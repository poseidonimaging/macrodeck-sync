package com.macrodeck.services.dataservice_0_2;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class TestClass {

	public static void main(String[] args) {
		MacroDeckService mds = new MacroDeckServiceLocator();
		System.out.println(mds.getServiceName());
		
		DataServiceCustomTypesItemMetadata md = new DataServiceCustomTypesItemMetadata("title", "description", "creator", "Bookmark");
		String authCode = "cd26e5ce90055fda11d8f0e35ec8c4aa8c7a997d1bf15894a7f6b277d64cacecbd23b383cfdee87d27192763a3a4bcbc4e6cfb74739295bd010dc456a5b0e580";
		try {
			String uuid = mds.getMacroDeckDataServicePort().createDataItem(authCode , "testGroup", md);
			System.out.println("return uuid: "+uuid);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
