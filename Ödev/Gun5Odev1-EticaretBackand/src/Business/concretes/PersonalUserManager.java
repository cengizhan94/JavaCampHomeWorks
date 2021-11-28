package Business.concretes;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import Core.abstracts.ISignUpService;
import Core.abstracts.IVerify;
import Core.concretes.Utils;
import DataAccess.abstracts.IUserDao;
import Entities.concretes.PersonalUser;

public class PersonalUserManager extends UserManager {
	private IUserDao userDao;
	private IVerify[] verifies;
	public PersonalUserManager(IUserDao userDao, IVerify[] verifies) {
		
		this.userDao = userDao;
		this.verifies = verifies;
	}
	
	String regex = "^(.+)@(.+)\\.(.+)$";
	Pattern pattern = Pattern.compile(regex);
	
	List<String> checkListEmails=new ArrayList<String>();
	
	public void add(PersonalUser personalUser) {
		if(personalUser.getPassword().length() < 6) {
			System.out.println("Sifreniz 6 karakterden kucuk olamaz");
			return;
		}else if(pattern.matcher(personalUser.getEmail()).matches()==false) {
			System.out.println("Yazdiginiz e-mail adresi gecersizdir.");
			return;
		}else if(personalUser.getFirstName().length() < 2) {
			System.out.println("Isminiz 2 karakterden az olamaz.");
			return;
		}else if(personalUser.getLastName().length() < 2) {
			System.out.println("Soyisminiz 2 karakterden az olamaz");
			return;
		}
		checkListEmails.add(personalUser.getEmail());
		userDao.add(personalUser);
		Utils.runVerify(verifies, personalUser);
		
		
	}
	public void add(PersonalUser personalUser, ISignUpService signUpService) {
		signUpService.signUp("Google ile giris yapildi : " + personalUser.getFirstName());
		userDao.add(personalUser);
	}
	
	public void update(PersonalUser personalUser) {
		
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
