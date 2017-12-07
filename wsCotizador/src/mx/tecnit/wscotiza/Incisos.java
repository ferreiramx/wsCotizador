/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.tecnit.wscotiza;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author aferreira
 */
public class Incisos {
	@JsonProperty("INCISO")
    private Inciso INCISO; 

    public Inciso getINCISO() {
        return INCISO;
    }

    public void setINCISO(Inciso INCISO) {
        this.INCISO = INCISO;
    }
    
}
