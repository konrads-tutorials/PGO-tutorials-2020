package zjazd_2.zadanie_2;

public class Product {

    private String name;
    private double price;
    private String productCode;
    private int noPieces;

    public Product(String name, double price, String productCode) {
        if(name==null || productCode==null){
            throw new IllegalArgumentException("Name, ProductCode muszą zostac podane");
        }
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.noPieces = 0;
    }

    public Product(String name, double price, String productCode, int noPieces) {
        if(name==null || productCode==null){
            throw new IllegalArgumentException("Name, ProductCode muszą zostac podane");
        }
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.noPieces = noPieces;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductCode() {
        return productCode;
    }

    public int getNoPieces() {
        return noPieces;
    }

    public void setNoPieces(int noPieces) {
        if(noPieces>=0) {
            this.noPieces = noPieces;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", productCode='" + productCode + '\'' +
                ", noPieces=" + noPieces +
                '}';
    }
}
