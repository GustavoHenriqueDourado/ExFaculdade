package ExFaculdade.EstruturasDeRepeticao;

import java.util.Scanner;

public class SolicitacaoDeSenha {
    public static void main (String[] args){

        Scanner leia = new Scanner(System.in);

        int senhaSalva = 2025;
        int  senhaUsuario = 0;

        while (senhaUsuario != senhaSalva ){

            System.out.println("Digite sua senha : ");
            senhaUsuario = leia.nextInt();

            if(senhaUsuario != senhaSalva){
                System.out.println("Acesso negado");
            }
        }
        System.out.println("Acesso aprovado");
    }
}
