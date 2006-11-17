/*
 * ISyncService.java 14.10.2006
 * 
 * Copyright (c) 2006 Manfred Mayer. All rights reserved.
 */
package com.macrodeck.lca.sync;

import java.io.IOException;

import com.macrodeck.www.xmlns.services._1_0.DataServiceCustomTypesItemMetadata;
import com.macrodeck.www.xmlns.services._1_0.MacroDeckDataServicePort;

public interface ISyncService {
    
    /**
     * creates a DataItem at macrodeck server
     * @param grouping
     * @param metadata
     * @return itemUUID of the item created on server
     * @throws IOException
     */
    public String createDataItem(String grouping, DataServiceCustomTypesItemMetadata metadata) throws IOException;
    
    /**
     * @param itemUUID
     * @return whether it was sucessful or not
     * @throws IOException
     */
    public boolean deleteDataItem(String itemUUID) throws IOException;
    
    /**
     * @return authcode to authorize at macrodeck service interface
     * @throws IOException
     */
    public String getAuthCode() throws IOException;
    
    /**
     * @return dataService interface to connect to macrodeck service 
     */
    public MacroDeckDataServicePort getDataService();
}
