import java.util.Scanner;

public class ControleDeVelocidade {
    public static void main (String[] args) {

        int velocidade;

        Scanner leia = new Scanner(System.in);

        System.out.println("Qual velocidade o altomóvel passou pelo radar : ");
        velocidade = leia.nextInt();

        if (velocidade >= 60 ){
            System.out.println("Acima da velocidade permitada!");
        }
        else{
            System.out.println("Velocidade dentro do limite");
        }

    }
}
