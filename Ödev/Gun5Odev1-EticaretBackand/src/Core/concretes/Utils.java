package Core.concretes;
import Core.abstracts.IVerify;
import Entities.concretes.User;

public class Utils {
	public static void runVerify(IVerify[] verifies, User user) {
		for (IVerify verify : verifies) {
			verify.verify(user);
		}
	}
}
