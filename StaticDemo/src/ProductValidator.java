public class ProductValidator {
    //Static tanımlanırsa bellekten atılmaz.
    public static boolean isValidate(Product product){
        if(product.price > 0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
