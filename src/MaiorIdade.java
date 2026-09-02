import java.util.Scanner;

public class MaiorIdade {
    public static void main (String[] args){

         int idade;

         Scanner leia = new Scanner(System.in);

         System.out.println("Escreva sua idade : ");
         idade = leia.nextInt();

         if (idade >= 18) {
             System.out.println("Voçê é maior de idade");
         }

         else {
            System.out.println("Voçê é menor de idade");
        }

    }
}
