package nontonRF;

import nontonRF.dao.ProductDaoImpl;

import nontonRF.service.ProductServiceImpl;
import nontonRF.ui.ProductMenu;

public class NonTonMain {
    public static void main(String[] args) {
        ProductMenu productMenu = new ProductMenu(
                new ProductServiceImpl(
                        new ProductDaoImpl()
                )
        );

        productMenu.menu();
    }
}
