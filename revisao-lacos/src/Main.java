import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("Desafio 05");
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arrayNumbers = new ArrayList<>();

        int opcao = -1;

        while (opcao != 0){
            System.out.println("Digite 1 - Para adicionar numero no ARRAY");
            System.out.println("Digite 0 - Para Sair");

            opcao = Integer.parseInt(input.nextLine());

            if (opcao == 1){
                try {
                    System.out.println("Digite um numero");
                    int number = Integer.parseInt(input.nextLine());
                    arrayNumbers.add(number);
                    System.out.println("Numero adicionado com sucesso!");
                }catch (NumberFormatException  error){
                    System.out.println("Valor Inválido. Digite apenas números! " + error.getMessage());
                }

            }else if(opcao == 0){
                System.out.println("Encerrando operação...");
                break;
            }else{
                throw new myException("Opção Inválida!!!");
            }
        }

        if (arrayNumbers.isEmpty()) {
            System.out.println("A lista está vazia. Nenhum número para comparar.");
        } else {
            int maiorNumero = arrayNumbers.get(0);

            for (int item : arrayNumbers) {
                if (item > maiorNumero) {
                    maiorNumero = item;
                }
            }
            System.out.println("O maior número do Array é: " + maiorNumero);
        }

        input.close();
    }
}