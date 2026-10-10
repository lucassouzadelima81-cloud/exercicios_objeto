package flamingo.aprendendo.listapoo.dominio;

public class Produto {
        public String nome;
        public double preco;
        public int quantidade;
        //ex14
        public double valorTotal() {
            return preco * quantidade;
        }

        //ex15
        public String vereficarCategoria() {
            return preco >= 1000 ? "Produto caro" : "Produto barato";
        }
        //ex21
        public double aplicarDesconto(double porcentagem){
            return preco - (preco * (porcentagem / 100));
        }
        //ex22
        public double aumentarPreco(double porcentagem) {
            return preco + (preco*(porcentagem / 200));
        }
    }

