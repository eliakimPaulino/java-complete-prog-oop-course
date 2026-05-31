package modulo02_construtores_this_sobrecarga_encapsulmento.exercise.entitie;

public class Account {
    private int accountNumber;
    private String userName;
    private double balance;

    public Account(int accountNumber, String userName) {
        this.accountNumber = accountNumber;
        this.userName = userName;
    }

    public Account(int accountNumber, String userName, double amount) {
        this.accountNumber = accountNumber;
        this.userName = userName;
        deposit(amount);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= -150.0) {
            balance -= amount + 5.0;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
}
