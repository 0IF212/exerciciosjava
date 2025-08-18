import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class exercicio26 {

    public static class Produto {
        private String nome;
        public String getNome() {
            return nome;
        }
        public Double getPreco() {
            return preco;
        }
        private Double preco;
        public Produto(String nome, Double preco) {
            this.nome = nome;
            this.preco = preco;
        }
    }

    public static void main(String[] args) {
        HashMap<String,List<Produto>> catalogo = new HashMap<>();

        ArrayList<Produto> eletrodomesticos = new ArrayList<>();

        eletrodomesticos.add(new Produto("Microondas", 300.00));
        eletrodomesticos.add(new Produto("Geladeira", 500.00));

        ArrayList<Produto> videogames = new ArrayList<>();

        videogames.add(new Produto("Wii U", 2400.00));
        videogames.add(new Produto("PS5", 3200.00));

        catalogo.put("Videogames", videogames);

        catalogo.put("Eletrodomesticos", eletrodomesticos);

        catalogo.get("Eletrodomesticos").forEach(produto -> {
            System.out.println(produto.getNome() + ": " + produto.getPreco());
        });
    } 
}
