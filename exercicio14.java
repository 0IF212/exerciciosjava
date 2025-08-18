import java.util.HashSet;

public class exercicio14 {
   public static void main(String[] args) {
    HashSet<String> emails = new HashSet<String>();
    for (int i = 0; i < 5; i++) {
        emails.add("aluno"+i+"@gmail.com");
    }
    emails.add("aluno1@gmail.com");
    System.out.println(emails);
   } 
}
