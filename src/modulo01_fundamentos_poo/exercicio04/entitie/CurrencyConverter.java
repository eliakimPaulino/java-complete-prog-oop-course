package modulo01_fundamentos_poo.exercicio04.entitie;

public class CurrencyConverter {
    public static double IOF = 0.06;

    public static double converter(double dollarPrice, double quantity) {
        double total = dollarPrice * quantity;
        return total + (total * IOF);
    }
}
