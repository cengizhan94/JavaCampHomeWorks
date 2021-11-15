public class Main {

    public static void main(String[] args) {
         sil(); güncelle();

        String mesaj =("Bugün Hava Çok Güzel.");
        String yenimesaj=sehirVer();
        System.out.println(yenimesaj);
        int sayi = topla(15,7,1,3,5,6,200);
        System.out.println(sayi);

    }

    public static String sehirVer(){
        return "Eklendi";
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void güncelle(){
        System.out.println("Güncellendi");
    }
    public static int topla(int... sayilar){
        int toplam=0;
        for(int sayi : sayilar){
            toplam = toplam+=sayi;
        }
        return toplam;
    }

}
