public class Main {

    public static void main(String[] args) {
       CustomerManager customerManager = new CustomerManager(new MySqlServerDal());

       customerManager.add();



        }
    }
