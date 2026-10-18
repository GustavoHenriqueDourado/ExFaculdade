package ExFaculdade.RevisaoProvaA1;

import java.util.Scanner;

public class QuestaoExtra { // Classe que contém os procedimentos e funcções

    static void cabecalho() { // Procedimento que  mostra uma introdução

        System.out.println("===========================");
        System.out.println("        MERCADINHO");
        System.out.println("===========================");

    }

    static double[] lerValores(){ // Função que pega os valor de um produto e insere um uma ArrayLista
        Scanner leia = new Scanner(System.in);
        double[] valorCompras = new double[5]; // Matriz ArrayList que recebe uma quantidade de valores pré determinadas - tipode dado[] varLista = new tipo de dado[quantidade de valores a receber]

        for (int i = 0; i < 5; i++) { // Laço FOR perguntado o valor dos produtos
            System.out.println("Informe o valor do produto R$ ");
            valorCompras[i] = leia.nextDouble(); // varLista[i]  = leia.nextTipodeDado();
        }
        return valorCompras; // Retorna o valor inserido na VarLista
    }

    static double calcularTotal(double[] valorCompras) { // Função que soma todos os valores da lista - Atribuição da varLista dento da Função - nomeFunção(tipoDeDado[] varLista)
        double soma = 0;
        for(double valor : valorCompras){ // Laço FOR EACH (para cada) usando uma varTemporaria que pega o valor da vez demro da lista - for(varTemporaria DentroDe VarLista)
            soma += valor;
        }
        return soma; // Retona a soma de todos os produtos dentro a variavel soma
    }

    static int produtosAcima50 (double[] valorCompras){
        int contAcima50 = 0;
        for (double produto : valorCompras) {
            if (produto > 50) {
                contAcima50 += 1;
            }
        }
        return contAcima50;
    }

    static double produtoValor(double[] valorCompras){ // Atribuição da varLista dento da Função - nomeFunção(tipoDeDado[] varLista), pega alista e os valçoes salvos nela para serem manipulados em outras funções
        double produtoMaiorValor = valorCompras[0]; // Salva o primeiro valor da varLista nessa variavel
        for (double produto : valorCompras) {
            if (produtoMaiorValor < produto) { // Condição que compara o primeiro numero da varLista com os demais dentro dela uma por ima de aocrdo com o FOR EACH
                produtoMaiorValor = produto; // Se o valor da vez for maior que o valor salvo na variavel produtoMaiorValor atualiza e fica salvo na variavel produtoMaiorValor
            }
        }
        return produtoMaiorValor;
    }

    static void notaFiscal(double soma, int contAcima50, double produtoMaiorValor){ // Procediemnto atribuido todos os retornos das funções

        System.out.println("====================================================");
        System.out.println("Valor total a pagar-------------------------R$ " + soma);
        System.out.println("A quantidade de produtos acima de R$ 50,00 é : " + contAcima50);
        System.out.println("O produto com maior valor custa ------------R$ " + produtoMaiorValor);
        System.out.println("====================================================");

    }

    public static void main(String[] args){  // Metodo Principal

        cabecalho();

        double[] valorCompras = lerValores(); // Chamando a varLista e atribuindo a Função que pega os valor e guarda nela

        double soma = calcularTotal(valorCompras); // Chamando as variaveis e retorno e atribuindo elas as respectivas funções com atribuição da varLIsta
        int contAcima50 = produtosAcima50(valorCompras); // TipodeDado VArRetornoDaFunção = Função(varLista);
        double produtoMaiorValor = produtoValor(valorCompras);

        notaFiscal(soma, contAcima50, produtoMaiorValor); // Chamando o procedimento que mostra todos os retornos - Procediemnto(atribuição dos retornos das funções)

    }
}
