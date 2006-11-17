/*
 * SyncServiceImpl.java 14.10.2006
 * 
 * Copyright (c) 2006 Manfred Mayer. All rights reserved.
 */
package com.macrodeck.lca.sync;

import java.io.IOException;

import javax.xml.rpc.ServiceException;

import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;

import com.macrodeck.lca.sync.ui.settings.PreferenceConstants;
import com.macrodeck.www.xmlns.services._1_0.DataServiceCustomTypesItemMetadata;
import com.macrodeck.www.xmlns.services._1_0.MacroDeckDataServicePort;
import com.macrodeck.www.xmlns.services._1_0.MacroDeckService;
import com.macrodeck.www.xmlns.services._1_0.MacroDeckServiceLocator;
import com.macrodeck.www.xmlns.services._1_0.MacroDeckUserServicePort;

public class SyncServiceImpl implements ISyncService, IPropertyChangeListener {

    private static SyncServiceImpl instance;

    private MacroDeckUserServicePort userService;

    private MacroDeckDataServicePort dataService;

    private String userName;

    private String password;

    private AuthCodeCreator auth;

    public SyncServiceImpl() {
        this.userService = getUserService();
        this.dataService = getDataService();
        this.auth = AuthCodeCreator.getInstance();
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
     * @throws RuntimeException,
     *             if username and password are missing
     */
    public String getAuthCode() throws IOException {
        if (userName == null || password == null) {
            throw new RuntimeException("Username and Password have to be configured first.");
        }
        return auth.getAuthCode(getUserService(), userName, password);
    }

    public MacroDeckUserServicePort getUserService() {
        if (userService == null) {
            MacroDeckService mds = new MacroDeckServiceLocator();
            try {
                userService = mds.getMacroDeckUserServicePort();
            } catch (ServiceException e) {
                e.printStackTrace();
                throw new RuntimeException(e.toString());
            }
        }
        return this.userService;
    }

    public MacroDeckDataServicePort getDataService() {
        if (dataService == null) {
            MacroDeckService mds = new MacroDeckServiceLocator();
            try {
                dataService = mds.getMacroDeckDataServicePort();
            } catch (ServiceException e) {
                e.printStackTrace();
                throw new RuntimeException(e.toString());
            }
        }
        return this.dataService;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return userName from preferenceStore
     */
    private String getUserName() {
        return SyncPlugin.getDefault().getPreferenceStore().getString(PreferenceConstants.P_USERNAME);
    }

    public static SyncServiceImpl getInstance() {
        if (instance == null) {
            instance = new SyncServiceImpl();
        }
        return instance;
    }

    public void propertyChange(PropertyChangeEvent event) {
        if (event.getProperty() == PreferenceConstants.P_USERNAME){
            setUserName((String) event.getNewValue());
        } else if (event.getProperty() == PreferenceConstants.P_PASSWD){
            setPassword((String) event.getNewValue());
        }
    }
}
