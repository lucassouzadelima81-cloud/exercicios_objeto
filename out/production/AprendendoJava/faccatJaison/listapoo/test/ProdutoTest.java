package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto01 = new Produto();
        Produto produto02 = new Produto();

        produto01.nome = "shampoo";
        produto01.preco = 20;
        produto01.quantidade = 5;
        double valorTotalEstoque01 = produto01.valorTotal();
        String categoriaProduto01 = produto01.vereficarCategoria();
        double desconto = produto01.aplicarDesconto(30);
        double aumento = produto01.aumentarPreco(100);

        System.out.printf("""
                
                Nome do Produto: %s
                Preço do Produto : %.2f
                Quantidade do Produto : %d
                Valor Total em Estoquer: %.2f
                categoria: %s
                Preço com desconto: %d
                Preço com aumento: %s
                """, produto01.nome, produto01.preco, produto01.quantidade, valorTotalEstoque01, categoriaProduto01, produto02.nome, produto02.preco, produto02.quantidade, desconto, aumento);

        produto02.nome = "shampoo";
        produto02.preco = 20;
        produto02.quantidade = 5;
        double valorTotalEstoque02 = produto01.valorTotal();
        String categoriaProduto02 = produto01.vereficarCategoria();

        System.out.printf("""
                
                Nome do Produto: %s
                Preço do Produto : %.2f
                Quantidade do Produto : %d
                Valor Total em Estoquer: %.2f
                categoria: %s
                """, produto02.nome, produto02.preco, produto02.quantidade, valorTotalEstoque02, categoriaProduto02);


    }
}
