package actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import ihm.pageconnexion.FrameLogin;
import ihm.tableaubord.PMainPanel;
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
		
		
		
		for (User user : listUser) 
		{
			if (login.length() == 0 && password.length() == 0)
			{
				frameLogin.getLblLoginFail().setText("Veuillez renseigner un Login !");
				frameLogin.getLblPasswordFail().setText("Veuillez renseigner un mot de passe !");
			}
			else if (login.length() == 0 && password.length() > 0)
			{
				frameLogin.getLblLoginFail().setText("Veuillez renseigner un Login !");
			}
			else if (login.length() > 0 && password.length() == 0)
			{
				frameLogin.getLblPasswordFail().setText("Veuillez renseigner un mot de passe !");
			}
			else
			{
				frameLogin.getLblLoginFail().setText("Login ou mot de passe incorrect !");
			}
			
			
			
			
			
			if (login.equals(user.getLogin()) && (password.equals(user.getPassword()) && user.getRole().getId() == Role.NUM_ROLE_USER))
			{
				frameLogin.getLblLoginFail().setText("Accés refusé, vous n'avez pas les droits requis !");
			}
			else if (login.equals(user.getLogin()) && (password.equals(user.getPassword()) && user.getRole().getId() != Role.NUM_ROLE_USER))
			{
				frameLogin.dispose();
				new PMainPanel().setVisible(true);
				
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
