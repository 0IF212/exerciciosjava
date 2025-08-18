import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class exercicio31 {
   static class Produto {
    private int codigo;
    public String nome;
    protected double preco;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    private double calcularImposto() {
        return preco * 0.1;
    }
}

public static class AnalisadorDeClasse {
    public static void inspecionar(Object obj) {
        System.out.println("Classe: " + obj.getClass().getName());
        System.out.println("Atributos:");
        Field[] atributos = obj.getClass().getDeclaredFields();
        for (Field field : atributos) {
            System.out.println(field.getName());
        }

        System.out.println("Metodos:");
        Method[] metodos = obj.getClass().getDeclaredMethods();
        for (Method methods : metodos) {
            System.out.println(methods.getName());
        } 
    }
}

 public static void main(String[] args) {
     Produto p = new Produto(101, "Notebook Gamer", 8500.0);
     AnalisadorDeClasse.inspecionar(p);
 } 
}
