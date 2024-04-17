package Exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nFuncionario,horasTrabalhadas,salarioPorHora,total;
        nFuncionario = sc.nextDouble();
        horasTrabalhadas = sc.nextDouble();
        salarioPorHora = sc.nextDouble();

        total = horasTrabalhadas * salarioPorHora;
        sc.close();
        System.out.printf("O funcionário %.0f recebe %.2f",nFuncionario,total);


    }
}
