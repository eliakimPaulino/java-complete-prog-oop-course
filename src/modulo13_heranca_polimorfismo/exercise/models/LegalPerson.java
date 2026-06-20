package modulo13_heranca_polimorfismo.exercise.models;

import modulo13_heranca_polimorfismo.exercise.entities.Taxpayer;

public class LegalPerson extends Taxpayer{

    private int numberOfEmployees;

    public LegalPerson() {
    }

    public LegalPerson(String name, double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        if (numberOfEmployees > 10) {
            return getAnualIncome() * 0.14;
        } else {
            return getAnualIncome() * 0.16;
        }
    }    
}
