/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.anibal.bean;

import java.math.BigDecimal;


/**
 *
 * @author Anibal
 */

public class ItemPedido{
    
    private Integer ItemPedidoID;
    private Produto produto;
    private Pedido pedido;
    private BigDecimal preco;


    public Integer getItemPedidoID() {
        return ItemPedidoID;
    }

    public void setItemPedidoID(Integer ItemPedidoID) {
        this.ItemPedidoID = ItemPedidoID;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
    
    
}
