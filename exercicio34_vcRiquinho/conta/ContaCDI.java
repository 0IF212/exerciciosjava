package exercicio34_vcRiquinho.conta;

public class ContaCDI extends Conta {
    private double taxaCDI; // Ex: 0.13 para 13% ao ano

    public ContaCDI(String numero, double saldoInicial, double taxaCDI) {
        super(numero, saldoInicial);
        this.taxaCDI = taxaCDI;
    }

    @Override
    public double calcularRendimento(int dias) {
        double rendimentoDiario = saldo * (taxaCDI / 30);
        double totalRendimento = rendimentoDiario * dias;
        double taxaServico = totalRendimento * 0.0007; // 0,07%
        return totalRendimento - taxaServico;
    }
}