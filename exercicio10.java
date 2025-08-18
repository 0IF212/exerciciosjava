import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class exercicio10 {
    public static void main(String[] args) {
           Integer[] fibb = {13, 8, 1, 34, 3, 21, 0, 5, 2};
           List<Integer> temp = Arrays.asList(fibb);
           List<Integer> lista = new ArrayList<>(); 
           lista.addAll(temp);

        Collections.sort(lista);
        System.out.println(lista);
    }
}
