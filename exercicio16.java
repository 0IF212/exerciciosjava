import java.util.TreeSet;

public class exercicio16 {
   public static void main(String[] args) {
    TreeSet<String> set = new TreeSet<>();

    set.add("Morgana");
    set.add("Arthur");
    set.add("Lancelot");
    set.add("Bedivere");
    set.add("Gawain");

    for (String string : set) {
        System.out.println(string);
    }
   } 
}
