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
public enum Dias {
    SEGUNDA("Segunda-Feira"),
    TERCA("Terça-Feira"),
    QUARTA("Quarta-Feira"),
    QUINTA("Quinta-Feira"),
    SEXTA("Sexta-Feira"),
    SABADO("Sábado"),
    DOMINGO("Domingo");
 
    private final String dias;
 
    Dias(String dias) {
        this.dias = dias;
    }
 
    public String getdias() {
        return dias;
    }
}
