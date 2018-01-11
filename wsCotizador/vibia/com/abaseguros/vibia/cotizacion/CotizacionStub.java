/**
 * CotizacionStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package com.abaseguros.vibia.cotizacion;


/*
 *  CotizacionStub java implementation
 */
public class CotizacionStub extends org.apache.axis2.client.Stub
    implements Cotizacion {
    private static int counter = 0;
    protected org.apache.axis2.description.AxisOperation[] _operations;

    //hashmaps to keep the fault mapping
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();

    /////////////////////////////////////////////////////////////////////////
    private javax.xml.namespace.QName[] opNameArray = null;

    /**
     *Constructor that takes in a configContext
     */
    public CotizacionStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public CotizacionStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
        //To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,
                _service);

        _service.applyPolicy();

        _serviceClient.getOptions()
                      .setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

        //Set the soap version
        _serviceClient.getOptions()
                      .setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
    }

    /**
     * Default Constructor
     */
    public CotizacionStub(
        org.apache.axis2.context.ConfigurationContext configurationContext)
        throws org.apache.axis2.AxisFault {
        this(configurationContext,
            "http://web.abaseguros.com/VibiaConnect/Cotizacion.svc");
    }

    /**
     * Default Constructor
     */
    public CotizacionStub() throws org.apache.axis2.AxisFault {
        this("http://web.abaseguros.com/VibiaConnect/Cotizacion.svc");
    }

    /**
     * Constructor taking the target endpoint
     */
    public CotizacionStub(java.lang.String targetEndpoint)
        throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
    }

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }

        counter = counter + 1;

        return java.lang.Long.toString(java.lang.System.currentTimeMillis()) +
        "_" + counter;
    }

    private void populateAxisService() throws org.apache.axis2.AxisFault {
        //creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService("Cotizacion" +
                getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[1];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://ace.diversos.vibia.wcf.model/services/cotizacion",
                "getCotizacion"));
        _service.addOperation(__operation);

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body/><sp:Header Name=\"Token\" Namespace=\"http://ace.diversos.vibia.wcf.model/services/cotizacion\"/><sp:Header Name=\"To\" Namespace=\"http://www.w3.org/2005/08/addressing\"/><sp:Header Name=\"From\" Namespace=\"http://www.w3.org/2005/08/addressing\"/><sp:Header Name=\"FaultTo\" Namespace=\"http://www.w3.org/2005/08/addressing\"/><sp:Header Name=\"ReplyTo\" Namespace=\"http://www.w3.org/2005/08/addressing\"/><sp:Header Name=\"MessageID\" Namespace=\"http://www.w3.org/2005/08/addressing\"/><sp:Header Name=\"RelatesTo\" Namespace=\"http://www.w3.org/2005/08/addressing\"/><sp:Header Name=\"Action\" Namespace=\"http://www.w3.org/2005/08/addressing\"/></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body/><sp:Header Name=\"Token\" Namespace=\"http://ace.diversos.vibia.wcf.model/services/cotizacion\"/></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:SecureConversationToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys/><sp:BootstrapPolicy><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:SignedParts><sp:Body/><sp:Header Name=\"To\" Namespace=\"http://www.w3.org/2005/08/addressing\"/><sp:Header Name=\"From\" Namespace=\"http://www.w3.org/2005/08/addressing\"/><sp:Header Name=\"FaultTo\" Namespace=\"http://www.w3.org/2005/08/addressing\"/><sp:Header Name=\"ReplyTo\" Namespace=\"http://www.w3.org/2005/08/addressing\"/><sp:Header Name=\"MessageID\" Namespace=\"http://www.w3.org/2005/08/addressing\"/><sp:Header Name=\"RelatesTo\" Namespace=\"http://www.w3.org/2005/08/addressing\"/><sp:Header Name=\"Action\" Namespace=\"http://www.w3.org/2005/08/addressing\"/></sp:SignedParts><sp:EncryptedParts><sp:Body/></sp:EncryptedParts><sp:SymmetricBinding><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:SpnegoContextToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys/></wsp:Policy></sp:SpnegoContextToken></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout><sp:IncludeTimestamp/><sp:EncryptSignature/><sp:OnlySignEntireHeadersAndBody/></wsp:Policy></sp:SymmetricBinding><sp:Wss11><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"/></sp:Wss11><sp:Trust10><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens/><sp:RequireClientEntropy/><sp:RequireServerEntropy/></wsp:Policy></sp:Trust10></wsp:Policy></sp:BootstrapPolicy></wsp:Policy></sp:SecureConversationToken></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout><sp:IncludeTimestamp/><sp:EncryptSignature/><sp:OnlySignEntireHeadersAndBody/></wsp:Policy></sp:SymmetricBinding><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"/></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens/><sp:RequireClientEntropy/><sp:RequireServerEntropy/></wsp:Policy></sp:Trust10><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body/><sp:Header Name=\"To\" Namespace=\"http://www.w3.org/2005/08/addressing\"/><sp:Header Name=\"From\" Namespace=\"http://www.w3.org/2005/08/addressing\"/><sp:Header Name=\"FaultTo\" Namespace=\"http://www.w3.org/2005/08/addressing\"/><sp:Header Name=\"ReplyTo\" Namespace=\"http://www.w3.org/2005/08/addressing\"/><sp:Header Name=\"MessageID\" Namespace=\"http://www.w3.org/2005/08/addressing\"/><sp:Header Name=\"RelatesTo\" Namespace=\"http://www.w3.org/2005/08/addressing\"/><sp:Header Name=\"Action\" Namespace=\"http://www.w3.org/2005/08/addressing\"/></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body/></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:SecureConversationToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys/><sp:BootstrapPolicy><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:SignedParts><sp:Body/><sp:Header Name=\"To\" Namespace=\"http://www.w3.org/2005/08/addressing\"/><sp:Header Name=\"From\" Namespace=\"http://www.w3.org/2005/08/addressing\"/><sp:Header Name=\"FaultTo\" Namespace=\"http://www.w3.org/2005/08/addressing\"/><sp:Header Name=\"ReplyTo\" Namespace=\"http://www.w3.org/2005/08/addressing\"/><sp:Header Name=\"MessageID\" Namespace=\"http://www.w3.org/2005/08/addressing\"/><sp:Header Name=\"RelatesTo\" Namespace=\"http://www.w3.org/2005/08/addressing\"/><sp:Header Name=\"Action\" Namespace=\"http://www.w3.org/2005/08/addressing\"/></sp:SignedParts><sp:EncryptedParts><sp:Body/></sp:EncryptedParts><sp:SymmetricBinding><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:SpnegoContextToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys/></wsp:Policy></sp:SpnegoContextToken></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout><sp:IncludeTimestamp/><sp:EncryptSignature/><sp:OnlySignEntireHeadersAndBody/></wsp:Policy></sp:SymmetricBinding><sp:Wss11><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"/></sp:Wss11><sp:Trust10><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens/><sp:RequireClientEntropy/><sp:RequireServerEntropy/></wsp:Policy></sp:Trust10></wsp:Policy></sp:BootstrapPolicy></wsp:Policy></sp:SecureConversationToken></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout><sp:IncludeTimestamp/><sp:EncryptSignature/><sp:OnlySignEntireHeadersAndBody/></wsp:Policy></sp:SymmetricBinding><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"/></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens/><sp:RequireClientEntropy/><sp:RequireServerEntropy/></wsp:Policy></sp:Trust10><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        _operations[0] = __operation;
    }

    //populates the faults
    private void populateFaults() {
        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://ace.diversos.vibia.wcf.model/datacontracts/vibia",
                    "ServiceFault"), "GetCotizacion"),
            "com.abaseguros.vibia.cotizacion.Cotizacion_GetCotizacion_ServiceFaultFault_FaultMessage");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://ace.diversos.vibia.wcf.model/datacontracts/vibia",
                    "ServiceFault"), "GetCotizacion"),
            "com.abaseguros.vibia.cotizacion.Cotizacion_GetCotizacion_ServiceFaultFault_FaultMessage");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://ace.diversos.vibia.wcf.model/datacontracts/vibia",
                    "ServiceFault"), "GetCotizacion"),
            "model.wcf.vibia.diversos.ace.datacontracts.vibia.ServiceFaultE");
    }

    /**
     * Auto generated method signature
     *
     * @see com.abaseguros.vibia.cotizacion.Cotizacion#getCotizacion
     * @param inputGetCotizacion3
     * @param token4
     * @throws com.abaseguros.vibia.cotizacion.Cotizacion_GetCotizacion_ServiceFaultFault_FaultMessage :
     */
    public model.wcf.vibia.diversos.ace.services.cotizacion.OutputGetCotizacion getCotizacion(
        model.wcf.vibia.diversos.ace.services.cotizacion.InputGetCotizacion inputGetCotizacion3,
        model.wcf.vibia.diversos.ace.services.cotizacion.Token token4)
        throws java.rmi.RemoteException,
            com.abaseguros.vibia.cotizacion.Cotizacion_GetCotizacion_ServiceFaultFault_FaultMessage {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions()
                            .setAction("http://ace.diversos.vibia.wcf.model/services/cotizacion/GetCotizacion");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    inputGetCotizacion3,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/services/cotizacion",
                            "getCotizacion")),
                    new javax.xml.namespace.QName(
                        "http://ace.diversos.vibia.wcf.model/services/cotizacion",
                        "InputGetCotizacion"));

            env.build();

            // add the children only if the parameter is not null
            if (token4 != null) {
                org.apache.axiom.om.OMElement omElementtoken4 = toOM(token4,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://ace.diversos.vibia.wcf.model/services/cotizacion",
                                "getCotizacion")));
                addHeader(omElementtoken4, env);
            }

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    model.wcf.vibia.diversos.ace.services.cotizacion.OutputGetCotizacion.class);

            return (model.wcf.vibia.diversos.ace.services.cotizacion.OutputGetCotizacion) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetCotizacion"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetCotizacion"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetCotizacion"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof com.abaseguros.vibia.cotizacion.Cotizacion_GetCotizacion_ServiceFaultFault_FaultMessage) {
                            throw (com.abaseguros.vibia.cotizacion.Cotizacion_GetCotizacion_ServiceFaultFault_FaultMessage) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
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
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see com.abaseguros.vibia.cotizacion.Cotizacion#startgetCotizacion
     * @param inputGetCotizacion3
     * @param token4
     */
    public void startgetCotizacion(
        model.wcf.vibia.diversos.ace.services.cotizacion.InputGetCotizacion inputGetCotizacion3,
        model.wcf.vibia.diversos.ace.services.cotizacion.Token token4,
        final com.abaseguros.vibia.cotizacion.CotizacionCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
        _operationClient.getOptions()
                        .setAction("http://ace.diversos.vibia.wcf.model/services/cotizacion/GetCotizacion");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                inputGetCotizacion3,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "http://ace.diversos.vibia.wcf.model/services/cotizacion",
                        "getCotizacion")),
                new javax.xml.namespace.QName(
                    "http://ace.diversos.vibia.wcf.model/services/cotizacion",
                    "InputGetCotizacion"));

        // add the soap_headers only if they are not null
        if (token4 != null) {
            org.apache.axiom.om.OMElement omElementtoken4 = toOM(token4,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/services/cotizacion",
                            "getCotizacion")));
            addHeader(omElementtoken4, env);
        }

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                model.wcf.vibia.diversos.ace.services.cotizacion.OutputGetCotizacion.class);
                        callback.receiveResultgetCotizacion((model.wcf.vibia.diversos.ace.services.cotizacion.OutputGetCotizacion) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorgetCotizacion(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(), "GetCotizacion"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "GetCotizacion"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "GetCotizacion"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    if (ex instanceof com.abaseguros.vibia.cotizacion.Cotizacion_GetCotizacion_ServiceFaultFault_FaultMessage) {
                                        callback.receiveErrorgetCotizacion((com.abaseguros.vibia.cotizacion.Cotizacion_GetCotizacion_ServiceFaultFault_FaultMessage) ex);

                                        return;
                                    }

                                    callback.receiveErrorgetCotizacion(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetCotizacion(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetCotizacion(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetCotizacion(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetCotizacion(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetCotizacion(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetCotizacion(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetCotizacion(f);
                                }
                            } else {
                                callback.receiveErrorgetCotizacion(f);
                            }
                        } else {
                            callback.receiveErrorgetCotizacion(f);
                        }
                    } else {
                        callback.receiveErrorgetCotizacion(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorgetCotizacion(axisFault);
                    }
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

    ////////////////////////////////////////////////////////////////////////
    private static org.apache.neethi.Policy getPolicy(
        java.lang.String policyString) {
        return org.apache.neethi.PolicyEngine.getPolicy(org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                new java.io.StringReader(policyString)).getDocument()
                                                                                               .getXMLStreamReader(false));
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

    //http://web.abaseguros.com/VibiaConnect/Cotizacion.svc
    private org.apache.axiom.om.OMElement toOM(
        model.wcf.vibia.diversos.ace.services.cotizacion.InputGetCotizacion param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(model.wcf.vibia.diversos.ace.services.cotizacion.InputGetCotizacion.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        model.wcf.vibia.diversos.ace.services.cotizacion.OutputGetCotizacion param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(model.wcf.vibia.diversos.ace.services.cotizacion.OutputGetCotizacion.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        model.wcf.vibia.diversos.ace.datacontracts.vibia.ServiceFaultE param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(model.wcf.vibia.diversos.ace.datacontracts.vibia.ServiceFaultE.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        model.wcf.vibia.diversos.ace.services.cotizacion.Token param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(model.wcf.vibia.diversos.ace.services.cotizacion.Token.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        model.wcf.vibia.diversos.ace.services.cotizacion.InputGetCotizacion param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    model.wcf.vibia.diversos.ace.services.cotizacion.InputGetCotizacion.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
        java.lang.Class type) throws org.apache.axis2.AxisFault {
        try {
            if (model.wcf.vibia.diversos.ace.datacontracts.vibia.ServiceFaultE.class.equals(
                        type)) {
                return model.wcf.vibia.diversos.ace.datacontracts.vibia.ServiceFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (model.wcf.vibia.diversos.ace.services.cotizacion.InputGetCotizacion.class.equals(
                        type)) {
                return model.wcf.vibia.diversos.ace.services.cotizacion.InputGetCotizacion.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (model.wcf.vibia.diversos.ace.services.cotizacion.OutputGetCotizacion.class.equals(
                        type)) {
                return model.wcf.vibia.diversos.ace.services.cotizacion.OutputGetCotizacion.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (model.wcf.vibia.diversos.ace.services.cotizacion.Token.class.equals(
                        type)) {
                return model.wcf.vibia.diversos.ace.services.cotizacion.Token.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }
}
