package zjazd_2.zadanie_4;

import zjazd_2.zadanie_1.User;
import zjazd_2.zadanie_2.Product;

import java.util.ArrayList;

public class ShoppingCart {

    private User user;
    private ArrayList<Product> productList = new ArrayList<>();

    public ShoppingCart() {
    }

    public ShoppingCart(User user) {
        this.user = user;
    }

    public ShoppingCart(User user, ArrayList<Product> productList) {
        this.user = user;
        this.productList = productList;
    }

    public User getUser() {
        return user;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product) {
        if (product.getNoPieces() > 0) {
            this.productList.add(product);
            product.setNoPieces(product.getNoPieces() - 1);
        } else {
            throw new IllegalArgumentException("Nie ma więcej produktów \"na półkach\" do dodania");
        }
    }

    public void removeProduct(Product product) {
        if(this.getProductList().contains(product)) {
            this.productList.remove(product);
            product.setNoPieces(product.getNoPieces() + 1);
        } else {
            throw new IllegalArgumentException("Object nie znajduje się w koszyku");
        }
    }

    public double pay() {
        double result = 0d;
        for (Product entry : this.productList) {
            result = +entry.getPrice();
        }
        return result;
    }


    @Override
    public String toString() {
        return "ShoppingCart{" +
                "user=" + user +
                ", productList=" + productList +
                ", suma=" + pay() +
                '}';
    }
}
