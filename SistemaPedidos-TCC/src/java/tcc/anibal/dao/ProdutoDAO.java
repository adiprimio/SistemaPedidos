/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.anibal.dao;

import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.persistence.Query;
import tcc.anibal.bean.Cliente;
import tcc.anibal.bean.Produto;


/**
 *
 * @author Anibal
 */
public class ProdutoDAO{
    
        private Connection conexao;

    public ProdutoDAO(Connection conexao) {
        this.conexao = conexao;
    }    
    
    
     public Produto retrieve(Produto prod) throws SQLException {
        PreparedStatement ps = conexao.prepareStatement("select nome,descricao,preco from produto where id=?");
        ps.setInt(1, prod.getProdutoID());
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            prod.setNome(rs.getString(1));
            prod.setDescricao(rs.getString(2));
            prod.setPreco(rs.getDouble(3));

        }
        return prod;
    }

        
}
