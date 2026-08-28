import java.util.Scanner;

public class Media {
    public static void main (String[] args){
        String nome;
        float nota1, nota2, nota3;
        float media;

        Scanner leia = new Scanner(System.in);

        System.out.println("informe seu nome : ");
        nome = leia.nextLine();
        System.out.println("Informe sua primeira nota : ");
        nota1 = leia.nextFloat();
        System.out.println("Informe sua segunda nota : ");
        nota2 = leia.nextFloat();
        System.out.println("Informe sua terceira nota : ");
        nota3 = leia.nextFloat();

        media =  (nota1 + nota2 + nota3) / 2; //ordem de procedencia
        System.out.println( nome + "a média das suas notas é : " + media);

    }

}
