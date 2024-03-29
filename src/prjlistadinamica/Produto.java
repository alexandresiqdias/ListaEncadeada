/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjlistadinamica;

/**
 *
 * @author alex_
 */
public class Produto {
    
    private int codigo;
    private String nome;
    private double preco;

    public Produto(int codigo, String nome, double preco)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }
    
    public String toString()
    {
        return "Código: " + codigo + "\t Nome: " + nome + "\tPreço: R$ " + preco;
    }
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
