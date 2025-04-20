import java.util.HashMap;
import java.util.Map;

public class ProductDB {
    private static Long idGen;
    private static Map<Long, Product> productMap;

    public ProductDB(){
        ProductDB.idGen = 1L;
        ProductDB.productMap = new HashMap<>();
    }

    public Product saveProduct(Product product){
        product.setId(idGen);
        idGen++;
        productMap.put(product.getId(),product);
        return product;
    }

    public void PrintMap(){
        System.out.println(productMap);
    }
}
