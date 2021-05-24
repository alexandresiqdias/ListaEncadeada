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
public class Lista {
    
    TipoNo primeiro, ultimo;
    
    public Lista()
    {
        primeiro = ultimo = null;
    }
    
    public boolean vazia()
    {
        return primeiro == null;
    }

    // Inserir um produto no início recebendo o código, nome e preço do produto
    public void inserirNoInicio(int codigo, String nome, double preco)
    {
        // Cria um novo produto
        Produto p = new Produto(codigo, nome, preco);
        
        // Executa o método inserirNoInicio passando o produto criado
        inserirNoInicio(p);
    }
            
    //Inserir um produto no início recebendo um objeto da classe produto
    public void inserirNoInicio(Produto p)
    {
        TipoNo no = new TipoNo(p);
        no.proximo = primeiro;

        if(vazia()) 
            ultimo = no;

        primeiro = no;
    }
    
    // Inserir um produto no fim recebendo o código, nome e preço do produto
    public void inserirNoFim(int codigo, String nome, double preco)
    {
        // Cria um novo produto
        Produto p = new Produto(codigo, nome, preco);
        
        // Executa o método inserirNoFim passando o produto criado
        inserirNoFim(p);
    }

    //Inserir um produto no fim recebendo um objeto da classe produto
    public void inserirNoFim(Produto p)
    {
        TipoNo no = new TipoNo(p);

        if (vazia()) 
              primeiro = no;
        else
              ultimo.proximo = no;

        ultimo = no;
        
    }
    
    public void inserirOrdenado(Produto p) {
        TipoNo aux = primeiro, ant = null;

        TipoNo no = new TipoNo(p);

        while ((aux != null) && (aux.item.getCodigo() < p.getCodigo())) {
            ant = aux;
            aux = aux.proximo;
        }

        if (ant == null) 
            primeiro = no;
        else 
            ant.proximo = no;

        no.proximo = aux;

        if (aux == null)
            ultimo = no;
    }

    
    public void imprimir()
    {
        TipoNo aux = primeiro;
        
        while (aux != null)
        {
            System.out.println(aux);
            aux = aux.proximo;
        }
    }
    
    public TipoNo excluir(int codigo)
    {
        TipoNo aux = primeiro, ant = null;

        while ((aux != null) && (aux.item.getCodigo() != codigo)) {
            ant = aux;
            aux = aux.proximo;
        }
        
        if (aux == null)
            return null;
        
        if (aux == primeiro)
        {
            if (primeiro == ultimo)
                ultimo = null;
            primeiro = aux.proximo;
        }
        else if (aux == ultimo)
        {
            ant.proximo = null;
            ultimo = ant;
        } else{
            ant.proximo = aux.proximo;
        }
        return aux;
    }
}
