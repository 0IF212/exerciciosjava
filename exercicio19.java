import java.util.HashMap;

public class exercicio19 {
   public static void main(String[] args) {
        String paragrafoDemian = "Durante alguns segundos renasceram em mim a fé e a esperança, à vista do chapéu de meu pai. Confessaria tudo a ele, aceitaria sua decisão e seu castigo, contar-lhe-ia meu segredo e ele me salvaria. Tudo se reduziria a uma penitência como de outras vezes, a uma hora de pesares e amarguras, a um pedido de perdão feito sinceramente.";

        HashMap<String,Integer> contador = new HashMap<>();

        String[] palavras = paragrafoDemian.split(" ");

        for (String string : palavras) {
            Integer ocorrencias = contador.get(string);

            if (ocorrencias == null) {
                contador.put(string, 1);
            } else {
                contador.put(string, ocorrencias + 1);
            }
        }
        System.out.println(contador);
   } 
}
