package actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ihm.pageajoutcompte.FrameAjoutCompte;
import metier.user.UserRequest;

import model.user.User;

public class CreateUserListener implements ActionListener
{

	private FrameAjoutCompte frameAjoutCompte;

	public CreateUserListener(FrameAjoutCompte frameAjoutCompte)
	{
		this.frameAjoutCompte = frameAjoutCompte;
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == frameAjoutCompte.getButtonAddUser())
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
		
		
		
		String civility = frameAjoutCompte.getComboBoxCivility().getSelectedItem().toString();
			
			if (frameAjoutCompte.getTextFieldName().getText().length() > 0)
			{
				name = frameAjoutCompte.getTextFieldName().getText();
				
				if (frameAjoutCompte.getTextFieldFirstName().getText().length() > 0)
				{
					firstName = frameAjoutCompte.getTextFieldName().getText();
					
					if (frameAjoutCompte.getTextFieldLogin().getText().length() > 0)
					{
						login = frameAjoutCompte.getTextFieldLogin().getText();
						
						if ((frameAjoutCompte.getPasswordFieldPassword().getPassword().length > 0) && (frameAjoutCompte.getPasswordFieldPasswordRepeat().getPassword().length > 0))					
						{
							
							if (new String (frameAjoutCompte.getPasswordFieldPassword().getPassword()).equals(new String (frameAjoutCompte.getPasswordFieldPasswordRepeat().getPassword())))
							{
								password = new String (frameAjoutCompte.getPasswordFieldPassword().getPassword());								
								
								User user = new User(civility, firstName, name, login , password);								
								
								UserRequest.addUser(user);
								frameAjoutCompte.removeAll();
							}
							else
							{
								frameAjoutCompte.getLblPasswordFail().setText("Vos mots de passe ne correspondent pas");
							}					
						}
						else
						{
							frameAjoutCompte.getLblPasswordFail().setText("Un des champs n'est pas renseigné");
						}						
					}
					else
					{
						frameAjoutCompte.getLblLoginFail().setText("Ce champ doit être renseigné");
					}
				}
				else
				{
					frameAjoutCompte.getLblFirstNameFail().setText("Ce champ doit être renseigné");
				}
			}
			else
			{
				frameAjoutCompte.getLblNameFail().setText("Ce champ doit être renseigné");
			}
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	/*if (frameAjoutCompte.getPasswordFieldPassword() != frameAjoutCompte.getPasswordFieldPasswordRepeat())
	{
		frameAjoutCompte.getLblPasswordFail().setText("Vos mots de passe ne correspondent pas");
	} else
	{
		user.setPassword(frameAjoutCompte.getPasswordFieldPassword().getSelectedText());
		user.setCivility(frameAjoutCompte.getComboBoxCivility().getSelectedItem().toString());
		user.setName(frameAjoutCompte.getTextFieldName().getText());
		user.setFirstName(frameAjoutCompte.getTextFieldFirstName().getText());
		user.setLogin(frameAjoutCompte.getTextFieldLogin().getText());
		
	}*/
	
	
}
