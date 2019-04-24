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
public class Paozinho extends Produto {
    private String sabor;
    
    public Paozinho (String sabor, double preco,String especificacao, int validade) {
        this.preco = preco;
        this.sabor = sabor;
        this.especificacao = especificacao;
        this.validade = validade;
    }
}
