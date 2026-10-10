package flamingo.aprendendo.listapoo.dominio;

public class Livro {
    public String titulo, autor;
    public int numeroPaginas;
    public double preco;

    //ex18
    public String verificarTamanho(){
        return numeroPaginas > 300 ? "livro grande" : "livro pequeno";
    }
}
