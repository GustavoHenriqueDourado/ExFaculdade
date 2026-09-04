import java.util.Scanner;

public class DesafioSistemaDePedidoDeLanche {
    public static void main (String[] args){

        String nome;
        float valorHamburger;
        int quantidadeHamburguer;
        float total;
        float desconto;
        int porcentoDesconto = 5 ;
        float valorDesconto;

        Scanner leia = new Scanner (System.in);

        System.out.println("Informe o seu nome : ");
        nome = leia.nextLine();
        System.out.println("Qual o valor uniário do Hambúrguer");
        valorHamburger = leia.nextFloat();
        System.out.println("Quantos Hambúrguers vai levar :");
        quantidadeHamburguer =  leia.nextInt();

        total = quantidadeHamburguer * valorHamburger;

        if (total >= 50){
            desconto = total - (total * porcentoDesconto / 100 );
            valorDesconto = total - desconto;
            System.out.println(nome + ", voçê comprou " + quantidadeHamburguer + " hambúrguers que no total lhe custaram R$ " + total);
            System.out.println("Voçê ganhou um desconto de R$ " + valorDesconto + " então a sua compra sai no valor de R$ " + desconto );
        }
        else {
            System.out.println(nome + ", voçê comprou " + quantidadeHamburguer + " hambúrguers que no total lhe custaram R$ " + total);
            System.out.println("Sem desconto !");
        }
    }
}
