/**
 * Cotizacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package com.abaseguros.vibia.cotizacion;


/*
 *  Cotizacion java interface
 */
public interface Cotizacion {
    /**
     * Auto generated method signature
     *
     * @param inputGetCotizacion0
     * @param token1
     * @throws com.abaseguros.vibia.cotizacion.Cotizacion_GetCotizacion_ServiceFaultFault_FaultMessage :
     */
    public model.wcf.vibia.diversos.ace.services.cotizacion.OutputGetCotizacion getCotizacion(
        model.wcf.vibia.diversos.ace.services.cotizacion.InputGetCotizacion inputGetCotizacion0,
        model.wcf.vibia.diversos.ace.services.cotizacion.Token token1)
        throws java.rmi.RemoteException,
            com.abaseguros.vibia.cotizacion.Cotizacion_GetCotizacion_ServiceFaultFault_FaultMessage;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param inputGetCotizacion0
     * @param token1
     */
    public void startgetCotizacion(
        model.wcf.vibia.diversos.ace.services.cotizacion.InputGetCotizacion inputGetCotizacion0,
        model.wcf.vibia.diversos.ace.services.cotizacion.Token token1,
        final com.abaseguros.vibia.cotizacion.CotizacionCallbackHandler callback)
        throws java.rmi.RemoteException;

    //
}
