package exercicio34_vcRiquinho.cliente;

public class PessoaJuridica extends Cliente {
    private String cnpj;

    public PessoaJuridica(String nome, String email, String cnpj) {
        super(nome, email);
        this.cnpj = cnpj;
    }

    @Override
    public String getDocumento() {
        return cnpj;
    }
}
