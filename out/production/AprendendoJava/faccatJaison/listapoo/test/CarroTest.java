package flamingo.aprendendo.listapoo.test;
import flamingo.aprendendo.listapoo.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro01 = new Carro();

        carro01.nome = "Uno";
        carro01.modelo = "Uno De Escada";
        carro01.ano = 1990;
        String clasificacao = carro01.verificarIdadeDoCarro();

        System.out.printf("""
                Nome do Carro: %s
                Modelo do Carro: %s
                Ano de Fabricação: %d
                Clasificação: %s
                """, carro01.nome, carro01.modelo, carro01.ano,clasificacao);
    }
}
