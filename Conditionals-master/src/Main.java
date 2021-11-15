public class Main {

    public static void main(String[] args) {
	    int sayi1 = 4120;
        int sayi2 = 6210;
        int sayi3 = 5440;
        int enbuyuk = sayi1;

        if(sayi1 < sayi2 && sayi3<sayi2){
            enbuyuk = sayi2;


        }
        else if(sayi1 < sayi3 && sayi2 < sayi3){
            enbuyuk = sayi3;

        }
        else{
            enbuyuk = sayi1;
        }







        System.out.println("Enbüyük sayi = "+ enbuyuk);













    }
}
