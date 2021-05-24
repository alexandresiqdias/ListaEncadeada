/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjlistadinamica;

/**
 *
 * @author alexandresd
 */
public class TipoNo {
    
    Produto item;
    TipoNo proximo; 
    
    // Construtor que recebe um código, nome e preço, cria um produto com 
    // esses dados, e atribui ao item o produto criado
    public TipoNo(int codigo, String nome, double preco)
    {
        Produto p = new Produto(codigo, nome, preco);
        this.item = p;
        proximo = null;
    }
    
    // Construtor que recebe um produto e atribui ao item o produto recebido 
    // como parâmetro
    public TipoNo(Produto p)
    {
       this.item = p;
       proximo = null;
    }
    
    public String toString()
    {
        return item.toString();
    }
    
}
