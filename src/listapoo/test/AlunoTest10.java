package Aprendendo.Java.main.src.listapoo.test;

import Aprendendo.Java.main.src.listapoo.dominio.AlunoEx10;

public class AlunoTest10 {
    static void main(String[] args) {
        AlunoEx10 aluno1 = new AlunoEx10();
        AlunoEx10 aluno2 = new AlunoEx10();
        AlunoEx10 aluno3 = new AlunoEx10();

        aluno1.nome = "lucas";
        aluno1.nota1 = 10;
        aluno1.nota2 = 9;
        double media = aluno3.calcularMedia();
        String isAprovado1 = aluno3.isAprovado()? "aprovado" : "reprovado";
        String situacao01 = aluno1.getSituacao();

        aluno2.nome = "lucas";
        aluno2.nota1 = 10;
        aluno2.nota2 = 9;
        double media = aluno2.calcularMedia();
        String isAprovado2 = aluno2.isAprovado()? "aprovado" : "reprovado";
        String situacao02 = aluno1.getSituacao();

        aluno3.nome = "lucas";
        aluno3.nota1 = 10;
        aluno3.nota2 = 9;
        double media = aluno1.calcularMedia();
        String isAprovado3 = aluno1.isAprovado()? "aprovado" : "reprovado";
        String situacao03 = aluno1.getSituacao();

        System.out.printf("""
                Nome: %s
                Nota1: %.1f
                Nota2: %.1f
                Media: %.1f
                isAprovado: %s
                """, aluno1.nome,aluno1.nota1,aluno1.nota2,media, isAprovado1);

        System.out.printf("""
                Nome: %s
                Nota1: %.1f
                Nota2: %.1f
                Media: %.1f
                isAprovado: %s
                """, aluno2.nome,aluno2.nota1,aluno2.nota2,media, isAprovado1);

        System.out.printf("""
                Nome: %s
                Nota1: %.1f
                Nota2: %.1f
                Media: %.1f
                isAprovado: %s
                """, aluno3.nome,aluno3.nota1,aluno3.nota2,media, isAprovado1);
    }
}
