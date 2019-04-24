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
public class Doces extends Produto{
    private TiposDoce tipo;

    public TiposDoce getTipo() {
        return tipo;
    }
    public Doces(TiposDoce tipo, double preco, String especificacao, int validade) {
        this.preco = preco;
        this.tipo = tipo;
        this.especificacao = especificacao;
        this.validade = validade;
    }
    
}
