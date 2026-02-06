import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("Desafio 04");
        Scanner input = new Scanner(System.in);
        int fatorial = 1;

        System.out.println("Digite um número para saber seu fatorial: ");
        int number = Integer.parseInt(input.nextLine());

        for (int i = number; i >= 1 ; i--) {
            fatorial = fatorial * i;
        }

        System.out.println("Fatorial de " + number + " = " + fatorial);
    }
}