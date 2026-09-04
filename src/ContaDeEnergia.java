import java.util.Scanner;

public class ContaDeEnergia {
    public static void main (String[] args){

        float consumoKwh;
        float valorKwh;
        float conta;

        Scanner leia = new Scanner (System.in);

        System.out.println("Qual o comnsumo de Kw ?");
        consumoKwh = leia.nextFloat();
        System.out.println("Qual o valor do Kwh /");
        valorKwh =  leia.nextFloat();

        conta = consumoKwh * valorKwh;

        if (conta >= 300){
            System.out.println("Consumo elevado!");
        }
        else{
            System.out.println("Consumo dentro do esperado!");
        }
    }
}
