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
		
	
	
	
	public static void addUser(User user) throws Exception
	{
		DaoFactory.getDaoUser().save(user);
	}
	
	public static void updateUser(User user) throws Exception
	{
		DaoFactory.getDaoUser().update(user);
	}
	
	public static void deleteUser(User user) throws Exception
	{
		DaoFactory.getDaoUser().delete(user);
		if (user.getContact() != null)
		{
			DaoFactory.getDaoContact().delete(user.getContact());
		}		
	}
	
	public static void disableEnableUser (User user) throws Exception
	{
		if (user.getAccountEnabled().booleanValue() == true)
		{
			user.setAccountEnabled(false);
		}
		else
		{
			user.setAccountEnabled(true);
		}
		DaoFactory.getDaoUser().update(user);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}//END
