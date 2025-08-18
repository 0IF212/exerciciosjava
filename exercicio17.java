import java.util.TreeSet;

public class exercicio17 {
   public static void main(String[] args) {
        Produto produto1 = new Produto("PS5", 3000.00);
        Produto produto2 = new Produto("Switch 2", 5000.00);
        Produto produto3 = new Produto("Xbox Series S", 2500.00);

        TreeSet<Produto> set = new TreeSet<>();

        set.add(produto1);
        set.add(produto2);
        set.add(produto3);

        for (Produto produto : set) {
            System.out.println(produto.getNome());
        }
   } 

   public static class Produto implements Comparable<Produto> {
    private String nome;
    private Double preco;

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Double getPreco() {
        return preco;
    }


    public void setPreco(Double preco) {
        this.preco = preco;
    }



    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    
    @Override
    public int compareTo(exercicio17.Produto arg0) {
        return Double.compare(this.preco, arg0.preco);
    }
   }
   
   
}
