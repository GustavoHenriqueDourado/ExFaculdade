import java.util.Scanner;

public class ControleDePresenca {
    public static void main (String[] args){

        int aulas;
        int faltas;
        int frequencia;

        Scanner leia = new Scanner(System.in);

        System.out.println("Qual a quantidade de aulas : ");
        aulas = leia.nextInt();
        System.out.println("Qunatos dias faltou ? ");
        faltas  =  leia.nextInt();

        frequencia = ((aulas-faltas) * 100) / aulas;

        if (frequencia >= 75){
            System.out.println("Frequência suficiente");
        }
        else{
            System.out.println("Frequência insuficiente");
        }
    }
}
