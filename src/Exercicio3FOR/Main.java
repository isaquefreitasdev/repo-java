package Exercicio3FOR;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double x,y,z;
        double mediaP = 0.0;
        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 5;
        int somados = peso1 + peso2 + peso3;
        for (int i = 0; i < N;i++){
            x = sc.nextDouble();
            y = sc.nextDouble();
            z = sc.nextDouble();
            mediaP = (x * 2 + y * 3 + z * 5)/somados;
            System.out.printf("%.1f",mediaP);

        }
    }
}
