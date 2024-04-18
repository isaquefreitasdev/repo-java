import java.util.Scanner;

public class s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo;
        String nome = "";
        codigo = sc.nextInt();
        switch (codigo){
            case 1:
                nome = "Isaque";
                break;
            case 2:
                nome = "Vitória";
                break;
            default:
                System.out.print("erro");
                break;
        }
        System.out.print(nome);
    }
}