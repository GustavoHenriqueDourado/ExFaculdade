import java.util.Scanner;

public class CalculoDeComissao {
    public static void main (String[] args){

        String nome;
        float salario;
        float vendas;
        float comissao;
        float salario_total;

        Scanner leia = new Scanner(System.in);

        System.out.println("Qua o seu nome ? ");
        nome = leia.next();
        System.out.println("Me informe seu salário R$ ");
        salario = leia.nextFloat();
        System.out.println("Me informe o valor de venda  mensal R$ ");
        vendas = leia.nextFloat();

        comissao = vendas * 15 / 100;
        salario_total = salario + comissao;
        System.out.println(nome + ", eu salário com a comissão inclusa fica R$" + salario_total);

    }

}
