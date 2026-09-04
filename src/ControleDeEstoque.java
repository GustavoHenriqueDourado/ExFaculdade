import java.util.Scanner;

public class ControleDeEstoque {
    public static void main (String[] args){

        int estoque;

        Scanner leia = new Scanner(System.in);

        System.out.println("Qual a quantidade de caixas no estoque :");
        estoque = leia.nextInt();

        if (estoque <= 10){
            System.out.println("Reposição necessária!");
        }
        else{
            System.out.println("Estoque adequado.");
        }

    }
}
