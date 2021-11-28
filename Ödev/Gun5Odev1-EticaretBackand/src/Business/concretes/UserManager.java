package Business.concretes;

import java.util.List;
import Business.abstracts.IUserService;
import Entities.concretes.User;

public class UserManager implements IUserService {

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void login(User user) {
		System.out.println("Giris Basarili");
		
	}

}
