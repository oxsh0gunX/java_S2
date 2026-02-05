public class Product {
    int pcode;
    String pname;
    double price;

    Product(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    public static void main(String[] args) {
        Product product1 = new Product(101, "Laptop", 75000);
        Product product2 = new Product(102, "Smartphone", 25000);
        Product product3 = new Product(103, "Tablet", 30000);

        Product[] products = {product1, product2, product3};
        Product lowestPriceProduct = products[0];

        for (Product p : products) {
            if (p.price < lowestPriceProduct.price) {
                lowestPriceProduct = p;
            }
        }

        System.out.println("Product with the lowest price:");
        System.out.println("Code: " + lowestPriceProduct.pcode);
        System.out.println("Name: " + lowestPriceProduct.pname);
        System.out.println("Price: " + lowestPriceProduct.price);
    }
}
