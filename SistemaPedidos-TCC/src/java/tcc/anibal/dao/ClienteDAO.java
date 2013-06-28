/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.anibal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.persistence.Query;
import tcc.anibal.bean.Categoria;
import tcc.anibal.bean.Cliente;

/**
 *
 * @author Anibal
 */
public class ClienteDAO {

    private Connection conexao;

    public ClienteDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public void create(Cliente cli) throws SQLException {
        if (this.valida(cli)) {
            String sql = "INSERT INTO cliente (cod_cliente,nome_cliente,sobrenome_cliente,email,endereco,login_cliente,senha) VALUES (NEXTVAL('cliente_cod_cliente_seq'),?,?,?,?,?,?)";
            PreparedStatement pst = this.conexao.prepareStatement(sql);
            pst.setString(1, cli.getNome());
            pst.setString(2, cli.getSobrenome());
            pst.setString(3, cli.getEmail());
            pst.setString(4, cli.getEndereco());
            pst.setString(5, cli.getLogin());
            pst.setString(6, cli.getSenha());
            pst.executeUpdate();
            Statement st = this.conexao.createStatement();
            ResultSet rs = st.executeQuery("SELECT CURRVAL('cliente_cod_cliente_seq')");
            if (rs.next()) {
                cli.setClienteID(rs.getInt(1));
            }
            rs.close();
            st.close();
            pst.close();
        }
    }

    public Cliente retrieve(String login) throws SQLException {
        Cliente cli = new Cliente();
        String sql = "SELECT cod_cliente,login_cliente,senha FROM cliente WHERE login_cliente=?";
        PreparedStatement pst = this.conexao.prepareStatement(sql);
        pst.setString(1, login);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            cli.setClienteID(rs.getInt("cod_cliente"));
            cli.setLogin(rs.getString("login_cliente"));
            cli.setSenha(rs.getString("senha"));
        }
        rs.close();
        pst.close();
        return cli;
    }

    public boolean valida(Cliente clie) {
        boolean ret = false;
        if (clie != null) {
            ret = true;
        }
        return ret;
    }
}
