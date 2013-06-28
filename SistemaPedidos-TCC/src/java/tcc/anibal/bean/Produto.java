/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.anibal.bean;


/**
 *
 * @author Anibal
 */
public class Produto {

    private Integer ProdutoID;
    private Categoria categoria;
    private SubCategoria subcategoria;
    private double Preco;
    private String Descricao;
    private String Nome;

   
    public Integer getProdutoID() {
        return ProdutoID;
    }

    public void setProdutoID(Integer ProdutoID) {
        this.ProdutoID = ProdutoID;
    }
    
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public SubCategoria getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(SubCategoria subcategoria) {
        this.subcategoria = subcategoria;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }
    
    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
}