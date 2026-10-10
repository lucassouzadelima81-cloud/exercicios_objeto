package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Ruan";
        professor.idade = 23;
        professor.disciplina = "matematica";
        professor.salario = 2000;


        System.out.printf("""
                        nome : %s
                        idade : %d
                        disciplia : %s
                        salario : %.2f
                        """, professor.nome , professor.idade, professor.disciplina, professor.salario );
    }

}
