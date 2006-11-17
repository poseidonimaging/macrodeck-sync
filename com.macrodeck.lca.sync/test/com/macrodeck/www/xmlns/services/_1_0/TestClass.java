package com.macrodeck.www.xmlns.services._1_0;

import org.apache.axis.components.uuid.UUIDGenFactory;

import com.macrodeck.lca.sync.SyncServiceImpl;

public class TestClass {

    public static void main(String[] args) {
        try {
            long startTime = System.currentTimeMillis();
            SyncServiceImpl sync = new SyncServiceImpl("mmeggs", "germany");
            DataServiceCustomTypesItemMetadata md = new DataServiceCustomTypesItemMetadata("title", "description", "creator", UUIDGenFactory.getUUIDGen().nextUUID()/*"Bookmark"*/);
            String uuid = sync.getDataService().createDataItem(sync.getAuthCode(), "testGroup", md);
            System.out.println("createDataItem: <" + uuid + "> " + (System.currentTimeMillis() - startTime));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
