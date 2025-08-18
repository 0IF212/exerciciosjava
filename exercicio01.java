import java.util.Scanner;

public class exercicio01 {
   public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno: ");
        Float n1 = leitor.nextFloat();
        System.out.println("Digite a segunda nota do aluno: ");
        Float n2 = leitor.nextFloat();
       System.out.println("Digite a terceira nota do aluno: ");
        Float n3 = leitor.nextFloat();

        Float media = (n1 + n2 + n3)/3;

        System.err.println("Nota final do aluno: " + media);

        if (media >= 7) {
            System.err.println("Aluno aprovado");
        } else if (media >= 5 && media < 7) {
            System.err.println("Aluno de recuperação");
        } else {
            System.err.println("Aluno reprovado");
        }

        leitor.close();


   } 
}