
package org.tempuri;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;

import mx.tecnit.wscotiza.ABA_XMLEntrada;
import mx.tecnit.wscotiza.ABA_XMLSalida;
import mx.tecnit.wscotiza.timestamp;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2017-11-24T01:33:28.433-06:00
 * Generated source version: 3.2.1
 * 
 */
public final class IACCotizacion_Default_Client {

    private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "ACCotizacion");

    private IACCotizacion_Default_Client() {
    }

    public static ABA_XMLSalida cotizar(ABA_XMLEntrada entrada) throws java.lang.Exception {
        URL wsdlURL = ACCotizacion.WSDL_LOCATION;
       /* if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }*/
        ABA_XMLSalida ret = new ABA_XMLSalida();
        ACCotizacion ss = new ACCotizacion(wsdlURL, SERVICE_NAME);
        IACCotizacion port = ss.getDefault();  
        JAXBContext jaxbContextSalida = JAXBContext.newInstance(ABA_XMLSalida.class);
        JAXBContext jaxbContextEntrada = JAXBContext.newInstance(ABA_XMLEntrada.class);
        Unmarshaller unmarshaller = jaxbContextSalida.createUnmarshaller();
        Marshaller marshaller = jaxbContextEntrada.createMarshaller();
        StringWriter writer = new StringWriter();
        marshaller.marshal(entrada,writer);
        String xml = writer.toString();
        System.out.println(mx.tecnit.wscotiza.timestamp.maketimestamp()+"URL del servicio a consumir: "+wsdlURL.toString());
		System.out.println(mx.tecnit.wscotiza.timestamp.maketimestamp()+"Realizando mapeo de JSON al formato XML...");
        System.out.println(mx.tecnit.wscotiza.timestamp.maketimestamp()+"Conversión a XML completa. El XML resultante es:");
        System.out.println(mx.tecnit.wscotiza.timestamp.maketimestamp()+xml);
        System.out.println(mx.tecnit.wscotiza.timestamp.maketimestamp()+"Utilizando credenciales:\n\tUsuario: Pruebasan\n\tPassword:Seguro123*");
        System.out.println(mx.tecnit.wscotiza.timestamp.maketimestamp()+"Formando cabecera de token...");
        System.out.println(mx.tecnit.wscotiza.timestamp.maketimestamp()+"Datos de entrada y autenticación listos.");
        System.out.println(mx.tecnit.wscotiza.timestamp.maketimestamp()+"Preparando el consumo del web service de ABA|Seguros...");
        System.out.println(mx.tecnit.wscotiza.timestamp.maketimestamp()+"Invocando la función cotizaAuto...");
        org.tempuri.ObjectFactory fac = new org.tempuri.ObjectFactory();
        org.tempuri.Entrada _cotizaAuto_parameters = fac.createEntrada();
        javax.xml.bind.JAXBElement<java.lang.String> _cotizaAuto_parametersStrEntrada = fac.createEntradaStrEntrada(xml);
        _cotizaAuto_parameters.setStrEntrada(_cotizaAuto_parametersStrEntrada);
        org.datacontract.schemas._2004._07.abaseguros.ObjectFactory facToken = new org.datacontract.schemas._2004._07.abaseguros.ObjectFactory();
        org.datacontract.schemas._2004._07.abaseguros.Token _cotizaAuto_token = facToken.createToken();
        javax.xml.bind.JAXBElement<java.lang.String> _cotizaAuto_tokenPassword = facToken.createTokenPassword("Seguro123*");
        _cotizaAuto_token.setPassword(_cotizaAuto_tokenPassword);
        javax.xml.bind.JAXBElement<java.lang.String> _cotizaAuto_tokenReferencia = facToken.createTokenReferencia("");
        _cotizaAuto_token.setReferencia(_cotizaAuto_tokenReferencia);
        javax.xml.bind.JAXBElement<java.lang.String> _cotizaAuto_tokenUsuario = facToken.createTokenUsuario("Pruebasan");
        _cotizaAuto_token.setUsuario(_cotizaAuto_tokenUsuario);
        org.tempuri.Salida _cotizaAuto__return = null;
        try {
            _cotizaAuto__return = port.cotizaAuto(_cotizaAuto_parameters, _cotizaAuto_token);
            System.out.println(mx.tecnit.wscotiza.timestamp.maketimestamp()+"Consumo del web service finalizado correctamente.");
            System.out.println(mx.tecnit.wscotiza.timestamp.maketimestamp()+"El servicio web ha retornado el siguiente XML: " + _cotizaAuto__return.getStrSalida().getValue());

        } catch (IACCotizacionCotizaAutoErrorFaultFaultMessage e) { 
            System.out.println(mx.tecnit.wscotiza.timestamp.maketimestamp()+"Expected exception: IACCotizacion_CotizaAuto_ErrorFault_FaultMessage has occurred.");
            System.out.println(e.toString());
            System.exit(1);
            //TODO: Mostrar al usuario en caso de error
        }
        System.out.println(mx.tecnit.wscotiza.timestamp.maketimestamp()+"Convirtiendo XML a formato JSON...");      
        StringReader reader = new StringReader(_cotizaAuto__return.getStrSalida().getValue());
        ret = (ABA_XMLSalida) unmarshaller.unmarshal(reader);
        return(ret);
    }

}
