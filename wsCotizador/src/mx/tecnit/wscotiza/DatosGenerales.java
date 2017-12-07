/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.tecnit.wscotiza;

import javax.xml.bind.annotation.XmlType;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author aferreira
 */
@XmlType(propOrder={"NEG","AGE","CON","TAR","INIVIG","FINVIG","TS","AGRUPA","TC","FP"})
public class DatosGenerales {
	@JsonProperty("NEG")
    private int NEG; //Identificador que ABA|Seguros asigno al negocio
	@JsonProperty("AGE")
    private int AGE; //Identificador del agente asignado por ABA|Seguros
	@JsonProperty("CON")
    private int CON; //Identificador del conducto asignado por ABA|Seguros
	@JsonProperty("TAR")
    private int TAR; //Identificador  que ABA|Seguros asigna a la tarifa
	@JsonProperty("INIVIG")
    private String INIVIG; //Fecha inicio de vigencia formato aaaa-mm-dd
	@JsonProperty("FINVIG")
    private String FINVIG; //Fecha Fin de vigencia formato aaaa-mm-dd
	@JsonProperty("TS")
    private int TS; //Identificador del tipo de suscripción
	@JsonProperty("AGRUPA")
	private int AGRUPA; //Identificador de la agrupación
	@JsonProperty("TC")
    private int TC; //Identificador tipo de calculo
	@JsonProperty("FP")
    private int FP; //Identificador de la forma de pago a utilizar en la cotización

    public int getNEG() {
        return NEG;
    }

    public void setNEG(int NEG) {
        this.NEG = NEG;
    }

    public int getAGE() {
        return AGE;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }

    public int getCON() {
        return CON;
    }

    public void setCON(int CON) {
        this.CON = CON;
    }

    public int getTAR() {
        return TAR;
    }

    public void setTAR(int TAR) {
        this.TAR = TAR;
    }

    public String getINIVIG() {
        return INIVIG;
    }

    public void setINIVIG(String INIVIG) {
        this.INIVIG = INIVIG;
    }

    public String getFINVIG() {
        return FINVIG;
    }

    public void setFINVIG(String FINVIG) {
        this.FINVIG = FINVIG;
    }

    public int getTS() {
        return TS;
    }

    public void setTS(int TS) {
        this.TS = TS;
    }
    

    public int getAGRUPA() {
		return AGRUPA;
	}

	public void setAGRUPA(int aGRUPA) {
		AGRUPA = aGRUPA;
	}

	public int getTC() {
        return TC;
    }

    public void setTC(int TC) {
        this.TC = TC;
    }

    public int getFP() {
        return FP;
    }

    public void setFP(int FP) {
        this.FP = FP;
    }
    
}
