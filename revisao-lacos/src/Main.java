import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("Desafio 07");
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Digite um nome para cadastrar:");
            String nome = input.nextLine().trim();

            if (nome.isEmpty()) {
                System.out.println("Inválido! Nome não pode ser vazio.");
            } else if (nome.length() < 3) {
                System.out.println("Nome precisa ter pelo menos 3 caracteres.");
            } else {
                System.out.println("Nome cadastrado com sucesso!");
                System.out.println(nome);
                break;
            }
        }

        input.close();


        input.close();
    }
}