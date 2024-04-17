package Exercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A,B,C,areadoTriangulo,areadoCirculo,areadoTrapezio,areadoQuadrado,areadoRetangulo;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        double pi = 3.14;
        areadoTriangulo = (A * C) /2;
        areadoCirculo = pi * (Math.pow(C,2));
        areadoTrapezio = (A+B) / 2;
        areadoQuadrado = Math.pow(B,2);
        areadoRetangulo = A * B;

        System.out.printf("A area do triangulo: %.2f%n A area do circulo: %.2f%n A area do Trapezio: %.2f%n A area do Quadrado: %.2f%n A área do Retangulo: %.2f",areadoTriangulo,areadoCirculo,areadoTrapezio,areadoQuadrado,areadoRetangulo);

    }

}
