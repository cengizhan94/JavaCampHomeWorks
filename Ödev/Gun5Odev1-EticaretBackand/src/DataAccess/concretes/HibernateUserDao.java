package DataAccess.concretes;

import DataAccess.abstracts.IUserDao;
import Entities.concretes.User;

public class HibernateUserDao implements IUserDao {

	@Override
	public void add(User user) {
		System.out.println("id'si : " + user.getId() + " olan kullanici hibernate ile eklendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("id'si : " + user.getId() + "olan kullanici hibernate ile silindi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println("id'si" + user.getId() + "olan kullanici hibernate ile güncellendi");
		
	}

}
