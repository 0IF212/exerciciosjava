import java.util.ArrayList;
import java.util.TreeSet;

public class exercicio27 {
    public static void main(String[] args) {
        ArrayList<String> participantes = new ArrayList<>();

        participantes.add("Leon");
        participantes.add("Mario");
        participantes.add("Mario");
        participantes.add("Luigi");
        participantes.add("Wario");
        participantes.add("Daisy");
        participantes.add("Yoshi");

        System.out.println("Participantes sorteados: ");
        ArrayList<String> sorteados = sorteio(participantes);
        System.out.println(sorteados);
    };

    public static ArrayList<String> sorteio(ArrayList<String> participantes) {
        TreeSet<String> filtro = new TreeSet<>();
        filtro.addAll(participantes);

        ArrayList<String> filtrado = new ArrayList<>(filtro);

        while (filtrado.size() > 3) {
            for (int index = filtrado.size() -1 ; index >= 0 && filtrado.size() > 3 ; index--) {
                int random = (int) (Math.random() * 100);
                if (random % 2 != 0) {
                    filtrado.remove(index);
                }
            }
        }

        return filtrado;

    }
}
