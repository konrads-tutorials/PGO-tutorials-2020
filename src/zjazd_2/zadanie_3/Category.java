package zjazd_2.zadanie_3;

import zjazd_2.zadanie_2.Product;

import java.util.ArrayList;

public class Category {

    private final static String MAIN_CATEGORY = "Pierwsza Kategoria Główna";

    private String categoryName;
    private ArrayList<Product> productList = new ArrayList<>();

    public Category() {
        this.categoryName = MAIN_CATEGORY;
    }

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public Category(String categoryName, ArrayList<Product> productList) {
        this.categoryName = categoryName;
        this.productList = productList;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product){
        this.productList.add(product);
    }

    public void removeProduct(Product product){
        this.productList.remove(product);
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                ", productList=" + productList +
                '}';
    }
}
