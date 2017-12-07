package mx.tecnit.wscotiza;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"ID","DESC","CVEVEH","MOD","PAQ","EDO","MUN","SERV","USO","TDED","TSA","COTINCID",
		"VERINCID","NUMINC","DSEG","DSEGEST","DER","MDESID","PD","DES","PB","BON","REC","PREC","PNETA","IVA","PTOTAL","COBINTEROP","RECIBOS","COBS"})
public class ABA_IncisoSalida {
	private String ID; //Identificador conocido como vehiculoid asignado por ABA|Seguros al Vehículo
	private String DESC; //Descripción
	private String CVEVEH; //Identificador conocido como CMST o Clave vehicular
	private int MOD; //Año modelo del vehículo
	private int PAQ; //Identificador asignado por ABA|Seguros al paquete solicitado
	private int EDO; //Identificador asignado por ABA|Seguros al Estado de circulación del vehículo
	private int MUN; //Identificador asignado por ABA|Seguros al Municipio de circulación del vehículo
	private int SERV; //Identificador del servicio del vehículo
	private int USO; //Identificador del uso del vehículo
	private int TDED; //Identificador del tipo de Deducible
	private int TSA; //Identificador del Tipo de Suma Asegurada
	private String COTINCID; //Es el inciso de la Cotización necesario para la emisión de la póliza
	private String VERINCID; //Es el versión de la Cotización necesario para la emisión de la póliza
	private int NUMINC; //Número de inciso de la Cotización
	private int DSEG; //Identificador asignado por ABA|Seguros al dispositivo de seguridad del vehículo
	private int DSEGEST; //Estatus del dispositivo de seguridad.
	private int DER; //Derechos de emisión del inciso
	private int MDESID; //Identificador del motivo del descuento
	private float PD; //Porcentaje de Descuento
	private float DES; //Monto del Descuento
	private float PB; //Porcentaje de Bonificación en punto decimal
	private float BON; //Monto de la Bonificación
	private float REC; //Monto del recargo
	private float PREC; //Porcentaje de recargo
	private float PNETA; //Prima neta del inciso de la Cotización
	private float IVA; //Total a cobrar de Impuesto al Valor Agregado del inciso de la Cotización
	private float PTOTAL; //Costo total del inciso de la Cotización
	private int COBINTEROP; //Indica se usan los de wsAbaseguros en lugar de los de wsAutoNet
	private ABA_RecibosSalida RECIBOS; //Simulación de recibos, esta simulación no muestra recibos correctos para las cotizaciones  multianuales
	private ABA_COBSSalida COBS; //
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getDESC() {
		return DESC;
	}
	public void setDESC(String dESC) {
		DESC = dESC;
	}
	public String getCVEVEH() {
		return CVEVEH;
	}
	public void setCVEVEH(String cVEVEH) {
		CVEVEH = cVEVEH;
	}
	public int getMOD() {
		return MOD;
	}
	public void setMOD(int mOD) {
		MOD = mOD;
	}
	public int getPAQ() {
		return PAQ;
	}
	public void setPAQ(int pAQ) {
		PAQ = pAQ;
	}
	public int getEDO() {
		return EDO;
	}
	public void setEDO(int eDO) {
		EDO = eDO;
	}
	public int getMUN() {
		return MUN;
	}
	public void setMUN(int mUN) {
		MUN = mUN;
	}
	public int getSERV() {
		return SERV;
	}
	public void setSERV(int sERV) {
		SERV = sERV;
	}
	public int getUSO() {
		return USO;
	}
	public void setUSO(int uSO) {
		USO = uSO;
	}
	public int getTDED() {
		return TDED;
	}
	public void setTDED(int tDED) {
		TDED = tDED;
	}
	public int getTSA() {
		return TSA;
	}
	public void setTSA(int tSA) {
		TSA = tSA;
	}
	public String getCOTINCID() {
		return COTINCID;
	}
	public void setCOTINCID(String cOTINCID) {
		COTINCID = cOTINCID;
	}
	public String getVERINCID() {
		return VERINCID;
	}
	public void setVERINCID(String vERINCID) {
		VERINCID = vERINCID;
	}
	public int getNUMINC() {
		return NUMINC;
	}
	public void setNUMINC(int nUMINC) {
		NUMINC = nUMINC;
	}
	public int getDSEG() {
		return DSEG;
	}
	public void setDSEG(int dSEG) {
		DSEG = dSEG;
	}
	public int getDSEGEST() {
		return DSEGEST;
	}
	public void setDSEGEST(int dSEGEST) {
		DSEGEST = dSEGEST;
	}
	public int getDER() {
		return DER;
	}
	public void setDER(int dER) {
		DER = dER;
	}
	public int getMDESID() {
		return MDESID;
	}
	public void setMDESID(int mDESID) {
		MDESID = mDESID;
	}
	public float getPD() {
		return PD;
	}
	public void setPD(float pD) {
		PD = pD;
	}
	public float getDES() {
		return DES;
	}
	public void setDES(float dES) {
		DES = dES;
	}
	public float getPB() {
		return PB;
	}
	public void setPB(float pB) {
		PB = pB;
	}
	public float getBON() {
		return BON;
	}
	public void setBON(float bON) {
		BON = bON;
	}
	public float getREC() {
		return REC;
	}
	public void setREC(float rEC) {
		REC = rEC;
	}
	public float getPREC() {
		return PREC;
	}
	public void setPREC(float pREC) {
		PREC = pREC;
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
	public int getCOBINTEROP() {
		return COBINTEROP;
	}
	public void setCOBINTEROP(int cOBINTEROP) {
		COBINTEROP = cOBINTEROP;
	}
	public ABA_RecibosSalida getRECIBOS() {
		return RECIBOS;
	}
	public void setRECIBOS(ABA_RecibosSalida rECIBOS) {
		RECIBOS = rECIBOS;
	}
	public ABA_COBSSalida getCOBS() {
		return COBS;
	}
	public void setCOBS(ABA_COBSSalida cOBS) {
		COBS = cOBS;
	}
	
	
}
