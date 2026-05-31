package modulo02_construtores_this_sobrecarga_encapsulmento.exercise;

import java.util.Scanner;

import modulo02_construtores_this_sobrecarga_encapsulmento.exercise.entitie.Account;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account user Name: ");
        String userName = sc.next();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y' || response == 'Y') {
            System.out.print("Enter initial deposit value: $ ");
            double initialDeposit = sc.nextDouble();
            Account acc = new Account(accountNumber, userName, initialDeposit);
            System.out.println("Account data:");
            System.out.println("Account " + acc.getAccountNumber() + ", Holder: " + acc.getUserName() + ", Balance: $ "
                    + String.format("%.2f", acc.getBalance()));

            System.out.print("Enter a deposit value: $ ");
            double depositValue = sc.nextDouble();
            acc.deposit(depositValue);
            System.out.println("Updated account data:");
            System.out.println("Account " + acc.getAccountNumber() + ", Holder: " + acc.getUserName() + ", Balance: $ "
                    + String.format("%.2f", acc.getBalance()));

            System.out.print("Enter a withdraw value: $ ");
            double withdrawValue = sc.nextDouble();
            acc.withdraw(withdrawValue);
            System.out.println("Updated account data:");
            System.out.println("Account " + acc.getAccountNumber() + ", Holder: " + acc.getUserName() + ", Balance: $ "
                    + String.format("%.2f", acc.getBalance()));
        } else {
            Account acc = new Account(accountNumber, userName);
            System.out.println("Account data:");
            System.out.println("Account " + acc.getAccountNumber() + ", Holder: " + acc.getUserName() + ", Balance: $ "
                    + String.format("%.2f", acc.getBalance()));

            System.out.print("Enter a deposit value: $ ");
            double depositValue = sc.nextDouble();
            acc.deposit(depositValue);
            System.out.println("Updated account data:");
            System.out.println("Account " + acc.getAccountNumber() + ", Holder: " + acc.getUserName() + ", Balance: $ "
                    + String.format("%.2f", acc.getBalance()));

            System.out.print("Enter a withdraw value: $ ");
            double withdrawValue = sc.nextDouble();
            acc.withdraw(withdrawValue);
            System.out.println("Updated account data:");
            System.out.println("Account " + acc.getAccountNumber() + ", Holder: " + acc.getUserName() + ", Balance: $ "
                    + String.format("%.2f", acc.getBalance()));
        }

        sc.close();
    }

}
