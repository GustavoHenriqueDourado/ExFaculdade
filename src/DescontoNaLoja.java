import java.util.Scanner;

public class DescontoNaLoja {
    public static void main(String[] args){

        float valorCompra;
        float desconto;

        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o valor da compra R$ ");
        valorCompra = leia.nextFloat();

        desconto = valorCompra - (valorCompra * 10 / 100);

        if (valorCompra >= 200 ){
            System.out.println("Voçê recebeu um desconto de 10% agora o valor do pruduto fica R$ " + desconto);
        }
        else{
            System.out.println("Compras abaixo de R$ 200,00 não tem desconto.");
        }
    }
}
