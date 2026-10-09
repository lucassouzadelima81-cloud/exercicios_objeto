package Aprendendo.Java.main.src.listapoo.test;

import Aprendendo.Java.main.src.listapoo.dominio.CelularEx6;

public class CelularTest6 {
    static void main(String[] args) {
        CelularEx6 celular = new CelularEx6();

        celular.marca = "samsung";
        celular.modelo = "S26";
        celular.armezanamento = 256;
        celular.preco = 400 ;

        System.out.printf("celular %s %s com %dGB R$ %.1f", celular.marca,celular.modelo,celular.armezanamento,celular.preco);
    }
}
