package Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area,raio,pi,raioEL;
        raio = sc.nextDouble();
        raioEL = Math.pow(raio,2);
        area = 3.14159 * raioEL;

        System.out.printf("A area do circulo é: %.4f",area);
    }
}
