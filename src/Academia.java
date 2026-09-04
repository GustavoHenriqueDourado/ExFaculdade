import java.util.Scanner;

public class Academia {
    public static void main(String[] args){

        String nome;
        int idade;

        Scanner leia = new Scanner(System.in);

        System.out.println("Insira seu nome : ");
        nome = leia.nextLine();
        System.out.println("Informe sau idade : ");
        idade = leia.nextInt();

        if (idade >= 16){
            System.out.println(nome + ", sua entrada é permitida!");
        }
        else{
            System.out.println(nome + ", sua foi negada!");
        }
    }
}
