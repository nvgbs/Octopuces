package actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import ihm.pagedesactivercompte.FrameDesactiverCompte;
import metier.advert.AdvertRequest;
import metier.user.UserRequest;
import model.user.User;

public class ValidateDisableUserListener implements ActionListener
{
	FrameDesactiverCompte frameDesactiverCompte;
	User user;
	
	public ValidateDisableUserListener(FrameDesactiverCompte frameDesactiverCompte, User user)
	{
		this.frameDesactiverCompte = frameDesactiverCompte;
		this.user = user;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == frameDesactiverCompte.getBtnYes())
		{
			try
			{
				if (frameDesactiverCompte.getUser().getAccountEnabled() == true)
				{	
					
				AdvertRequest.disableAdvertFromUser(frameDesactiverCompte.getUser().getId());	
				
				}
				
				UserRequest.disableEnableUser(frameDesactiverCompte.getUser());
				
				frameDesactiverCompte.dispose();
				
			} 
			catch (Exception e1)
			{
				
				e1.printStackTrace();
			}
		}
		else if (e.getSource() == frameDesactiverCompte.getBtnNo())
		{
			frameDesactiverCompte.dispose();
		}
		
	}

}
