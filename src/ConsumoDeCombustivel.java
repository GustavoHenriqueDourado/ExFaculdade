import java.util.Scanner;

public class ConsumoDeCombustivel {
    public static void main (String[] args){

        int quilometros;
        int combustivel;
        float precoCombustivel;
        int litrosGastos;
        float gastoTotal;


        Scanner leia = new Scanner(System.in);

        System.out.println("Infrome os Km's percorridos : ");
        quilometros = leia.nextInt();
        System.out.println("Consumo por quilometro km/L : ");
        combustivel = leia.nextInt();
        System.out.println("Preço do comnustivel : ");
        precoCombustivel = leia.nextFloat();

        litrosGastos = quilometros / combustivel;
        gastoTotal = litrosGastos * precoCombustivel;
        System.out.println("O gasto total foi de R$ " + gastoTotal );













    }
}
