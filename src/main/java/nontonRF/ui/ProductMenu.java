package nontonRF.ui;

import nontonRF.service.ProductServiceImpl;

import java.util.Scanner;

public class ProductMenu {
    private final ProductServiceImpl productService;
    public ProductMenu(ProductServiceImpl productService) {
        this.productService = productService;
    }
    Scanner userInput = new Scanner(System.in);
    public void menu() {
        boolean session = true;
        while (session) {
            System.out.println("Select option:\n" +
                    "1. addProduct, 2. getAll, 3. getIdsByName, 4.deleteProduct 5. getNameById, 6. exit");
            switch (userInput.nextLine()) {
                case "1", "addProduct" -> {
                    System.out.println("Input product id:");
                    String productId = userInput.nextLine();

                    System.out.println("Input product name: ");
                    String productName = userInput.nextLine();

                    productService.addProduct(productId, productName);
                }
                case "2", "getAll" -> {
                    System.out.println("All existing products: ");
                    productService.getAllProducts();
                }
                case "3", "getIdsByName" -> {
                    System.out.println("Input product name: ");
                    productService.getProductsIdByName(userInput.nextLine());
                }
                case "4", "delete" -> {
                    System.out.println("Input product id:");
                    productService.deleteProduct(userInput.nextLine());
                }
                case "5", "getNameById" -> {
                    System.out.println("Input product id: ");
                    productService.getProductName(userInput.nextLine());
                }
                case "6", "exit" -> {
                    System.out.println("Bye-Bye! :)");
                    session = false;
                }
                default -> System.out.println("I don't understand you");
            }
        }
    }
}
