package actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import ihm.pageconnexion.FrameLogin;
import ihm.tableaubord.MainFrame;
import metier.user.UserRequest;
import model.user.Role;
import model.user.User;




public class ActionListenerLogin implements ActionListener, MouseListener
{

	private FrameLogin frameLogin = null;
	
	
	public ActionListenerLogin(FrameLogin frameLogin)
	{
		this.frameLogin = frameLogin;		
	}
	
	
	
	
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == frameLogin.getBtnLogin())
		{
			try
			{
				getActionLogin();				
			} 
			catch (Exception e1) 
			{
				
				e1.printStackTrace();
			}
		}
	}
	
	
	
	public void mouseClicked(MouseEvent e) 
	{
		if (e.getSource() == frameLogin.getTextFieldLogin())
		{
			frameLogin.getLblLoginFail().setText("");
		}
		else if (e.getSource() == frameLogin.getTextFieldPassword())
		{
			frameLogin.getLblPasswordFail().setText("");
		}
	}
	
	
	
	



	public void getActionLogin() throws Exception
	{
		
		ArrayList <User >listUser = (ArrayList<User>) UserRequest.getAllUser();
		String login = frameLogin.getTextFieldLogin().getText();
		String password =  new String (frameLogin.getTextFieldPassword().getPassword());
		Boolean admin = false;
		Boolean launchTest = true;
		Boolean booleanDeJu = false;
		
		
		
		
		if (login.length() == 0 && password.length() == 0)
		{
			frameLogin.getLblLoginFail().setText("Veuillez renseigner un Login !");
			frameLogin.getLblPasswordFail().setText("Veuillez renseigner un mot de passe !");
			launchTest = false;
		}
		else if (login.length() == 0 && password.length() > 0)
		{
			frameLogin.getLblLoginFail().setText("Veuillez renseigner un Login !");
			launchTest = false;
		}
		else if (login.length() > 0 && password.length() == 0)
		{
			frameLogin.getLblPasswordFail().setText("Veuillez renseigner un mot de passe !");
			launchTest = false;
		}
		
		
		
		if (launchTest == true)
		{		
			for (User user : listUser) 
			{	
				
				
				if (login.equals(user.getLogin()) && (password.equals(user.getPassword()) && user.getRole().getId() == Role.NUM_ROLE_USER))
				{
					frameLogin.getLblLoginFail().setText("Accés refusé, vous n'avez pas les droits requis !");
					booleanDeJu = true;
				}
				else if (login.equals(user.getLogin()) && (password.equals(user.getPassword()) && user.getRole().getId() == Role.NUM_ROLE_ADMINISTRATEUR))
				{
					admin = true;
					frameLogin.dispose();
					new MainFrame(admin).setVisible(true);
				
				}
				else if (login.equals(user.getLogin()) && (password.equals(user.getPassword()) && user.getRole().getId() == Role.NUM_ROLE_MODERATEUR))
				{				
					frameLogin.dispose();
					new MainFrame(admin).setVisible(true);
				}
				else if (booleanDeJu == false)
				{
					frameLogin.getLblLoginFail().setText("Login ou mot de passe incorrect !");
				}
				
			}
			
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
	
	
	
	
	
	
	
	
	
	
	
	
}//END
