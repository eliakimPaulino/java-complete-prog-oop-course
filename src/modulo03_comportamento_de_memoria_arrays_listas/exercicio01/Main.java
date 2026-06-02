package modulo03_comportamento_de_memoria_arrays_listas.exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos dados você deseja inserir? ");
        int n;
        try {
            n = sc.nextInt();
            double[] vect = new double[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Insira o dado " + i);
                vect[i] = sc.nextDouble();
            }

            System.out.println("Dados inseridos: ");
            for (int i = 0; i < n; i++) {
                System.out.println(vect[i]);
            }

            double sum = 0.0;

            for (int i = 0; i < n; i++) {
                sum += vect[i];
            }
            double avg = sum / n;
            System.out.printf("Média: %.2f%n", avg);

        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            e.printStackTrace();
        }

        sc.close();
    }
}
