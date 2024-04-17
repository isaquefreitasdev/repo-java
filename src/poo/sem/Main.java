package poo.sem;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("A area do X: %.4f%n",areaX);
        System.out.printf("A area do Y: %.4f%n",areaY);

        if (areaX > areaY){
            System.out.println("A maior área é o X");
        }else{
            System.out.println("A maior área é o Y");
        }
    }
}
