package Aprendendo.Java.main.src.listapoo.test;

import Aprendendo.Java.main.src.listapoo.dominio.AnimalEx8;

public class AnimalTest8 {
    static void main(String[] args) {
        AnimalEx8 animal1 = new AnimalEx8();
        AnimalEx8 animal2 = new AnimalEx8();

        animal1.nome = "montanha";
        animal1.especie = "cachorro";
        animal1.idade = 1;

        animal2.nome = "henrique";
        animal2.especie = "cachorro";
        animal2.idade = 2;

        System.out.printf("""
                Animal 1
                ----------------
                nome: %s
                Especie: %s
                Idade : %d
                ----------------------
                
                Animal 2
                ------------------
                nome: %s
                Especie: %s
                Idade : %d
                """,animal1.nome,animal1.especie,animal1.idade,animal2.nome,animal2.especie,animal2.idade);
    }
}
