import java.util.Scanner;

public class Desconto {
    public static void main (String[] args){

        float produto;
        int desconto;
        float valorFinal;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor do produto R$ ");
        produto = leia.nextFloat();

        System.out.println("Informe a porcentagem do desconto : ");
        desconto = leia.nextInt();

        valorFinal = produto - (produto * desconto / 100);
        System.out.println("O  valor do produto com desconto é de R$ " + valorFinal);


    }
}
