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
public class PrjListaDinamica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista l = new Lista();
        
        // Exemplo de inserção de produtos na lista, passando como parâmetros
        // o código, nome e preço do produto
        l.inserirNoInicio(10, "Arroz", 9.50);
        l.inserirNoFim(20, "Feijão", 5.00);
        
        // Exemplo de inserção de produtos na lista, passando como parâmetro
        // um objeto da classe produto
        Produto p = new Produto(30, "Café", 8.30);
        l.inserirNoInicio(p);
        
        p = new Produto(40, "Açúcar", 5.50);
        l.inserirNoFim(p);

        l.imprimir();
        System.out.println("excluindo 40");
        TipoNo no = l.excluir(40);
        System.out.println(no);

        l.imprimir();
        System.out.println("excluindo 30");
        no = l.excluir(30);
        System.out.println(no);

        l.imprimir();
    }
    
}
