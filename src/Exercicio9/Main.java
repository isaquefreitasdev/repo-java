package Exercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo,qtd;
        codigo = sc.nextInt();
        qtd = sc.nextInt();
        double valor = 0;


        if(codigo == 1){
            valor = 4.00;

        }else if(codigo == 2){
            valor = 4.50;

        }else if(codigo == 3){
            valor = 5.00;

        } else if (codigo == 4) {
            valor = 2.00;


        } else if (codigo == 5){
            valor = 1.50;

        }else{
            System.out.println("ERRO");

    }
        double calculo = valor * qtd;
        System.out.printf("O valor é %.2f",calculo);

    }
}
