package DB;

import Object.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductDB {

    private static Long prodId;
    private static Map<Long,Product> db;

    public ProductDB(){
        ProductDB.prodId = 1L;
        ProductDB.db = new HashMap<>();
    }

    public Product save(Product newProduct) {
        newProduct.setId(prodId);
        prodId++;
        db.put(newProduct.getId(),newProduct);
        return newProduct;
    }
}
