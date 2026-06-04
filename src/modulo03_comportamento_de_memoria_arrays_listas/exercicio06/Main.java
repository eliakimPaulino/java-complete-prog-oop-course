package modulo03_comportamento_de_memoria_arrays_listas.exercicio06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite qualquer número, positivo ou negativo:");
        int number = sc.nextInt();

        int[] array = new int[number];
        int countPares = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite um número: ");
            array[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS PARES:");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countPares++;
                System.out.print(array[i] + " ");
            }
        }

        System.out.println(); // Pular linha para melhor formatação

        System.out.println("Quantidade de números pares: " + countPares);

        sc.close();

    }
}
