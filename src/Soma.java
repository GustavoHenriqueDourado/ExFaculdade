import java.util.Scanner;

public class Soma {
    public static void main(String[] args){

        int numeroA, numeroB; // primeiro vem o tipo de dado que a variável aceita e depois o nome dela
        int resultado;

        Scanner leia = new Scanner(System.in); // para o usuário poder interagir (escrever no terminal e o computador ler)
        System.out.println("Digite um número ");
        numeroA = leia.nextInt(); // aqui atribui uma variável para ser lida e armazenada
        System.out.println("Digite outro número ");
        numeroB = leia.nextInt();
        resultado = numeroA + numeroB;
        System.out.println("A soma dos números é " + resultado);
    }

}
