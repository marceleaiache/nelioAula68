package application;

import entities.Product;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = leia.nextLine();

        System.out.println("Price: ");
        product.price = leia.nextDouble();

        System.out.println("Quantity in stock: ");
        product.quantity = leia.nextInt();

        System.out.println();
        System.out.println("Product data: " + product);

        // ADCIONANDO QUANTIDADE NO PRODUCT

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = leia.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        // REMOVENDO QUANTIDADE NO PRODUCT

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = leia.nextInt();
        product.removeProduct(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);



        leia.close();
    }
}
