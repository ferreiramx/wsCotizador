package mx.tecnit.wscotiza;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement(name = "COT")
@XmlType(propOrder={"COTID","VERID","PNETA","REC","IVA","PTOTAL","DTO","INCISOS"})
public class ABA_XMLSalida {
	@JsonProperty("COTID")
	private String COTID; //Es el Id de la Cotizaci�n necesario para la emisi�n de la p�liza
	@JsonProperty("VERID")
	private String VERID; //Es el Id de la versi�n necesario para la emisi�n de la p�liza
	@JsonProperty("PNETA")
	private float PNETA; //Prima neta de la cotizaci�n
	@JsonProperty("REC")
	private float REC; //Es el recargo correspondiente al pago fraccionado de la cotizaci�n
	@JsonProperty("IVA")
	private float IVA; //Total a cobrar de Impuesto al Valor Agregado
	@JsonProperty("PTOTAL")
	private float PTOTAL; //Costo total de la cotizaci�n
	@JsonProperty("DTO")
	private float DTO; //Descuento otorgado a la cotizaci�n
	private ABA_IncisosSalida INCISOS;
	public String getCOTID() {
		return COTID;
	}
	public void setCOTID(String cOTID) {
		COTID = cOTID;
	}
	public String getVERID() {
		return VERID;
	}
	public void setVERID(String vERID) {
		VERID = vERID;
	}
	public float getPNETA() {
		return PNETA;
	}
	public void setPNETA(float pNETA) {
		PNETA = pNETA;
	}
	public float getREC() {
		return REC;
	}
	public void setREC(float rEC) {
		REC = rEC;
	}
	public float getIVA() {
		return IVA;
	}
	public void setIVA(float iVA) {
		IVA = iVA;
	}
	public float getPTOTAL() {
		return PTOTAL;
	}
	public void setPTOTAL(float pTOTAL) {
		PTOTAL = pTOTAL;
	}
	public float getDTO() {
		return DTO;
	}
	public void setDTO(float dTO) {
		DTO = dTO;
	}
	public ABA_IncisosSalida getINCISOS() {
		return INCISOS;
	}
	public void setINCISOS(ABA_IncisosSalida iNCISOS) {
		INCISOS = iNCISOS;
	}
	
	
}
