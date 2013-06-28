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
public class LoginController {

    private HttpServletRequest req;
    private HttpServletResponse resp;
    private Connection conn;

    public LoginController(HttpServletRequest req, HttpServletResponse resp, Connection conn) {
        this.req = req;
        this.resp = resp;
        this.conn = conn;
    }

    public void processo() throws ServletException, IOException, SQLException {
        String login = req.getParameter("login_cliente");
        String senha = req.getParameter("senha");
        ClienteDAO cliDao = new ClienteDAO(conn);
        Cliente cliente = cliDao.retrieve(login);




        if (cliente == null || !cliente.validaSenha(senha)) {
            ServletPrincipal.dispatcherErro(req, resp, String.format("Login ou Senha Inválidos.[%s]", login));
            return;
        } else {
            req.getSession().setAttribute("ClienteLogado", Boolean.TRUE);
            req.getSession().setAttribute("Login", cliente.getLogin());
            req.getSession().setAttribute("ClienteID", cliente.getClienteID());

            int vcodusuario = cliente.getClienteID();

            RequestDispatcher dispatcher = req.getRequestDispatcher("TelaCliente.jsp");
            dispatcher.forward(req, resp);
            

        }
    }
}