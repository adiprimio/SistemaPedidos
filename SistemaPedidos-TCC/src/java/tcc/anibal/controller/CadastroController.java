/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.anibal.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tcc.anibal.bean.Cliente;
import tcc.anibal.dao.ClienteDAO;
import tcc.anibal.servlet.ServletPrincipal;

/**
 *
 * @author Anibal
 */
public class CadastroController {

    private HttpServletRequest req;
    private HttpServletResponse resp;
    private Connection conn;

    public CadastroController(HttpServletRequest req, HttpServletResponse resp, Connection conn) {
        this.req = req;
        this.resp = resp;
        this.conn = conn;
    }

    public void processo() throws ServletException, IOException, SQLException {
        this.salvar();

        RequestDispatcher dispatcher = req.getRequestDispatcher("Cadastro.jsp");
        dispatcher.forward(req, resp);
    }

    private void salvar() throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String sobrenome = req.getParameter("sobrenome");
        String email = req.getParameter("email");
        String endereco = req.getParameter("endereco");
        String login = req.getParameter("login");
        String senha = req.getParameter("senha");
        Cliente cli = new Cliente();
        cli.setNome(nome);
        cli.setSobrenome(sobrenome);
        cli.setEmail(email);
        cli.setEndereco(endereco);
        cli.setLogin(login);
        cli.setSenha(senha);
        int codigo = 0;
        try {
            codigo = Integer.parseInt(req.getParameter("cod_cliente"));
        } catch (NumberFormatException ex) {
        } catch (NullPointerException ex) {
        }
        ClienteDAO cliDAO = new ClienteDAO(conn);
        try {
            if (codigo == 0) {
                cliDAO.create(cli);
            }
        } catch (Exception ex) {
            ServletPrincipal.dispatcherErro(req, resp, String.format("Não foi possível criar a conta.[%s]", ex.getMessage()));
            return;
        }
    }
}
