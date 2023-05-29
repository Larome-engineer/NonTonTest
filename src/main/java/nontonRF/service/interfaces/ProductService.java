package nontonRF.service.interfaces;

public interface ProductService {
    void addProduct(String id, String name);
    void deleteProduct(String productId);
    void getProductName(String productId);
    void getProductsIdByName(String productName);
    void getAllProducts();
}
