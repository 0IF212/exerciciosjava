package exercicio34_vcRiquinho.conta;

import exercicio34_vcRiquinho.produto.*;
import java.util.ArrayList;
import java.util.List;

import exercicio34_vcRiquinho.cliente.*;

public class ContaInvestimentoAutomatico extends Conta {
    private List<ProdutoInvestimento> produtos;
    private Cliente cliente;

    public ContaInvestimentoAutomatico(String numero, double saldoInicial, Cliente cliente) {
        super(numero, saldoInicial);
        this.produtos = new ArrayList<>();
        this.cliente = cliente;
    }

    public void adicionarProduto(ProdutoInvestimento p) {
        produtos.add(p);
    }

    @Override
    public double calcularRendimento(int dias) {
        double totalRend = 0;
        for (ProdutoInvestimento p : produtos) {
            double rendimento = p.calcularRendimentoMensal(saldo) * (dias / 30.0);

            // Se for Renda Fixa e dentro da carência, não entra na taxa de serviço
            if (p instanceof RendaFixa) {
                RendaFixa rf = (RendaFixa) p;
                if (dias < rf.getCarenciaDias()) {
                    System.out.println("Produto " + rf.getNome() + " está na carência, sem taxa de serviço.");
                    totalRend += rendimento;
                    continue;
                }
            }
            totalRend += rendimento;
        }

        double taxaServico = 0;
        if (cliente instanceof PessoaFisica) {
            taxaServico = totalRend * 0.001; // 0,1%
        } else if (cliente instanceof PessoaJuridica) {
            taxaServico = totalRend * 0.0015; // 0,15%
        }

        return totalRend - taxaServico;
    }
}