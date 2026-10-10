package flamingo.aprendendo.listapoo.dominio;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double media;

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public boolean isAprovado(){
        if(media >= 7){
            return true;
        }
        return false;
    }
    public String getSituacao(){
        if(media >= 7){
            return "Aprovado";
        }else if(media >= 5 && media < 7){
            return "Recuperação";
        }
        return "Reprovado";
    }

}
