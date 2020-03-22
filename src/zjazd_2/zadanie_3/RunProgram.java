package zjazd_2.zadanie_3;

import zjazd_2.zadanie_2.Product;

import java.util.ArrayList;
import java.util.List;

public class RunProgram {

    public static void main(String[] args) {

        Product product_1 = new Product("Kiełbasa Podwawelska", 12.11d, "A000001");
        Product product_2 = new Product("Masło", 42.19d, "B000022", 2);
        Product product_3 = new Product("Oliwa", 5.99d, "C0001233", 1);

        ArrayList<Product> pustaListaProduktow = new ArrayList<>();

        Category category_1 = new Category();
        Category category_2 = new Category("Druga Kategoria");
        Category category_3 = new Category("Trzecia Kategoria", pustaListaProduktow);

        category_1.addProduct(product_1);
        category_2.addProduct(product_2);
        category_3.addProduct(product_3);

        System.out.println(category_1.toString());
        System.out.println(category_2.toString());
        System.out.println(category_3.toString());

        category_3.removeProduct(product_3);
        System.out.println(category_3.toString());

    }

}
