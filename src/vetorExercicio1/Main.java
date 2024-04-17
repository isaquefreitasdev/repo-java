package vetorExercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            int N = sc.nextInt();
            vetor[i] = N;
        }
        for (int i = 0;i<n;i++){
            if (vetor[i] < 0){
                System.out.println(vetor[i]);
            }
        }
    }
}
