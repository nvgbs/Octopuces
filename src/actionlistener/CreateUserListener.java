package actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import ihm.pageajoutcompte.FrameAjoutCompte;
import ihm.tableaubord.MainFrame;
import metier.user.UserRequest;
import model.user.Role;
import model.user.User;

public class CreateUserListener implements ActionListener, MouseListener
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

	
	
	
	public void mouseClicked(MouseEvent e) 
	{
		if (e.getSource() == frameAjoutCompte.getTextFieldName())
		{
			frameAjoutCompte.getLblNameFail().setText("");
		}
		else if (e.getSource() == frameAjoutCompte.getTextFieldFirstName())
		{
			frameAjoutCompte.getLblFirstNameFail().setText("");
		}
		else if (e.getSource() == frameAjoutCompte.getTextFieldLogin())
		{
			frameAjoutCompte.getLblLoginFail().setText("");
		}
		else if (e.getSource() == frameAjoutCompte.getPasswordFieldPassword())
		{
			frameAjoutCompte.getLblPasswordFail().setText("");
		}
		else if (e.getSource() == frameAjoutCompte.getPasswordFieldPasswordRepeat())
		{
			frameAjoutCompte.getLblPasswordFail().setText("");
		}
	}
	
	
	
	
	
	
	private void getAddUser(ActionEvent e) throws Exception
	{
		
		ArrayList <User >listUser = (ArrayList<User>) UserRequest.getAllUser();
		
		
				
		Role admin = new Role (Role.NUM_ROLE_ADMINISTRATEUR, "Admin");
		Role moderator = new Role (Role.NUM_ROLE_MODERATEUR, "Moderateur");
		
		String name = null;
		String firstName = null;
		String login = null;
		String password = null;
		Boolean allCheck = true;
		
		String civility = frameAjoutCompte.getComboBoxCivility().getSelectedItem().toString();

		
		
		
		if (frameAjoutCompte.getTextFieldName().getText().length() == 0)
		{
			frameAjoutCompte.getLblNameFail().setText("Ce champ doit être renseigné");
			allCheck = false;
		}
		if (frameAjoutCompte.getTextFieldFirstName().getText().length() == 0)
		{
			frameAjoutCompte.getLblFirstNameFail().setText("Ce champ doit être renseigné");
			allCheck = false;
		}
		if (frameAjoutCompte.getTextFieldLogin().getText().length() == 0)
		{
			frameAjoutCompte.getLblLoginFail().setText("Ce champ doit être renseigné");
			allCheck = false;
		}
		
		
		if ((frameAjoutCompte.getPasswordFieldPassword().getPassword().length < 4) || (frameAjoutCompte.getPasswordFieldPasswordRepeat().getPassword().length < 4))
		{
			frameAjoutCompte.getLblPasswordFail().setText("Le mot de passe doit comporté 4 caractères minimum");
			allCheck = false;
		}
		else if (!new String (frameAjoutCompte.getPasswordFieldPassword().getPassword()).equals(new String (frameAjoutCompte.getPasswordFieldPasswordRepeat().getPassword())))
		{
			frameAjoutCompte.getLblPasswordFail().setText("La confirmation du mot de passe est erroné");
			allCheck = false;
		}
		
		
		for (User userCheckLogin : listUser)
		{
			if (frameAjoutCompte.getTextFieldLogin().getText().equals(userCheckLogin.getLogin()))
			{
				frameAjoutCompte.getLblLoginFail().setText("Le login est déjà utilisé ");
				allCheck = false;
			}
		}		
		
		
		if (allCheck == true && frameAjoutCompte.getChckbxAdmin().isSelected())
		{
			name = frameAjoutCompte.getTextFieldName().getText();
			firstName = frameAjoutCompte.getTextFieldFirstName().getText();
			login = frameAjoutCompte.getTextFieldLogin().getText();
			password = new String (frameAjoutCompte.getPasswordFieldPassword().getPassword());
			
			User user = new User(civility, firstName, name, login , password, admin);								
			
			UserRequest.addUser(user, MainFrame.getCenterPanel());
			
			frameAjoutCompte.dispose();
			
			
			
		}
		else if (allCheck == true)
		{
			name = frameAjoutCompte.getTextFieldName().getText();
			firstName = frameAjoutCompte.getTextFieldFirstName().getText();
			login = frameAjoutCompte.getTextFieldLogin().getText();
			password = new String (frameAjoutCompte.getPasswordFieldPassword().getPassword());
			
			User user = new User(civility, firstName, name, login , password, moderator);								
			
			UserRequest.addUser(user, MainFrame.getCenterPanel());
			
			frameAjoutCompte.dispose();
			
			
			
		}	
	
	}

	
	
	
	
	
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
