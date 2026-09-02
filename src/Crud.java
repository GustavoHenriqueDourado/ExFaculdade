import java.util.Scanner;

public class Crud {
    public static void main (String[] args){

        int opcao = 0;
        String nome ;

        Scanner leia = new Scanner(System.in);

        System.out.println("Para cadastrar digite 1");
        System.out.println("Para buscar digite 2");
        System.out.println("Para atualizar digite 3");
        System.out.println("Para apagar digite 4");
        System.out.println("Digite um dos números para escolher a opção desejada ");
        opcao = leia.nextInt();
        leia.nextLine();

        switch (opcao) {

            case 1 :
                System.out.println("Digite seu nome : ");
                nome = leia.nextLine();
                System.out.println("Cadastro realizado com sucesso!");
            break;

            case 2 :
                System.out.println("Buscando seu cadastro...");
                nome = leia.nextLine();
                System.out.println("Seu cadastro é " + nome);
            break;

            case 3 :
                nome = "";
                System.out.println("Atualize seu nome : ");
                nome = leia.next();
                System.out.println("Nome atualizado com sucesso!");
            break;

            case 4 :
                nome = "";
                System.out.println("Nome apagado com sucesso");
            break;

            default:
                System.out.println("Opção inválida!");

        }
    }
}
