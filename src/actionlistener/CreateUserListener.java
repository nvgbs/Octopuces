package actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ihm.pageajoutcompte.PAddAccount;
import metier.user.UserRequest;

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

	private User getAddUser(ActionEvent e) throws Exception
	{
		User user = new User("Monsieur", "tset", "tset", "Nono" , "1603");
		
		String civility = pAddAccount.getComboBoxCivility().getSelectedItem().toString();
		
		String name = pAddAccount.getTextFieldName().getText();
		
		String firstName = pAddAccount.getTextFieldName().getText();
		
		String Login = pAddAccount.getTextFieldLogin().getText();
		
		//String password = pAddAccount.getPasswordFieldPassword().getText();
		
		
		
		Integer role;
		
		
		
		return UserRequest.addUser(user);
	}
	
	/*if (pAddAccount.getPasswordFieldPassword() != pAddAccount.getPasswordFieldPasswordRepeat())
	{
		pAddAccount.getLblPasswordFail().setText("Vos mots de passe ne correspondent pas");
	} else
	{
		user.setPassword(pAddAccount.getPasswordFieldPassword().getSelectedText());
		user.setCivility(pAddAccount.getComboBoxCivility().getSelectedItem().toString());
		user.setName(pAddAccount.getTextFieldName().getText());
		user.setFirstName(pAddAccount.getTextFieldFirstName().getText());
		user.setLogin(pAddAccount.getTextFieldLogin().getText());
		
	}*/
	
	
}
