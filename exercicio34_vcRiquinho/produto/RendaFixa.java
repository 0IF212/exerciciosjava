package exercicio34_vcRiquinho.produto;

public class RendaFixa extends ProdutoInvestimento {
    private double rendimentoMensal;
    private int carenciaDias;

    public RendaFixa(String nome, String descricao, double rendimentoMensal, int carenciaDias) {
        super(nome, descricao);
        this.rendimentoMensal = rendimentoMensal;
        this.carenciaDias = carenciaDias;
    }

    public int getCarenciaDias() { return carenciaDias; }

    @Override
    public double calcularRendimentoMensal(double valor) {
        return valor * rendimentoMensal;
    }
}