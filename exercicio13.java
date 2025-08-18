import java.util.ArrayList;
import java.util.HashSet;

public class exercicio13 {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            lista.add(i);
            lista.add(i);
        }
        HashSet<Integer> set = new HashSet<Integer>();
        set.addAll(lista);
        System.out.println(lista);
        System.out.println(set);

    }

}
