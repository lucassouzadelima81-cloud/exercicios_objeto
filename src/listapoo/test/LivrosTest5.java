package Aprendendo.Java.main.src.listapoo.test;

import Aprendendo.Java.main.src.listapoo.dominio.LivrosEx5;

public class LivrosTest5 {
    static void main(String[] args) {
        LivrosEx5 livro1 = new LivrosEx5();
        LivrosEx5 livro2 = new LivrosEx5();

        livro1.autor = "lucas";
        livro1.titulo = "aventuras lucas";
        livro1.numeroPaginas = 222;
        livro1.preco = 29.90;

        livro2.autor = "lucas";
        livro2.titulo = "aventuras lucas";
        livro2.numeroPaginas = 222;
        livro2.preco = 29.90;

        System.out.printf("""
                livro1
                ----------------------
                autos: %s
                titulo: %s
                numeros de paginas : %d
                preco: %d
                -----------------------
                livro2
                ----------------------
                autos: %s
                titulo: %s
                numeros de paginas : %d
                preco: %d
                """, livro1.autor,livro1.titulo,livro1.numeroPaginas,livro1.numeroPaginas,livro1.preco, livro2.autor,livro2.titulo,livro2.numeroPaginas,livro2.numeroPaginas,livro2.preco);
    }
}
