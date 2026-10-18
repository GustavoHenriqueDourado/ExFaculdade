package ExFaculdade.RevisaoProvaA1;

import java.util.Scanner;

public class Questao01 {
    public static void main (String[] args){

        Scanner leia = new Scanner (System.in);

        float  valorProduto;
        float calculoDesconto;
        float valorFinal;

        System.out.println("Informe o valor da compra R$ ");
        valorProduto = leia.nextFloat();

        calculoDesconto = valorProduto * 15 / 100;

        valorFinal = valorProduto - calculoDesconto;

        System.out.println("O valor da compra é R$ " + valorProduto);
        System.out.println("O valor do desconto é de R$ " + calculoDesconto);
        System.out.println("Ovalor final do produto com descomto é R$ " + valorFinal);

    }
}
