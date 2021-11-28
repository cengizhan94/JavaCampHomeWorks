package Adapters;
import Core.abstracts.ISignUpService;
import GoogleLogin.Login;

public class GoogleSignUpAdapter implements ISignUpService {

	@Override
	public void signUp(String message) {
		Login login= new Login();
		login.login(message);
		
	}

}
