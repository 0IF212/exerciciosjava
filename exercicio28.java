import java.util.ArrayDeque;
import java.util.Scanner;

public class exercicio28 {
   public static void main(String[] args) {
        ArrayDeque<String> pilha = new ArrayDeque<>();

        System.out.println("Digite uma frase: ");

        Scanner leitor = new Scanner(System.in);

        String frase = leitor.nextLine();
        leitor.close();

        String[] palavras = frase.split(" ");

        for (String palavraString : palavras) {
            pilha.push(palavraString);
        }

        String fraseInvertida = "";
        int size = pilha.size();
        for (int i = 0; i < size; i++) {
            fraseInvertida+=pilha.pop() + " ";
        }

        System.out.println(fraseInvertida);
   } 
}
