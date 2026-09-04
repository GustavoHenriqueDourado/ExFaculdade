import java.util.Scanner;

public class DesafioAluguelDeBicicletas {
    public static void main(String[] args) {

        String nome;
        int horas;
        double valorHora = 8.0;
        double total;

        Scanner leia = new Scanner(System.in);

        System.out.println("Informe seu nome :");
        nome = leia.nextLine();
        System.out.println("Quantas horas permanesceu com a bicicleta :");
        horas = leia.nextInt();

        total = horas * valorHora;

        if (total >= 50){
            System.out.println("Parabéns, voçê é um cliente Premium!");
            System.out.println(nome + ", voçê usou a bicicleta por " + horas + " horas,\n o valor a pagar pelo alugel será de R$" + total ); // \n quebra a linha
        }
        else {
            System.out.println("Voçê não é um cliente Premium!");
            System.out.println(nome + ", voçê usou a bicicleta por " + horas + "horas,\n o valor a pagar pelo alugel será de R$" + total );
        }
    }
}
