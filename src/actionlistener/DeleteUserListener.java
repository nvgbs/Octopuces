package actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import base.dao.DaoFactory;
import ihm.pagesupprimercompte.FrameSupprimerCompte;
import ihm.tableaubord.PUser;
import model.user.User;

public class DeleteUserListener implements ActionListener
{

	private PUser pUser;
		
	public DeleteUserListener(PUser pUser)
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
		}
		else if (e.getSource() == pUser.getButtonUpdate())
		{
			getUpdateUser();
		}
	}

	private void getUpdateUser()
	{
		// TODO Auto-generated method stub
		
	}

	private void getDeleteUser()
	{
		
		new FrameSupprimerCompte(pUser.getUser()).setVisible(true);
				
	}
	
}
