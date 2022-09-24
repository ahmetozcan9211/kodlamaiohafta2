package classesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.name="Laptop";
        product.description="dizüstü bilgisayar";
        product.id=1;
        product.price = 2000;
        product.stockAmount = 3;


        ProductManager productManager = new ProductManager();
        productManager.Add(product);

    }
}
