package ExFaculdade.RevisaoProvaA1;

import java.util.Scanner;

public class Questao05 {
    public static void main (String[] args){

        Scanner leia = new Scanner(System.in);

        String[] nomes = new String[5];

        for(int i = 0; i < 5; i++) {
            System.out.println("Informe seu nome : ");
            nomes[i] = leia.nextLine();
        }
        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
