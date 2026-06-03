package modulo03_comportamento_de_memoria_arrays_listas.exercicio05;

import java.util.Scanner;

import modulo03_comportamento_de_memoria_arrays_listas.exercicio05.entitie.Person;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas você deseja inserir? ");

        int n = sc.nextInt();
        Person[] people = new Person[n];

        double alturaMedia = 0;
        double pessoasComMenosDe16Anos = 0;

        for (int i = 0; i < people.length; i++) {
            System.out.println("Insira o nome da " + (i + 1) + "ª pessoa: ");
            String name = sc.next();

            System.out.println("Insira a idade da " + (i + 1) + "ª pessoa: ");
            int age = sc.nextInt();

            System.out.println("Insira a altura da " + (i + 1) + "ª pessoa: ");
            double height = sc.nextDouble();

            people[i] = new Person(name, age, height);
            alturaMedia += people[i].getHeight();
            if (people[i].getAge() < 16) {
                pessoasComMenosDe16Anos++;
            }
        }

        alturaMedia /= people.length;
        pessoasComMenosDe16Anos = (pessoasComMenosDe16Anos / people.length) * 100;

        System.out.printf("Altura média: %.2f%n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n", pessoasComMenosDe16Anos);

        sc.close();
    }
}