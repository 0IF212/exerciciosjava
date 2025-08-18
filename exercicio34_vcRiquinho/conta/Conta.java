package exercicio34_vcRiquinho.conta;

public abstract class Conta {
    private String numero;
    protected double saldo;

    public Conta(String numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public String getNumero() { return numero; }
    public double getSaldo() { return saldo; }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public abstract double calcularRendimento(int dias);
}
