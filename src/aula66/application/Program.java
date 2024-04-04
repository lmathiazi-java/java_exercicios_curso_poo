package aula66.application;

import java.util.Locale;
import java.util.Scanner;

import aula66.entities.Product;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Product product = new Product();
        
        System.out.println("enter product data:");

        System.out.print("name: ");
        product.name = entrada.next();

        System.out.print("price: $ ");
        product.price = entrada.nextDouble();

        System.out.print("quantity in stock: ");
        product.quantity = entrada.nextInt();

        System.out.print("\nproduct data: " + product.toString() + "\n");

        System.out.print("\nenter the number of products to be added in stock: ");
        int addProducts = entrada.nextInt();
        product.AddProducts(addProducts);

        System.out.print("\nupdated data: " + product.toString() + "\n");

        System.out.print("\nenter the number of products to be removed from stock: ");
        int removeProducts = entrada.nextInt();
        product.RemoveProducts(removeProducts);

        System.out.print("\nupdated data: " + product.toString() + "\n");

        entrada.close();
    }
}