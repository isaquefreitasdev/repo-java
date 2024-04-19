package vetorExercicio11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos serão digitados");
        int n = sc.nextInt();
        String[] names = new String[n];
        double[] notaOne = new double[n];
        double[] notaTwo = new double[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Nome e suas duas notas");
            names[i] = sc.nextLine();
            notaOne[i] = sc.nextDouble();
            notaTwo[i] = sc.nextDouble();
        }
        double soma = 0;
        double media = 0;
        for (int i = 0; i < n ; i++) {
            soma+= notaOne[i] + notaTwo[i];
        }
        media =
        for (int i = 0; i < n; i++) {

        }

    }
}
