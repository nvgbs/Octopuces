package metier.user;

import java.awt.BorderLayout;
import java.util.List;

import base.dao.DaoFactory;
import ihm.tableaubord.PAllUser;
import ihm.tableaubord.PCenterPanel;
import model.user.User;

public class UserRequest
{
	public static List<User> getAllUser() throws Exception
	{
		return (List<User>) DaoFactory.getDaoUser().readAll(User.class);
	}
	
	public static List<User> getUserByRole(Integer stateValue) throws Exception
	{
		return (List<User>) DaoFactory.getDaoUser().readByRole(stateValue);
	}
	
	
	
	public static void addUser(User user) throws Exception
	{
		DaoFactory.getDaoUser().save(user);
	}
	
	public static void updateUser(User user) throws Exception
	{
		DaoFactory.getDaoUser().update(user);
	}
	
	public static void deleteUser(User user, PCenterPanel centerPanel) throws Exception
	{
		DaoFactory.getDaoUser().delete(user);
		if (user.getContact() != null)
		{
			DaoFactory.getDaoContact().delete(user.getContact());
		}		
		
		
		PAllUser pAllUser = new PAllUser (PCenterPanel.TITLE_LIST_USER, centerPanel.getAdmin());
		
		centerPanel.removeAll();
		centerPanel.add(pAllUser, BorderLayout.CENTER);
		centerPanel.updateUI();	
	}
	
	public static void disableEnableUser (User user, PCenterPanel centerPanel) throws Exception
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
		
		PAllUser pAllUser = new PAllUser (PCenterPanel.TITLE_LIST_USER, centerPanel.getAdmin());
		
		centerPanel.removeAll();
		centerPanel.add(pAllUser, BorderLayout.CENTER);
		centerPanel.updateUI();	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}//END
