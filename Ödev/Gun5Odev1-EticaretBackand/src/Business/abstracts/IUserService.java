package Business.abstracts;
import java.util.List;
import Entities.concretes.User;

public interface IUserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	List<User>getAll();
	void login(User user);
}
