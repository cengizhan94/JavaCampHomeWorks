public class Main {

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1); //<_id
        product.setDescription("Casper");
        product.setPrice(5000);
        product.setStockAmount(3);
        product.setRenk("Kırmızı");
        product.setKod("300");


        manager.Add(product);

    }
}
