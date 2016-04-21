package actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import base.dao.DaoFactory;
import ihm.pagesupprimercompte.FrameSupprimerCompte;

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
				DaoFactory.getDaoUser().delete(frameSupprimerCompte.getUser());
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
