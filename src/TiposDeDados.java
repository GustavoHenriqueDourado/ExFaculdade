import java.util.Scanner;

public class TiposDeDados {
    public static void main (String[] args){

            //tipando as variaveis e nomeando elas
        String nome;
        int idade;
        float altura;
        boolean logico;

            //peguando informações do usuario(a)
        Scanner leia = new Scanner (System.in);
        System.out.println("Qual o neu nome ? ");
        nome = leia.nextLine(); //nextline lê a linha como String
        System.out.println("Qual a sua idade ? ");
        idade = leia.nextInt(); //nextInt lê o caracter como numero inteiro
        System.out.println("Qual a sua altura ? ");
        altura = leia.nextFloat();
        System.out.println("Me de um valor booleano : ");
        logico = leia.nextBoolean();

            //mostrando na tela as informações
        System.out.println("Prazer em te conhecer, " + nome);
        System.out.println("A sua idade é de : " + idade);
        System.out.println("Sua altura é de : " + altura);
        System.out.println("O valor em booleano é " + logico);





    }
}
