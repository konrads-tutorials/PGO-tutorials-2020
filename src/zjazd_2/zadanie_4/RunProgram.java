package zjazd_2.zadanie_4;

import zjazd_2.zadanie_1.User;
import zjazd_2.zadanie_2.Product;
import zjazd_2.zadanie_3.Category;

import java.util.ArrayList;

public class RunProgram {

    public static void main(String[] args) {

        String name = "Jan";
        String surname = "Kowalski";
        String email = "jan.kowalski@wp.pl";
        String email2 = "jan.maria.kowalski@wp.pl";
        String email3 = "maria.kowalska@wp.pl";
        String password = "haslo1";

        User user_1 = new User(name, surname, email, password);
        User user_2 = new User(email2);
        User user_3 = new User(email3);

        user_3.changeFromGuestToUser("Maria", "Kawalska", "haselko2");


        Product product_1 = new Product("Kiełbasa Podwawelska", 12.11d, "A000001");
        Product product_2 = new Product("Masło", 42.19d, "B000022", 2);
        Product product_3 = new Product("Oliwa", 5.99d, "C0001233", 1);

        ShoppingCart cart_1 = new ShoppingCart();
        ShoppingCart cart_2 = new ShoppingCart(user_1);
        ShoppingCart cart_3 = new ShoppingCart(user_3, new ArrayList<>());

        try {
            cart_3.addProduct(product_2);
            cart_3.addProduct(product_2);
            cart_3.removeProduct(product_2);
            cart_2.addProduct(product_2);
            cart_2.removeProduct(product_2);
            cart_3.addProduct(product_2);
            cart_2.addProduct(product_3);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(cart_3.toString());
        System.out.println(cart_2.toString());
        System.out.println(cart_3.pay());
        System.out.println(cart_2.pay());

    }

}
