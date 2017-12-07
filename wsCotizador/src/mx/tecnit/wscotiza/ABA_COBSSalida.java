package mx.tecnit.wscotiza;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class ABA_COBSSalida {
	private List<ABA_COBSalida> COB;

	public List<ABA_COBSalida> getCOB() {
		return COB;
	}

	public void setCOB(List<ABA_COBSalida> cOB) {
		COB = cOB;
	}
	
}
