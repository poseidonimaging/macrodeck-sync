/*
 * SyncServiceImpl.java 14.10.2006
 * 
 * Copyright (c) 2006 Manfred Mayer. All rights reserved.
 */
package com.macrodeck.lca.sync;

import org.apache.axiom.om.impl.llom.OMElementImpl;

import com.macrodeck.lca.sync.ui.settings.PreferenceConstants;
import com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub;

public class SyncServiceImpl implements ISyncService {
    
    public void sync(Object data) {
        MacroDeckServiceStub.DataServiceSetObjectValue p1 = new MacroDeckServiceStub.DataServiceSetObjectValue();
        p1.setValue(new OMElementImpl("test", null, null));
        p1.setItemUUID("uuid");
        p1.setAuthCode(getUserAuthCode());
    }

    
    /**
     * @return userName from preferenceStore
     */
    private String getUserName(){
        return SyncPlugin.getDefault().getPreferenceStore().getString(PreferenceConstants.P_USERNAME);
    }
    
    /**
     * The idea will be like this:
     * 1) Get an authCookie. This will change each time you request one and each time you login and will be used to get an authCode. Randomly generated and has no security significance other than it prevents a hashed password from transferring over the network. It will be a salted, hashed, password. 
     * 2) Request an authCode using an authToken. authToken will be something like authToken = sha512(authCookie + ":" + sha512(password)). The server will check that it gets the same result, if so, you'll get the authCode and can perform all actions on that user's behalf. 
     * @return authcode from preferenceStore
     */
    private String getUserAuthCode(){
        return SyncPlugin.getDefault().getPreferenceStore().getString(PreferenceConstants.P_PASSWD);
    }
}
