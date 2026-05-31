package modulo01_fundamentos_poo.exercicio02;

import java.util.Scanner;

import modulo01_fundamentos_poo.exercicio02.entitie.Employee;

/*
Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto).
Em seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida,
aumentar o salário do funcionário com base em uma porcentagem dada (somente o salário 
bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a 
classe projetada abaixo:

Employee
+ name: String
+ grossSalary: double
+ tax: double
+ netSalary(): double
+ increaseSalary(percentage: double): void

*/

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println(
                "Employee: " + emp.name + ", GrossSalary $ " + String.format("%.2f", emp.grossSalary) + ", Tax $ "
                        + String.format("%.2f", emp.tax) + ", Net Salary $ " + String.format("%.2f", emp.netSalary()));

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);
        System.out.println(
                "Updated! Salary encreased in " + percentage + "%\nEmployee: " + emp.name + ", GrossSalary $ "
                        + String.format("%.2f", emp.grossSalary) + ", Tax $ "
                        + String.format("%.2f", emp.tax) + ", Net Salary $ " + String.format("%.2f", emp.netSalary()));

        sc.close();
    }
}
