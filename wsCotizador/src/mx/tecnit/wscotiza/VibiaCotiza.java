package mx.tecnit.wscotiza;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.codehaus.jackson.map.ObjectMapper;

@Path("/")
public class VibiaCotiza {        
    @POST
	@Path("/ABA/hogar/cotizar")
    //@Consumes("application/json")
	//@Produces("application/xml")
	public Response cotizar(/*model.wcf.vibia.diversos.ace.datacontracts.cotizacion.InputGetCotizacion cotTmp*/) throws Exception {
    	ObjectMapper mapper = new ObjectMapper();
    	model.wcf.vibia.diversos.ace.datacontracts.cotizacion.InputGetCotizacion cot = new model.wcf.vibia.diversos.ace.datacontracts.cotizacion.InputGetCotizacion();
    	model.wcf.vibia.diversos.ace.services.cotizacion.InputGetCotizacion cotWrap = new model.wcf.vibia.diversos.ace.services.cotizacion.InputGetCotizacion();
    	model.wcf.vibia.diversos.ace.datacontracts.vibia.Token token = new model.wcf.vibia.diversos.ace.datacontracts.vibia.Token();
    	model.wcf.vibia.diversos.ace.services.cotizacion.Token tokenWrap = new model.wcf.vibia.diversos.ace.services.cotizacion.Token();
    	
    	// Establecer credenciales de usuario
    	token.setUsuario("wsvibiaqa1");
    	token.setPassword("VIRTUAL1$");
    	tokenWrap.setToken(token);
    	// Poblar los datos de entrada
    	
    	cotWrap.setInputGetCotizacion(cot);
    			System.out.println(timestamp.maketimestamp()+"Servicio REST [ABA/hogar/cotizar] invocado.");
    			//System.out.println(timestamp.maketimestamp()+"JSON de entrada: ");
    			//System.out.println(timestamp.maketimestamp()+mapper.writer().withDefaultPrettyPrinter().writeValueAsString(cot));
    			System.out.println(timestamp.maketimestamp()+"Consumiendo servicio SOAP...");
    			com.abaseguros.vibia.cotizacion.CotizacionStub cliente = new com.abaseguros.vibia.cotizacion.CotizacionStub();
    			cliente.getCotizacion(cotWrap, tokenWrap);
                //ABA_XMLSalida salida = org.tempuri.IACCotizacion_Default_Client.cotizar(cot);
                //System.out.println(timestamp.maketimestamp()+"Conversión a JSON finalizada. Los datos de la cotización son:");
                //String jsonSalida = mapper.writer().withDefaultPrettyPrinter().writeValueAsString(salida);
                //System.out.println(timestamp.maketimestamp()+jsonSalida);
                System.out.println(timestamp.maketimestamp()+"Fin del consumo del servicio REST");
                return Response.status(200).entity("OK").build(); 

	}
}