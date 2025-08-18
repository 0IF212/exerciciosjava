package exercicio34_vcRiquinho.cliente;

import java.util.ArrayList;
import java.util.List;
import exercicio34_vcRiquinho.conta.*;

public abstract class Cliente {
    private String nome;
    private String email;
    private List<Conta> contas;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.contas = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public List<Conta> getContas() { return contas; }

    public void addConta(Conta conta) {
        contas.add(conta);
    }

    public void removeConta(Conta conta) {
        contas.remove(conta);
    }

    public abstract String getDocumento(); // CPF ou CNPJ
}
