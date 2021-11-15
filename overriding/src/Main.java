public class Main {

    public static void main(String[] args) {
	    KrediManager krediManager = new KrediManager();
        krediManager.krediTuru(new BaseKrediManager());
        System.out.println(krediManager.krediTuru(new BaseKrediManager()));
        BaseKrediManager[] baseKrediManagers = new BaseKrediManager[] {new TarımKrediManager() , new OgretmenKrediManager(),new OgrenciKrediManager()};

             for (BaseKrediManager manager : baseKrediManagers) {
                 System.out.println(manager.hesapla(1000));

             }



        }
    }

