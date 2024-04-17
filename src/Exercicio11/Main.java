package Exercicio11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double renda;
        renda = sc.nextDouble();
        double imposto = 0;
        if (renda > 0 && renda <=2000){
            System.out.println("Isento");
        } else if (renda >=2000.01 && renda <=3000 ) {
            imposto = 8;
        }else if (renda >= 3000.01 && renda <= 4500){
            imposto = 18;
        } else if (renda > 4500) {
            imposto = 28;
        }else{
            System.out.println("Isento");
        }
        double CalcImposto = renda *(imposto/100);
        System.out.printf("Valor do imposto %.2f",CalcImposto);

    }
}
