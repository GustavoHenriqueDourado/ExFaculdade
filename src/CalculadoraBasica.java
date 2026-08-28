import java.util.Scanner;

public class CalculadoraBasica {
    public static void main (String[] args){

        int numeroA, numeroB;
        int resultado;

        Scanner leia = new Scanner(System.in);
        System.out.println("Calculadora de soma, subtração, multiplicação e divisão");
        System.out.println("DIGITE UM NÚMERO : ");
        numeroA = leia.nextInt();
        System.out.println("DIGITE OUTRO NÚMERO : ");
        numeroB = leia.nextInt();

            // calculando valores de variaveis

        resultado = numeroA + numeroB;
        System.out.println("A soma dos números é : " + resultado);
        resultado = numeroA - numeroB;
        System.out.println("A subtração dos números é : " + resultado);
        resultado = numeroA * numeroB;
        System.out.println("A multiplicação dos números é : " + resultado);
        resultado = numeroA / numeroB;
        System.out.println("A divisão entre os números é : " + resultado);

    }
}
