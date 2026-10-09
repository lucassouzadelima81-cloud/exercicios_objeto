package Aprendendo.Java.main.src.listapoo.test;

import Aprendendo.Java.main.src.listapoo.dominio.ContaBancariaEx7;

public class ContaBancariaTest7 {
    static void main(String[] args) {
        ContaBancariaEx7 conta = new ContaBancariaEx7();

        conta.titular = "lucas";
        conta.numeroConta = "556 998 008 346";
        conta.saldo = 1.200;

        System.out.printf("""
                Titular: %s
                Numero conta: %s
                Saldo: %.2f
                """, conta.titular,conta.numeroConta,conta.saldo);
    }
}
