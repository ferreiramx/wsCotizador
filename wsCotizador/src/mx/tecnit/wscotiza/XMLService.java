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
public class XMLService {        
    @POST
	@Path("/cotizar")
    @Consumes("application/json")
	//@Produces("application/xml")
	public Response cotizar(ABA_XMLEntrada cot) throws Exception {
    	ObjectMapper mapper = new ObjectMapper();
    			System.out.println(timestamp.maketimestamp()+"Servicio REST [cotizar] invocado.");
    			System.out.println(timestamp.maketimestamp()+"JSON de entrada: ");
    			System.out.println(timestamp.maketimestamp()+mapper.writer().withDefaultPrettyPrinter().writeValueAsString(cot));
    			System.out.println(timestamp.maketimestamp()+"Consumiendo servicio SOAP...");
                ABA_XMLSalida salida = org.tempuri.IACCotizacion_Default_Client.cotizar(cot);
                System.out.println(timestamp.maketimestamp()+"Conversión a JSON finalizada. Los datos de la cotización son:");
                String jsonSalida = mapper.writer().withDefaultPrettyPrinter().writeValueAsString(salida);
                System.out.println(timestamp.maketimestamp()+jsonSalida);
                System.out.println(timestamp.maketimestamp()+"Fin del consumo del servicio REST");
                return Response.status(200).entity(jsonSalida).build(); 

	}
}