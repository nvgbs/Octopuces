package metier.advert;

import java.awt.BorderLayout;
import java.util.List;
import base.dao.DaoFactory;
import ihm.FrameErrorEnableAdvert.FrameErrorEnableAdvert;
import ihm.tableaubord.PAllAdvert;
import ihm.tableaubord.PCenterPanel;
import model.advert.Advert;

public class AdvertRequest 
{
	
	public static void validateAdvert (Advert advert, PCenterPanel centerPanel) throws Exception
	{	
	
			advert.setState(Advert.VALIDATE_STATE);
		
			DaoFactory.getDaoAdvert().saveOrUpdate(advert);
				
		
			PAllAdvert pAllAdvert = new PAllAdvert(PCenterPanel.TITLE_WAIT, Advert.WAIT_STATE);
			centerPanel.removeAll();
			centerPanel.add(pAllAdvert, BorderLayout.CENTER);
			centerPanel.updateUI();	
				
		
		
		
	}
	
	
	public static void validateAdvert2 (Advert advert, PCenterPanel centerPanel) throws Exception
	{	
		if (advert.getUser().getAccountEnabled())
		{
			advert.setState(Advert.VALIDATE_STATE);
			
			DaoFactory.getDaoAdvert().saveOrUpdate(advert);
				
		
				PAllAdvert pAllAdvert = new PAllAdvert(PCenterPanel.TITLE_DESACTIVED, Advert.UNVALIDATE_STATE);
				centerPanel.removeAll();
				centerPanel.add(pAllAdvert, BorderLayout.CENTER);
				centerPanel.updateUI();
		}
		else
		{
			new FrameErrorEnableAdvert(advert.getUser()).setVisible(true);
		}
		
			
		
			
		
		
		
				
		
	}
	
	
	
	public static void unvalidateAdvert (Advert advert, PCenterPanel centerPanel) throws Exception
	{
		advert.setState(Advert.UNVALIDATE_STATE);
		
		DaoFactory.getDaoAdvert().saveOrUpdate(advert);	
		
		PAllAdvert pAllAdvert = new PAllAdvert(PCenterPanel.TITLE_VALIDATE, Advert.VALIDATE_STATE);
		
		centerPanel.removeAll();
		centerPanel.add(pAllAdvert, BorderLayout.CENTER);
		centerPanel.updateUI();	
	}
	
	public static void unvalidateAdvert2 (Advert advert, PCenterPanel centerPanel) throws Exception
	{
		advert.setState(Advert.UNVALIDATE_STATE);
		
		DaoFactory.getDaoAdvert().saveOrUpdate(advert);	
		
		PAllAdvert pAllAdvert = new PAllAdvert(PCenterPanel.TITLE_WAIT, Advert.WAIT_STATE);
		
		centerPanel.removeAll();
		centerPanel.add(pAllAdvert, BorderLayout.CENTER);
		centerPanel.updateUI();	
	}
	
	
	
	public static List <Advert> getListAdvert (Integer stateValue) throws Exception
	{
		return DaoFactory.getDaoAdvert().readByState(stateValue.intValue());
		
	}
	
	
	
	public static void disableAdvertFromUser (Integer idValue) throws Exception
	{
		List <Advert> listAdvert = DaoFactory.getDaoAdvert().getAdvertFromUser(idValue);
		
		for (Advert advert : listAdvert) 
		{			
			advert.setState(Advert.UNVALIDATE_STATE);
			
			DaoFactory.getDaoAdvert().saveOrUpdate(advert);	
		}
	}
	
	
	
	
	
	
	
}//END
