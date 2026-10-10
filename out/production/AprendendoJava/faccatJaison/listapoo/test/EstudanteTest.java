package flamingo.aprendendo.listapoo.test;
import flamingo.aprendendo.listapoo.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Camilly";
        estudante.idade = 20;
        estudante.sexo = 'F';

        System.out.printf("""
                Nome do Estudante: %s
                Idade: %d
                Gênero: %c
                """, estudante.nome, estudante.idade, estudante.sexo);
    }
}
