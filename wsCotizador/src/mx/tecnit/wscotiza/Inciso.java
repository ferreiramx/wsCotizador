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
@XmlType(propOrder={"CVEVEH","MOD","PAQ","EDO","MUN","SERV","USO","TDED","TSA","PD","PB"})
public class Inciso {
	@JsonProperty("CVEVEH")
    private String CVEVEH;
	@JsonProperty("MOD")
    private int MOD; //Año modelo del vehículo
	@JsonProperty("PAQ")
    private int PAQ; //Identificador asignado al Paquete que se desea cotizar
	@JsonProperty("EDO")
	private int EDO; //Identificador asignado al Estado de circulación del vehículo
	@JsonProperty("MUN")
	private int MUN; //Identificador asignado al Municipio de circulación del vehículo
	@JsonProperty("SERV")
	private int SERV; //Identificador del servicio del vehículo
	@JsonProperty("USO")
	private int USO; //Identificador del uso del vehículo
	@JsonProperty("TDED")
	private int TDED; //Identificador del tipo de Deducible
	@JsonProperty("TSA")
	private int TSA; //Identificador del Tipo de Suma Asegurada
	@JsonProperty("PD")
	private float PD; //Porcentaje de Descuento en punto decimal
	@JsonProperty("PB")
	private float PB; //Porcentaje de Bonificación en punto decimal

    public String getCVEVEH() {
        return CVEVEH;
    }

    public void setCVEVEH(String CVEVEH) {
        this.CVEVEH = CVEVEH;
    }

    public int getMOD() {
        return MOD;
    }

    public void setMOD(int MOD) {
        this.MOD = MOD;
    }

    public int getPAQ() {
        return PAQ;
    }

    public void setPAQ(int PAQ) {
        this.PAQ = PAQ;
    }

    public int getEDO() {
        return EDO;
    }

    public void setEDO(int EDO) {
        this.EDO = EDO;
    }

    public int getMUN() {
        return MUN;
    }

    public void setMUN(int MUN) {
        this.MUN = MUN;
    }

    public int getSERV() {
        return SERV;
    }

    public void setSERV(int SERV) {
        this.SERV = SERV;
    }

    public int getUSO() {
        return USO;
    }

    public void setUSO(int USO) {
        this.USO = USO;
    }

    public int getTDED() {
        return TDED;
    }

    public void setTDED(int TDED) {
        this.TDED = TDED;
    }

    public int getTSA() {
        return TSA;
    }

    public void setTSA(int TSA) {
        this.TSA = TSA;
    }

    public float getPD() {
        return PD;
    }

    public void setPD(float PD) {
        this.PD = PD;
    }

    public float getPB() {
        return PB;
    }

    public void setPB(float PB) {
        this.PB = PB;
    }
    
}
