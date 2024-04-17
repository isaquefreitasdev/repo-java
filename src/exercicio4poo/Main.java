package exercicio4poo;

import exercicio4poo.util.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cotação atual do dolar: ");
        double dolar = sc.nextDouble();
        System.out.println("Quantos dolares vc quer? ");
        double amount = sc.nextDouble();
        System.out.println(CurrencyConverter.DolarNow(amount,dolar));
    }
}
