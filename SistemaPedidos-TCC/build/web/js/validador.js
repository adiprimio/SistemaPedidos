function validarLoginCliente() {

    if (document.getElementById("login").value == "") {
        alert("preencha o login!");
        document.getElementById("login").style.borderColor = "#ed3f50";
        document.getElementById("login").focus();
        return false;
    }

    if (document.getElementById("senha").value == "") {
        alert("preencha a senha!");
        document.getElementById("senha").style.borderColor = "#ed3f50";
        document.getElementById("senha").focus();
        return false;
    }

    return true;
}

function validarCadastroCliente() {

    if (document.getElementById("nome").value == "") {
        alert("preencha o nome!");
        document.getElementById("nome").style.borderColor = "#ed3f50";
        document.getElementById("nome").focus();
        return false;
    }

    if (document.getElementById("sobrenome").value == "") {
        alert("preencha o sobrenome!");
        document.getElementById("sobrenome").style.borderColor = "#ed3f50";
        document.getElementById("sobrenome").focus();
        return false;
    }

    if (document.getElementById("login").value == "") {
        alert("preencha o login!");
        document.getElementById("login").style.borderColor = "#ed3f50";
        document.getElementById("login").focus();
        return false;
    }

    if (document.getElementById("senha").value == "") {
        alert("preencha o senha!");
        document.getElementById("senha").style.borderColor = "#ed3f50";
        document.getElementById("senha").focus();
        return false;
    }

    if (document.getElementById("endereco").value == "") {
        alert("preencha o endereco!");
        document.getElementById("endereco").style.borderColor = "#ed3f50";
        document.getElementById("endereco").focus();
        return false;
    }

    if (document.getElementById("email").value == "") {
        alert("preencha o e-mail!");
        document.getElementById("email").style.borderColor = "#ed3f50";
        document.getElementById("email").focus();
        return false;
    }

    return true;
}