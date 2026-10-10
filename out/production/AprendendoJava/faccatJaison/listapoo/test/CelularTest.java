package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Celular;

public class CelularTest {
    public static void main(String[] args) {
        Celular celular = new Celular();

        celular.marca = "Apple";
        celular.modelo = "Iphone 11";
        celular.armazenamento  = 64;
        celular.preco = 1200;

        System.out.printf("""
                
               Marca: %s
               modelo: %s
               armazenamento: %d
               preco : %.2f
                """, celular.marca , celular.modelo , celular.armazenamento , celular.preco);
    }
}
