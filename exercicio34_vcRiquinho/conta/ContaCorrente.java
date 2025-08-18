package exercicio34_vcRiquinho.conta;

public class ContaCorrente extends Conta {
    public ContaCorrente(String numero, double saldoInicial) {
        super(numero, saldoInicial);
    }

    @Override
    public double calcularRendimento(int dias) {
        return 0; 
    }
}
