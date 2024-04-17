package projeto.apliccation;

import projeto.entities.Product;

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        System.out.println("Name:");
        product.name = sc.nextLine();
        System.out.println("Price");
        product.price = sc.nextDouble();
        System.out.println("Quantity");
        product.quantity = sc.nextInt();

        System.out.println(product);

        System.out.print("Adicionar no estoque: ");
        int quantity = sc.nextInt();
        product.AddProducts(quantity);
        System.out.print("Quantidade atual: " + product.quantity + " " + product.TotalValueinStock());
        System.out.println();
        System.out.print("Remover do estoque :");
        quantity = sc.nextInt();
        product.RemoveProducts(quantity);
        System.out.print("Quantidade atual: " + product.quantity + " " + product.TotalValueinStock());

    }
}
