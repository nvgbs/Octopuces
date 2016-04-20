package actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
			getDeleteUser();
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
		// TODO Auto-generated method stub
		
	}
	
}
