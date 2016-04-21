package actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ihm.pagemodifcompte.FrameModifCompte;
import metier.user.UserRequest;
import model.user.User;

public class UpdateUserListener implements ActionListener
{

	private FrameModifCompte frameModifCompte;
	private User user;
	
	public UpdateUserListener(FrameModifCompte frameModifCompte)
	{
		this.frameModifCompte = frameModifCompte;		
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == frameModifCompte.getButtonUpdateUser())
		{
			getUpdateUser(e);
		}
		else if (e.getSource() == frameModifCompte.getButtonCancel())
		{
			getCancel(e);
		}
	
}
	
	private void getUpdateUser(ActionEvent e)
	{
		String civility = null;
		String name = null;
		String firstName = null;
		String login = null;
		String password = null;
		
		civility = frameModifCompte.getComboBoxCivility().getSelectedItem().toString();
		if (frameModifCompte.getTextFieldName().getText().length() > 0)
		{
			name = frameModifCompte.getTextFieldName().getText();
			
			if (frameModifCompte.getTextFieldFirstName().getText().length() > 0)
			{
				firstName = frameModifCompte.getTextFieldName().getText();
				
				if (frameModifCompte.getTextFieldLogin().getText().length() > 0)
				{
					login = frameModifCompte.getTextFieldLogin().getText();
					
					if ((frameModifCompte.getPasswordFieldPassword().getPassword().length > 0) && (frameModifCompte.getPasswordFieldPasswordRepeat().getPassword().length > 0))					
					{
						
						if (new String (frameModifCompte.getPasswordFieldPassword().getPassword()).equals(new String (frameModifCompte.getPasswordFieldPasswordRepeat().getPassword())))
						{
							password = new String (frameModifCompte.getPasswordFieldPassword().getPassword());								
							
							user.setCivility(civility);
							user.setFirstName(firstName);
							user.setName(name);
							user.setLogin(login);
							user.setPassword(password);
														
							try
							{
								UserRequest.updateUser(user);
							} catch (Exception e1)
							{
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							frameModifCompte.removeAll();
						}
						else
						{
							frameModifCompte.getLblPasswordFail().setText("Vos mots de passe ne correspondent pas");
						}					
					}
					else
					{
						frameModifCompte.getLblPasswordFail().setText("Un des champs n'est pas renseigné");
					}						
				}
				else
				{
					frameModifCompte.getLblLoginFail().setText("Ce champ doit être renseigné");
				}
			}
			else
			{
				frameModifCompte.getLblFirstNameFail().setText("Ce champ doit être renseigné");
			}
		}
		else
		{
			frameModifCompte.getLblNameFail().setText("Ce champ doit être renseigné");
		}
		
	}
	
	private void getCancel(ActionEvent e)
	{
		frameModifCompte.dispose();
		
	}
}
