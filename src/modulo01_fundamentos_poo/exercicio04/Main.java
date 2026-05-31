package modulo01_fundamentos_poo.exercicio04;

import java.util.Scanner;

import modulo01_fundamentos_poo.exercicio04.entitie.CurrencyConverter;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double quantity = sc.nextDouble();
        System.out.println("Amount to be paid in reais: R$ "
                + String.format("%.2f", CurrencyConverter.converter(dollarPrice, quantity)));
    }

}
