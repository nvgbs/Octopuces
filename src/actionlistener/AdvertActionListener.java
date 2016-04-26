package actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ihm.tableaubord.PAdvert;
import metier.advert.AdvertRequest;
import model.advert.Advert;


public class AdvertActionListener implements ActionListener
{

	private PAdvert pAdvert = null;
	private Advert advert = null;
	
	
	
	
	
	public AdvertActionListener (PAdvert pAdvert, Advert advert)
	{
		this.pAdvert = pAdvert;
		this.advert = advert;
	}
	
	
	
	
	public void actionPerformed (ActionEvent e)
	{
		if (e.getSource() == pAdvert.getBtnCancel())
		{
			try 
			{
				getActionBtnCancel(e);
			}
			catch (Exception e1) 
			{				
				e1.printStackTrace();
			}
		}
		
		
	}
	
	
	
	
	
	
	
	public void getActionBtnCancel(ActionEvent e) throws Exception
	{

		
		
		if (pAdvert.getBtnCancel().getText().equals("Activer"))
		{
			AdvertRequest.validateAdvert(advert);
		
		}
		else 
		{
			AdvertRequest.unvalidateAdvert(advert);
			
		}
		
				
	}
	
	
	
	
	
}//END
