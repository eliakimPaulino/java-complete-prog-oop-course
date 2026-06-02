package modulo03_comportamento_de_memoria_arrays_listas.exercicio02;

import java.util.Locale;
import java.util.Scanner;

import modulo03_comportamento_de_memoria_arrays_listas.exercicio02.entitie.Product;

/*

    2. Fazer um programa para ler um número inteiro N e os dados(nome e preço) de N produtos.
    Armazene os N produtos em um vetor. Em seguida, mostrar o preço médio dos produtos.

*/

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos produtos você deseja inserir? ");
        int n;

        try {
            n = sc.nextInt();

            Product[] vect = new Product[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Insira o nome do produto " + i);
                sc.nextLine(); // cosumir a quebra de linha
                String name = sc.nextLine();
                System.out.println("Insira o preço do produto " + i);
                double price = sc.nextDouble();
                vect[i] = new Product(name, price);
            }

            System.out.println("Produtos inseridos: ");
            for (int i = 0; i < n; i++) {
                System.out.println(vect[i]);
            }

            double sum = 0.0;

            for (int i = 0; i < n; i++) {
                sum += vect[i].getPrice();
            }

            double average = sum / n;
            System.out.printf("Preço médio: %.2f%n", average);

        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            e.printStackTrace();
        }

        sc.close();
    }
}
