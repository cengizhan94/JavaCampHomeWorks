public class Main {

    public static void main(String[] args) {
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Pekiyi-Geçtiniz");
                break;
            case 'B':
                System.out.println("Ortalama-Geçtiniz");
                break;
            case 'C':
                System.out.println("Zor-Geçtiniz");
                break;
            case 'D':
                System.out.println("Neredeyse-Geçtiniz");
                break;
            case 'F':
                System.out.println("Kaldınız.");
                break;
            default:
                System.out.println("Geçersiz Karakter");
        }
    }
}
