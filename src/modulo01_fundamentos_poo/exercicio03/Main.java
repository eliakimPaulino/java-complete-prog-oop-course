package modulo01_fundamentos_poo.exercicio03;

import java.util.Scanner;

import modulo01_fundamentos_poo.exercicio03.entitie.Student;

/* 
Fazer um programa para ler o nome de um aluno e as três notas que ele obeteve nos três trimestres
do ano (primeiro trimestre vale 30, segundo e terceiro valem 35 cada). Ao final mostrar qual a nota
final do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo,
quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Criar classe Student
para resolver o problema.

*/

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        student.name = sc.nextLine();
        System.out.print("Enter the first trimester grade (max 30): ");
        student.firstTrimester = sc.nextDouble();
        System.out.print("Enter the second trimester grade (max 35): ");
        student.secondTrimester = sc.nextDouble();
        System.out.print("Enter the third trimester grade (max 35): ");
        student.thirdTrimester = sc.nextDouble();

        System.out.println("FINAL GRADE = " + String.format("%.2f", student.finalGrade()));
        System.out.println(student.status());

        sc.close();
    }
    
}
