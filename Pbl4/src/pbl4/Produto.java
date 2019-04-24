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
public abstract class Produto {
    protected double preco;
    protected int validade;
    protected String especificacao;
    protected int entrega;

    public double getPreco() {
        return preco;
    }

    public void setPreco ( double preco) {
        this.preco = preco;
    }

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

    public int getEntrega() {
        return entrega;
    }

    public void setEntrega(int entrega) {
        this.entrega = entrega;
    }
    
}
