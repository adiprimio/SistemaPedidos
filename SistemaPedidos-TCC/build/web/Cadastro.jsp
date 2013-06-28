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
            <h2>Cadastro</h2>
            <form method="post" action="ServletPrincipal" >
                <fieldset>
                    <br/>

                    <label for="nome">Nome: </label>
                    <input type="text" id="nome" name="nome" class="campo">
                        <br/><br/>

                        <label for="sobrenome">Sobrenome: </label>
                        <input type="text" id="sobrenome" name="sobrenome" class="campo">
                            <br/><br/>

                            <label for="endereco">Endereço: </label>
                            <input type="text" id="endereco" name="endereco" class="campo">
                                <br/><br/>

                                <label for="email">E-mail: </label>
                                <input type="text" id="email" name="email" class="campo">
                                    <br/><br/>

                                    <label for="login">Login: </label>
                                    <input type="text" id="login" name="login" class="campo">
                                        <br/><br/>

                                        <label for="senha">Senha: </label>
                                        <input type="password" id="senha" name="senha" class="campo">
                                            <br/><br/>

                                            <input type="submit" value="Cadastrar" class="botao">&nbsp;

                                                <input type="reset" class="botao reset">

                                                    <input type="hidden" name="acao" value="cadastro"/>


                                                    </fieldset>
                                                    </form>
                                                    </div>
                                                    </body>
                                                    </html>