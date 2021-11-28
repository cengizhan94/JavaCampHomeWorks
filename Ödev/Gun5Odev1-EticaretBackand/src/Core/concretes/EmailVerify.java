package Core.concretes;
import Core.abstracts.IVerify;
import Entities.concretes.User;

public class EmailVerify implements IVerify {

	@Override
	public void verify(User user) {
		System.out.println(user.getEmail() + "<- mail adresinize dogrulama baglantisi gonderildi.");
		
	}
	
	public void isEmailverify(User user) {
		System.out.println(user.getEmail() + "<- mail adresiniz dogrulandi.");
		
	}

}
