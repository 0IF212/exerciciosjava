import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        int aleatorio = (int) (Math.random() * 100);
        int guess = 0;
        int tentativas = 0;
        Scanner leitor = new Scanner(System.in);
        while (guess != aleatorio) {
            System.out.println("Adivinhe um número: ");
            guess = leitor.nextInt();
            if(guess > aleatorio) {
                System.out.println("O número inserido é maior que o número gerado");
            } else {
                System.out.println("O número inserido é menor que o número gerado");
            }
            tentativas++;
        }
        System.out.println("Você adivinhou o número: " + aleatorio);
        System.out.println("Total de tentativas: " + tentativas);
        leitor.close();
    }
}
