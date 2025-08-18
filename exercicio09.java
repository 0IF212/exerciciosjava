import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        List<String> tarefas = new ArrayList<>();
        do {
            Menu();
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Insira o nome da tarefa:");
                    tarefas.add(leitor.next());
                    break;
                case 2:
                    System.out.println("Digite o indice da tarefa a ser removida:");
                    tarefas.remove(leitor.nextInt());
                    break;
                case 3:
                    for (String string : tarefas) {
                        System.out.println(string);
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        } while (opcao != 4);
        leitor.close();
    }

    public static void Menu() {
        System.out.println("1. Adicionar tarefa.");
        System.out.println("2. Remover tarefa.");
        System.out.println("3. Listar todas as tarefas.");
        System.out.println("4. Sair");
    }
}
