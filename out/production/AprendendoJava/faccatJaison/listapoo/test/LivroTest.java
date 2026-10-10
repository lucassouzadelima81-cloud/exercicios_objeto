package flamingo.aprendendo.listapoo.test;
import flamingo.aprendendo.listapoo.dominio.Livro;

public class LivroTest {
    public static void main(String[] args) {
        Livro exemplar = new Livro();

        exemplar.titulo = "O Senhor dos Anéis";
        exemplar.autor = "Tolkien";
        exemplar.numeroPaginas = 360;
        exemplar.preco = 120.00;

        String tamanhoLivro = exemplar.verificarTamanho();
        System.out.printf("""
                Título: %s
                Autor: %s
                Quantidade de Páginas: %d
                Preço: R$ %.2f
                Tamanho livro: %s
                """, exemplar.titulo, exemplar.autor, exemplar.numeroPaginas, exemplar.preco,tamanhoLivro);
    }
}
