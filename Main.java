import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Product data: ");
        System.out.print("Name: ");
        System.out.print("Price: ");
        System.out.print("Quantity in stock: ");


        sc.close();

    }
}