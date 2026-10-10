package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Animal;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.nome = "Spike";
        animal.especie = "Labrador";
        animal.idade = 5;

        System.out.printf("""
                
                Nome do animal: %s
                Especie do animal : %s
                Idade do animal: %d anos
                """, animal.nome, animal.especie, animal.idade);

    }
}
