/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.anibal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import tcc.anibal.bean.Categoria;
import tcc.anibal.bean.SubCategoria;

/**
 *
 * @author Anibal
 */
public class SubCategoriaDAO {
    
     private Connection conexao;

    public SubCategoriaDAO(Connection conexao) {
        this.conexao = conexao;
    }


    public SubCategoria retrieve(SubCategoria subcateg) throws SQLException {
        PreparedStatement ps = conexao.prepareStatement("select nome from subcategoria where id=?");
        ps.setInt(1, subcateg.getSubCategoriaID());
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            subcateg.setNomeSubCategoria(rs.getString(1));

        }
        return subcateg;
    }
    
}
