package modulo03_comportamento_de_memoria_arrays_listas.exercicio08;

import java.util.Scanner;

/*
Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.
*/
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores terão cada vetor?");
        int number = sc.nextInt();

        int[] vectA = new int[number];
        int[] vectB = new int[number];
        int[] vectC = new int[number];

        System.out.println("Digite os valores do Vetor A: ");

        for (int i = 0; i < vectA.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vectA[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Digite os valores do Vetor B: ");

        for (int i = 0; i < vectB.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vectB[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Vetor C (soma de A e B): ");

        for (int i = 0; i < vectC.length; i++) {
            vectC[i] = vectA[i] + vectB[i];
            System.out.print(vectC[i] + " ");
        }
        System.out.println();
        sc.close();
    }

}
