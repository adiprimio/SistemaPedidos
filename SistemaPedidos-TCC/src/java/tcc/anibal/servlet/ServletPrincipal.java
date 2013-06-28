package tcc.anibal.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import tcc.anibal.controller.CadastroController;
import tcc.anibal.controller.LoginController;
// import tcc.anibal.controller.MensagemSuporteController;
// import tcc.anibal.controller.PedidoController;
// import tcc.anibal.controller.PesquisaController;

public class ServletPrincipal extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DataSource dataSource = null;
        Connection conn = null;
        try {
            Context context = new InitialContext();
            dataSource = (DataSource) context.lookup("jdbc/sptr");
            conn = dataSource.getConnection();
            String acao = req.getParameter("acao");
            if ("login".equals(acao)) {
                LoginController lc = new LoginController(req, resp, conn);
                lc.processo();
            }else if ("cadastro".equals(acao)) {
                CadastroController dc = new CadastroController(req, resp, conn);
                dc.processo();
            }
            /** else if ("pedido".equals(acao)) {
                PedidoController dc = new PedidoController(req, resp, conn);
                dc.processo();
            } else if ("mensagemsuporte".equals(acao)) {
                MensagemSuporteController cp = new MensagemSuporteController(req, resp, conn);
                cp.processo();
            }else if ("mensagemsuporte".equals(acao)) {
                PesquisaController cp = new PesquisaController(req, resp, conn);
                cp.processo();
            } */
            else if ("logout".equals(acao)) {
                req.getSession().invalidate();
                RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
                dispatcher.forward(req, resp);
            } else {
                RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
                dispatcher.forward(req, resp);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            ServletPrincipal.dispatcherErro(req, resp, ex.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
            }
        }

    }

    public static void dispatcherErro(HttpServletRequest req, HttpServletResponse resp, String msg) throws ServletException, IOException {
        req.setAttribute("mensagem", msg);
        RequestDispatcher dispatcher = req.getRequestDispatcher("formerro.jsp");
        dispatcher.forward(req, resp);

    }
}
