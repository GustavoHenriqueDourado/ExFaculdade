import java.util.Scanner;

public class CompraNoSupermercado {
    public static void main(String[] args){

        int produtos;
        float valorProduto;
        float valorFinal;

         Scanner leia = new Scanner (System.in);

         System.out.println("Informe a quantiodade de produtos : ");
         produtos = leia.nextInt();

         System.out.println("Informe o valor unitario : ");
         valorProduto = leia.nextFloat();

        valorFinal = valorProduto * produtos;

        if (valorFinal >= 100){
            System.out.println("Voçê recebeu um frete grátis!");
        }

        else{
            System.out.println("Frte não disponível!");
        }




    }
}
