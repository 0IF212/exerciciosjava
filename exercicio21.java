import java.util.LinkedHashMap;

public class exercicio21 {
   public static void main(String[] args) {
    LinkedHashMap<Integer, String> produtos = new LinkedHashMap<>();

    produtos.put(1, "RX550");
    produtos.put(4, "RX580");
    produtos.put(3, "RX7600");
    produtos.put(2, "RX9600XT");
    produtos.put(5, "GTX 1080TI");


    System.out.println(produtos);
   } 
}
