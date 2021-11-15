public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[] {1,2,3,4,5,6};
        int aranacak = 0;
            boolean varMi = false;
        for(int sayi : sayilar){
            if(sayi == aranacak){
                varMi = true;
                break;
            }
        }
        if(varMi){
            System.out.println("Sayı Bulundu");
        }else{
            System.out.println("Sayı Bulunamadı");

        }
    }
}
