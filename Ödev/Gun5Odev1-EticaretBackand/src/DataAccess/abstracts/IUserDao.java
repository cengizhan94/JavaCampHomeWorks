package DataAccess.abstracts;
import Entities.concretes.User;

public interface IUserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
}
