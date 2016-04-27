package actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ihm.pagesupprimercompte.FrameSupprimerCompte;
import ihm.tableaubord.MainFrame;
import ihm.tableaubord.PCenterPanel;
import ihm.tableaubord.PLeftPanel;
import metier.user.UserRequest;

public class ValidateDeleteUserListener implements ActionListener
{
	FrameSupprimerCompte frameSupprimerCompte;
	
	public ValidateDeleteUserListener(FrameSupprimerCompte frameSupprimerCompte)
	{
		this.frameSupprimerCompte = frameSupprimerCompte;
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == frameSupprimerCompte.getBtnYes())
		{
			try
			{
				UserRequest.deleteUser(frameSupprimerCompte.getUser(), MainFrame.getCenterPanel());
				frameSupprimerCompte.dispose();
				
			} catch (Exception e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if (e.getSource() == frameSupprimerCompte.getBtnNo())
		{
			frameSupprimerCompte.dispose();
		}
		
	}

}
