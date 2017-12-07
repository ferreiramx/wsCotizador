package mx.tecnit.wscotiza;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"NUM","INIVIG","FINVIG","LIMPAG","DER","REC","IVAPCT","IVA","PNETA","PTOTAL","END"})
public class ABA_ReciboSalida {
	private int NUM; //Numero de recibo
	private String INIVIG; //Fecha del inicio de vigencia del recibo
	private String FINVIG; //Fecha del fin de vigencia del recibo
	private String LIMPAG; //Fecha limite para el pago del recibo
	private float DER; //Derechos a pagar en el recibo
	private float REC;//Recargos a pagar en el recibo
	private float IVAPCT; //Porcentaje de IVA a pagar en el recibo
	private float IVA; //IVA a pagar en el recibo
	private float PNETA; //Prima neta a pagar en el recibo
	private float PTOTAL; //Prima total a pagar en el recibo
	private int END; //Numero de endoso (siempre vendrá con valor cero)
	public int getNUM() {
		return NUM;
	}
	public void setNUM(int nUM) {
		NUM = nUM;
	}
	public String getINIVIG() {
		return INIVIG;
	}
	public void setINIVIG(String iNIVIG) {
		INIVIG = iNIVIG;
	}
	public String getFINVIG() {
		return FINVIG;
	}
	public void setFINVIG(String fINVIG) {
		FINVIG = fINVIG;
	}
	public String getLIMPAG() {
		return LIMPAG;
	}
	public void setLIMPAG(String lIMPAG) {
		LIMPAG = lIMPAG;
	}
	public float getDER() {
		return DER;
	}
	public void setDER(float dER) {
		DER = dER;
	}
	public float getREC() {
		return REC;
	}
	public void setREC(float rEC) {
		REC = rEC;
	}
	public float getIVAPCT() {
		return IVAPCT;
	}
	public void setIVAPCT(float iVAPCT) {
		IVAPCT = iVAPCT;
	}
	public float getIVA() {
		return IVA;
	}
	public void setIVA(float iVA) {
		IVA = iVA;
	}
	public float getPNETA() {
		return PNETA;
	}
	public void setPNETA(float pNETA) {
		PNETA = pNETA;
	}
	public float getPTOTAL() {
		return PTOTAL;
	}
	public void setPTOTAL(float pTOTAL) {
		PTOTAL = pTOTAL;
	}
	public int getEND() {
		return END;
	}
	public void setEND(int eND) {
		END = eND;
	}
	
}
