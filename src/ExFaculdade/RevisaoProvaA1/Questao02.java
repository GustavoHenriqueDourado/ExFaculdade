package ExFaculdade.RevisaoProvaA1;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args){

        Scanner leia = new Scanner (System.in);

        int quantidadeHoras;

        System.out.println("Informe a quantidade de horas completas que permaneceu no estacionamneto : ");
        quantidadeHoras = leia.nextInt();


        if(quantidadeHoras <= 2){
            System.out.println("O valor a ser pago pela quantidade de horas é R$ 10,00");
        }
        else if(quantidadeHoras >2 && quantidadeHoras <= 5){
            System.out.println("O valor a ser pago pela quantidade de horas é R$ 20,00");
        }
        else if(quantidadeHoras >= 6){
            System.out.println("O valor a ser pago pela quantidade de horas é R$ 35,00");
        }
        else{
            System.out.println("Valor informado incorreto!");
        }

    }
}
