import java.util.ArrayList;
import java.util.Scanner;

public class exercicio12 {
   public static void main(String[] args) {
    ArrayList<String> lista = new ArrayList<String>();

    Scanner leitor = new Scanner(System.in);

    lista.add("São Paulo");
    lista.add("Guarulhos");
    lista.add("Diadema");
    lista.add("Osasco");
    
    System.out.println("Digite o nome de uma cidade.");

    String cidade = leitor.next();

    if(lista.contains(cidade)) {
        System.out.println("O indice da cidade informada na lista é: " + lista.indexOf(cidade) );
    } else {
        System.out.println("Cidade não presente na lista");
    }
    leitor.close();
   } 
}
