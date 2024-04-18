package vetorExercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de elementos do vetor:");
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] ages = new int[n];
        for (int i = 0; i < n ; i++) {
            sc.nextLine();
            System.out.println("Nome:");
            names[i] = sc.nextLine();
            System.out.println("Idade:");
            ages[i] = sc.nextInt();
        }
        int ageThanOlder = ages[0];
        int positonAge = 0;
        for (int i = 0; i < n; i++) {
            if (ages[i] > ageThanOlder){
                ageThanOlder = ages[i];
                positonAge = i;
            }

        }
        System.out.println(names[positonAge]);
        System.out.println(ages[positonAge]);
    }
}
