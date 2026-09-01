import java.util.Scanner;

public class Comsumo {
    public static void main (String[] args){

         int quilometros;
         int litros;
         int consumo;

         Scanner leia = new Scanner(System.in);

         System.out.println("Quantos Km percorreu ? ");
         quilometros = leia.nextInt();
         System.out.println("Quantos litros gastou ? ");
         litros = leia.nextInt();

         consumo = quilometros / litros;
         System.out.println("O consumo foi de Km/L " + consumo);
    }
}
