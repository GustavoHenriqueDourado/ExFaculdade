import java.util.Scanner;

public class ControleDeTemperatura {
    public static void main (String[] args){

        float temperatura;

        Scanner leia = new Scanner(System.in);

        System.out.println("Informe a temperatura atual : ");
        temperatura = leia.nextFloat();

        if (temperatura >= 28 ) {
            System.out.println("Ligar o ar-condicionado!");
        }
        else {
            System.out.println("Temperatura agradável !");
        }
    }
}

