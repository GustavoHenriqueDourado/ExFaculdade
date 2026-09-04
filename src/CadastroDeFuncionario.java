import java.util.Scanner;

public class CadastroDeFuncionario {
    public static void main (String[] args){

        String funcionario;
        float salario;

        Scanner leia = new Scanner(System.in);

        System.out.println("Informe seu nome : ");
        funcionario = leia.nextLine();
        System.out.println("Infomre seu salário :");
        salario = leia.nextFloat();

        if (salario >= 3000){
            System.out.println( funcionario + ", sua faixa salarial é alta!");
        }
        else{
            System.out.println( funcionario + ", sua faixa salarial é básica!");
        }
    }
}
