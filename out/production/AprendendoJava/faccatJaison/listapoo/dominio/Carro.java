package flamingo.aprendendo.listapoo.dominio;

public class Carro {
    //ex3
    public String nome;
    public String modelo;
    public int ano;

    //ex16
    public String verificarIdadeDoCarro(){
        return ano < 2010 ? "Carro antigo" : "Carro novo";
    }
}
