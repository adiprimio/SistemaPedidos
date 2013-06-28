/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.anibal.bean;



/**
 *
 * @author Anibal
 */

public class Categoria {
    
    private Integer CategoriaID;
    private String NomeCategoria;

    public Categoria(String NomeCategoria) {
        this.NomeCategoria = NomeCategoria;
    }

    

    public Integer getCategoriaID() {
        return CategoriaID;
    }

    public void setCategoriaID(Integer CategoriaID) {
        this.CategoriaID = CategoriaID;
    }

    public String getNomeCategoria() {
        return NomeCategoria;
    }

    public void setNomeCategoria(String NomeCategoria) {
        this.NomeCategoria = NomeCategoria;
    }
 
}
