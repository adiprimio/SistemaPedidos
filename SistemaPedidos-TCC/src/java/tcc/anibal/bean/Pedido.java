/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.anibal.bean;

import java.util.Date;


/**
 *
 * @author Anibal
 */

public class Pedido extends Cliente {

    private Integer PedidoID;
    private Cliente cliente;
    private Date dataPed;

    
    public Integer getPedidoID() {
        return PedidoID;
    }

    public void setPedidoID(Integer PedidoID) {
        this.PedidoID = PedidoID;
    }
    
    	public Date getDataPed() {
		return this.dataPed;
	}

	public void setDataPed(Date dataPed) {
		this.dataPed = dataPed;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente clientes) {
		this.cliente = clientes;
	}

    
}
