package actionlistener;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

import ihm.tableaubord.PCenterPanel;
import ihm.tableaubord.PLeftPanel;
import ihm.tableaubord.PAllAdvert;
import ihm.tableaubord.PBoardTable;
import model.advert.Advert;

public class ActionMenuListener implements ActionListener
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
		PAllAdvert pAllAdvert2 = new PAllAdvert(PCenterPanel.TITLE_UNVALIDATE, Advert.UNVALIDATE_STATE);
		
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
	
	
}//END
