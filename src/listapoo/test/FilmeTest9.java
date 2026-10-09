package Aprendendo.Java.main.src.listapoo.test;

import Aprendendo.Java.main.src.listapoo.dominio.FilmeEx9;

public class FilmeTest9 {
    static void main(String[] args) {
        FilmeEx9 filme = new FilmeEx9();

        filme.titulo = "el bigode";
        filme.genero = "terror";
        filme.duracaoMinutos = 190;
        filme.clasificacaoIndicativa = "A18";

        System.out.printf("""
                Filme %s do genero %s tem %d minutos na classificação indicativa %s
                """, filme.titulo,filme.genero,filme.duracaoMinutos,filme.clasificacaoIndicativa);
    }
}
