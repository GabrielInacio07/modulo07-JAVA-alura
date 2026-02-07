import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("Desafio 06");
        Scanner input = new Scanner(System.in);

        String password = "teste123";
        int tentativas = 3;

        while (tentativas > 0) {
            System.out.println("Digite sua senha:");
            String senha = input.nextLine();

            if (senha.equals(password)) {
                System.out.println("Senha Correta! Acesso concedido!");
                break;
            } else {
                tentativas--;
                System.out.println("Senha incorreta! Você tem " + tentativas + " tentativas restantes.");
            }

            if (tentativas == 0) {
                System.out.println("Tentativas esgotadas! CONTA BLOQUEADA.");
            }
        }


        input.close();
    }
}