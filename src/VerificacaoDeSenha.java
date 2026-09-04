import java.util.Scanner;

public class VerificacaoDeSenha {
    public static void main (String[] args){

        String senhaSalva = "senha123";
        String senha;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua senha : ");
        senha = leia.nextLine();

        //if (senhaSalva == senha) { // pelo o que entendi == não compara o objeto compara o espaço na memoria, e Scanner faz essa diferença tornando sempre diferentes
        if (senhaSalva.equals(senha)){// aqui chamei o metodo .equals ele compara dois objetos e verifica se são iguais
            System.out.println("Senha correta!");
        }
        else{
            System.out.println("Senha incorreta !");

        }
    }
}


