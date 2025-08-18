import java.util.HashMap;
import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        HashMap<String,String> dicionario = new HashMap<>();

        dicionario.put("Livro", "Book");
        dicionario.put("Mesa", "Table");
        dicionario.put("Espada", "Sword");
        dicionario.put("Teclado", "Keyboard");
        dicionario.put("Garrafa", "Bottle");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Buscar no dicionario: ");

        String palavra = leitor.next();

        if (dicionario.containsKey(palavra)) {
            System.out.println(palavra + " em inglês: " + dicionario.get(palavra));
        } else {
            System.out.println("Palavra não existe no dicionario");
        }
        leitor.close();
        
    }
    
}
