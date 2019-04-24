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
public class Pbl4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Doces doce1 = new Doces(TiposDoce.DE_FESTA, 10, "Chocolate amargo", 10);
        Frios frio1 = new Frios(10,10 ,"Gorgonzola" );
        Paozinho pao1 = new Paozinho("Calabresa", 10, "com muito queijo", 10);
        Doces doce2 = new Doces(TiposDoce.GOURMET, 20, "recheio de morango", 20);
        Doces doce3 = new Doces(TiposDoce.FINO, 5, "granulado", 20);
        Doces doce4 = new Doces(TiposDoce.ORNAMENTAL, 5, "mousse", 20);
        Doces doce5 = new Doces(TiposDoce.OUTROS, 5, "pra fritar", 20);
       System.out.println("\n\nPedido 1\n");
        Pedido pedido1 = new Pedido("Gabriel Vita", Dias.SEGUNDA);
        pedido1.addProduto(doce1);
        pedido1.addProduto(frio1);
        pedido1.addProduto(pao1);
        pedido1.addProduto(doce1);
        pedido1.addProduto(doce2);
        pedido1.addProduto(doce3);
        pedido1.addProduto(doce4);
        pedido1.addProduto(doce5);
        pedido1.calcTempoEntrega();
        pedido1.calcValorTotal();
        pedido1.verifProdutos();
        System.out.println("Cupom" + "\nCliente:" +  pedido1.getCliente() + "\nProdutos:\nDoces:" + pedido1.getQuantDoce() + "\nFrios:" + pedido1.getQuantFrios() + "\nPãozinho:" + pedido1.getQuantPaozinho() + "\n Valor Total: " + pedido1.calcValorTotal() + "\n Tempo para entrega(min): " + pedido1.calcTempoEntrega());
    }
    
}
