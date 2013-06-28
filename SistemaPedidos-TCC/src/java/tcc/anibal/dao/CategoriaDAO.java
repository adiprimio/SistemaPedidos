/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.anibal.dao;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import tcc.anibal.bean.Categoria;

/**
 *
 * @author Anibal
 */
public class CategoriaDAO{
    
 private Connection conexao;

    public CategoriaDAO(Connection conexao) {
        this.conexao = conexao;
    }


    public Categoria retrieve(Categoria categ) throws SQLException {
        PreparedStatement ps = conexao.prepareStatement("select nome from categoria where id=?");
        ps.setInt(1, categ.getCategoriaID());
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            categ.setNomeCategoria(rs.getString(1));

        }
        return categ;
    }
    
        public List<Categoria> lista() throws SQLException {
        List<Categoria> lista = new ArrayList<Categoria>();
        String sql = "SELECT nome_categ FROM categoria ";
        Statement st = this.conexao.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Categoria categoria = new Categoria(rs.getString("nome_categ"));
            lista.add(categoria);
        }
        rs.close();
        st.close();
        return lista;
    }

    
}
