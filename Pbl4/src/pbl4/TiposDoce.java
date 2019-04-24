/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl4;

/**
 *
 * @author ANGELO
 */
public enum TiposDoce {
    FINO("Fino"),
    DE_FESTA("De festa"),
    GOURMET("Gourmet"),
    ORNAMENTAL("Ornamental"),
    OUTROS("Outros");
 
    private final String tipoDoce;
 
    TiposDoce(String tipoDoce) {
        this.tipoDoce = tipoDoce;
    }
 
    public String gettipoDoce() {
        return tipoDoce;
    }
}
