public class Main {

    public static void main(String[] args) {
	    int number = -2;
        int remainder = number % 2;
        boolean isPrime = true;

        if(number == 1) {
            System.out.println("Sayı Asal Değildir");
            return;
        }

        else if(number<1){
            System.out.println("Geçersiz Sayı");
            return;
        }

     for(int i = 2; i<number; i++){
         if (number % i == 0){
             isPrime = false;
         }
     }
        if(isPrime){
            System.out.println("Sayı Asaldır :"+number);
        }
        else {
            System.out.println("Sayı Asal Değildir. :"+ number);
        }

    }
}
