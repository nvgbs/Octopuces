package actionlistener;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import ihm.tableaubord.MainFrame;
import ihm.tableaubord.PAdvert;
import ihm.tableaubord.PCenterPanel;
import metier.advert.AdvertRequest;
import model.advert.Advert;
import model.advert.Picture;


public class AdvertActionListener implements ActionListener
{

	private PAdvert pAdvert = null;
	private Advert advert = null;
	private List<Picture> listPicture = null;
	private PCenterPanel centerPanel = null;
	

	
	
	
	
	
	public AdvertActionListener (PAdvert pAdvert, Advert advert, List<Picture> listPicture)
	{
		this.pAdvert = pAdvert;
		this.advert = advert;
		this.listPicture = listPicture;
		
	}
	
	
	
	
	public void actionPerformed (ActionEvent e)
	{
		if (e.getSource() == pAdvert.getBtnAccept())
		{
			try 
			{
				getActionBtnAccept(e);
			}
			catch (Exception e1) 
			{				
				e1.printStackTrace();
			}
		}	
		else if (e.getSource() == pAdvert.getBtnRefuse())
		{
			try 
			{
				getActionBtnRefuse(e);
			} 
			catch (Exception e1)
			{				
				e1.printStackTrace();
			}
		}
		else if (e.getSource() == pAdvert.getBtnPhotos())
		{
			getBtnPhotos(e);
		}
	}
	
	
	
	
	
	
	
	private void getBtnPhotos(ActionEvent e)
	{
		pAdvert.showPhotos(listPicture);
		
	}




	public void getActionBtnAccept(ActionEvent e) throws Exception
	{

		if (pAdvert.getBtnAccept().getText().equals("Activer"))
		{
			AdvertRequest.validateAdvert(advert, MainFrame.getCenterPanel());		
		}
		else if (pAdvert.getBtnAccept().getText().equals("Désactiver"))
		{
			AdvertRequest.unvalidateAdvert(advert,MainFrame.getCenterPanel());			
		}
		else if (pAdvert.getBtnAccept().getText().equals("Réactiver"))
		{
			AdvertRequest.validateAdvert2(advert, MainFrame.getCenterPanel());
		}
		
	}
	
	public void getActionBtnRefuse(ActionEvent e) throws Exception 
	{
		AdvertRequest.unvalidateAdvert2(advert, MainFrame.getCenterPanel());
	}
			
		
			
	
	
	
}//END
