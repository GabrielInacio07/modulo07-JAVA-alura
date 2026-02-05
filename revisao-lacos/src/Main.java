import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("Desafio 01");
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de degraus a subir");
        int degraus = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= degraus; i++) {
            System.out.println("Subindo o degrau: " + i);
        }
        System.out.println("Você chegou ao topo!");
    }
}