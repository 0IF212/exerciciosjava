import java.util.LinkedList;

public class exercicio24 {
   public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();

        queue.add("RGFrente.jpg");
        queue.add("RGVerso.jpg");
        queue.add("Declaracao.pdf");
        queue.add("Documento.pdf");
        queue.add("selfie.png");
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            String documento = queue.pop();
            System.out.println("Imprimindo: " + documento);
        }
   } 
}
