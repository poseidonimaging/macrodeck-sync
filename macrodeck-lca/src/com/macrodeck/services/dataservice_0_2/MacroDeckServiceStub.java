/**
 * MacroDeckServiceStub.java This file was auto-generated from WSDL by the
 * Apache Axis2 version: 1.0 May 04, 2006 (09:21:04 IST)
 */
package com.macrodeck.services.dataservice_0_2;


/*
*  MacroDeckServiceStub java implementation
*/
public class MacroDeckServiceStub extends org.apache.axis2.client.Stub {
    //default axis home being null forces the system to pick up the mars from the axis2 library
    public static final java.lang.String AXIS2_HOME = null;
    protected static org.apache.axis2.description.AxisOperation[] _operations;

    //hashmaps to keep the fault mapping
    private java.util.HashMap faultExeptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExeptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();
    private javax.xml.namespace.QName[] opNameArray = null;

    public MacroDeckServiceStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint) throws java.lang.Exception {
        //To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,
                _service);
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
    }

    /**
     * Default Constructor
     */
    public MacroDeckServiceStub() throws java.lang.Exception {
        this("http://www.macrodeck.com/services/DataService");
    }

    /**
     * Constructor taking the target endpoint
     */
    public MacroDeckServiceStub(java.lang.String targetEndpoint)
        throws java.lang.Exception {
        this(org.apache.axis2.context.ConfigurationContextFactory.createConfigurationContextFromFileSystem(
                AXIS2_HOME, null), targetEndpoint);
    }

    private void populateAxisService() {
        //creating the Service
        _service = new org.apache.axis2.description.AxisService(
                "MacroDeckService");

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[8];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("", "SetObjectValue"));

        _operations[0] = __operation;
        _service.addOperation(__operation);

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("",
                "DeleteStringValue"));

        _operations[1] = __operation;
        _service.addOperation(__operation);

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("", "CreateDataItem"));

        _operations[2] = __operation;
        _service.addOperation(__operation);

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("", "SetStringValue"));

        _operations[3] = __operation;
        _service.addOperation(__operation);

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("",
                "DeleteIntegerValue"));

        _operations[4] = __operation;
        _service.addOperation(__operation);

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("",
                "DeleteObjectValue"));

        _operations[5] = __operation;
        _service.addOperation(__operation);

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("", "SetIntegerValue"));

        _operations[6] = __operation;
        _service.addOperation(__operation);

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("", "DeleteDataItem"));

        _operations[7] = __operation;
        _service.addOperation(__operation);
    }

    //populates the faults
    private void populateFaults() {
    }

    /**
     * Auto generated method signature
     *
     * @param param16
     *
     * @see com.macrodeck.services.dataservice_0_2.MacroDeckService#SetObjectValue
     */
    public com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetObjectValueResponse SetObjectValue(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetObjectValue param16)
        throws java.rmi.RemoteException {
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions().setAction("/services/DataService/SetObjectValue");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            //Style is Doc.
            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    param16,
                    optimizeContent(
                        new javax.xml.namespace.QName("", "SetObjectValue")));

            // create message context with that soap envelope
            org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(getElement(_returnEnv, "rpc"),
                    com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetObjectValueResponse.class,
                    getEnvelopeNamespaces(_returnEnv));
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);

            return (com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetObjectValueResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExeptionNameMap.containsKey(faultElt.getQName())) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExeptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.rmi.RemoteException ex = (java.rmi.RemoteException) exceptionClass.newInstance();

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw ex;
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param param16
     *
     * @see com.macrodeck.services.dataservice_0_2.MacroDeckService#startSetObjectValue
     */
    public void startSetObjectValue(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetObjectValue param16,
        final com.macrodeck.services.dataservice_0_2.MacroDeckServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
        _operationClient.getOptions().setAction("/services/DataService/SetObjectValue");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                param16,
                optimizeContent(
                    new javax.xml.namespace.QName("", "SetObjectValue")));

        // create message context with that soap envelope
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.Callback() {
                public void onComplete(
                    org.apache.axis2.client.async.AsyncResult result) {
                    java.lang.Object object = fromOM(getElement(
                                result.getResponseEnvelope(), "document"),
                            com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetObjectValueResponse.class,
                            getEnvelopeNamespaces(result.getResponseEnvelope()));
                    callback.receiveResultSetObjectValue((com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetObjectValueResponse) object);
                }

                public void onError(java.lang.Exception e) {
                    callback.receiveErrorSetObjectValue(e);
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[0].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[0].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     *
     * @param param18
     *
     * @see com.macrodeck.services.dataservice_0_2.MacroDeckService#DeleteStringValue
     */
    public com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteStringValueResponse DeleteStringValue(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteStringValue param18)
        throws java.rmi.RemoteException {
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
            _operationClient.getOptions().setAction("/services/DataService/DeleteStringValue");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            //Style is Doc.
            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    param18,
                    optimizeContent(
                        new javax.xml.namespace.QName("", "DeleteStringValue")));

            // create message context with that soap envelope
            org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(getElement(_returnEnv, "rpc"),
                    com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteStringValueResponse.class,
                    getEnvelopeNamespaces(_returnEnv));
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);

            return (com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteStringValueResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExeptionNameMap.containsKey(faultElt.getQName())) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExeptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.rmi.RemoteException ex = (java.rmi.RemoteException) exceptionClass.newInstance();

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw ex;
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param param18
     *
     * @see com.macrodeck.services.dataservice_0_2.MacroDeckService#startDeleteStringValue
     */
    public void startDeleteStringValue(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteStringValue param18,
        final com.macrodeck.services.dataservice_0_2.MacroDeckServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
        _operationClient.getOptions().setAction("/services/DataService/DeleteStringValue");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                param18,
                optimizeContent(
                    new javax.xml.namespace.QName("", "DeleteStringValue")));

        // create message context with that soap envelope
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.Callback() {
                public void onComplete(
                    org.apache.axis2.client.async.AsyncResult result) {
                    java.lang.Object object = fromOM(getElement(
                                result.getResponseEnvelope(), "document"),
                            com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteStringValueResponse.class,
                            getEnvelopeNamespaces(result.getResponseEnvelope()));
                    callback.receiveResultDeleteStringValue((com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteStringValueResponse) object);
                }

                public void onError(java.lang.Exception e) {
                    callback.receiveErrorDeleteStringValue(e);
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[1].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[1].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     *
     * @param param20
     *
     * @see com.macrodeck.services.dataservice_0_2.MacroDeckService#CreateDataItem
     */
    public com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.CreateDataItemResponse CreateDataItem(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.CreateDataItem param20)
        throws java.rmi.RemoteException {
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
            _operationClient.getOptions().setAction("/services/DataService/CreateDataItem");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            //Style is Doc.
            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    param20,
                    optimizeContent(
                        new javax.xml.namespace.QName("", "CreateDataItem")));

            // create message context with that soap envelope
            org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(getElement(_returnEnv, "rpc"),
                    com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.CreateDataItemResponse.class,
                    getEnvelopeNamespaces(_returnEnv));
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);

            return (com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.CreateDataItemResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExeptionNameMap.containsKey(faultElt.getQName())) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExeptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.rmi.RemoteException ex = (java.rmi.RemoteException) exceptionClass.newInstance();

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw ex;
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param param20
     *
     * @see com.macrodeck.services.dataservice_0_2.MacroDeckService#startCreateDataItem
     */
    public void startCreateDataItem(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.CreateDataItem param20,
        final com.macrodeck.services.dataservice_0_2.MacroDeckServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
        _operationClient.getOptions().setAction("/services/DataService/CreateDataItem");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                param20,
                optimizeContent(
                    new javax.xml.namespace.QName("", "CreateDataItem")));

        // create message context with that soap envelope
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.Callback() {
                public void onComplete(
                    org.apache.axis2.client.async.AsyncResult result) {
                    java.lang.Object object = fromOM(getElement(
                                result.getResponseEnvelope(), "document"),
                            com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.CreateDataItemResponse.class,
                            getEnvelopeNamespaces(result.getResponseEnvelope()));
                    callback.receiveResultCreateDataItem((com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.CreateDataItemResponse) object);
                }

                public void onError(java.lang.Exception e) {
                    callback.receiveErrorCreateDataItem(e);
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[2].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[2].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     *
     * @param param22
     *
     * @see com.macrodeck.services.dataservice_0_2.MacroDeckService#SetStringValue
     */
    public com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetStringValueResponse SetStringValue(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetStringValue param22)
        throws java.rmi.RemoteException {
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
            _operationClient.getOptions().setAction("/services/DataService/SetStringValue");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            //Style is Doc.
            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    param22,
                    optimizeContent(
                        new javax.xml.namespace.QName("", "SetStringValue")));

            // create message context with that soap envelope
            org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(getElement(_returnEnv, "rpc"),
                    com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetStringValueResponse.class,
                    getEnvelopeNamespaces(_returnEnv));
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);

            return (com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetStringValueResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExeptionNameMap.containsKey(faultElt.getQName())) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExeptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.rmi.RemoteException ex = (java.rmi.RemoteException) exceptionClass.newInstance();

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw ex;
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param param22
     *
     * @see com.macrodeck.services.dataservice_0_2.MacroDeckService#startSetStringValue
     */
    public void startSetStringValue(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetStringValue param22,
        final com.macrodeck.services.dataservice_0_2.MacroDeckServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
        _operationClient.getOptions().setAction("/services/DataService/SetStringValue");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                param22,
                optimizeContent(
                    new javax.xml.namespace.QName("", "SetStringValue")));

        // create message context with that soap envelope
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.Callback() {
                public void onComplete(
                    org.apache.axis2.client.async.AsyncResult result) {
                    java.lang.Object object = fromOM(getElement(
                                result.getResponseEnvelope(), "document"),
                            com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetStringValueResponse.class,
                            getEnvelopeNamespaces(result.getResponseEnvelope()));
                    callback.receiveResultSetStringValue((com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetStringValueResponse) object);
                }

                public void onError(java.lang.Exception e) {
                    callback.receiveErrorSetStringValue(e);
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[3].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[3].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     *
     * @param param24
     *
     * @see com.macrodeck.services.dataservice_0_2.MacroDeckService#DeleteIntegerValue
     */
    public com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteIntegerValueResponse DeleteIntegerValue(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteIntegerValue param24)
        throws java.rmi.RemoteException {
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
            _operationClient.getOptions().setAction("/services/DataService/DeleteIntegerValue");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            //Style is Doc.
            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    param24,
                    optimizeContent(
                        new javax.xml.namespace.QName("", "DeleteIntegerValue")));

            // create message context with that soap envelope
            org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(getElement(_returnEnv, "rpc"),
                    com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteIntegerValueResponse.class,
                    getEnvelopeNamespaces(_returnEnv));
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);

            return (com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteIntegerValueResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExeptionNameMap.containsKey(faultElt.getQName())) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExeptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.rmi.RemoteException ex = (java.rmi.RemoteException) exceptionClass.newInstance();

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw ex;
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param param24
     *
     * @see com.macrodeck.services.dataservice_0_2.MacroDeckService#startDeleteIntegerValue
     */
    public void startDeleteIntegerValue(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteIntegerValue param24,
        final com.macrodeck.services.dataservice_0_2.MacroDeckServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
        _operationClient.getOptions().setAction("/services/DataService/DeleteIntegerValue");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                param24,
                optimizeContent(
                    new javax.xml.namespace.QName("", "DeleteIntegerValue")));

        // create message context with that soap envelope
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.Callback() {
                public void onComplete(
                    org.apache.axis2.client.async.AsyncResult result) {
                    java.lang.Object object = fromOM(getElement(
                                result.getResponseEnvelope(), "document"),
                            com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteIntegerValueResponse.class,
                            getEnvelopeNamespaces(result.getResponseEnvelope()));
                    callback.receiveResultDeleteIntegerValue((com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteIntegerValueResponse) object);
                }

                public void onError(java.lang.Exception e) {
                    callback.receiveErrorDeleteIntegerValue(e);
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[4].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[4].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     *
     * @param param26
     *
     * @see com.macrodeck.services.dataservice_0_2.MacroDeckService#DeleteObjectValue
     */
    public com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteObjectValueResponse DeleteObjectValue(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteObjectValue param26)
        throws java.rmi.RemoteException {
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
            _operationClient.getOptions().setAction("/services/DataService/DeleteObjectValue");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            //Style is Doc.
            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    param26,
                    optimizeContent(
                        new javax.xml.namespace.QName("", "DeleteObjectValue")));

            // create message context with that soap envelope
            org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(getElement(_returnEnv, "rpc"),
                    com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteObjectValueResponse.class,
                    getEnvelopeNamespaces(_returnEnv));
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);

            return (com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteObjectValueResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExeptionNameMap.containsKey(faultElt.getQName())) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExeptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.rmi.RemoteException ex = (java.rmi.RemoteException) exceptionClass.newInstance();

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw ex;
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param param26
     *
     * @see com.macrodeck.services.dataservice_0_2.MacroDeckService#startDeleteObjectValue
     */
    public void startDeleteObjectValue(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteObjectValue param26,
        final com.macrodeck.services.dataservice_0_2.MacroDeckServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
        _operationClient.getOptions().setAction("/services/DataService/DeleteObjectValue");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                param26,
                optimizeContent(
                    new javax.xml.namespace.QName("", "DeleteObjectValue")));

        // create message context with that soap envelope
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.Callback() {
                public void onComplete(
                    org.apache.axis2.client.async.AsyncResult result) {
                    java.lang.Object object = fromOM(getElement(
                                result.getResponseEnvelope(), "document"),
                            com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteObjectValueResponse.class,
                            getEnvelopeNamespaces(result.getResponseEnvelope()));
                    callback.receiveResultDeleteObjectValue((com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteObjectValueResponse) object);
                }

                public void onError(java.lang.Exception e) {
                    callback.receiveErrorDeleteObjectValue(e);
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[5].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[5].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     *
     * @param param28
     *
     * @see com.macrodeck.services.dataservice_0_2.MacroDeckService#SetIntegerValue
     */
    public com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetIntegerValueResponse SetIntegerValue(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetIntegerValue param28)
        throws java.rmi.RemoteException {
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
            _operationClient.getOptions().setAction("/services/DataService/SetIntegerValue");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            //Style is Doc.
            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    param28,
                    optimizeContent(
                        new javax.xml.namespace.QName("", "SetIntegerValue")));

            // create message context with that soap envelope
            org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(getElement(_returnEnv, "rpc"),
                    com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetIntegerValueResponse.class,
                    getEnvelopeNamespaces(_returnEnv));
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);

            return (com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetIntegerValueResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExeptionNameMap.containsKey(faultElt.getQName())) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExeptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.rmi.RemoteException ex = (java.rmi.RemoteException) exceptionClass.newInstance();

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw ex;
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param param28
     *
     * @see com.macrodeck.services.dataservice_0_2.MacroDeckService#startSetIntegerValue
     */
    public void startSetIntegerValue(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetIntegerValue param28,
        final com.macrodeck.services.dataservice_0_2.MacroDeckServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
        _operationClient.getOptions().setAction("/services/DataService/SetIntegerValue");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                param28,
                optimizeContent(
                    new javax.xml.namespace.QName("", "SetIntegerValue")));

        // create message context with that soap envelope
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.Callback() {
                public void onComplete(
                    org.apache.axis2.client.async.AsyncResult result) {
                    java.lang.Object object = fromOM(getElement(
                                result.getResponseEnvelope(), "document"),
                            com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetIntegerValueResponse.class,
                            getEnvelopeNamespaces(result.getResponseEnvelope()));
                    callback.receiveResultSetIntegerValue((com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetIntegerValueResponse) object);
                }

                public void onError(java.lang.Exception e) {
                    callback.receiveErrorSetIntegerValue(e);
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[6].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[6].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     *
     * @param param30
     *
     * @see com.macrodeck.services.dataservice_0_2.MacroDeckService#DeleteDataItem
     */
    public com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteDataItemResponse DeleteDataItem(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteDataItem param30)
        throws java.rmi.RemoteException {
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
            _operationClient.getOptions().setAction("/services/DataService/DeleteDataItem");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            //Style is Doc.
            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    param30,
                    optimizeContent(
                        new javax.xml.namespace.QName("", "DeleteDataItem")));

            // create message context with that soap envelope
            org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(getElement(_returnEnv, "rpc"),
                    com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteDataItemResponse.class,
                    getEnvelopeNamespaces(_returnEnv));
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);

            return (com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteDataItemResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExeptionNameMap.containsKey(faultElt.getQName())) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExeptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.rmi.RemoteException ex = (java.rmi.RemoteException) exceptionClass.newInstance();

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw ex;
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param param30
     *
     * @see com.macrodeck.services.dataservice_0_2.MacroDeckService#startDeleteDataItem
     */
    public void startDeleteDataItem(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteDataItem param30,
        final com.macrodeck.services.dataservice_0_2.MacroDeckServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
        _operationClient.getOptions().setAction("/services/DataService/DeleteDataItem");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                param30,
                optimizeContent(
                    new javax.xml.namespace.QName("", "DeleteDataItem")));

        // create message context with that soap envelope
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.Callback() {
                public void onComplete(
                    org.apache.axis2.client.async.AsyncResult result) {
                    java.lang.Object object = fromOM(getElement(
                                result.getResponseEnvelope(), "document"),
                            com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteDataItemResponse.class,
                            getEnvelopeNamespaces(result.getResponseEnvelope()));
                    callback.receiveResultDeleteDataItem((com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteDataItemResponse) object);
                }

                public void onError(java.lang.Exception e) {
                    callback.receiveErrorDeleteDataItem(e);
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[7].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[7].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * A utility method that copies the namepaces from the SOAPEnvelope
     */
    private java.util.Map getEnvelopeNamespaces(
        org.apache.axiom.soap.SOAPEnvelope env) {
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();

        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(), ns.getName());
        }

        return returnMap;
    }

    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        if (opNameArray == null) {
            return false;
        }

        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;
            }
        }

        return false;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetObjectValue param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axiom.om.impl.builder.StAXOMBuilder builder = new org.apache.axiom.om.impl.builder.StAXOMBuilder(org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                    new org.apache.axis2.util.StreamWrapper(param.getPullParser(
                            com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetObjectValue.MY_QNAME)));
            org.apache.axiom.om.OMElement documentElement = builder.getDocumentElement();
            ((org.apache.axiom.om.impl.OMNodeEx) documentElement).setParent(null); // remove the parent link

            return documentElement;
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetObjectValue param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axis2.databinding.ADBSOAPModelBuilder builder = new org.apache.axis2.databinding.ADBSOAPModelBuilder(param.getPullParser(
                        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetObjectValue.MY_QNAME),
                    factory);

            return builder.getEnvelope();
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteObjectValueResponse param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axiom.om.impl.builder.StAXOMBuilder builder = new org.apache.axiom.om.impl.builder.StAXOMBuilder(org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                    new org.apache.axis2.util.StreamWrapper(param.getPullParser(
                            com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteObjectValueResponse.MY_QNAME)));
            org.apache.axiom.om.OMElement documentElement = builder.getDocumentElement();
            ((org.apache.axiom.om.impl.OMNodeEx) documentElement).setParent(null); // remove the parent link

            return documentElement;
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteObjectValueResponse param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axis2.databinding.ADBSOAPModelBuilder builder = new org.apache.axis2.databinding.ADBSOAPModelBuilder(param.getPullParser(
                        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteObjectValueResponse.MY_QNAME),
                    factory);

            return builder.getEnvelope();
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.CreateDataItemResponse param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axiom.om.impl.builder.StAXOMBuilder builder = new org.apache.axiom.om.impl.builder.StAXOMBuilder(org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                    new org.apache.axis2.util.StreamWrapper(param.getPullParser(
                            com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.CreateDataItemResponse.MY_QNAME)));
            org.apache.axiom.om.OMElement documentElement = builder.getDocumentElement();
            ((org.apache.axiom.om.impl.OMNodeEx) documentElement).setParent(null); // remove the parent link

            return documentElement;
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.CreateDataItemResponse param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axis2.databinding.ADBSOAPModelBuilder builder = new org.apache.axis2.databinding.ADBSOAPModelBuilder(param.getPullParser(
                        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.CreateDataItemResponse.MY_QNAME),
                    factory);

            return builder.getEnvelope();
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.CreateDataItem param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axiom.om.impl.builder.StAXOMBuilder builder = new org.apache.axiom.om.impl.builder.StAXOMBuilder(org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                    new org.apache.axis2.util.StreamWrapper(param.getPullParser(
                            com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.CreateDataItem.MY_QNAME)));
            org.apache.axiom.om.OMElement documentElement = builder.getDocumentElement();
            ((org.apache.axiom.om.impl.OMNodeEx) documentElement).setParent(null); // remove the parent link

            return documentElement;
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.CreateDataItem param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axis2.databinding.ADBSOAPModelBuilder builder = new org.apache.axis2.databinding.ADBSOAPModelBuilder(param.getPullParser(
                        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.CreateDataItem.MY_QNAME),
                    factory);

            return builder.getEnvelope();
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteIntegerValueResponse param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axiom.om.impl.builder.StAXOMBuilder builder = new org.apache.axiom.om.impl.builder.StAXOMBuilder(org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                    new org.apache.axis2.util.StreamWrapper(param.getPullParser(
                            com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteIntegerValueResponse.MY_QNAME)));
            org.apache.axiom.om.OMElement documentElement = builder.getDocumentElement();
            ((org.apache.axiom.om.impl.OMNodeEx) documentElement).setParent(null); // remove the parent link

            return documentElement;
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteIntegerValueResponse param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axis2.databinding.ADBSOAPModelBuilder builder = new org.apache.axis2.databinding.ADBSOAPModelBuilder(param.getPullParser(
                        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteIntegerValueResponse.MY_QNAME),
                    factory);

            return builder.getEnvelope();
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteObjectValue param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axiom.om.impl.builder.StAXOMBuilder builder = new org.apache.axiom.om.impl.builder.StAXOMBuilder(org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                    new org.apache.axis2.util.StreamWrapper(param.getPullParser(
                            com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteObjectValue.MY_QNAME)));
            org.apache.axiom.om.OMElement documentElement = builder.getDocumentElement();
            ((org.apache.axiom.om.impl.OMNodeEx) documentElement).setParent(null); // remove the parent link

            return documentElement;
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteObjectValue param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axis2.databinding.ADBSOAPModelBuilder builder = new org.apache.axis2.databinding.ADBSOAPModelBuilder(param.getPullParser(
                        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteObjectValue.MY_QNAME),
                    factory);

            return builder.getEnvelope();
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetIntegerValue param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axiom.om.impl.builder.StAXOMBuilder builder = new org.apache.axiom.om.impl.builder.StAXOMBuilder(org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                    new org.apache.axis2.util.StreamWrapper(param.getPullParser(
                            com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetIntegerValue.MY_QNAME)));
            org.apache.axiom.om.OMElement documentElement = builder.getDocumentElement();
            ((org.apache.axiom.om.impl.OMNodeEx) documentElement).setParent(null); // remove the parent link

            return documentElement;
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetIntegerValue param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axis2.databinding.ADBSOAPModelBuilder builder = new org.apache.axis2.databinding.ADBSOAPModelBuilder(param.getPullParser(
                        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetIntegerValue.MY_QNAME),
                    factory);

            return builder.getEnvelope();
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetStringValueResponse param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axiom.om.impl.builder.StAXOMBuilder builder = new org.apache.axiom.om.impl.builder.StAXOMBuilder(org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                    new org.apache.axis2.util.StreamWrapper(param.getPullParser(
                            com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetStringValueResponse.MY_QNAME)));
            org.apache.axiom.om.OMElement documentElement = builder.getDocumentElement();
            ((org.apache.axiom.om.impl.OMNodeEx) documentElement).setParent(null); // remove the parent link

            return documentElement;
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetStringValueResponse param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axis2.databinding.ADBSOAPModelBuilder builder = new org.apache.axis2.databinding.ADBSOAPModelBuilder(param.getPullParser(
                        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetStringValueResponse.MY_QNAME),
                    factory);

            return builder.getEnvelope();
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteStringValue param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axiom.om.impl.builder.StAXOMBuilder builder = new org.apache.axiom.om.impl.builder.StAXOMBuilder(org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                    new org.apache.axis2.util.StreamWrapper(param.getPullParser(
                            com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteStringValue.MY_QNAME)));
            org.apache.axiom.om.OMElement documentElement = builder.getDocumentElement();
            ((org.apache.axiom.om.impl.OMNodeEx) documentElement).setParent(null); // remove the parent link

            return documentElement;
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteStringValue param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axis2.databinding.ADBSOAPModelBuilder builder = new org.apache.axis2.databinding.ADBSOAPModelBuilder(param.getPullParser(
                        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteStringValue.MY_QNAME),
                    factory);

            return builder.getEnvelope();
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteDataItem param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axiom.om.impl.builder.StAXOMBuilder builder = new org.apache.axiom.om.impl.builder.StAXOMBuilder(org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                    new org.apache.axis2.util.StreamWrapper(param.getPullParser(
                            com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteDataItem.MY_QNAME)));
            org.apache.axiom.om.OMElement documentElement = builder.getDocumentElement();
            ((org.apache.axiom.om.impl.OMNodeEx) documentElement).setParent(null); // remove the parent link

            return documentElement;
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteDataItem param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axis2.databinding.ADBSOAPModelBuilder builder = new org.apache.axis2.databinding.ADBSOAPModelBuilder(param.getPullParser(
                        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteDataItem.MY_QNAME),
                    factory);

            return builder.getEnvelope();
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteIntegerValue param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axiom.om.impl.builder.StAXOMBuilder builder = new org.apache.axiom.om.impl.builder.StAXOMBuilder(org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                    new org.apache.axis2.util.StreamWrapper(param.getPullParser(
                            com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteIntegerValue.MY_QNAME)));
            org.apache.axiom.om.OMElement documentElement = builder.getDocumentElement();
            ((org.apache.axiom.om.impl.OMNodeEx) documentElement).setParent(null); // remove the parent link

            return documentElement;
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteIntegerValue param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axis2.databinding.ADBSOAPModelBuilder builder = new org.apache.axis2.databinding.ADBSOAPModelBuilder(param.getPullParser(
                        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteIntegerValue.MY_QNAME),
                    factory);

            return builder.getEnvelope();
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteDataItemResponse param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axiom.om.impl.builder.StAXOMBuilder builder = new org.apache.axiom.om.impl.builder.StAXOMBuilder(org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                    new org.apache.axis2.util.StreamWrapper(param.getPullParser(
                            com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteDataItemResponse.MY_QNAME)));
            org.apache.axiom.om.OMElement documentElement = builder.getDocumentElement();
            ((org.apache.axiom.om.impl.OMNodeEx) documentElement).setParent(null); // remove the parent link

            return documentElement;
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteDataItemResponse param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axis2.databinding.ADBSOAPModelBuilder builder = new org.apache.axis2.databinding.ADBSOAPModelBuilder(param.getPullParser(
                        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteDataItemResponse.MY_QNAME),
                    factory);

            return builder.getEnvelope();
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteStringValueResponse param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axiom.om.impl.builder.StAXOMBuilder builder = new org.apache.axiom.om.impl.builder.StAXOMBuilder(org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                    new org.apache.axis2.util.StreamWrapper(param.getPullParser(
                            com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteStringValueResponse.MY_QNAME)));
            org.apache.axiom.om.OMElement documentElement = builder.getDocumentElement();
            ((org.apache.axiom.om.impl.OMNodeEx) documentElement).setParent(null); // remove the parent link

            return documentElement;
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteStringValueResponse param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axis2.databinding.ADBSOAPModelBuilder builder = new org.apache.axis2.databinding.ADBSOAPModelBuilder(param.getPullParser(
                        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteStringValueResponse.MY_QNAME),
                    factory);

            return builder.getEnvelope();
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetStringValue param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axiom.om.impl.builder.StAXOMBuilder builder = new org.apache.axiom.om.impl.builder.StAXOMBuilder(org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                    new org.apache.axis2.util.StreamWrapper(param.getPullParser(
                            com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetStringValue.MY_QNAME)));
            org.apache.axiom.om.OMElement documentElement = builder.getDocumentElement();
            ((org.apache.axiom.om.impl.OMNodeEx) documentElement).setParent(null); // remove the parent link

            return documentElement;
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetStringValue param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axis2.databinding.ADBSOAPModelBuilder builder = new org.apache.axis2.databinding.ADBSOAPModelBuilder(param.getPullParser(
                        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetStringValue.MY_QNAME),
                    factory);

            return builder.getEnvelope();
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetIntegerValueResponse param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axiom.om.impl.builder.StAXOMBuilder builder = new org.apache.axiom.om.impl.builder.StAXOMBuilder(org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                    new org.apache.axis2.util.StreamWrapper(param.getPullParser(
                            com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetIntegerValueResponse.MY_QNAME)));
            org.apache.axiom.om.OMElement documentElement = builder.getDocumentElement();
            ((org.apache.axiom.om.impl.OMNodeEx) documentElement).setParent(null); // remove the parent link

            return documentElement;
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetIntegerValueResponse param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axis2.databinding.ADBSOAPModelBuilder builder = new org.apache.axis2.databinding.ADBSOAPModelBuilder(param.getPullParser(
                        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetIntegerValueResponse.MY_QNAME),
                    factory);

            return builder.getEnvelope();
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetObjectValueResponse param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axiom.om.impl.builder.StAXOMBuilder builder = new org.apache.axiom.om.impl.builder.StAXOMBuilder(org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                    new org.apache.axis2.util.StreamWrapper(param.getPullParser(
                            com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetObjectValueResponse.MY_QNAME)));
            org.apache.axiom.om.OMElement documentElement = builder.getDocumentElement();
            ((org.apache.axiom.om.impl.OMNodeEx) documentElement).setParent(null); // remove the parent link

            return documentElement;
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetObjectValueResponse param,
        boolean optimizeContent) {
        if (param instanceof org.apache.axis2.databinding.ADBBean) {
            org.apache.axis2.databinding.ADBSOAPModelBuilder builder = new org.apache.axis2.databinding.ADBSOAPModelBuilder(param.getPullParser(
                        com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetObjectValueResponse.MY_QNAME),
                    factory);

            return builder.getEnvelope();
        } else {
            //todo finish this onece the bean serializer has the necessary methods
            return null;
        }
    }

    /**
     * get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
        java.lang.Class type, java.util.Map extraNamespaces) {
        try {
            if (com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetObjectValue.class.equals(
                        type)) {
                return com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetObjectValue.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteObjectValueResponse.class.equals(
                        type)) {
                return com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteObjectValueResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.CreateDataItemResponse.class.equals(
                        type)) {
                return com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.CreateDataItemResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.CreateDataItem.class.equals(
                        type)) {
                return com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.CreateDataItem.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteIntegerValueResponse.class.equals(
                        type)) {
                return com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteIntegerValueResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteObjectValue.class.equals(
                        type)) {
                return com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteObjectValue.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetIntegerValue.class.equals(
                        type)) {
                return com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetIntegerValue.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetStringValueResponse.class.equals(
                        type)) {
                return com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetStringValueResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteStringValue.class.equals(
                        type)) {
                return com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteStringValue.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteDataItem.class.equals(
                        type)) {
                return com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteDataItem.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteIntegerValue.class.equals(
                        type)) {
                return com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteIntegerValue.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteDataItemResponse.class.equals(
                        type)) {
                return com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteDataItemResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteStringValueResponse.class.equals(
                        type)) {
                return com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.DeleteStringValueResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetStringValue.class.equals(
                        type)) {
                return com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetStringValue.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetIntegerValueResponse.class.equals(
                        type)) {
                return com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetIntegerValueResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetObjectValueResponse.class.equals(
                        type)) {
                return com.macrodeck.services.dataservice_0_2.MacroDeckServiceStub.SetObjectValueResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    //http://www.macrodeck.com/services/DataService
    public static class DeleteStringValue
        implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.macrodeck.com/xmlns/services/1.0/",
                "DeleteStringValue", "ns1");

        /** field for DeleteStringValue */
        protected DataServiceDeleteStringValue localDeleteStringValue;

        /**
         * Auto generated getter method
         *
         * @return DataServiceDeleteStringValue
         */
        public DataServiceDeleteStringValue getDeleteStringValue() {
            return localDeleteStringValue;
        }

        /**
         * Auto generated setter method
         *
         * @param param DeleteStringValue
         */
        public void setDeleteStringValue(DataServiceDeleteStringValue param) {
            this.localDeleteStringValue = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            //We can safely assume an element has only one type associated with it
            return localDeleteStringValue.getPullParser(MY_QNAME);
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static DeleteStringValue parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DeleteStringValue object = new DeleteStringValue();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.macrodeck.com/xmlns/services/1.0/",
                                "DeleteStringValue").equals(reader.getName())) {
                        object.setDeleteStringValue(DataServiceDeleteStringValue.Factory.parse(
                                reader));
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DeleteObjectValueResponse
        implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.macrodeck.com/xmlns/services/1.0/",
                "DeleteObjectValueResponse", "ns1");

        /** field for DeleteObjectValueResponse */
        protected DataServiceDeleteObjectValueResponse localDeleteObjectValueResponse;

        /**
         * Auto generated getter method
         *
         * @return DataServiceDeleteObjectValueResponse
         */
        public DataServiceDeleteObjectValueResponse getDeleteObjectValueResponse() {
            return localDeleteObjectValueResponse;
        }

        /**
         * Auto generated setter method
         *
         * @param param DeleteObjectValueResponse
         */
        public void setDeleteObjectValueResponse(
            DataServiceDeleteObjectValueResponse param) {
            this.localDeleteObjectValueResponse = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            //We can safely assume an element has only one type associated with it
            return localDeleteObjectValueResponse.getPullParser(MY_QNAME);
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static DeleteObjectValueResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DeleteObjectValueResponse object = new DeleteObjectValueResponse();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.macrodeck.com/xmlns/services/1.0/",
                                "DeleteObjectValueResponse").equals(
                                reader.getName())) {
                        object.setDeleteObjectValueResponse(DataServiceDeleteObjectValueResponse.Factory.parse(
                                reader));
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class SetStringValue
        implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.macrodeck.com/xmlns/services/1.0/",
                "SetStringValue", "ns1");

        /** field for SetStringValue */
        protected DataServiceSetStringValue localSetStringValue;

        /**
         * Auto generated getter method
         *
         * @return DataServiceSetStringValue
         */
        public DataServiceSetStringValue getSetStringValue() {
            return localSetStringValue;
        }

        /**
         * Auto generated setter method
         *
         * @param param SetStringValue
         */
        public void setSetStringValue(DataServiceSetStringValue param) {
            this.localSetStringValue = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            //We can safely assume an element has only one type associated with it
            return localSetStringValue.getPullParser(MY_QNAME);
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static SetStringValue parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                SetStringValue object = new SetStringValue();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.macrodeck.com/xmlns/services/1.0/",
                                "SetStringValue").equals(reader.getName())) {
                        object.setSetStringValue(DataServiceSetStringValue.Factory.parse(
                                reader));
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class SetIntegerValueResponse
        implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.macrodeck.com/xmlns/services/1.0/",
                "SetIntegerValueResponse", "ns1");

        /** field for SetIntegerValueResponse */
        protected DataServiceSetIntegerValueResponse localSetIntegerValueResponse;

        /**
         * Auto generated getter method
         *
         * @return DataServiceSetIntegerValueResponse
         */
        public DataServiceSetIntegerValueResponse getSetIntegerValueResponse() {
            return localSetIntegerValueResponse;
        }

        /**
         * Auto generated setter method
         *
         * @param param SetIntegerValueResponse
         */
        public void setSetIntegerValueResponse(
            DataServiceSetIntegerValueResponse param) {
            this.localSetIntegerValueResponse = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            //We can safely assume an element has only one type associated with it
            return localSetIntegerValueResponse.getPullParser(MY_QNAME);
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static SetIntegerValueResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                SetIntegerValueResponse object = new SetIntegerValueResponse();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.macrodeck.com/xmlns/services/1.0/",
                                "SetIntegerValueResponse").equals(
                                reader.getName())) {
                        object.setSetIntegerValueResponse(DataServiceSetIntegerValueResponse.Factory.parse(
                                reader));
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DeleteDataItem
        implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.macrodeck.com/xmlns/services/1.0/",
                "DeleteDataItem", "ns1");

        /** field for DeleteDataItem */
        protected DataServiceDeleteDataItem localDeleteDataItem;

        /**
         * Auto generated getter method
         *
         * @return DataServiceDeleteDataItem
         */
        public DataServiceDeleteDataItem getDeleteDataItem() {
            return localDeleteDataItem;
        }

        /**
         * Auto generated setter method
         *
         * @param param DeleteDataItem
         */
        public void setDeleteDataItem(DataServiceDeleteDataItem param) {
            this.localDeleteDataItem = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            //We can safely assume an element has only one type associated with it
            return localDeleteDataItem.getPullParser(MY_QNAME);
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static DeleteDataItem parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DeleteDataItem object = new DeleteDataItem();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.macrodeck.com/xmlns/services/1.0/",
                                "DeleteDataItem").equals(reader.getName())) {
                        object.setDeleteDataItem(DataServiceDeleteDataItem.Factory.parse(
                                reader));
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DataServiceDeleteDataItem
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = DataService-DeleteDataItem
                Namespace URI = http://www.macrodeck.com/xmlns/services/1.0/
                Namespace Prefix = ns1
                */

        /** field for ItemUUID */
        protected java.lang.String localItemUUID;

        /** field for AuthCode */
        protected java.lang.String localAuthCode;

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getItemUUID() {
            return localItemUUID;
        }

        /**
         * Auto generated setter method
         *
         * @param param ItemUUID
         */
        public void setItemUUID(java.lang.String param) {
            this.localItemUUID = param;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getAuthCode() {
            return localAuthCode;
        }

        /**
         * Auto generated setter method
         *
         * @param param AuthCode
         */
        public void setAuthCode(java.lang.String param) {
            this.localAuthCode = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("", "itemUUID"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localItemUUID));

            elementList.add(new javax.xml.namespace.QName("", "authCode"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localAuthCode));

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static DataServiceDeleteDataItem parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DataServiceDeleteDataItem object = new DataServiceDeleteDataItem();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "itemUUID").equals(
                                reader.getName())) {
                        java.lang.String content = getElementTextProperly(reader);
                        object.setItemUUID(org.apache.axis2.databinding.utils.ConverterUtil.convertTostring(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "authCode").equals(
                                reader.getName())) {
                        java.lang.String content = getElementTextProperly(reader);
                        object.setAuthCode(org.apache.axis2.databinding.utils.ConverterUtil.convertTostring(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DeleteObjectValue
        implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.macrodeck.com/xmlns/services/1.0/",
                "DeleteObjectValue", "ns1");

        /** field for DeleteObjectValue */
        protected DataServiceDeleteObjectValue localDeleteObjectValue;

        /**
         * Auto generated getter method
         *
         * @return DataServiceDeleteObjectValue
         */
        public DataServiceDeleteObjectValue getDeleteObjectValue() {
            return localDeleteObjectValue;
        }

        /**
         * Auto generated setter method
         *
         * @param param DeleteObjectValue
         */
        public void setDeleteObjectValue(DataServiceDeleteObjectValue param) {
            this.localDeleteObjectValue = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            //We can safely assume an element has only one type associated with it
            return localDeleteObjectValue.getPullParser(MY_QNAME);
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static DeleteObjectValue parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DeleteObjectValue object = new DeleteObjectValue();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.macrodeck.com/xmlns/services/1.0/",
                                "DeleteObjectValue").equals(reader.getName())) {
                        object.setDeleteObjectValue(DataServiceDeleteObjectValue.Factory.parse(
                                reader));
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class SetIntegerValue
        implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.macrodeck.com/xmlns/services/1.0/",
                "SetIntegerValue", "ns1");

        /** field for SetIntegerValue */
        protected DataServiceSetIntegerValue localSetIntegerValue;

        /**
         * Auto generated getter method
         *
         * @return DataServiceSetIntegerValue
         */
        public DataServiceSetIntegerValue getSetIntegerValue() {
            return localSetIntegerValue;
        }

        /**
         * Auto generated setter method
         *
         * @param param SetIntegerValue
         */
        public void setSetIntegerValue(DataServiceSetIntegerValue param) {
            this.localSetIntegerValue = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            //We can safely assume an element has only one type associated with it
            return localSetIntegerValue.getPullParser(MY_QNAME);
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static SetIntegerValue parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                SetIntegerValue object = new SetIntegerValue();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.macrodeck.com/xmlns/services/1.0/",
                                "SetIntegerValue").equals(reader.getName())) {
                        object.setSetIntegerValue(DataServiceSetIntegerValue.Factory.parse(
                                reader));
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DataServiceDeleteStringValueResponse
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = DataService-DeleteStringValueResponse
                Namespace URI = http://www.macrodeck.com/xmlns/services/1.0/
                Namespace Prefix = ns1
                */

        /** field for _return */
        protected boolean local_return;

        /**
         * Auto generated getter method
         *
         * @return boolean
         */
        public boolean get_return() {
            return local_return;
        }

        /**
         * Auto generated setter method
         *
         * @param param _return
         */
        public void set_return(boolean param) {
            this.local_return = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("", "return"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    local_return));

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static DataServiceDeleteStringValueResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DataServiceDeleteStringValueResponse object = new DataServiceDeleteStringValueResponse();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "return").equals(
                                reader.getName())) {
                        java.lang.String content = getElementTextProperly(reader);
                        object.set_return(org.apache.axis2.databinding.utils.ConverterUtil.convertToboolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DataServiceDeleteDataItemResponse
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = DataService-DeleteDataItemResponse
                Namespace URI = http://www.macrodeck.com/xmlns/services/1.0/
                Namespace Prefix = ns1
                */

        /** field for _return */
        protected boolean local_return;

        /**
         * Auto generated getter method
         *
         * @return boolean
         */
        public boolean get_return() {
            return local_return;
        }

        /**
         * Auto generated setter method
         *
         * @param param _return
         */
        public void set_return(boolean param) {
            this.local_return = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("", "return"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    local_return));

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static DataServiceDeleteDataItemResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DataServiceDeleteDataItemResponse object = new DataServiceDeleteDataItemResponse();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "return").equals(
                                reader.getName())) {
                        java.lang.String content = getElementTextProperly(reader);
                        object.set_return(org.apache.axis2.databinding.utils.ConverterUtil.convertToboolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DataServiceDeleteIntegerValue
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = DataService-DeleteIntegerValue
                Namespace URI = http://www.macrodeck.com/xmlns/services/1.0/
                Namespace Prefix = ns1
                */

        /** field for ItemUUID */
        protected java.lang.String localItemUUID;

        /** field for AuthCode */
        protected java.lang.String localAuthCode;

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getItemUUID() {
            return localItemUUID;
        }

        /**
         * Auto generated setter method
         *
         * @param param ItemUUID
         */
        public void setItemUUID(java.lang.String param) {
            this.localItemUUID = param;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getAuthCode() {
            return localAuthCode;
        }

        /**
         * Auto generated setter method
         *
         * @param param AuthCode
         */
        public void setAuthCode(java.lang.String param) {
            this.localAuthCode = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("", "itemUUID"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localItemUUID));

            elementList.add(new javax.xml.namespace.QName("", "authCode"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localAuthCode));

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static DataServiceDeleteIntegerValue parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DataServiceDeleteIntegerValue object = new DataServiceDeleteIntegerValue();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "itemUUID").equals(
                                reader.getName())) {
                        java.lang.String content = getElementTextProperly(reader);
                        object.setItemUUID(org.apache.axis2.databinding.utils.ConverterUtil.convertTostring(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "authCode").equals(
                                reader.getName())) {
                        java.lang.String content = getElementTextProperly(reader);
                        object.setAuthCode(org.apache.axis2.databinding.utils.ConverterUtil.convertTostring(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DataServiceCreateDataItemResponse
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = DataService-CreateDataItemResponse
                Namespace URI = http://www.macrodeck.com/xmlns/services/1.0/
                Namespace Prefix = ns1
                */

        /** field for _return */
        protected java.lang.String local_return;

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String get_return() {
            return local_return;
        }

        /**
         * Auto generated setter method
         *
         * @param param _return
         */
        public void set_return(java.lang.String param) {
            this.local_return = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("", "return"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    local_return));

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static DataServiceCreateDataItemResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DataServiceCreateDataItemResponse object = new DataServiceCreateDataItemResponse();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "return").equals(
                                reader.getName())) {
                        java.lang.String content = getElementTextProperly(reader);
                        object.set_return(org.apache.axis2.databinding.utils.ConverterUtil.convertTostring(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DataServiceSetStringValueResponse
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = DataService-SetStringValueResponse
                Namespace URI = http://www.macrodeck.com/xmlns/services/1.0/
                Namespace Prefix = ns1
                */

        /** field for _return */
        protected boolean local_return;

        /**
         * Auto generated getter method
         *
         * @return boolean
         */
        public boolean get_return() {
            return local_return;
        }

        /**
         * Auto generated setter method
         *
         * @param param _return
         */
        public void set_return(boolean param) {
            this.local_return = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("", "return"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    local_return));

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static DataServiceSetStringValueResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DataServiceSetStringValueResponse object = new DataServiceSetStringValueResponse();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "return").equals(
                                reader.getName())) {
                        java.lang.String content = getElementTextProperly(reader);
                        object.set_return(org.apache.axis2.databinding.utils.ConverterUtil.convertToboolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class SetObjectValueResponse
        implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.macrodeck.com/xmlns/services/1.0/",
                "SetObjectValueResponse", "ns1");

        /** field for SetObjectValueResponse */
        protected DataServiceSetObjectValueResponse localSetObjectValueResponse;

        /**
         * Auto generated getter method
         *
         * @return DataServiceSetObjectValueResponse
         */
        public DataServiceSetObjectValueResponse getSetObjectValueResponse() {
            return localSetObjectValueResponse;
        }

        /**
         * Auto generated setter method
         *
         * @param param SetObjectValueResponse
         */
        public void setSetObjectValueResponse(
            DataServiceSetObjectValueResponse param) {
            this.localSetObjectValueResponse = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            //We can safely assume an element has only one type associated with it
            return localSetObjectValueResponse.getPullParser(MY_QNAME);
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static SetObjectValueResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                SetObjectValueResponse object = new SetObjectValueResponse();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.macrodeck.com/xmlns/services/1.0/",
                                "SetObjectValueResponse").equals(
                                reader.getName())) {
                        object.setSetObjectValueResponse(DataServiceSetObjectValueResponse.Factory.parse(
                                reader));
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DataServiceSetObjectValueResponse
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = DataService-SetObjectValueResponse
                Namespace URI = http://www.macrodeck.com/xmlns/services/1.0/
                Namespace Prefix = ns1
                */

        /** field for _return */
        protected boolean local_return;

        /**
         * Auto generated getter method
         *
         * @return boolean
         */
        public boolean get_return() {
            return local_return;
        }

        /**
         * Auto generated setter method
         *
         * @param param _return
         */
        public void set_return(boolean param) {
            this.local_return = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("", "return"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    local_return));

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static DataServiceSetObjectValueResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DataServiceSetObjectValueResponse object = new DataServiceSetObjectValueResponse();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "return").equals(
                                reader.getName())) {
                        java.lang.String content = getElementTextProperly(reader);
                        object.set_return(org.apache.axis2.databinding.utils.ConverterUtil.convertToboolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DeleteDataItemResponse
        implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.macrodeck.com/xmlns/services/1.0/",
                "DeleteDataItemResponse", "ns1");

        /** field for DeleteDataItemResponse */
        protected DataServiceDeleteDataItemResponse localDeleteDataItemResponse;

        /**
         * Auto generated getter method
         *
         * @return DataServiceDeleteDataItemResponse
         */
        public DataServiceDeleteDataItemResponse getDeleteDataItemResponse() {
            return localDeleteDataItemResponse;
        }

        /**
         * Auto generated setter method
         *
         * @param param DeleteDataItemResponse
         */
        public void setDeleteDataItemResponse(
            DataServiceDeleteDataItemResponse param) {
            this.localDeleteDataItemResponse = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            //We can safely assume an element has only one type associated with it
            return localDeleteDataItemResponse.getPullParser(MY_QNAME);
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static DeleteDataItemResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DeleteDataItemResponse object = new DeleteDataItemResponse();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.macrodeck.com/xmlns/services/1.0/",
                                "DeleteDataItemResponse").equals(
                                reader.getName())) {
                        object.setDeleteDataItemResponse(DataServiceDeleteDataItemResponse.Factory.parse(
                                reader));
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class CreateDataItemResponse
        implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.macrodeck.com/xmlns/services/1.0/",
                "CreateDataItemResponse", "ns1");

        /** field for CreateDataItemResponse */
        protected DataServiceCreateDataItemResponse localCreateDataItemResponse;

        /**
         * Auto generated getter method
         *
         * @return DataServiceCreateDataItemResponse
         */
        public DataServiceCreateDataItemResponse getCreateDataItemResponse() {
            return localCreateDataItemResponse;
        }

        /**
         * Auto generated setter method
         *
         * @param param CreateDataItemResponse
         */
        public void setCreateDataItemResponse(
            DataServiceCreateDataItemResponse param) {
            this.localCreateDataItemResponse = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            //We can safely assume an element has only one type associated with it
            return localCreateDataItemResponse.getPullParser(MY_QNAME);
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static CreateDataItemResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                CreateDataItemResponse object = new CreateDataItemResponse();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.macrodeck.com/xmlns/services/1.0/",
                                "CreateDataItemResponse").equals(
                                reader.getName())) {
                        object.setCreateDataItemResponse(DataServiceCreateDataItemResponse.Factory.parse(
                                reader));
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DataServiceSetObjectValue
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = DataService-SetObjectValue
                Namespace URI = http://www.macrodeck.com/xmlns/services/1.0/
                Namespace Prefix = ns1
                */

        /** field for Value */
        protected org.apache.axiom.om.OMElement localValue;

        /** field for ItemUUID */
        protected java.lang.String localItemUUID;

        /** field for AuthCode */
        protected java.lang.String localAuthCode;

        /**
         * Auto generated getter method
         *
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getValue() {
            return localValue;
        }

        /**
         * Auto generated setter method
         *
         * @param param Value
         */
        public void setValue(org.apache.axiom.om.OMElement param) {
            this.localValue = param;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getItemUUID() {
            return localItemUUID;
        }

        /**
         * Auto generated setter method
         *
         * @param param ItemUUID
         */
        public void setItemUUID(java.lang.String param) {
            this.localItemUUID = param;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getAuthCode() {
            return localAuthCode;
        }

        /**
         * Auto generated setter method
         *
         * @param param AuthCode
         */
        public void setAuthCode(java.lang.String param) {
            this.localAuthCode = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("", "value"));

            if (localValue == null) {
                throw new RuntimeException("value cannot be null!!");
            }

            elementList.add(localValue);

            elementList.add(new javax.xml.namespace.QName("", "itemUUID"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localItemUUID));

            elementList.add(new javax.xml.namespace.QName("", "authCode"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localAuthCode));

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static DataServiceSetObjectValue parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DataServiceSetObjectValue object = new DataServiceSetObjectValue();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "value").equals(
                                reader.getName())) {
                        boolean loopDone1 = false;
                        javax.xml.namespace.QName startQname1 = new javax.xml.namespace.QName("",
                                "value");

                        while (!loopDone1) {
                            if (reader.isStartElement() &&
                                    startQname1.equals(reader.getName())) {
                                loopDone1 = true;
                            } else {
                                reader.next();
                            }
                        }

                        // We need to wrap the reader so that it produces a fake START_DOCUEMENT event
                        // this is needed by the builder classes
                        org.apache.axis2.databinding.utils.NamedStaxOMBuilder builder1 =
                            new org.apache.axis2.databinding.utils.NamedStaxOMBuilder(new org.apache.axis2.util.StreamWrapper(
                                    reader), startQname1);
                        object.setValue(builder1.getOMElement());

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "itemUUID").equals(
                                reader.getName())) {
                        java.lang.String content = getElementTextProperly(reader);
                        object.setItemUUID(org.apache.axis2.databinding.utils.ConverterUtil.convertTostring(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "authCode").equals(
                                reader.getName())) {
                        java.lang.String content = getElementTextProperly(reader);
                        object.setAuthCode(org.apache.axis2.databinding.utils.ConverterUtil.convertTostring(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DataServiceDeleteObjectValueResponse
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = DataService-DeleteObjectValueResponse
                Namespace URI = http://www.macrodeck.com/xmlns/services/1.0/
                Namespace Prefix = ns1
                */

        /** field for _return */
        protected boolean local_return;

        /**
         * Auto generated getter method
         *
         * @return boolean
         */
        public boolean get_return() {
            return local_return;
        }

        /**
         * Auto generated setter method
         *
         * @param param _return
         */
        public void set_return(boolean param) {
            this.local_return = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("", "return"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    local_return));

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static DataServiceDeleteObjectValueResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DataServiceDeleteObjectValueResponse object = new DataServiceDeleteObjectValueResponse();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "return").equals(
                                reader.getName())) {
                        java.lang.String content = getElementTextProperly(reader);
                        object.set_return(org.apache.axis2.databinding.utils.ConverterUtil.convertToboolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DeleteIntegerValue
        implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.macrodeck.com/xmlns/services/1.0/",
                "DeleteIntegerValue", "ns1");

        /** field for DeleteIntegerValue */
        protected DataServiceDeleteIntegerValue localDeleteIntegerValue;

        /**
         * Auto generated getter method
         *
         * @return DataServiceDeleteIntegerValue
         */
        public DataServiceDeleteIntegerValue getDeleteIntegerValue() {
            return localDeleteIntegerValue;
        }

        /**
         * Auto generated setter method
         *
         * @param param DeleteIntegerValue
         */
        public void setDeleteIntegerValue(DataServiceDeleteIntegerValue param) {
            this.localDeleteIntegerValue = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            //We can safely assume an element has only one type associated with it
            return localDeleteIntegerValue.getPullParser(MY_QNAME);
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static DeleteIntegerValue parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DeleteIntegerValue object = new DeleteIntegerValue();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.macrodeck.com/xmlns/services/1.0/",
                                "DeleteIntegerValue").equals(reader.getName())) {
                        object.setDeleteIntegerValue(DataServiceDeleteIntegerValue.Factory.parse(
                                reader));
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class CreateDataItem
        implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.macrodeck.com/xmlns/services/1.0/",
                "CreateDataItem", "ns1");

        /** field for CreateDataItem */
        protected DataServiceCreateDataItem localCreateDataItem;

        /**
         * Auto generated getter method
         *
         * @return DataServiceCreateDataItem
         */
        public DataServiceCreateDataItem getCreateDataItem() {
            return localCreateDataItem;
        }

        /**
         * Auto generated setter method
         *
         * @param param CreateDataItem
         */
        public void setCreateDataItem(DataServiceCreateDataItem param) {
            this.localCreateDataItem = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            //We can safely assume an element has only one type associated with it
            return localCreateDataItem.getPullParser(MY_QNAME);
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static CreateDataItem parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                CreateDataItem object = new CreateDataItem();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.macrodeck.com/xmlns/services/1.0/",
                                "CreateDataItem").equals(reader.getName())) {
                        object.setCreateDataItem(DataServiceCreateDataItem.Factory.parse(
                                reader));
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class SetStringValueResponse
        implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.macrodeck.com/xmlns/services/1.0/",
                "SetStringValueResponse", "ns1");

        /** field for SetStringValueResponse */
        protected DataServiceSetStringValueResponse localSetStringValueResponse;

        /**
         * Auto generated getter method
         *
         * @return DataServiceSetStringValueResponse
         */
        public DataServiceSetStringValueResponse getSetStringValueResponse() {
            return localSetStringValueResponse;
        }

        /**
         * Auto generated setter method
         *
         * @param param SetStringValueResponse
         */
        public void setSetStringValueResponse(
            DataServiceSetStringValueResponse param) {
            this.localSetStringValueResponse = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            //We can safely assume an element has only one type associated with it
            return localSetStringValueResponse.getPullParser(MY_QNAME);
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static SetStringValueResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                SetStringValueResponse object = new SetStringValueResponse();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.macrodeck.com/xmlns/services/1.0/",
                                "SetStringValueResponse").equals(
                                reader.getName())) {
                        object.setSetStringValueResponse(DataServiceSetStringValueResponse.Factory.parse(
                                reader));
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DeleteStringValueResponse
        implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.macrodeck.com/xmlns/services/1.0/",
                "DeleteStringValueResponse", "ns1");

        /** field for DeleteStringValueResponse */
        protected DataServiceDeleteStringValueResponse localDeleteStringValueResponse;

        /**
         * Auto generated getter method
         *
         * @return DataServiceDeleteStringValueResponse
         */
        public DataServiceDeleteStringValueResponse getDeleteStringValueResponse() {
            return localDeleteStringValueResponse;
        }

        /**
         * Auto generated setter method
         *
         * @param param DeleteStringValueResponse
         */
        public void setDeleteStringValueResponse(
            DataServiceDeleteStringValueResponse param) {
            this.localDeleteStringValueResponse = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            //We can safely assume an element has only one type associated with it
            return localDeleteStringValueResponse.getPullParser(MY_QNAME);
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static DeleteStringValueResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DeleteStringValueResponse object = new DeleteStringValueResponse();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.macrodeck.com/xmlns/services/1.0/",
                                "DeleteStringValueResponse").equals(
                                reader.getName())) {
                        object.setDeleteStringValueResponse(DataServiceDeleteStringValueResponse.Factory.parse(
                                reader));
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DataServiceDeleteStringValue
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = DataService-DeleteStringValue
                Namespace URI = http://www.macrodeck.com/xmlns/services/1.0/
                Namespace Prefix = ns1
                */

        /** field for ItemUUID */
        protected java.lang.String localItemUUID;

        /** field for AuthCode */
        protected java.lang.String localAuthCode;

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getItemUUID() {
            return localItemUUID;
        }

        /**
         * Auto generated setter method
         *
         * @param param ItemUUID
         */
        public void setItemUUID(java.lang.String param) {
            this.localItemUUID = param;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getAuthCode() {
            return localAuthCode;
        }

        /**
         * Auto generated setter method
         *
         * @param param AuthCode
         */
        public void setAuthCode(java.lang.String param) {
            this.localAuthCode = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("", "itemUUID"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localItemUUID));

            elementList.add(new javax.xml.namespace.QName("", "authCode"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localAuthCode));

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static DataServiceDeleteStringValue parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DataServiceDeleteStringValue object = new DataServiceDeleteStringValue();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "itemUUID").equals(
                                reader.getName())) {
                        java.lang.String content = getElementTextProperly(reader);
                        object.setItemUUID(org.apache.axis2.databinding.utils.ConverterUtil.convertTostring(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "authCode").equals(
                                reader.getName())) {
                        java.lang.String content = getElementTextProperly(reader);
                        object.setAuthCode(org.apache.axis2.databinding.utils.ConverterUtil.convertTostring(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class SetObjectValue
        implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.macrodeck.com/xmlns/services/1.0/",
                "SetObjectValue", "ns1");

        /** field for SetObjectValue */
        protected DataServiceSetObjectValue localSetObjectValue;

        /**
         * Auto generated getter method
         *
         * @return DataServiceSetObjectValue
         */
        public DataServiceSetObjectValue getSetObjectValue() {
            return localSetObjectValue;
        }

        /**
         * Auto generated setter method
         *
         * @param param SetObjectValue
         */
        public void setSetObjectValue(DataServiceSetObjectValue param) {
            this.localSetObjectValue = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            //We can safely assume an element has only one type associated with it
            return localSetObjectValue.getPullParser(MY_QNAME);
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static SetObjectValue parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                SetObjectValue object = new SetObjectValue();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.macrodeck.com/xmlns/services/1.0/",
                                "SetObjectValue").equals(reader.getName())) {
                        object.setSetObjectValue(DataServiceSetObjectValue.Factory.parse(
                                reader));
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DataServiceCreateDataItem
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = DataService-CreateDataItem
                Namespace URI = http://www.macrodeck.com/xmlns/services/1.0/
                Namespace Prefix = ns1
                */

        /** field for Grouping */
        protected java.lang.String localGrouping;

        /** field for Metadata */
        protected org.apache.axiom.om.OMElement localMetadata;

        /** field for AuthCode */
        protected java.lang.String localAuthCode;

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getGrouping() {
            return localGrouping;
        }

        /**
         * Auto generated setter method
         *
         * @param param Grouping
         */
        public void setGrouping(java.lang.String param) {
            this.localGrouping = param;
        }

        /**
         * Auto generated getter method
         *
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getMetadata() {
            return localMetadata;
        }

        /**
         * Auto generated setter method
         *
         * @param param Metadata
         */
        public void setMetadata(org.apache.axiom.om.OMElement param) {
            this.localMetadata = param;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getAuthCode() {
            return localAuthCode;
        }

        /**
         * Auto generated setter method
         *
         * @param param AuthCode
         */
        public void setAuthCode(java.lang.String param) {
            this.localAuthCode = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("", "grouping"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localGrouping));

            elementList.add(new javax.xml.namespace.QName("", "metadata"));

            if (localMetadata == null) {
                throw new RuntimeException("metadata cannot be null!!");
            }

            elementList.add(localMetadata);

            elementList.add(new javax.xml.namespace.QName("", "authCode"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localAuthCode));

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static DataServiceCreateDataItem parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DataServiceCreateDataItem object = new DataServiceCreateDataItem();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "grouping").equals(
                                reader.getName())) {
                        java.lang.String content = getElementTextProperly(reader);
                        object.setGrouping(org.apache.axis2.databinding.utils.ConverterUtil.convertTostring(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "metadata").equals(
                                reader.getName())) {
                        boolean loopDone2 = false;
                        javax.xml.namespace.QName startQname2 = new javax.xml.namespace.QName("",
                                "metadata");

                        while (!loopDone2) {
                            if (reader.isStartElement() &&
                                    startQname2.equals(reader.getName())) {
                                loopDone2 = true;
                            } else {
                                reader.next();
                            }
                        }

                        // We need to wrap the reader so that it produces a fake START_DOCUEMENT event
                        // this is needed by the builder classes
                        org.apache.axis2.databinding.utils.NamedStaxOMBuilder builder2 =
                            new org.apache.axis2.databinding.utils.NamedStaxOMBuilder(new org.apache.axis2.util.StreamWrapper(
                                    reader), startQname2);
                        object.setMetadata(builder2.getOMElement());

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "authCode").equals(
                                reader.getName())) {
                        java.lang.String content = getElementTextProperly(reader);
                        object.setAuthCode(org.apache.axis2.databinding.utils.ConverterUtil.convertTostring(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DataServiceDeleteIntegerValueResponse
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = DataService-DeleteIntegerValueResponse
                Namespace URI = http://www.macrodeck.com/xmlns/services/1.0/
                Namespace Prefix = ns1
                */

        /** field for _return */
        protected boolean local_return;

        /**
         * Auto generated getter method
         *
         * @return boolean
         */
        public boolean get_return() {
            return local_return;
        }

        /**
         * Auto generated setter method
         *
         * @param param _return
         */
        public void set_return(boolean param) {
            this.local_return = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("", "return"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    local_return));

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static DataServiceDeleteIntegerValueResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DataServiceDeleteIntegerValueResponse object = new DataServiceDeleteIntegerValueResponse();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "return").equals(
                                reader.getName())) {
                        java.lang.String content = getElementTextProperly(reader);
                        object.set_return(org.apache.axis2.databinding.utils.ConverterUtil.convertToboolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DataServiceSetStringValue
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = DataService-SetStringValue
                Namespace URI = http://www.macrodeck.com/xmlns/services/1.0/
                Namespace Prefix = ns1
                */

        /** field for Value */
        protected java.lang.String localValue;

        /** field for ItemUUID */
        protected java.lang.String localItemUUID;

        /** field for AuthCode */
        protected java.lang.String localAuthCode;

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getValue() {
            return localValue;
        }

        /**
         * Auto generated setter method
         *
         * @param param Value
         */
        public void setValue(java.lang.String param) {
            this.localValue = param;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getItemUUID() {
            return localItemUUID;
        }

        /**
         * Auto generated setter method
         *
         * @param param ItemUUID
         */
        public void setItemUUID(java.lang.String param) {
            this.localItemUUID = param;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getAuthCode() {
            return localAuthCode;
        }

        /**
         * Auto generated setter method
         *
         * @param param AuthCode
         */
        public void setAuthCode(java.lang.String param) {
            this.localAuthCode = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("", "value"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localValue));

            elementList.add(new javax.xml.namespace.QName("", "itemUUID"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localItemUUID));

            elementList.add(new javax.xml.namespace.QName("", "authCode"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localAuthCode));

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static DataServiceSetStringValue parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DataServiceSetStringValue object = new DataServiceSetStringValue();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "value").equals(
                                reader.getName())) {
                        java.lang.String content = getElementTextProperly(reader);
                        object.setValue(org.apache.axis2.databinding.utils.ConverterUtil.convertTostring(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "itemUUID").equals(
                                reader.getName())) {
                        java.lang.String content = getElementTextProperly(reader);
                        object.setItemUUID(org.apache.axis2.databinding.utils.ConverterUtil.convertTostring(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "authCode").equals(
                                reader.getName())) {
                        java.lang.String content = getElementTextProperly(reader);
                        object.setAuthCode(org.apache.axis2.databinding.utils.ConverterUtil.convertTostring(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DataServiceSetIntegerValue
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = DataService-SetIntegerValue
                Namespace URI = http://www.macrodeck.com/xmlns/services/1.0/
                Namespace Prefix = ns1
                */

        /** field for Value */
        protected int localValue;

        /** field for ItemUUID */
        protected java.lang.String localItemUUID;

        /** field for AuthCode */
        protected java.lang.String localAuthCode;

        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getValue() {
            return localValue;
        }

        /**
         * Auto generated setter method
         *
         * @param param Value
         */
        public void setValue(int param) {
            this.localValue = param;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getItemUUID() {
            return localItemUUID;
        }

        /**
         * Auto generated setter method
         *
         * @param param ItemUUID
         */
        public void setItemUUID(java.lang.String param) {
            this.localItemUUID = param;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getAuthCode() {
            return localAuthCode;
        }

        /**
         * Auto generated setter method
         *
         * @param param AuthCode
         */
        public void setAuthCode(java.lang.String param) {
            this.localAuthCode = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("", "value"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localValue));

            elementList.add(new javax.xml.namespace.QName("", "itemUUID"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localItemUUID));

            elementList.add(new javax.xml.namespace.QName("", "authCode"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localAuthCode));

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static DataServiceSetIntegerValue parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DataServiceSetIntegerValue object = new DataServiceSetIntegerValue();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "value").equals(
                                reader.getName())) {
                        java.lang.String content = getElementTextProperly(reader);
                        object.setValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToint(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "itemUUID").equals(
                                reader.getName())) {
                        java.lang.String content = getElementTextProperly(reader);
                        object.setItemUUID(org.apache.axis2.databinding.utils.ConverterUtil.convertTostring(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "authCode").equals(
                                reader.getName())) {
                        java.lang.String content = getElementTextProperly(reader);
                        object.setAuthCode(org.apache.axis2.databinding.utils.ConverterUtil.convertTostring(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DataServiceDeleteObjectValue
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = DataService-DeleteObjectValue
                Namespace URI = http://www.macrodeck.com/xmlns/services/1.0/
                Namespace Prefix = ns1
                */

        /** field for ItemUUID */
        protected java.lang.String localItemUUID;

        /** field for AuthCode */
        protected java.lang.String localAuthCode;

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getItemUUID() {
            return localItemUUID;
        }

        /**
         * Auto generated setter method
         *
         * @param param ItemUUID
         */
        public void setItemUUID(java.lang.String param) {
            this.localItemUUID = param;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getAuthCode() {
            return localAuthCode;
        }

        /**
         * Auto generated setter method
         *
         * @param param AuthCode
         */
        public void setAuthCode(java.lang.String param) {
            this.localAuthCode = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("", "itemUUID"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localItemUUID));

            elementList.add(new javax.xml.namespace.QName("", "authCode"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localAuthCode));

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static DataServiceDeleteObjectValue parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DataServiceDeleteObjectValue object = new DataServiceDeleteObjectValue();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "itemUUID").equals(
                                reader.getName())) {
                        java.lang.String content = getElementTextProperly(reader);
                        object.setItemUUID(org.apache.axis2.databinding.utils.ConverterUtil.convertTostring(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "authCode").equals(
                                reader.getName())) {
                        java.lang.String content = getElementTextProperly(reader);
                        object.setAuthCode(org.apache.axis2.databinding.utils.ConverterUtil.convertTostring(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DeleteIntegerValueResponse
        implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.macrodeck.com/xmlns/services/1.0/",
                "DeleteIntegerValueResponse", "ns1");

        /** field for DeleteIntegerValueResponse */
        protected DataServiceDeleteIntegerValueResponse localDeleteIntegerValueResponse;

        /**
         * Auto generated getter method
         *
         * @return DataServiceDeleteIntegerValueResponse
         */
        public DataServiceDeleteIntegerValueResponse getDeleteIntegerValueResponse() {
            return localDeleteIntegerValueResponse;
        }

        /**
         * Auto generated setter method
         *
         * @param param DeleteIntegerValueResponse
         */
        public void setDeleteIntegerValueResponse(
            DataServiceDeleteIntegerValueResponse param) {
            this.localDeleteIntegerValueResponse = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            //We can safely assume an element has only one type associated with it
            return localDeleteIntegerValueResponse.getPullParser(MY_QNAME);
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static DeleteIntegerValueResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DeleteIntegerValueResponse object = new DeleteIntegerValueResponse();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.macrodeck.com/xmlns/services/1.0/",
                                "DeleteIntegerValueResponse").equals(
                                reader.getName())) {
                        object.setDeleteIntegerValueResponse(DataServiceDeleteIntegerValueResponse.Factory.parse(
                                reader));
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DataServiceSetIntegerValueResponse
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = DataService-SetIntegerValueResponse
                Namespace URI = http://www.macrodeck.com/xmlns/services/1.0/
                Namespace Prefix = ns1
                */

        /** field for _return */
        protected boolean local_return;

        /**
         * Auto generated getter method
         *
         * @return boolean
         */
        public boolean get_return() {
            return local_return;
        }

        /**
         * Auto generated setter method
         *
         * @param param _return
         */
        public void set_return(boolean param) {
            this.local_return = param;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName) {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("", "return"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    local_return));

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            // This is horrible, but the OM implementation of getElementText() does not obey the proper contract.  Specifically, it does
            // does not advance the reader to the END_ELEMENT.  This bug is triggered by calls to getElementText() unpredictably, e.g. it
            // happens with outer (document) elements, but not with inner elements.  The root bug is in OMStAXWrapper.java, which is now part
            // of commons and so cannot just be fixed in axis2.  This method should be removed and the calls to it below replaced with
            // simple calls to getElementText() as soon as this serious bug can be fixed.
            private static java.lang.String getElementTextProperly(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                java.lang.String value = reader.getElementText();

                while (!reader.isEndElement())
                    reader.next();

                return value;
            }

            /**
             * static method to create the object Precondition:  If this object
             * is an element, the current or next start element starts this
             * object and any intervening reader events are ignorable If this
             * object is not an element, it is a complex type and the reader
             * is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is
             * positioned at its end element If this object is a complex type,
             * the reader is positioned at the end element of its outer
             * element
             */
            public static DataServiceSetIntegerValueResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DataServiceSetIntegerValueResponse object = new DataServiceSetIntegerValueResponse();
                int event;

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "return").equals(
                                reader.getName())) {
                        java.lang.String content = getElementTextProperly(reader);
                        object.set_return(org.apache.axis2.databinding.utils.ConverterUtil.convertToboolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new java.lang.RuntimeException(
                            "Unexpected subelement " + reader.getLocalName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }
}
