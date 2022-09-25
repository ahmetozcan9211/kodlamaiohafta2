package classesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"asus bilgisayar","laptop bilgisayar",4,5,"kırmızı");
        /*product.set_name("laptop");
        product.set_description("dizüstü bilgisayar");
        product.set_id(1);
        product.set_price(2000);
        product.set_stockAmount(3);
        product.set_renk("kırmızı");*/


        ProductManager productManager = new ProductManager();
        productManager.Add(product);

       

    }
}
