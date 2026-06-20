package modulo13_heranca_polimorfismo.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import modulo13_heranca_polimorfismo.exercise.entities.Taxpayer;
import modulo13_heranca_polimorfismo.exercise.models.LegalPerson;
import modulo13_heranca_polimorfismo.exercise.models.NaturalPerson;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Taxpayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new NaturalPerson(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new LegalPerson(name, anualIncome, numberOfEmployees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        for (Taxpayer tp : list) {
            System.out.printf("%s: $ %.2f%n", tp.getName(), tp.tax());
        }

        System.out.println();
        double sum = 0.0;
        for (Taxpayer tp : list) {
            sum += tp.tax();
        }
        System.out.printf("TOTAL TAXES: $ %.2f%n", sum);

        sc.close();

    }
}
