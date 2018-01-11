/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package model.wcf.vibia.diversos.ace.services.cotizacion.imports;


/**
 *  ExtensionMapper class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ExtensionMapper {
    public static java.lang.Object getTypeObject(
        java.lang.String namespaceURI, java.lang.String typeName,
        javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
        if ("http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion".equals(
                    namespaceURI) && "Ubicacion".equals(typeName)) {
            return model.wcf.vibia.diversos.ace.datacontracts.cotizacion.Ubicacion.Factory.parse(reader);
        }

        if ("http://schemas.microsoft.com/2003/10/Serialization/".equals(
                    namespaceURI) && "char".equals(typeName)) {
            return com.microsoft.schemas._2003._10.serialization._char.Factory.parse(reader);
        }

        if ("http://schemas.microsoft.com/2003/10/Serialization/".equals(
                    namespaceURI) && "guid".equals(typeName)) {
            return com.microsoft.schemas._2003._10.serialization.Guid.Factory.parse(reader);
        }

        if ("http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion".equals(
                    namespaceURI) && "InputGetCotizacion".equals(typeName)) {
            return model.wcf.vibia.diversos.ace.datacontracts.cotizacion.InputGetCotizacion.Factory.parse(reader);
        }

        if ("http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion".equals(
                    namespaceURI) && "Caracteristicas".equals(typeName)) {
            return model.wcf.vibia.diversos.ace.datacontracts.cotizacion.Caracteristicas.Factory.parse(reader);
        }

        if ("http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion".equals(
                    namespaceURI) && "Cobertura".equals(typeName)) {
            return model.wcf.vibia.diversos.ace.datacontracts.cotizacion.Cobertura.Factory.parse(reader);
        }

        if ("http://ace.diversos.vibia.wcf.model/datacontracts/vibia".equals(
                    namespaceURI) && "ServiceFault".equals(typeName)) {
            return model.wcf.vibia.diversos.ace.datacontracts.vibia.ServiceFault.Factory.parse(reader);
        }

        if ("http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion".equals(
                    namespaceURI) && "DatosGenerales".equals(typeName)) {
            return model.wcf.vibia.diversos.ace.datacontracts.cotizacion.DatosGenerales.Factory.parse(reader);
        }

        if ("http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion".equals(
                    namespaceURI) && "ArrayOfCobertura".equals(typeName)) {
            return model.wcf.vibia.diversos.ace.datacontracts.cotizacion.ArrayOfCobertura.Factory.parse(reader);
        }

        if ("http://schemas.microsoft.com/2003/10/Serialization/".equals(
                    namespaceURI) && "duration".equals(typeName)) {
            return com.microsoft.schemas._2003._10.serialization.Duration.Factory.parse(reader);
        }

        if ("http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion".equals(
                    namespaceURI) && "ArrayOfClausula".equals(typeName)) {
            return model.wcf.vibia.diversos.ace.datacontracts.cotizacion.ArrayOfClausula.Factory.parse(reader);
        }

        if ("http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion".equals(
                    namespaceURI) && "Paquete".equals(typeName)) {
            return model.wcf.vibia.diversos.ace.datacontracts.cotizacion.Paquete.Factory.parse(reader);
        }

        if ("http://ace.diversos.vibia.wcf.model/datacontracts/vibia".equals(
                    namespaceURI) && "Token".equals(typeName)) {
            return model.wcf.vibia.diversos.ace.datacontracts.vibia.Token.Factory.parse(reader);
        }

        if ("http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion".equals(
                    namespaceURI) && "Clausula".equals(typeName)) {
            return model.wcf.vibia.diversos.ace.datacontracts.cotizacion.Clausula.Factory.parse(reader);
        }

        if ("http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion".equals(
                    namespaceURI) && "DatosExtras".equals(typeName)) {
            return model.wcf.vibia.diversos.ace.datacontracts.cotizacion.DatosExtras.Factory.parse(reader);
        }

        if ("http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion".equals(
                    namespaceURI) && "MedidaSeguridad".equals(typeName)) {
            return model.wcf.vibia.diversos.ace.datacontracts.cotizacion.MedidaSeguridad.Factory.parse(reader);
        }

        if ("http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion".equals(
                    namespaceURI) && "ArrayOfMedidaSeguridad".equals(typeName)) {
            return model.wcf.vibia.diversos.ace.datacontracts.cotizacion.ArrayOfMedidaSeguridad.Factory.parse(reader);
        }

        if ("http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion".equals(
                    namespaceURI) && "OutputGetCotizacion".equals(typeName)) {
            return model.wcf.vibia.diversos.ace.datacontracts.cotizacion.OutputGetCotizacion.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
