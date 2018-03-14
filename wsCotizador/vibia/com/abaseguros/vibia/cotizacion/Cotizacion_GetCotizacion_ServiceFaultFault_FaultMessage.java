/**
 * Cotizacion_GetCotizacion_ServiceFaultFault_FaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package com.abaseguros.vibia.cotizacion;

public class Cotizacion_GetCotizacion_ServiceFaultFault_FaultMessage extends java.lang.Exception {
    private static final long serialVersionUID = 1515702777136L;
    private model.wcf.vibia.diversos.ace.datacontracts.vibia.ServiceFaultE faultMessage;

    public Cotizacion_GetCotizacion_ServiceFaultFault_FaultMessage() {
        super("Cotizacion_GetCotizacion_ServiceFaultFault_FaultMessage");
    }

    public Cotizacion_GetCotizacion_ServiceFaultFault_FaultMessage(
        java.lang.String s) {
        super(s);
    }

    public Cotizacion_GetCotizacion_ServiceFaultFault_FaultMessage(
        java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public Cotizacion_GetCotizacion_ServiceFaultFault_FaultMessage(
        java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        model.wcf.vibia.diversos.ace.datacontracts.vibia.ServiceFaultE msg) {
        faultMessage = msg;
    }

    public model.wcf.vibia.diversos.ace.datacontracts.vibia.ServiceFaultE getFaultMessage() {
        return faultMessage;
    }
}
