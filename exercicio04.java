public class exercicio04 {
   public static void main(String[] args) {
     int fibbonaci[] = {0, 1, 1, 2, 3, 5, 8, 13};
     int soma = 0;
     for (int i : fibbonaci) {
        if (i % 2 != 0) {
            soma += i;
        }
     }
     System.out.println("Soma de todos os números impares do array: " + soma);
   } 
}
