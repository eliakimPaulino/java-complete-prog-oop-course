package modulo03_comportamento_de_memoria_arrays_listas.vetores.exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você deseja inserir? ");
        int numero = sc.nextInt();

        int[] array = new int[numero];
        int[] negativeNumber = new int[numero];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° número: ");
            array[i] = sc.nextInt();
            if (array[i] < 0) {
                negativeNumber[i] = array[i];
            }
        }

        System.out.println("Números negativos: ");

        for (int i = 0; i < negativeNumber.length; i++) {
            if (negativeNumber[i] != 0) {
                System.out.println(negativeNumber[i]);
            }
        }

        sc.close();
    }
}
