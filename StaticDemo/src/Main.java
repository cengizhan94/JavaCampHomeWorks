public class Main {

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.name = "Mause";
        product.id = 1;
        product.price = 40;
        manager.Add(product);

        DatabaseHelper.Connection.createConnection();
    }
}
