import java.util.LinkedList;

public class exercicio29 {

    public static class Navegacao {
       LinkedList<String> historico;
       private int atual = -1;
        
       public Navegacao(LinkedList<String> historico) {
        this.historico = new LinkedList<>();
       }

       public void visitar(String url) {
         while(historico.size() > atual + 1) {
            historico.removeLast();
         }

         historico.add(url);
         atual++;
       }

       public void voltar() {
            if(atual > 0) {
                atual--;
                System.out.println("Voltou para: " + historico.get(atual));
            }
       }

       public void avancar() {
            if(atual < historico.size() - 1) {
                atual++;
                System.out.println("Avançou para: " + historico.get(atual));
            }
       }



    }

   public static void main(String[] args) {
 
        Navegacao navegacao = new Navegacao(new LinkedList<>());

        navegacao.visitar("wikipedia.org");
        navegacao.visitar("youtube.com");
        navegacao.visitar("discord.com");

        navegacao.voltar();
        navegacao.voltar();
        navegacao.avancar();

   } 
}
