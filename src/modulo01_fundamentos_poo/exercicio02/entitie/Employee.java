package modulo01_fundamentos_poo.exercicio02.entitie;

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
public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
    }
    
}
