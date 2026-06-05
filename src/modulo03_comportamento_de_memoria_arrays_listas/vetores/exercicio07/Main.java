package modulo03_comportamento_de_memoria_arrays_listas.vetores.exercicio07;

import java.util.Scanner;

/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).
*/

public class Main {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos número você vai digitar?");
        int number = sc.nextInt();

        int[] vect = new int[number];

        int greaterValue = 0;
        int position = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um número:");
            vect[i] = sc.nextInt();
            if (vect[i] > greaterValue) {
                greaterValue = vect[i];
                position = i;
            }
        }

        System.out.println("Maior valor: " + greaterValue);
        System.out.println("Posição do maior valor: index " + position);
        
        sc.close();
    }
}
