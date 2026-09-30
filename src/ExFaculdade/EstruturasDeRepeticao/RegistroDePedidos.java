package ExFaculdade.EstruturasDeRepeticao;

import java.util.Scanner;

public class RegistroDePedidos {
    public static void main (String[] args){

        Scanner leia = new Scanner(System.in);

        String respostaUsuario;

        do{
            System.out.println("Pretende continuar o atendimento ? S/N ");
            respostaUsuario = leia.next().toUpperCase();
        }
        while(respostaUsuario.equals("S"));
    }
}
