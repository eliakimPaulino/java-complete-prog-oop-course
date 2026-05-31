package modulo01_fundamentos_poo.exercicio01;

import java.util.Scanner;

import modulo01_fundamentos_poo.exercicio01.entitie.Rectangle;

/**
 * Fazer um programa para ler os valores da largura e altura de um retângulo. Em
 * seguida,
 * mostrar na tela o valor de suaa área, perímetro e diagonal. Usar uma classe
 * como
 * mostrado abaixo:
 * 
 * Rectangle
 * - width: double
 * - height: double
 * + area(): double
 * + perimeter(): double
 * + diagonal(): double
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.print("Enter rectangle height: ");
        rectangle.height = sc.nextDouble();
        System.out.print("Enter rectangle width: ");
        rectangle.width = sc.nextDouble();

        sc.close();

        System.out.printf("Rectangle area: %.2f%n", rectangle.area());
        System.out.printf("Rectangle perimeter: %.2f%n", rectangle.perimeter());
        System.out.printf("Rectangle diagonal: %.2f%n", rectangle.diagonal());
    }

}
