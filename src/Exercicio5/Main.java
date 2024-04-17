package Exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peca1,peca2,npecas1,npecas2,vUnit1,vUnit2,pecaTotal1,pecaTotal2,total;
        peca1 = sc.nextDouble();
        npecas1 = sc.nextDouble();
        vUnit1 = sc.nextDouble();
        peca2 = sc.nextDouble();;
        npecas2 = sc.nextDouble();
        vUnit2 = sc.nextDouble();

        pecaTotal1 = vUnit1 * npecas1;
        pecaTotal2 = vUnit2 * npecas2;

        total = pecaTotal1 + pecaTotal2;

        System.out.printf("VALOR A PAGAR: R$ %.2f",total);

    }
}
