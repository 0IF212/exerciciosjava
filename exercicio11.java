import java.util.LinkedList;

public class exercicio11 {
public static void main(String[] args) {
       LinkedList<String> fila = new LinkedList<String>(); 
      fila.addLast("José");
      fila.addLast("João");
      fila.addLast("Maria");
      fila.addLast("Takeshi");
      fila.addLast("Vladmir");
      fila.pop();
      fila.pop();
      fila.addFirst("Zhang Yu");
      fila.addFirst("Rakesh");
      for (String clienteString : fila) {
        System.out.println(clienteString);
      }

}

}
