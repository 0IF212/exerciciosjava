import java.util.HashMap;
import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {
        HashMap<String,String> agenda = new HashMap<>();

        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        do {
            Menu();
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Insira o nome do contato:");
                    String nome = leitor.next();
                    if (agenda.containsKey(nome)) {
                        System.out.println("Contato já existe na agenda");
                        break;
                    }
                    System.out.println("Insira o número do contato:");
                    String numero = leitor.next();

                    if (agenda.containsValue(numero)) {
                        System.out.println("Número já existe na agenda");
                        break;
                    }
                    agenda.put(nome, numero);
                    break;
                case 2:
                    System.out.println("Insira o nome do contato a ser removido:");
                    agenda.remove(leitor.next());
                    break;
                case 3:
                    agenda.forEach((k, v) -> {
                        System.out.println(k + ": " + v);
                    });
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
        System.out.println("1. Adicionar contato.");
        System.out.println("2. Remover contato.");
        System.out.println("3. Listar contatos.");
        System.out.println("4. Sair");
    }
    }

