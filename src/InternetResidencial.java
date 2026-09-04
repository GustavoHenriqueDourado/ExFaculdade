import java.util.Scanner;

public class InternetResidencial {
    public static void main (String[] args){

        int velocidadeInternet;

        Scanner leia = new Scanner(System.in);

        System.out.println("Qual a velocidade de Mbps registrada ? ");
        velocidadeInternet =  leia.nextInt();

        if (velocidadeInternet >= 100){
            System.out.println("Plano adequado para streaming");
        }
        else{
            System.out.println("Considere aumentar o plano");
        }
    }
}
