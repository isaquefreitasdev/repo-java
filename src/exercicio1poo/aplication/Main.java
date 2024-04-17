package exercicio1poo.aplication;

import exercicio1poo.entities.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.print("Digite a largura e altura do retangulo");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();
        System.out.print("Area: " + rectangle.Area());
        System.out.print("Perimetro: " + rectangle.Perimeter());
        System.out.print("Diagonal: " + rectangle.Diagonal());
    }
}
