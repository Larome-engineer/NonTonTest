package nontonRF.dao;

import nontonRF.model.Product;

import java.util.List;

public interface ProductDao {
    boolean addProduct(Product product);
    boolean deleteProduct(String productId);
    String getProductName(String productId);
    List<String> getProductsIdByName(String productName);
    List<String> getAllProducts();

}
