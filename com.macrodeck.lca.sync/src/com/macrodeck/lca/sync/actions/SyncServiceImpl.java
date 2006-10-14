/*
 * SyncServiceImpl.java 14.10.2006
 * 
 * Copyright (c) 2006 Manfred Mayer. All rights reserved.
 */
package com.macrodeck.lca.sync.actions;

import org.apache.axiom.om.impl.llom.OMElementImpl;

import com.macrodeck.lca.sync.SyncPlugin;
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
     * @return authcode from preferenceStore
     */
    private String getUserAuthCode(){
        return SyncPlugin.getDefault().getPreferenceStore().getString(PreferenceConstants.P_PASSWD);
    }
}
