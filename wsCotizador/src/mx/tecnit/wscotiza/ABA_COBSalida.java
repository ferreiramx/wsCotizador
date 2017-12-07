package mx.tecnit.wscotiza;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"COBID","DESC","SEL","SUMAASEG","SADESC","DPCT","DEDESC","PNETA","IVA","PTOTAL","RECMTO","DER","DTOMTO","BONMTO"})
public class ABA_COBSalida {
	private int COBID; //identificador de la cobertura
	private String DESC; //Nombre de la cobertura
	private int SEL; //"Indica si la cobertura esta incluida en la cotización
	private float SUMAASEG; //Suma Asegurada, es la cantidad con la ABA|Seguros respalda la cobertura
	private String SADESC; //Texto descriptivo de la suma asegurada
	private float DPCT; //Valor del deducible en punto decimal
	private String DEDESC; //Texto descriptivo del deducible
	private float PNETA; //Prima neta de la cobertura
	private float IVA; //Total a cobrar de Impuesto al Valor Agregado para la cobertura
	private float PTOTAL; //Costo total de la cobertura
	private float RECMTO; //Es el recargo correspondiente al pago fraccionado de la cobertura
	private float DER; //Derechos de emisión de la cobertura
	private float DTOMTO; //Monto del descuento en la cobertura
	private float BONMTO; //Monto de la Bonificación en la cobertura
	public int getCOBID() {
		return COBID;
	}
	public void setCOBID(int cOBID) {
		COBID = cOBID;
	}
	public String getDESC() {
		return DESC;
	}
	public void setDESC(String dESC) {
		DESC = dESC;
	}
	public int getSEL() {
		return SEL;
	}
	public void setSEL(int sEL) {
		SEL = sEL;
	}
	public float getSUMAASEG() {
		return SUMAASEG;
	}
	public void setSUMAASEG(float sUMAASEG) {
		SUMAASEG = sUMAASEG;
	}
	public String getSADESC() {
		return SADESC;
	}
	public void setSADESC(String sADESC) {
		SADESC = sADESC;
	}
	public float getDPCT() {
		return DPCT;
	}
	public void setDPCT(float dPCT) {
		DPCT = dPCT;
	}
	public String getDEDESC() {
		return DEDESC;
	}
	public void setDEDESC(String dEDESC) {
		DEDESC = dEDESC;
	}
	public float getPNETA() {
		return PNETA;
	}
	public void setPNETA(float pNETA) {
		PNETA = pNETA;
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
	public float getRECMTO() {
		return RECMTO;
	}
	public void setRECMTO(float rECMTO) {
		RECMTO = rECMTO;
	}
	public float getDER() {
		return DER;
	}
	public void setDER(float dER) {
		DER = dER;
	}
	public float getDTOMTO() {
		return DTOMTO;
	}
	public void setDTOMTO(float dTOMTO) {
		DTOMTO = dTOMTO;
	}
	public float getBONMTO() {
		return BONMTO;
	}
	public void setBONMTO(float bONMTO) {
		BONMTO = bONMTO;
	}
	
}
