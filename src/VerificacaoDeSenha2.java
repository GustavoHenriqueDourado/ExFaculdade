import java.util.Scanner;

public class VerificacaoDeSenha2 {
    public static void main(String[] args){

        int senhaSalva = 1234;
        int senha;

        Scanner leia = new Scanner(System.in);

        System.out.println("Informe sua senha : ");
        senha = leia.nextInt();

        if (senhaSalva == senha){
            System.out.println("Senha coreta!");
        }
        else{
            System.out.println("Senha incorreta!");
        }
    }
}
