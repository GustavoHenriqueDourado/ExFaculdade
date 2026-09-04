import java.util.Scanner;

public class ConversaoDeMoeda {
    public static void main (String[] args){

         double valorDolar = 5.40;
         double valorReal;
         double conversao;

        Scanner leia =  new Scanner(System.in);

        System.out.println("Quantos reais quer converter R$ ");
        valorReal = leia.nextFloat();

        conversao = valorReal / valorDolar;
        System.out.printf("Com R$ %.2f convertido para dólar voçê tem U$ %.2f%n ", valorReal, conversao); // usansdo formatação "%.2f%n" para ter só duas casas decimais após a virgula

    }
}
