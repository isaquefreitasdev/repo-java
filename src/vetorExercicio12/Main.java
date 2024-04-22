package vetorExercicio12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos serao digitados? ");
        int n = sc.nextInt();
        double[] alturas = new double[n];
        String[] generos = new String[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Altura e Genero");
            alturas[i] = sc.nextDouble();
            sc.nextLine();
            generos[i] = sc.nextLine();
        }
        double menorAltura =  alturas[0];
        double maiorAltura = alturas[0];
        for (int i = 0; i < n; i++) {
            if (alturas[i] < menorAltura){
                menorAltura = alturas[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (alturas[i] > menorAltura){
                maiorAltura = alturas[i];
            }
        }
        double mediaMulheres = 0;
        double ndeMulheres = 0;
        for (int i = 0; i < n; i++) {
            if (generos[i].equals("F")){
                ndeMulheres++;
                mediaMulheres = alturas[i] / ndeMulheres;
            }
        }
        int qtdHomens = 0;
        for (int i = 0; i < n; i++) {
            if (generos[i].equals("M")){
                qtdHomens++;
            }
        }
        System.out.println("Menor altura " + menorAltura);
        System.out.println("Maior altura " + maiorAltura);
        System.out.println("Media de altura de mulheres " + mediaMulheres);
        System.out.println("Numero de homens " + qtdHomens);


    }
}
