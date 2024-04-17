package Exercicio1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int x,y,z;
        System.out.println("Digite os números para serem somados");
        x = sc.nextInt();
        y = sc.nextInt();
        z = x + y;
        System.out.println("Soma: " + z);
    }
}
