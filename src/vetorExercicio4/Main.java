package vetorExercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < values.length;i++){
            sc.nextLine();
            int N = sc.nextInt();
            values[i] = N;
        }
        int valueBigger = values[0];
        int position = 0;
        for (int i = 0; i < values.length;i++){
            if (values[i] > valueBigger){
                valueBigger = values[i];
                position = i;
            }
        }
        System.out.println("O valor maior: " + valueBigger + " ," + "Posição: " + position);
    }
}
