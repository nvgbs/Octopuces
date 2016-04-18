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
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//END
