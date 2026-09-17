package w3SchoolsJava;

public class JavaSwitch {
    public static void main (String[] args) {

        // coffe 1
        // tea 2

        int choice = 1;

        switch (choice){
            case 1:
                System.out.println("Seu pedido é um café");
            break;
            case 2:
                System.out.println("Seu pedido é um chá");
            break;
            default:
                System.out.println("Pedio incorreto!");
        }
    }
}

