package nontonRF.service;

import nontonRF.dao.ProductDaoImpl;
import nontonRF.model.Product;
import nontonRF.service.interfaces.ProductService;

public class ProductServiceImpl implements ProductService {

    private final ProductDaoImpl productDao;
    public ProductServiceImpl(ProductDaoImpl productDao) {
        this.productDao = productDao;
    }

    @Override
    public void addProduct(String id, String name){
        Product product = new Product(id, name);
        if(!productDao.addProduct(product)) {
            System.out.println("Product already exist!");
        } else {
            System.out.println("Product added success!");
        }
    }

    @Override
    public void deleteProduct(String productId) {
        if (!productDao.deleteProduct(productId)) {
            System.out.println("Product doesn't exist");
        } else {
            System.out.println("Product deleted success");
        }
    }

    @Override
    public void getProductName(String productId) {
        System.out.println(productDao.getProductName(productId));
    }

    @Override
    public void getProductsIdByName(String productName) {
        System.out.println(productDao.getProductsIdByName(productName));
    }

    @Override
    public void getAllProducts() {
        System.out.println(productDao.getAllProducts());
    }
}
