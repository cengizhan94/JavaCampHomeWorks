public class Main {

    public static void main(String[] args) {
	    String[] ogrenciler = new String[4];
        ogrenciler[0] = "Cengiz";
        ogrenciler[1] = "Zeynep";
        ogrenciler[2] = "Pervin";
        ogrenciler[3] = "Yeni Öğrenci : Zehra";

        for(int i = 0; i<ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }
        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}
