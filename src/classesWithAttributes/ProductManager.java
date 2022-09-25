package classesWithAttributes;

public class ProductManager {
    public void Add(Product product){
        System.out.println("ürün eklndi " + product.get_name());
        System.out.println("ürün eklndi " + product.get_id());
    }

    public void Add2(int id){}

}
