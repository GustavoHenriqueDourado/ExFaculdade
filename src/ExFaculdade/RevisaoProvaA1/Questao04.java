package ExFaculdade.RevisaoProvaA1;

import java.util.Scanner;
import java.lang.Math;

public class Questao04 {

    static void cabecalho(){
        System.out.println("QUADRADO DE UM NÙMERO");
    }

    static int calcQuadrado(int numero){
        return (int) Math.pow(numero, 2);
    }
    public static void main (String[] args){

        cabecalho();

        Scanner leia = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número inteiro : ");
        numero = leia.nextInt();

        System.out.println("O quadrado do numero " + numero + " é " + calcQuadrado(numero));

    }
}
