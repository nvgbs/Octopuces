package actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import base.dao.DaoFactory;
import ihm.pagedesactivercompte.FrameDesactiverCompte;
import metier.user.UserRequest;

public class ValidateDisableUserListener implements ActionListener
{
	FrameDesactiverCompte frameDesactiverCompte;
	
	public ValidateDisableUserListener(FrameDesactiverCompte frameDesactiverCompte)
	{
		this.frameDesactiverCompte = frameDesactiverCompte;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == frameDesactiverCompte.getBtnYes())
		{
			try
			{
				UserRequest.disableEnableUser(frameDesactiverCompte.getUser());
				
			} catch (Exception e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if (e.getSource() == frameDesactiverCompte.getBtnNo())
		{
			frameDesactiverCompte.dispose();
		}
		
	}

}
