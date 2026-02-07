import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("Desafio 08");
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> arrayNumbers = new ArrayList<>();
        ArrayList<Integer> arrayNumbersPositivos = new ArrayList<>();
        ArrayList<Integer> arrayNumbersNegativos = new ArrayList<>();

        int opcao = -1;

        while (opcao != 0){
            System.out.println("1 - Para adicionar um número");
            System.out.println("0 - Para encerrar");

            try {
                opcao = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException error){
                System.out.println("Inválido Menu só é permitido NUMBERS");
                continue;
            }

            if(opcao == 1){
                try {
                    System.out.println("Digite um número");
                    int number = Integer.parseInt(input.nextLine());
                    arrayNumbers.add(number);
                } catch (NumberFormatException e){
                    System.out.println("Entrada inválida! Digite apenas números.");
                }
            } else if (opcao == 0){
                System.out.println("Encerrando...");
                break;
            } else {
                System.out.println("Opção inválida! Escolha 1 ou 0.");
            }
        }

        for (int item : arrayNumbers){
            if(item >= 0){
                arrayNumbersPositivos.add(item);
            }else {
               arrayNumbersNegativos.add(item);
            }
        }

        System.out.println("Numeros Positivos: " + arrayNumbersPositivos);
        System.out.println("Numeros Negativos: " + arrayNumbersNegativos);

        input.close();
    }
}