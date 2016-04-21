package metier.user;

import java.util.List;

import base.dao.DaoFactory;
import model.user.User;

public class UserRequest
{

	
	
	public static List<User> getAllUser() throws Exception
	{
		return (List<User>) DaoFactory.getDaoUser().readAll(User.class);
	}
		
	
	
	
	public static User addUser(User user) throws Exception
	{
		return DaoFactory.getDaoUser().save(user);
	}
	
	public static User updateUser(User user) throws Exception
	{
		return DaoFactory.getDaoUser().update(user);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}//END
