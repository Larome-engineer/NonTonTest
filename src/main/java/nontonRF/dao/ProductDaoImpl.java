package nontonRF.dao;

import nontonRF.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductDaoImpl implements ProductDao {

    private final static HashMap<String, String> productStorage = new HashMap<>();

    @Override
    public boolean addProduct(Product product) {
        if (checkProductOnExist(product.getProductId())) {
            return false;
        }
        productStorage.put(product.getProductId(), product.getProductName());
        return true;
    }

    @Override
    public boolean deleteProduct(String productId) {
        if (!checkProductOnExist(productId)) {
            return false;
        }
        productStorage.remove(productId);
        return true;

    }

    @Override
    public String getProductName(String productId) {
        if (!checkProductOnExist(productId)) {
            return " ";
        }
        return productStorage.get(productId);
    }

    @Override
    public List<String> getProductsIdByName(String productName) {
        List<String> productIds = new ArrayList<>();
        for (String id : productStorage.keySet()) {
            if (productName.equals(productStorage.get(id))) {
                productIds.add(id);
            }
        }
        return productIds;
    }

    public List<String> getAllProducts() {
        return new ArrayList<>(productStorage.values());
    }

    private boolean checkProductOnExist(String productId) {
        return productStorage.get(productId) != null;
    }
}
