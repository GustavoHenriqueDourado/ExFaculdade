package ExFaculdade.EstruturasDeRepeticao;

import java.util.Scanner;

public class DesafioCalculoDeVendas {
    public static void main (String[] args){

        Scanner leia = new Scanner(System.in);

        float mediaVendas;
        int quantidadeVendas = 0;
        float valorVenda = 1;
        float valorTotalVendas = 0;

        while(valorVenda != 0){

            System.out.println("Informe o valor da venda R$ ");
            valorVenda = leia.nextFloat();
            valorTotalVendas += valorVenda;
            quantidadeVendas += 1;

        }
        mediaVendas = valorTotalVendas / (quantidadeVendas -1);

        System.out.println("O valor total de vendas foi : " + valorTotalVendas +
            "\nA quantidade de vendas foi de : " + (quantidadeVendas - 1) +
            "\nA media de vendas foi R$ %.2f%n ".formatted(mediaVendas));

    }
}