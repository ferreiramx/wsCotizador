package mx.tecnit.wscotiza;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class ABA_RecibosSalida {
	private List<ABA_ReciboSalida> RECIBO;

	public List<ABA_ReciboSalida> getRECIBO() {
		return RECIBO;
	}

	public void setRECIBO(List<ABA_ReciboSalida> rECIBO) {
		RECIBO = rECIBO;
	} 
	
}
