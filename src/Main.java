import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Digite um número:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;

        while (x != 0) {
            sum += x;
            System.out.println("Digite outro número:");
            x = sc.nextInt();
        }

        System.out.println("A soma dos números digitados é: " + sum);
        sc.close();

    }
}