/**
 * MacroDeckServiceTest.java This file was auto-generated from WSDL by the
 * Apache Axis2 version: 1.0 May 04, 2006 (09:21:04 IST)
 */
package com.macrodeck.services.dataservice_0_2;

import org.apache.axiom.om.impl.llom.OMElementImpl;


/*
 *  MacroDeckServiceTest Junit test case
*/
public class MacroDeckServiceTest extends junit.framework.TestCase {
    /**
     * Auto generated test method
     */
    public void testSetObjectValue() throws java.lang.Exception {
        MacroDeckServiceStub stub = new MacroDeckServiceStub(); //the default implementation should point to the right endpoint

        MacroDeckServiceStub.DataServiceSetObjectValue p1 = new MacroDeckServiceStub.DataServiceSetObjectValue();
        p1.setValue(new OMElementImpl("test", null, null));
        p1.setItemUUID("uuid");
        p1.setAuthCode("authCode");
        
        MacroDeckServiceStub.SetObjectValue param48 =
            new MacroDeckServiceStub.SetObjectValue();
        param48.setSetObjectValue(p1);

        // todo Fill in the param48 here
        assertNotNull(stub.SetObjectValue(param48));
    }

    /**
     * Auto generated test method
     */
    public void testStartSetObjectValue() throws java.lang.Exception {
        MacroDeckServiceStub stub = new MacroDeckServiceStub();
        MacroDeckServiceStub.SetObjectValue param48 =
            (MacroDeckServiceStub.SetObjectValue) getTestObject(MacroDeckServiceStub.SetObjectValue.class);

        // todo Fill in the param48 here
        stub.startSetObjectValue(param48, new tempCallbackN1000B());
    }

    /**
     * Auto generated test method
     */
    public void testDeleteStringValue() throws java.lang.Exception {
        MacroDeckServiceStub stub = new MacroDeckServiceStub(); //the default implementation should point to the right endpoint

        MacroDeckServiceStub.DeleteStringValue param50 =
            (MacroDeckServiceStub.DeleteStringValue) getTestObject(MacroDeckServiceStub.DeleteStringValue.class);

        // todo Fill in the param50 here
        assertNotNull(stub.DeleteStringValue(param50));
    }

    /**
     * Auto generated test method
     */
    public void testStartDeleteStringValue() throws java.lang.Exception {
        MacroDeckServiceStub stub = new MacroDeckServiceStub();
        MacroDeckServiceStub.DeleteStringValue param50 =
            (MacroDeckServiceStub.DeleteStringValue) getTestObject(MacroDeckServiceStub.DeleteStringValue.class);

        // todo Fill in the param50 here
        stub.startDeleteStringValue(param50, new tempCallbackN1001E());
    }

    /**
     * Auto generated test method
     */
    public void testCreateDataItem() throws java.lang.Exception {
        MacroDeckServiceStub stub = new MacroDeckServiceStub(); //the default implementation should point to the right endpoint

        MacroDeckServiceStub.CreateDataItem param52 =
            (MacroDeckServiceStub.CreateDataItem) getTestObject(MacroDeckServiceStub.CreateDataItem.class);

        // todo Fill in the param52 here
        assertNotNull(stub.CreateDataItem(param52));
    }

    /**
     * Auto generated test method
     */
    public void testStartCreateDataItem() throws java.lang.Exception {
        MacroDeckServiceStub stub = new MacroDeckServiceStub();
        MacroDeckServiceStub.CreateDataItem param52 =
            (MacroDeckServiceStub.CreateDataItem) getTestObject(MacroDeckServiceStub.CreateDataItem.class);

        // todo Fill in the param52 here
        stub.startCreateDataItem(param52, new tempCallbackN10031());
    }

    /**
     * Auto generated test method
     */
    public void testSetStringValue() throws java.lang.Exception {
        MacroDeckServiceStub stub = new MacroDeckServiceStub(); //the default implementation should point to the right endpoint

        MacroDeckServiceStub.SetStringValue param54 =
            (MacroDeckServiceStub.SetStringValue) getTestObject(MacroDeckServiceStub.SetStringValue.class);

        // todo Fill in the param54 here
        assertNotNull(stub.SetStringValue(param54));
    }

    /**
     * Auto generated test method
     */
    public void testStartSetStringValue() throws java.lang.Exception {
        MacroDeckServiceStub stub = new MacroDeckServiceStub();
        MacroDeckServiceStub.SetStringValue param54 =
            (MacroDeckServiceStub.SetStringValue) getTestObject(MacroDeckServiceStub.SetStringValue.class);

        // todo Fill in the param54 here
        stub.startSetStringValue(param54, new tempCallbackN10044());
    }

    /**
     * Auto generated test method
     */
    public void testDeleteIntegerValue() throws java.lang.Exception {
        MacroDeckServiceStub stub = new MacroDeckServiceStub(); //the default implementation should point to the right endpoint

        MacroDeckServiceStub.DeleteIntegerValue param56 =
            (MacroDeckServiceStub.DeleteIntegerValue) getTestObject(MacroDeckServiceStub.DeleteIntegerValue.class);

        // todo Fill in the param56 here
        assertNotNull(stub.DeleteIntegerValue(param56));
    }

    /**
     * Auto generated test method
     */
    public void testStartDeleteIntegerValue() throws java.lang.Exception {
        MacroDeckServiceStub stub = new MacroDeckServiceStub();
        MacroDeckServiceStub.DeleteIntegerValue param56 =
            (MacroDeckServiceStub.DeleteIntegerValue) getTestObject(MacroDeckServiceStub.DeleteIntegerValue.class);

        // todo Fill in the param56 here
        stub.startDeleteIntegerValue(param56, new tempCallbackN10057());
    }

    /**
     * Auto generated test method
     */
    public void testDeleteObjectValue() throws java.lang.Exception {
        MacroDeckServiceStub stub = new MacroDeckServiceStub(); //the default implementation should point to the right endpoint

        MacroDeckServiceStub.DeleteObjectValue param58 =
            (MacroDeckServiceStub.DeleteObjectValue) getTestObject(MacroDeckServiceStub.DeleteObjectValue.class);

        // todo Fill in the param58 here
        assertNotNull(stub.DeleteObjectValue(param58));
    }

    /**
     * Auto generated test method
     */
    public void testStartDeleteObjectValue() throws java.lang.Exception {
        MacroDeckServiceStub stub = new MacroDeckServiceStub();
        MacroDeckServiceStub.DeleteObjectValue param58 =
            (MacroDeckServiceStub.DeleteObjectValue) getTestObject(MacroDeckServiceStub.DeleteObjectValue.class);

        // todo Fill in the param58 here
        stub.startDeleteObjectValue(param58, new tempCallbackN1006A());
    }

    /**
     * Auto generated test method
     */
    public void testSetIntegerValue() throws java.lang.Exception {
        MacroDeckServiceStub stub = new MacroDeckServiceStub(); //the default implementation should point to the right endpoint

        MacroDeckServiceStub.SetIntegerValue param60 =
            (MacroDeckServiceStub.SetIntegerValue) getTestObject(MacroDeckServiceStub.SetIntegerValue.class);

        // todo Fill in the param60 here
        assertNotNull(stub.SetIntegerValue(param60));
    }

    /**
     * Auto generated test method
     */
    public void testStartSetIntegerValue() throws java.lang.Exception {
        MacroDeckServiceStub stub = new MacroDeckServiceStub();
        MacroDeckServiceStub.SetIntegerValue param60 =
            (MacroDeckServiceStub.SetIntegerValue) getTestObject(MacroDeckServiceStub.SetIntegerValue.class);

        // todo Fill in the param60 here
        stub.startSetIntegerValue(param60, new tempCallbackN1007D());
    }

    /**
     * Auto generated test method
     */
    public void testDeleteDataItem() throws java.lang.Exception {
        MacroDeckServiceStub stub = new MacroDeckServiceStub(); //the default implementation should point to the right endpoint

        MacroDeckServiceStub.DeleteDataItem param62 =
            (MacroDeckServiceStub.DeleteDataItem) getTestObject(MacroDeckServiceStub.DeleteDataItem.class);

        // todo Fill in the param62 here
        assertNotNull(stub.DeleteDataItem(param62));
    }

    /**
     * Auto generated test method
     */
    public void testStartDeleteDataItem() throws java.lang.Exception {
        MacroDeckServiceStub stub = new MacroDeckServiceStub();
        MacroDeckServiceStub.DeleteDataItem param62 =
            (MacroDeckServiceStub.DeleteDataItem) getTestObject(MacroDeckServiceStub.DeleteDataItem.class);

        // todo Fill in the param62 here
        stub.startDeleteDataItem(param62, new tempCallbackN10090());
    }

    //Create an ADBBean and provide it as the test object
    public org.apache.axis2.databinding.ADBBean getTestObject(
        java.lang.Class type) throws Exception {
        return (org.apache.axis2.databinding.ADBBean) type.newInstance();
    }

    private class tempCallbackN1000B
        extends MacroDeckServiceCallbackHandler {
        public tempCallbackN1000B() {
            super(null);
        }

        public void receiveResultSetObjectValue(
            org.apache.axis2.client.async.AsyncResult result) {
            assertNotNull(result.getResponseEnvelope().getBody()
                                .getFirstElement());
        }

        public void receiveErrorSetObjectValue(java.lang.Exception e) {
            fail();
        }
    }

    private class tempCallbackN1001E
        extends MacroDeckServiceCallbackHandler {
        public tempCallbackN1001E() {
            super(null);
        }

        public void receiveResultDeleteStringValue(
            org.apache.axis2.client.async.AsyncResult result) {
            assertNotNull(result.getResponseEnvelope().getBody()
                                .getFirstElement());
        }

        public void receiveErrorDeleteStringValue(java.lang.Exception e) {
            fail();
        }
    }

    private class tempCallbackN10031
        extends MacroDeckServiceCallbackHandler {
        public tempCallbackN10031() {
            super(null);
        }

        public void receiveResultCreateDataItem(
            org.apache.axis2.client.async.AsyncResult result) {
            assertNotNull(result.getResponseEnvelope().getBody()
                                .getFirstElement());
        }

        public void receiveErrorCreateDataItem(java.lang.Exception e) {
            fail();
        }
    }

    private class tempCallbackN10044
        extends MacroDeckServiceCallbackHandler {
        public tempCallbackN10044() {
            super(null);
        }

        public void receiveResultSetStringValue(
            org.apache.axis2.client.async.AsyncResult result) {
            assertNotNull(result.getResponseEnvelope().getBody()
                                .getFirstElement());
        }

        public void receiveErrorSetStringValue(java.lang.Exception e) {
            fail();
        }
    }

    private class tempCallbackN10057
        extends MacroDeckServiceCallbackHandler {
        public tempCallbackN10057() {
            super(null);
        }

        public void receiveResultDeleteIntegerValue(
            org.apache.axis2.client.async.AsyncResult result) {
            assertNotNull(result.getResponseEnvelope().getBody()
                                .getFirstElement());
        }

        public void receiveErrorDeleteIntegerValue(java.lang.Exception e) {
            fail();
        }
    }

    private class tempCallbackN1006A
        extends MacroDeckServiceCallbackHandler {
        public tempCallbackN1006A() {
            super(null);
        }

        public void receiveResultDeleteObjectValue(
            org.apache.axis2.client.async.AsyncResult result) {
            assertNotNull(result.getResponseEnvelope().getBody()
                                .getFirstElement());
        }

        public void receiveErrorDeleteObjectValue(java.lang.Exception e) {
            fail();
        }
    }

    private class tempCallbackN1007D
        extends MacroDeckServiceCallbackHandler {
        public tempCallbackN1007D() {
            super(null);
        }

        public void receiveResultSetIntegerValue(
            org.apache.axis2.client.async.AsyncResult result) {
            assertNotNull(result.getResponseEnvelope().getBody()
                                .getFirstElement());
        }

        public void receiveErrorSetIntegerValue(java.lang.Exception e) {
            fail();
        }
    }

    private class tempCallbackN10090
        extends MacroDeckServiceCallbackHandler {
        public tempCallbackN10090() {
            super("test");
        }

        public void receiveResultDeleteDataItem(
            org.apache.axis2.client.async.AsyncResult result) {
            assertNotNull(result.getResponseEnvelope().getBody()
                                .getFirstElement());
        }

        public void receiveErrorDeleteDataItem(java.lang.Exception e) {
            fail();
        }
    }
}
