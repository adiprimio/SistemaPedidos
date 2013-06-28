/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.anibal.bean;



/**
 *
 * @author Anibal
 */
public class Cliente {

    private Integer ClienteID;
    private String Login;
    private String Senha;
    private String Nome;
    private String Sobrenome;
    private String Email;
    private String Endereco;


    public Integer getClienteID() {
        return ClienteID;
    }

    public void setClienteID(Integer ClienteID) {
        this.ClienteID = ClienteID;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public boolean validaSenha(String senha) {
        boolean ret = false;
        try {
            if (this.Senha.equals(senha)) {
                ret = true;
            }
        } catch (NullPointerException ex) {
        }
        return ret;
    }
    
    @Override
        public String toString() {
        return super.toString();
    }
    
        @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.ClienteID != other.ClienteID) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.ClienteID;
        return hash;
    }
    
    
}