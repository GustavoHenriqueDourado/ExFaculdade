import java.util.Scanner;

public class TrocaDeValores {
    public static void main (String[] args){

        String troca;
        String A;
        String B;

        Scanner leia = new Scanner(System.in);

        System.out.println("De um valor para o caracter A : ");
        A = leia.next();
        System.out.println("De um valor apara o caracter B : ");
        B = leia.next();

        troca = A; //usada quando quer inverter os valores de uma variavél sem perder o que a variavél já continha
        A = B;
        B = troca;

        System.out.println("Agora o caracter A vale : " + A );
        System.out.println("Agora o valor do caractere B passa a ser " + B );


    }

}
