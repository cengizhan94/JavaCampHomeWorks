public class ProductManager {
    //Manager Sınıflar Asla Static Yapılmaz!
    public void Add(Product product){

        if(ProductValidator.isValidate(product)){
            System.out.println("Eklendi.");
        }else{
            System.out.println("Eklenemedi.");
        }

    }
}
