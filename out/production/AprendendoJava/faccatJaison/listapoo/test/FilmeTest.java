package flamingo.aprendendo.listapoo.test;
import flamingo.aprendendo.listapoo.dominio.Filme;

public class FilmeTest {
    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.titulo = "Vingadores";
        filme.genero = "Ação";
        filme.duracaoMinutos = 180;
        filme.classificacaoIndicativa = "12";

        System.out.printf("""
                Título: %s
                Gênero: %s
                Duração: %d minutos
                Classificação Indicativa: %s anos
                """, filme.titulo, filme.genero, filme.duracaoMinutos, filme.classificacaoIndicativa);
    }
}
