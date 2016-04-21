package actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ihm.pageajoutcompte.PAddAccount;
import metier.user.UserRequest;
import model.user.Role;
import model.user.User;

public class CreateUserListener implements ActionListener
{

	private PAddAccount pAddAccount;

	public CreateUserListener(PAddAccount pAddAccount)
	{
		this.pAddAccount = pAddAccount;
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == pAddAccount.getButtonAddUser())
		{
			try
			{
				getAddUser(e);
			} catch (Exception e1)
			{
				e1.printStackTrace();
			}
		}
	}

	private void getAddUser(ActionEvent e) throws Exception
	{
		
		
		String name = null;
		String firstName = null;
		String login = null;
		String password = null;
		
		
		
		
		String civility = pAddAccount.getComboBoxCivility().getSelectedItem().toString();
			
			if (pAddAccount.getTextFieldName().getText().length() > 0)
			{
				name = pAddAccount.getTextFieldName().getText();
				
				if (pAddAccount.getTextFieldFirstName().getText().length() > 0)
				{
					firstName = pAddAccount.getTextFieldName().getText();
					
					if (pAddAccount.getTextFieldLogin().getText().length() > 0)
					{
						login = pAddAccount.getTextFieldLogin().getText();
						
						if ((pAddAccount.getPasswordFieldPassword().getPassword().length > 0) && (pAddAccount.getPasswordFieldPasswordRepeat().getPassword().length > 0))					
						{
							
							if (new String (pAddAccount.getPasswordFieldPassword().getPassword()).equals(new String (pAddAccount.getPasswordFieldPasswordRepeat().getPassword())))
							{
								if (pAddAccount.getChckbxAdmin().isSelected())
								{
									
									Role admin = new Role (Role.NUM_ROLE_ADMINISTRATEUR, "Admin");
									
									password = new String (pAddAccount.getPasswordFieldPassword().getPassword());								
									
									User user = new User(civility, firstName, name, login , password, admin);								
									
									UserRequest.addUser(user);
									
									pAddAccount.removeAll();
								}
								else
								{
									Role moderator = new Role (Role.NUM_ROLE_MODERATEUR, "Moderateur");
									
									password = new String (pAddAccount.getPasswordFieldPassword().getPassword());								
									
									User user = new User(civility, firstName, name, login , password , moderator);								
									
									UserRequest.addUser(user);
									
									pAddAccount.removeAll();
								}
								
								
							}
							else
							{
								pAddAccount.getLblPasswordFail().setText("Vos mots de passe ne correspondent pas");
							}					
						}
						else
						{
							pAddAccount.getLblPasswordFail().setText("Un des champs n'est pas renseigné");
						}						
					}
					else
					{
						pAddAccount.getLblLoginFail().setText("Ce champ doit être renseigné");
					}
				}
				else
				{
					pAddAccount.getLblFirstNameFail().setText("Ce champ doit être renseigné");
				}
			}
			else
			{
				pAddAccount.getLblNameFail().setText("Ce champ doit être renseigné");
			}
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
