package actionlistener;

import java.awt.event.ActionEvent;

import ihm.pageconnexion.PRightLogin;


public class ActionListenerLogin 
{

	PRightLogin pRightLogin = null;
	
	
	
	public ActionListenerLogin(ActionEvent e)
	{
				
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == pRightLogin.getBtnLogin())
		{
			getActionLogin (e);
		}
	}
	
	
	
	
	
	
	public void getActionLogin (ActionEvent e)
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}//END
