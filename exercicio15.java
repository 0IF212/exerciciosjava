import java.util.LinkedHashSet;

public class exercicio15 {
   public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Quarta");
        set.add("Segunda");
        set.add("Sexta");
        set.add("Terça");
        set.add("Domingo");
        set.add("Quinta");
        set.add("Sabado");

        for (String string : set) {
            System.out.println(string);
        }
   } 
}
