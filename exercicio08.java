public class exercicio08 {
   public class ContaBancaria {
   
    private String titular;
    private Double saldo;

    public void Depositar(Double valor) {
        this.saldo += valor;
    }

    public Boolean sacar(Double valor) {
        if(valor > this.getSaldo()) {
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

   } 

   class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
   }
}
