<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="formerro.jsp"%>
<%
// Evitar cache das páginas
    response.setHeader("Cache-Control", "no-cache"); //HTTP 1.1
    response.setHeader("Pragma", "no-cache"); //HTTP 1.0
    response.setDateHeader("Expires", 0); //prevents caching at the proxy server
%>
<html lang="en-US" xmlns="http://www.w3.org/1999/xhtml" dir="ltr">
    <head>
        <title>Sistema de Pedidos com Técnicas de Recomendação</title>
        <meta http-equiv="Content-type" content="text/html; charset=utf-8" />
        <link rel="shortcut icon" href="css/images/favicon.ico" />
        <link rel="stylesheet" href="css/style.css" type="text/css" media="all" />

        <script src="js/jquery-1.6.2.min.js" type="text/javascript" charset="utf-8"></script>
        <!--[if IE 6]>
                <script src="js/DD_belatedPNG-min.js" type="text/javascript" charset="utf-8"></script>
        <![endif]-->
        <script src="js/jquery.jcarousel.min.js" type="text/javascript" charset="utf-8"></script>
        <script src="js/functions.js" type="text/javascript" charset="utf-8"></script>
        <script src="js/validador.js" type="text/javascript" ></script>    
    </head>
    <body>
        <%@include file="include/Menu.jsp" %>
        <%@include file="include/Banner.jsp" %>
        <%@include file="include/LadoEsquerdo.jsp" %>
        <%@include file="include/LadoDireito.jsp" %>
        <div id="Formulario">
            <h2>Login</h2>

            <form method="post" action="ServletPrincipal">
                <fieldset>
                    <br/>
                    <label for="login">Login: </label>
                    <input type="text" id="login" name="login_cliente" class="campo"/><br/><br/>

                        <label for="senha">Senha: </label>
                        <input type="password" id="senha" name="senha" class="campo"/>
                            <input type="hidden" id="acao" name="acao" value="login"/><br/></br>

                            <input type="submit" value="Logar" class="botao"/>&nbsp;&nbsp;
                                <input type="reset" class="botao reset"/>
                                    </fieldset>
                                    </form>
                                    </div>

                                    </body>
                                    </html>