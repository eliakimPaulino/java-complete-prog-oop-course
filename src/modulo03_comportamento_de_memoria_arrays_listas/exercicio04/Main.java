package modulo03_comportamento_de_memoria_arrays_listas.exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você deseja inserir? ");
        double n = sc.nextDouble();
        double[] sum = new double[(int) n];
        double avg = 0;

        double[] vect = new double[(int) n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Insira o " + (i + 1) + "º número: ");
            vect[i] = sc.nextDouble();
            sum[i] = vect[i];
            avg += vect[i];
        }

        avg /= n;

        System.out.println("Valores inseridos: ");
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
        }
        System.out.println("\nMédia: " + avg);
        sc.close();
    }
}
