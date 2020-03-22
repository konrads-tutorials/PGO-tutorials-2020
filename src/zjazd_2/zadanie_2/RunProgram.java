package zjazd_2.zadanie_2;

import zjazd_2.zadanie_1.User;

public class RunProgram {

    public static void main(String[] args) {

        Product product_1 = new Product("Kiełbasa Podwawelska", 12.11d, "A000001");
        Product product_2 = new Product("Masło", 42.19d, "B000022", 2);
        Product product_3 = new Product("Oliwa", 5.99d, "C0001233", 1);

        System.out.println(product_1.toString());
        System.out.println(product_2.toString());
        System.out.println(product_3.toString());

        product_2.setNoPieces(5);
        product_3.setPrice(6.99d);

        System.out.println(product_2.toString());
        System.out.println(product_3.toString());

    }

}
