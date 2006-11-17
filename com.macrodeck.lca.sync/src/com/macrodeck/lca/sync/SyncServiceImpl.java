/*
 * SyncServiceImpl.java 14.10.2006
 * 
 * Copyright (c) 2006 Manfred Mayer. All rights reserved.
 */
package com.macrodeck.lca.sync;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.macrodeck.lca.sync.ui.settings.AuthCodeCreator;
import com.macrodeck.lca.sync.ui.settings.PreferenceConstants;
import com.macrodeck.www.xmlns.services._1_0.DataServiceCustomTypesItemMetadata;
import com.macrodeck.www.xmlns.services._1_0.MacroDeckDataServicePort;
import com.macrodeck.www.xmlns.services._1_0.MacroDeckService;
import com.macrodeck.www.xmlns.services._1_0.MacroDeckServiceLocator;
import com.macrodeck.www.xmlns.services._1_0.MacroDeckUserServicePort;

public class SyncServiceImpl implements ISyncService {

    private static final String SALT = "giomullyoxonoind:";
    private MacroDeckUserServicePort userService;
    private MacroDeckDataServicePort dataService;
    private final String userName;
    private final String password;

    public SyncServiceImpl(String userName, String password) {
        this.userName = userName;
        this.password = password;
        MacroDeckService mds = new MacroDeckServiceLocator();
        try {
            this.userService = mds.getMacroDeckUserServicePort();
            this.dataService = mds.getMacroDeckDataServicePort();
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }
    
    public String createDataItem(String grouping, DataServiceCustomTypesItemMetadata metadata) throws IOException {
        return getDataService().createDataItem(getAuthCode(), grouping, metadata);
    }

    public boolean deleteDataItem(String itemUUID) throws IOException {
        return getDataService().deleteDataItem(getAuthCode(), itemUUID);
    }
    
    /**
     * @return authCode
     * @throws IOException 
     */
    public String getAuthCode() throws IOException {
        String authCookie = getAuthCookie(userName);
        String authToken = createAuthToken(password, authCookie);
        String authCode = userService.getAuthCode(userName, authToken);
        return authCode;
    }

    public MacroDeckUserServicePort getUserService() {
        return this.userService;
    }
    
    public MacroDeckDataServicePort getDataService() {
        return this.dataService;
    }
    
    /**
     * @return userName from preferenceStore
     */
    private String getUserName(){
        return SyncPlugin.getDefault().getPreferenceStore().getString(PreferenceConstants.P_USERNAME);
    }
    
    /**
     * The idea will be like this:
     * 1) Get an authCookie. This will change each time you request one and each time you login and will be used to get an authCode. 
     *    Randomly generated and has no security significance other than it prevents a hashed password from transferring over the network. 
     *    It will be a salted, hashed, password. 
     * 2) Request an authCode using an authToken. 
     *    authToken = sha512(authCookie + ":" + sha512(password)). 
     *    The server will check that it gets the same result, if so, you'll get the authCode and can perform all actions on that user's behalf. 
     * @return authcode from preferenceStore
     */
    private String createAuthToken(String password, String authCookie) {
        // String password = SyncPlugin.getDefault().getPreferenceStore().getString(PreferenceConstants.P_PASSWD);
        String authToken = AuthCodeCreator.sha512(authCookie + ":" + AuthCodeCreator.sha512(SALT + password));
        //System.out.println("SALT:password: "+SALT + password);
        //System.out.println("sha512(SALT:password): "+AuthCodeCreator.sha512(SALT + password));
        //System.out.println("authToken: "+authToken.toLowerCase());
        return authToken.toLowerCase();
    }
    
    /**
     * @param userService
     * @param userName
     * @return authCookie
     * @throws RemoteException
     */
    private String getAuthCookie(String userName) throws IOException {
        String authCookie = null;
        File file = new File("./authCookie");
        if (!file.exists() || System.currentTimeMillis() - file.lastModified() > 60000) {
            // fetch new cookie
            authCookie = userService.getAuthCookie(userName);
            BufferedWriter w = new BufferedWriter(new FileWriter(file));
            w.write(authCookie);
            w.close();
        } else {
            // read from file
            BufferedReader r = new BufferedReader(new FileReader(file));
            authCookie = r.readLine();
            r.close();
        }
        return authCookie;
    }
}
