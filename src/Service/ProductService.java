package Service;

import DB.ProductDB;
import Object.Product;

public class ProductService {

    private static ProductDB productDB;

    public ProductService(ProductDB productDB){
        this.productDB = productDB;
    }


    public Product save(String productName, Double productPrice) {
        Product newProduct = new Product(productName,productPrice);
        newProduct = productDB.save(newProduct);
        return newProduct;
    }
}
