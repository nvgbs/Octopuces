package actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ihm.pagedesactivercompte.FrameDesactiverCompte;
import ihm.pagemodifcompte.FrameModifCompte;
import ihm.pagesupprimercompte.FrameSupprimerCompte;
import ihm.tableaubord.PUser;

public class UserListener implements ActionListener
{

	private PUser pUser;

	public UserListener(PUser pUser)
	{
		this.pUser = pUser;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == pUser.getButtonDelete())
		{
			try
			{
				getDeleteUser();
			} catch (Exception e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (e.getSource() == pUser.getButtonUpdate())
		{
			getUpdateUser();
		} else if (e.getSource() == pUser.getButtonDisable())
		{
			getDisableUser();
		}
	}

	private void getUpdateUser()
	{
		new FrameModifCompte(pUser.getUser()).setVisible(true);
	}

	private void getDeleteUser()
	{
		new FrameSupprimerCompte(pUser.getUser()).setVisible(true);
	}

	private void getDisableUser()
	{
		new FrameDesactiverCompte(pUser.getUser()).setVisible(true);
	}

}
