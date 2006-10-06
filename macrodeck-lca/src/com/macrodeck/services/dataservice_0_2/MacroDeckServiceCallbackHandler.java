/**
 * MacroDeckServiceCallbackHandler.java This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.0 May 04, 2006 (09:21:04 IST)
 */
package com.macrodeck.services.dataservice_0_2;

/**
 * MacroDeckServiceCallbackHandler Callback class
 */
public abstract class MacroDeckServiceCallbackHandler {
    private Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the
     * NonBlocking  Web service call is finished and appropreate method of
     * this CallBack is called.
     *
     * @param clientData Object mechanism by which the user can pass in user
     *        data that will be avilable at the time this callback is called.
     */
    public MacroDeckServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * auto generated Axis2 call back method for SetObjectValue method
     */
    public void receiveResultSetObjectValue(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetObjectValueResponse param1) {
        //Fill here with the code to handle the response
    }

    /**
     * auto generated Axis2 Error handler
     */
    public void receiveErrorSetObjectValue(java.lang.Exception e) {
        //Fill here with the code to handle the exception
    }

    /**
     * auto generated Axis2 call back method for DeleteStringValue method
     */
    public void receiveResultDeleteStringValue(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteStringValueResponse param3) {
        //Fill here with the code to handle the response
    }

    /**
     * auto generated Axis2 Error handler
     */
    public void receiveErrorDeleteStringValue(java.lang.Exception e) {
        //Fill here with the code to handle the exception
    }

    /**
     * auto generated Axis2 call back method for CreateDataItem method
     */
    public void receiveResultCreateDataItem(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.CreateDataItemResponse param5) {
        //Fill here with the code to handle the response
    }

    /**
     * auto generated Axis2 Error handler
     */
    public void receiveErrorCreateDataItem(java.lang.Exception e) {
        //Fill here with the code to handle the exception
    }

    /**
     * auto generated Axis2 call back method for SetStringValue method
     */
    public void receiveResultSetStringValue(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetStringValueResponse param7) {
        //Fill here with the code to handle the response
    }

    /**
     * auto generated Axis2 Error handler
     */
    public void receiveErrorSetStringValue(java.lang.Exception e) {
        //Fill here with the code to handle the exception
    }

    /**
     * auto generated Axis2 call back method for DeleteIntegerValue method
     */
    public void receiveResultDeleteIntegerValue(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteIntegerValueResponse param9) {
        //Fill here with the code to handle the response
    }

    /**
     * auto generated Axis2 Error handler
     */
    public void receiveErrorDeleteIntegerValue(java.lang.Exception e) {
        //Fill here with the code to handle the exception
    }

    /**
     * auto generated Axis2 call back method for DeleteObjectValue method
     */
    public void receiveResultDeleteObjectValue(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteObjectValueResponse param11) {
        //Fill here with the code to handle the response
    }

    /**
     * auto generated Axis2 Error handler
     */
    public void receiveErrorDeleteObjectValue(java.lang.Exception e) {
        //Fill here with the code to handle the exception
    }

    /**
     * auto generated Axis2 call back method for SetIntegerValue method
     */
    public void receiveResultSetIntegerValue(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetIntegerValueResponse param13) {
        //Fill here with the code to handle the response
    }

    /**
     * auto generated Axis2 Error handler
     */
    public void receiveErrorSetIntegerValue(java.lang.Exception e) {
        //Fill here with the code to handle the exception
    }

    /**
     * auto generated Axis2 call back method for DeleteDataItem method
     */
    public void receiveResultDeleteDataItem(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteDataItemResponse param15) {
        //Fill here with the code to handle the response
    }

    /**
     * auto generated Axis2 Error handler
     */
    public void receiveErrorDeleteDataItem(java.lang.Exception e) {
        //Fill here with the code to handle the exception
    }
}
