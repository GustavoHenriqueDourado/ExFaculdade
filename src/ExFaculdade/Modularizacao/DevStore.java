package ExFaculdade.Modularizacao;

import java.util.Scanner;

public class DevStore { //Classe principal main

    static void cabecalho() { //Procedimento não recebe atributo nem devolve valor| modificador vazio nomeClasse(){...}
        System.out.println("===========================");
        System.out.println("SISTEMA DE CAIXA - DEVSTORE");
        System.out.println("===========================\n");
    }

    static double calculoSubTotal(double preco, int quantidade) { //Função recebe valores faz alguma ação e retorna um valor| modificador tipoDeDado classe(tipoDado  var)
        return preco * quantidade;                                                                                          //retorna ação_valor ou var
    }

    static double calculoDesconto( int opcao, double valorSubTotal) { //Função recebe valores faz alguma ação e retorna um valor| modificador tipoDeDado classe(tipoDado  var)
        double desconto = 0;
        if (opcao == 1) {                                                                                                  //retorna ação_valor
           desconto = 0;
        }
        else if (opcao == 2) {
            desconto = valorSubTotal * 10 /100 ;
        }
        else if (opcao == 3) {
            desconto = valorSubTotal * 15 / 100;
        }
        else {
            System.out.print("Opção não encontrada");
        }
        return desconto;
    }

    static double calculoImposto(double valorDescontado) {
        return valorDescontado * 5 / 100 ;
    }

    static void exibirComprovante(double valorSubtotal, double desconto,
                                  double imposto, double valorFinal) { //Procedimento não recebe atributo nem devolve valor| modificador nomeClasse(){...}
        System.out.println("\n========== CUPOM FISCAL ==========");
        System.out.printf("Total bruto....: R$ %.2f%n", valorSubtotal);
        System.out.printf("Desconto.......: R$ %.2f%n", desconto);
        System.out.printf("Imposto (5%%)...: R$ %.2f%n", valorFinal);
        System.out.println("----------------------------------");
        System.out.printf("VALOR FINAL....: R$ %.2f%n", valorFinal);
        System.out.println("==================================");
        System.out.println("      Obrigado pela preferência!  ");
    }

    public static void main(String[] args) { //Principal - main
        Scanner leia = new Scanner(System.in);

        cabecalho(); //Importação do procedimento

        double preco;
        int quantidade;
        double valorSubTotal = 0;
        for (int i = 0; i < 3; ++i) {
            System.out.print("Qual o valor do produto R$ ");
            preco = leia.nextDouble();
            System.out.print("Quantos protudos pegou ? ");
            quantidade = leia.nextInt();
            valorSubTotal += calculoSubTotal(preco, quantidade); //Aqui vai somando os valores e atribuindo a valorSubTotal
        }

        int opcao;
        do {
            System.out.print("\1 - Cliente Comum \n2 - Cliente VIP \n3 - Funcionário \nInforme que tipo de cliente é : \n");
            opcao = leia.nextInt();
            if(opcao < 1 || opcao > 3){
                System.out.println("Opção não encontrada!");
            }
        }
        while (opcao < 1 || opcao > 3);

        double desconto = calculoDesconto(opcao, valorSubTotal); //chamamos a var desconto atribuindo calculoDesconto(opcao, valorSubTotal) com os valor de opcao e valorSubTotal atribuidos neles
        double valorDescontado = valorSubTotal - desconto; //ai criamos a var valorDEscontado e calculos o valorSubTotal(preco * quantidade) - o valor do desconto
        double imposto = calculoImposto(valorDescontado); //ai chamamos a var imposto e atribuimos calculoImposto(valorDescontado) com o valorDescontado ja atribuido nele
        double valorFinal = valorDescontado + imposto;  //ai criamos a var valorFinal e calculamos o valor descontado + o valor do imposo

        exibirComprovante(valorSubTotal, desconto, imposto, valorFinal); //chamamos o procidimento exibir comprovante com toda s as informações e valor atribuidos
    }
}
