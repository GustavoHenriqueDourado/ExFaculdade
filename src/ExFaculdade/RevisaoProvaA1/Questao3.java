package ExFaculdade.RevisaoProvaA1;

import java.util.Scanner;

public class Questao3 {
    public static void main (String[] args){

        Scanner leia = new Scanner(System.in);

        int numero;
        int contPar = 0;
        int contImp = 0;

        for(int i = 0; i < 10; ++i){
            System.out.println("Digite um número inteiro aleatório : ");
            numero = leia.nextInt();

            if(numero % 2 ==0){
               contPar += 1;
            }
            else{
                contImp += 1;
            }
        }
        System.out.println("A quantidade de numeros pares digitados foi : " + contPar);
        System.out.println("A quantidade de numeros impares digitados foi : " + contImp);
    }
}
