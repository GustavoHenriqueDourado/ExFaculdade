import java.util.Scanner;

public class MediaEscolar {
    public static void main(String[] args){

        float nota1;
        float nota2;
        float media;

        Scanner leia = new Scanner(System.in);

        System.out.println("Qual foi a sua primeira nota : ");
        nota1 = leia.nextFloat();
        System.out.println("Qual foi a sua segunda nota : ");
        nota2 = leia.nextFloat();

        media = (nota1 + nota2) / 2;

        if (media >= 60){
            System.out.println("Aprovado!");
        }
        else{
            System.out.println("Reprovado!");
        }
    }
}
