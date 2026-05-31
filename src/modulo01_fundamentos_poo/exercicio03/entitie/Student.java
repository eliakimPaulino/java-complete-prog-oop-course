package modulo01_fundamentos_poo.exercicio03.entitie;

/* 
Fazer um programa para ler o nome de um aluno e as três notas que ele obeteve nos três trimestres
do ano (primeiro trimestre vale 30, segundo e terceiro valem 35 cada). Ao final mostrar qual a nota
final do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo,
quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Criar classe Student
para resolver o problema.

*/

public class Student {
    public String name;
    public double firstTrimester;
    public double secondTrimester;
    public double thirdTrimester;

    public double finalGrade() {
        return firstTrimester + secondTrimester + thirdTrimester;
    }

    public String status() {
        if (finalGrade() >= 60) {
            return "PASS";
        } else {
            final double missingPoints = 60 - finalGrade();
            return "FAILED\nMISSING " + String.format("%.2f", missingPoints) + " POINTS to reach the minimum 60 for approval.";
        }
    }
}
