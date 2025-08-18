import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class exercicio30 {
    public static class Aluno {
        private String nome;

        public String getNome() {
            return nome;
        }

        public Double getNota() {
            return nota;
        }

        private Double nota;

        public Aluno(String nome, Double nota) {
            this.nome = nome;
            this.nota = nota;
        }

    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Anna", 9.00);

        Aluno aluno2 = new Aluno("João", 7.00);

        Aluno aluno3 = new Aluno("Grimm", 6.00);
        Aluno aluno4 = new Aluno("Mario", 2.00);

        ArrayList<Aluno> alunosLista = new ArrayList<>();

        alunosLista.add(aluno1);
        alunosLista.add(aluno2);
        alunosLista.add(aluno3);
        alunosLista.add(aluno4);

        HashMap<String, List<Aluno>> mapa = gerarMap(alunosLista);
        mapa.forEach((k, v) -> {
            System.out.println(k + ":");
            v.forEach(aluno -> {
                System.out.println("Aluno: " + aluno.getNome());
                System.out.println("Nota: " + aluno.getNota());
            });
        });
    }

    public static HashMap<String, List<Aluno>> gerarMap(List<Aluno> alunos) {
        ArrayList<Aluno> aprovados = new ArrayList<>();

        ArrayList<Aluno> recuperacao = new ArrayList<>();

        ArrayList<Aluno> reprovados = new ArrayList<>();

        for (Aluno aluno : alunos) {
            if (aluno.getNota() >= 7) {
                aprovados.add(aluno);
            } else if (aluno.getNota() >= 5 && aluno.getNota() < 7) {
                recuperacao.add(aluno);
            } else {
                reprovados.add(aluno);
            }
        }
        HashMap<String, List<Aluno>> mapa = new HashMap<>();

        mapa.put("Aprovados", aprovados);

        mapa.put("Recuperação", recuperacao);

        mapa.put("Reprovados", reprovados);

        return mapa;

    }
}