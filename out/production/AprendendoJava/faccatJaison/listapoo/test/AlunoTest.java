package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Aluno aluno02 = new Aluno();
        Aluno aluno03 = new Aluno();

        aluno.nome = "Ruan";
        aluno.nota1 = 5.5;
        aluno.nota2 = 7;
        aluno.media = aluno.calcularMedia();
        aluno.isAprovado();
        aluno.getSituacao();

        aluno02.nome = "Camilly";
        aluno02.nota1 = 7;
        aluno02.nota2 = 8;
        aluno02.media = aluno02.calcularMedia();
        aluno02.isAprovado();
        aluno02.getSituacao();

        aluno03.nome = "Andressa";
        aluno03.nota1 = 7;
        aluno03.nota2 = 5.5;
        aluno03.media = aluno03.calcularMedia();
        aluno03.isAprovado();
        aluno03.getSituacao();

        System.out.printf("""
                Nome do aluno: %s
                Nota 01 do aluno: %.2f
                Nota 02 do aluno: %.2f
                Nota Final: %.2f
                Situação: %s
                Condição: %s
                
                -----------------------
                
                Nome do aluno: %s
                Nota 01 do aluno: %.2f
                Nota 02 do aluno: %.2f
                Nota Final: %.2f
                Situação: %s
                Condição: %s
                
                -----------------------
                
                Nome do aluno: %s
                Nota 01 do aluno: %.2f
                Nota 02 do aluno: %.2f
                Nota Final: %.2f
                Situação: %s
                Condição: %s
                """, aluno.nome, aluno.nota1 , aluno.nota2, aluno.calcularMedia(), aluno.isAprovado() ? "Aprovado" : "Reprovado", aluno.getSituacao(), aluno02.nome, aluno02.nota1, aluno02.nota2, aluno02.calcularMedia(), aluno02.isAprovado() ? "Aprovado" : "Reprovado", aluno02.getSituacao(), aluno03.nome, aluno03.nota1, aluno03.nota2, aluno03.calcularMedia(), aluno03.isAprovado() ? "Aprovado" : "Reprovado", aluno03.getSituacao());

    }
}
