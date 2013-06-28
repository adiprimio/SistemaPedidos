<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
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
    </head>
    <body>
        <%@include file="include/Menu.jsp" %>
        <%@include file="include/Banner.jsp" %>
        <%@include file="include/LadoEsquerdo.jsp" %>
        <%@include file="include/LadoDireito.jsp" %>
        <div id="Formulario">
            <h2>Suporte</h2>
            <form method="post" action="ServletPrincipal">
                <fieldset>
                    <br/>

                    <label for="email">E-mail: </label>
                    <input type="text" id="email" name="email" class="campo" cols="40">
                        <br/><br/>

                        <label for="assunto">Assunto </label>
                        <input type="text" id="assunto" name="assunto" class="campo">
                            <br/><br/>             
                            
                            <textarea name="descricao" rows="10" cols="40">Descreva seu problema</textarea>
                            <br/><br/>

                            <input type="submit" value="Enviar" class="botao">
                                &nbsp;&nbsp;
                                <input type="reset" class="botao reset">

                                    <input type="hidden" name="acao" value="enviar"/>
                                    </fieldset>
                                    </form>
                                    </div>
                                    </body>
                                    </html>