/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.tecnit.wscotiza;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author aferreira
 */
@XmlRootElement(name = "COT")
@XmlType(propOrder={"DG","INCISOS"})
public class ABA_XMLEntrada {
	@JsonProperty("DG")
    private DatosGenerales DG;
	@JsonProperty("INCISOS")
    private Incisos INCISOS;
    
    @XmlElement (name="DG")
    public DatosGenerales getDG() {
        return DG;
    }

    public void setDG(DatosGenerales DG) {
        this.DG = DG;
    }
    @XmlElement (name="INCISOS")
    public Incisos getINCISOS() {
        return INCISOS;
    }

    public void setINCISOS(Incisos INCISOS) {
        this.INCISOS = INCISOS;
    }
    
}
