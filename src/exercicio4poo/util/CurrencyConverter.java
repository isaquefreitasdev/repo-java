package exercicio4poo.util;

public class CurrencyConverter {
    public static final double IOF = 0.06;
    public static double DolarNow(double amount,double dolar){
        return (amount * dolar )* (1 + IOF);


    }
}
