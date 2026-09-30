package ExFaculdade.EstruturasDeRepeticao;

import java.util.Scanner;

public class MenuComOpcoes {
    public static void main (String[] args){

        Scanner leia = new Scanner(System.in);

        int opcao = 0;

        do{
            System.out.println("Insira a opção que deseja: \n1-Ver saldo \n2-Fazer depósito \n3-Sair");
            opcao = leia.nextInt();
        }
        while(opcao != 3);
            System.out.println("Pograma encerrado");
    }
}
