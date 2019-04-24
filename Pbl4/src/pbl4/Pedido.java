/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl4;

import java.util.ArrayList;

/**
 *
 * @author ANGELO
 */
public class Pedido {
    private String cliente;
    private ArrayList<Produto> cupom;
    private Dias dia;
    private double valorTotal;
    //private int tempoEntrega;
    

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Produto> getCupom() {
        return cupom;
    }

    public void setCupom(ArrayList<Produto> cupom) {
        this.cupom = cupom;
    }

    public Dias getDia() {
        return dia;
    }

    public void setDia(Dias dia) {
        this.dia = dia;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    //public int getTempoEntrega() {
    //    return tempoEntrega;
    //}

    //public void setTempoEntrega(int tempoEntrega) {
    //    this.tempoEntrega = tempoEntrega;
    //}
    public void addProduto(Produto produto) {
        this.cupom.add(produto);
    }
    public double calcValorTotal(){
        int i=0;
        double conta=0;
        while(i<cupom.size()){
            conta += cupom.get(i).preco;
            i++;
        }
        return conta;
    }
    public void verifProdutos(){
        int j=0;
        int quantFrios=0;
        int quantDoce=0;
        int quantPaozinho=0;
        while(j<cupom.size()){
            if(cupom.get(j) instanceof Frios){
                quantFrios++;
            }else if(cupom.get(j) instanceof Doces){
                quantDoce++;
            }else if(cupom.get(j) instanceof Paozinho){
                quantPaozinho++;
            }
            j++;
        }
        
    }
    public double calcTempoEntrega(){
        int j=0;
        double tempoTotal =0;
        while(j<cupom.size()){
            if(cupom.get(j) instanceof Frios){
                if(dia == Dias.DOMINGO ){
                    tempoTotal += 6.6;
                }else{
                    tempoTotal += 6;
                }
            }else if(cupom.get(j) instanceof Paozinho){
                if(dia == Dias.DOMINGO || dia == Dias.SABADO){
                    tempoTotal += 2.3;
                }else{
                    tempoTotal += 2;
                }
            }else if(cupom.get(j) instanceof Paozinho){
                if(dia == Dias.DOMINGO || dia == Dias.SABADO){
                    tempoTotal += 6;
                }else{
                    tempoTotal += 5;
                }
            }
            j++;
        }
        return tempoTotal;
    }
}
