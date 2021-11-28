import Business.concretes.PersonalUserManager;
import Business.concretes.UserManager;
import Core.abstracts.IVerify;
import Core.concretes.EmailVerify;
import Adapters.GoogleSignUpAdapter;
import DataAccess.concretes.HibernateUserDao;
import Entities.concretes.PersonalUser;
import Entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		PersonalUser personal1 = new PersonalUser();
		personal1.setId(1);
		personal1.setFirstName("CengizHan");
		personal1.setLastName("Uyar");
		personal1.setEmail("sonsair11@gmail.com");
		personal1.setPassword("123456");
		
		PersonalUser personal2 = new PersonalUser();
		personal2.setId(2);
		personal2.setFirstName("Zeynep");
		personal2.setLastName("Uyar");
		personal2.setEmail("zeynep11@gmail.com");
		personal2.setPassword("1234567890");
		
		PersonalUserManager manager = new PersonalUserManager(new HibernateUserDao(), new IVerify[] {new EmailVerify()}); 
			manager.add(personal1);
			manager.add(personal2, new GoogleSignUpAdapter()); //<- Google ile giriş yaparken isim soyisim google tarafından kontrol edilecek.Dolayisiyla burada google ile giris yapan kullanici bilgileri elle girilirse kabul edecektir.
			
			UserManager userManager = new UserManager();
			userManager.login(personal1);

	}

}
