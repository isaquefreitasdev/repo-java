package Exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha =0;

        while (senha != 2002){
            senha = sc.nextInt();
            System.out.println("SENHA INCORRETA");
        }
        System.out.println("Correto");
    }
}
