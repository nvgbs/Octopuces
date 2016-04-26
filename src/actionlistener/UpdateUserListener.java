package actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import ihm.pagemodifcompte.FrameModifCompte;
import metier.user.UserRequest;
import model.user.Role;
import model.user.User;

public class UpdateUserListener implements ActionListener
{

	private FrameModifCompte frameModifCompte;
	private User user;

	public UpdateUserListener(FrameModifCompte frameModifCompte, User user)
	{
		this.frameModifCompte = frameModifCompte;
		this.user = user;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == frameModifCompte.getButtonUpdateUser())
		{
			try
			{
				getUpdateUser(e);
			} catch (Exception e1)
			{
				e1.printStackTrace();
			}
		}
		else if (e.getSource() == frameModifCompte.getButtonCancel())
		{
			getCancel(e);
		}

	}

	private void getUpdateUser(ActionEvent e) throws Exception
	{

		ArrayList <User >listUser = (ArrayList<User>) UserRequest.getAllUser();
		
		
		
		Role admin = new Role (Role.NUM_ROLE_ADMINISTRATEUR, "Admin");
		Role moderator = new Role (Role.NUM_ROLE_MODERATEUR, "Moderateur");
		Role userRole = new Role (Role.NUM_ROLE_USER, "Utilisateur");
		
		String name = null;
		String firstName = null;
		String login = null;
		String password = null;
		Boolean allCheck = true;
		
		String civility = frameModifCompte.getComboBoxCivility().getSelectedItem().toString();

		
		
		
		if (frameModifCompte.getTextFieldName().getText().length() == 0)
		{
			frameModifCompte.getLblNameFail().setText("Ce champ doit être renseigné");
			allCheck = false;
		}
		if (frameModifCompte.getTextFieldFirstName().getText().length() == 0)
		{
			frameModifCompte.getLblFirstNameFail().setText("Ce champ doit être renseigné");
			allCheck = false;
		}
		if (frameModifCompte.getTextFieldLogin().getText().length() == 0)
		{
			frameModifCompte.getLblLoginFail().setText("Ce champ doit être renseigné");
			allCheck = false;
		}
		
		
		if ((frameModifCompte.getPasswordFieldPassword().getPassword().length < 4) || (frameModifCompte.getPasswordFieldPasswordRepeat().getPassword().length < 4))
		{
			frameModifCompte.getLblPasswordFail().setText("Le mot de passe doit comporté 4 caractères minimum");
			allCheck = false;
		}
		else if (!new String (frameModifCompte.getPasswordFieldPassword().getPassword()).equals(new String (frameModifCompte.getPasswordFieldPasswordRepeat().getPassword())))
		{
			frameModifCompte.getLblPasswordFail().setText("La confirmation du mot de passe est erroné");
			allCheck = false;
		}
		
		
		for (User userCheckLogin : listUser)
		{
			if (frameModifCompte.getTextFieldLogin().getText().equals(userCheckLogin.getLogin())&&(userCheckLogin.getId() != user.getId()))
			{
				frameModifCompte.getLblLoginFail().setText("Le login est déjà utilisé ");
				allCheck = false;
			}
		}		
		
		
		if (allCheck == true && frameModifCompte.getChckbxAdmin().isSelected())
		{
			name = frameModifCompte.getTextFieldName().getText();
			firstName = frameModifCompte.getTextFieldFirstName().getText();
			login = frameModifCompte.getTextFieldLogin().getText();
			password = new String (frameModifCompte.getPasswordFieldPassword().getPassword());
			
			user.setCivility(civility);
			user.setFirstName(firstName);
			user.setName(name);
			user.setLogin(login);
			user.setPassword(password);
			user.setRole(admin);
											
			
			UserRequest.updateUser(user);
			
			
			
		}
		else if ((allCheck == true) && (user.getRole().getId() == Role.NUM_ROLE_USER))
		{
			
			name = frameModifCompte.getTextFieldName().getText();
			firstName = frameModifCompte.getTextFieldFirstName().getText();
			login = frameModifCompte.getTextFieldLogin().getText();
			password = new String (frameModifCompte.getPasswordFieldPassword().getPassword());
			user.setCivility(civility);
			user.setFirstName(firstName);
			user.setName(name);
			user.setLogin(login);
			user.setPassword(password);
			user.setRole(userRole);
											
			
			UserRequest.updateUser(user);
		}
		
		else if (allCheck == true)
		{
			
			name = frameModifCompte.getTextFieldName().getText();
			firstName = frameModifCompte.getTextFieldFirstName().getText();
			login = frameModifCompte.getTextFieldLogin().getText();
			password = new String (frameModifCompte.getPasswordFieldPassword().getPassword());
			user.setCivility(civility);
			user.setFirstName(firstName);
			user.setName(name);
			user.setLogin(login);
			user.setPassword(password);
			user.setRole(moderator);
											
			
			UserRequest.updateUser(user);
		}
	
	}
		
		

	private void getCancel(ActionEvent e)
	{
		frameModifCompte.dispose();

	}
}
