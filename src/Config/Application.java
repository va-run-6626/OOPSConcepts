package Config;

import DB.ProductDB;
import Service.ProductService;
import Object.Product;

import java.util.Scanner;

public class Application {

    private static Scanner scanner;
    private static ProductService productService;
    private static ProductDB productDB;

    public Application(){
        scanner = new Scanner(System.in);
        productDB = new ProductDB();
        productService = new ProductService(productDB);
    }

    public static void start(){
        System.out.println("Hi kindly add your new product !!");
        System.out.println("Product name : ");
        String productName = scanner.nextLine();
        System.out.println("Product price :");
        Double productPrice = scanner.nextDouble();

        Product ans = productService.save(productName,productPrice);
        System.out.println(ans);


        // product delete by id
        System.out.println("Give the product id that needs to be deleted");
        System.out.println("Id :");
        Long id = scanner.nextLong();


    }
}
