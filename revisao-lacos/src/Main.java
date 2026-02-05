import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("Desafio 02");
        Scanner input = new Scanner(System.in);

        int[] valores = {10,20,30,40,50};
        int soma = 0;
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }

        System.out.println("Valor da soma dos valores: " + soma);
        input.close();
    }
}