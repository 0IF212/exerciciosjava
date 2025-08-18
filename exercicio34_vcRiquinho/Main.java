package exercicio34_vcRiquinho;

import exercicio34_vcRiquinho.cliente.*;
import exercicio34_vcRiquinho.conta.*;
import exercicio34_vcRiquinho.produto.*;

import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<ProdutoInvestimento> produtos = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n=== VcRiquinho - Menu Principal ===");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Cadastrar Produto de Investimento");
            System.out.println("4 - Listar Produtos");
            System.out.println("5 - Adicionar Conta a Cliente");
            System.out.println("6 - Simular Rendimento de Cliente");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> cadastrarCliente();
                case 2 -> listarClientes();
                case 3 -> cadastrarProduto();
                case 4 -> listarProdutos();
                case 5 -> adicionarConta();
                case 6 -> simularRendimento();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    // ===== CRUD CLIENTE =====
    private static void cadastrarCliente() {
        System.out.println("1 - Pessoa Física | 2 - Pessoa Jurídica");
        int tipo = sc.nextInt(); sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        if (tipo == 1) {
            System.out.print("CPF: ");
            String cpf = sc.nextLine();
            clientes.add(new PessoaFisica(nome, email, cpf));
        } else {
            System.out.print("CNPJ: ");
            String cnpj = sc.nextLine();
            clientes.add(new PessoaJuridica(nome, email, cnpj));
        }
        System.out.println("Cliente cadastrado!");
    }

    private static void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        int i = 1;
        for (Cliente c : clientes) {
            System.out.println(i++ + " - " + c.getNome() + " (" + c.getDocumento() + ")");
            for (Conta conta : c.getContas()) {
                System.out.println("   Conta " + conta.getNumero() + " - Saldo: R$" + conta.getSaldo() +
                        " - Tipo: " + conta.getClass().getSimpleName());
            }
        }
    }

    // ===== CRUD PRODUTO =====
    private static void cadastrarProduto() {
        System.out.println("1 - Renda Fixa | 2 - Renda Variável");
        int tipo = sc.nextInt(); sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Descrição: ");
        String desc = sc.nextLine();

        if (tipo == 1) {
            System.out.print("Rendimento Mensal (ex: 0.01 = 1%): ");
            double rend = sc.nextDouble();
            System.out.print("Carência em dias: ");
            int carencia = sc.nextInt();
            produtos.add(new RendaFixa(nome, desc, rend, carencia));
        } else {
            System.out.print("Rendimento Mensal Esperado (ex: 0.02 = 2%): ");
            double rend = sc.nextDouble();
            produtos.add(new RendaVariavel(nome, desc, rend));
        }
        System.out.println("Produto cadastrado!");
    }

    private static void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        int i = 1;
        for (ProdutoInvestimento p : produtos) {
            System.out.println(i++ + " - " + p.getNome() + " (" + p.getClass().getSimpleName() + ")");
        }
    }

    // ===== CONTAS =====
    private static void adicionarConta() {
        if (clientes.isEmpty()) {
            System.out.println("Cadastre um cliente primeiro!");
            return;
        }
        listarClientes();
        System.out.print("Escolha o cliente: ");
        int idx = sc.nextInt(); sc.nextLine();
        Cliente cliente = clientes.get(idx - 1);

        System.out.println("1 - Conta Corrente | 2 - Conta CDI | 3 - Conta Investimento Automático");
        int tipo = sc.nextInt(); sc.nextLine();

        System.out.print("Número da conta: ");
        String numero = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble(); sc.nextLine();

        Conta conta = null;
        if (tipo == 1) {
            conta = new ContaCorrente(numero, saldo);
        } else if (tipo == 2) {
            System.out.print("Informe taxa CDI (ex: 0.13 = 13% ao ano): ");
            double cdi = sc.nextDouble();
            conta = new ContaCDI(numero, saldo, cdi);
        } else {
            ContaInvestimentoAutomatico invest = new ContaInvestimentoAutomatico(numero, saldo, cliente);
            listarProdutos();
            System.out.print("Quantos produtos deseja vincular? ");
            int qtd = sc.nextInt(); sc.nextLine();
            for (int i = 0; i < qtd; i++) {
                System.out.print("Escolha o produto " + (i+1) + ": ");
                int pIdx = sc.nextInt(); sc.nextLine();
                invest.adicionarProduto(produtos.get(pIdx - 1));
            }
            conta = invest;
        }
        cliente.addConta(conta);
        System.out.println("Conta adicionada ao cliente!");
    }

    // ===== SIMULAÇÃO =====
    private static void simularRendimento() {
        if (clientes.isEmpty()) {
            System.out.println("Cadastre um cliente primeiro!");
            return;
        }
        listarClientes();
        System.out.print("Escolha o cliente: ");
        int idx = sc.nextInt(); sc.nextLine();
        Cliente cliente = clientes.get(idx - 1);

        if (cliente.getContas().isEmpty()) {
            System.out.println("Esse cliente não tem contas.");
            return;
        }
        int i = 1;
        for (Conta conta : cliente.getContas()) {
            System.out.println(i++ + " - Conta " + conta.getNumero() + " (" + conta.getClass().getSimpleName() + ")");
        }
        System.out.print("Escolha a conta: ");
        int cIdx = sc.nextInt(); sc.nextLine();
        Conta conta = cliente.getContas().get(cIdx - 1);

        System.out.println("Informe período (30, 60, 90 ou 180 dias): ");
        int dias = sc.nextInt();

        double rendimento = conta.calcularRendimento(dias);
        System.out.println("Rendimento estimado em " + dias + " dias: R$ " + rendimento);
    }
}

