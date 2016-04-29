package actionlistener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import ihm.tableaubord.PCenterPanel;
import ihm.tableaubord.PLeftPanel;
import ihm.pageajoutcompte.FrameAjoutCompte;
import ihm.tableaubord.PAllAdvert;
import ihm.tableaubord.PAllUser;
import ihm.tableaubord.PBoardTable;
import model.advert.Advert;

public class ActionMenuListener implements ActionListener, MouseListener
{

	private PLeftPanel leftPanel = null;
	private PCenterPanel centerPanel = null;
	
	
	public ActionMenuListener (PLeftPanel leftPanel, PCenterPanel centerPanel)
	{
		this.leftPanel = leftPanel;
		this.centerPanel = centerPanel;
		
	}




	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == leftPanel.getDisconnectBtn())
		{
			getActionDisconnect(e);
		}
		else if (e.getSource() == leftPanel.getWaitAdvertBtn())
		{
			try {
				getActionWaitAdvertBtn (e);
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
		}
		else if (e.getSource() == leftPanel.getCheckAdvertBtn())
		{
			try {
				getActionCheckAdvertBtn(e);
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
		}
		else if (e.getSource() == leftPanel.getRefuseAdvertBtn())
		{
			try {
				getActionRefuseAdvertBtn (e);
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
		}
		else if (e.getSource() == leftPanel.getBoardTableBtn())
		{
			try {
				getActionBoardTableBtn(e);
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
		}
		else if (e.getSource() == leftPanel.getListUserBtn())
		{
			try 
			{
				getActionListUserBtn (e);
			} 
			catch (Exception e1) 
			{				
				e1.printStackTrace();
			}
		}
		else if (e.getSource() == leftPanel.getCreateUserBtn())
		{
			try
			{
				getActionCreateUserBtn (e);
			}
			catch (Exception e1)
			{
				e1.printStackTrace();
			}
		}
	}
	
	
	
	
	
	




	
	public void getActionDisconnect(ActionEvent e)
	{
		System.exit(1);
	}
	
	
	
	public void getActionWaitAdvertBtn (ActionEvent e) throws Exception
	{
		PAllAdvert pAllAdvert = new PAllAdvert(PCenterPanel.TITLE_WAIT, Advert.WAIT_STATE);
		
		centerPanel.removeAll();
		centerPanel.add(pAllAdvert, BorderLayout.CENTER);
		centerPanel.updateUI();
		
		
	}
	
	
	public void getActionCheckAdvertBtn (ActionEvent e) throws Exception
	{
		
		PAllAdvert pAllAdvert1 = new PAllAdvert(PCenterPanel.TITLE_VALIDATE, Advert.VALIDATE_STATE);
		
		centerPanel.removeAll();
		centerPanel.add(pAllAdvert1, BorderLayout.CENTER);
		centerPanel.updateUI();
		
				
	} 
	
	
	
	public void getActionRefuseAdvertBtn (ActionEvent e) throws Exception
	{
		PAllAdvert pAllAdvert2 = new PAllAdvert(PCenterPanel.TITLE_DESACTIVED, Advert.UNVALIDATE_STATE);
		
		centerPanel.removeAll();
		centerPanel.add(pAllAdvert2, BorderLayout.CENTER);
		centerPanel.updateUI();
		
		
	}
	
	
	public void getActionBoardTableBtn (ActionEvent e) throws Exception
	{
		PBoardTable pBoardTable = new PBoardTable ();
		
		centerPanel.removeAll();
		centerPanel.add(pBoardTable, BorderLayout.CENTER);
		centerPanel.updateUI();
	}
	
	public void getActionListUserBtn (ActionEvent e) throws Exception
	{
		PAllUser pAllUser = new PAllUser (PCenterPanel.TITLE_LIST_USER, centerPanel.getAdmin());
		
			centerPanel.removeAll();
			centerPanel.add(pAllUser, BorderLayout.CENTER);
			centerPanel.updateUI();				
	}
	
		
	private void getActionCreateUserBtn(ActionEvent e)
	{
		
		new FrameAjoutCompte().setVisible(true);	
	}




	@Override
	public void mouseClicked(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseEntered(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseExited(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mousePressed(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseReleased(MouseEvent e)
	{
		setColorButton();
		JButton button = (JButton)e.getSource();
		button.setBackground(new Color(70, 130, 180));
		button.setForeground(new Color(255, 255, 255));				
	}
	
	private void setColorButton()
	{
		leftPanel.getDisconnectBtn().setBackground(new Color(255, 255, 255));
		leftPanel.getWaitAdvertBtn().setBackground(new Color(255, 255, 255));
		leftPanel.getCheckAdvertBtn().setBackground(new Color(255, 255, 255));
		leftPanel.getRefuseAdvertBtn().setBackground(new Color(255, 255, 255));
		leftPanel.getBoardTableBtn().setBackground(new Color(255, 255, 255));
		leftPanel.getListUserBtn().setBackground(new Color(255, 255, 255));
		leftPanel.getCreateUserBtn().setBackground(new Color(255, 255, 255));
		
		leftPanel.getDisconnectBtn().setForeground(new Color(70, 130, 180));
		leftPanel.getWaitAdvertBtn().setForeground(new Color(70, 130, 180));
		leftPanel.getCheckAdvertBtn().setForeground(new Color(70, 130, 180));
		leftPanel.getRefuseAdvertBtn().setForeground(new Color(70, 130, 180));
		leftPanel.getBoardTableBtn().setForeground(new Color(70, 130, 180));
		leftPanel.getListUserBtn().setForeground(new Color(70, 130, 180));
		leftPanel.getCreateUserBtn().setForeground(new Color(70, 130, 180));
				
		
	}
	
}//END
