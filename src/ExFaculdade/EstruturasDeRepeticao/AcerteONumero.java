package ExFaculdade.EstruturasDeRepeticao;

import java.util.Scanner;

public class AcerteONumero {
    public static void main (String[] args){

        Scanner leia = new Scanner(System.in);

        int chuteUsuario = 1;
        int numeroSecreto = 0;

        while (chuteUsuario != numeroSecreto){
            System.out.println("Escolha um número : ");
            chuteUsuario = leia.nextInt();
        }
        System.out.println("Programa encerrado");
    }
}
