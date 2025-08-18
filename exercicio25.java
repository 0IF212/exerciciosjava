import java.util.ArrayDeque;

public class exercicio25 {
    public static void main(String[] args) {
        ArrayDeque<String> pilha = new ArrayDeque<>();

        pilha.push("Demian");
        pilha.push("Sidarta");
        pilha.push("O lobo da estepe");

        System.out.println(pilha.pop());

        System.out.println(pilha.peek());

    }
}
