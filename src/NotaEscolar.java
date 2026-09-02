import java.util.Scanner;

public class NotaEscolar {
    public static void main (String[] args){

        float nota;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua nota final da UC");
        nota = leia.nextFloat();

        if (nota >= 90 && nota <= 100){
            System.out.println("Exelente");
        }

        else if (nota >= 70 && nota <= 89){
            System.out.println("Bom");
        }

        else if (nota >= 60 && nota <=69){
            System.out.println("Regular");
        }

        else {
            System.out.println("Insuficiente");
        }
    }
}
