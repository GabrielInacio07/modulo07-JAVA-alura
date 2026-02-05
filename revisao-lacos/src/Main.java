import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("Desafio 03");
        Scanner input = new Scanner(System.in);
        int somaPar = 0;
        int somaImpar = 0;
        for (int i = 0; i <= 100 ; i++) {
            if(i % 2 == 0 ){
                somaPar += i;
            }else {
                somaImpar += i;
            }
        }

        System.out.println("A soma dos numeros pares é: " + somaPar);
        System.out.println("Lista de numeros impares: " + somaImpar);
        System.out.println("A diferença de valores é: " + (somaPar - somaImpar));
        input.close();
    }
}