package Aprendendo.Java.main.src.listapoo.dominio;

public class AlunoEx10 {
    public  String nome;
    public double nota1;
    public double nota2;

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public boolean isAprovado() {
        return calcularMedia() >= 7;
    }

    public String getSituacao() {
        if (calcularMedia() >=7 ) {
            return "aprovado";
        } else if (calcularMedia() >= 5 && calcularMedia()<7) {
            return "recuperação";
        }else {
            return "reprovado";
        }
    }
}
