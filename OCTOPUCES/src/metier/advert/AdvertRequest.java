package metier.advert;

import java.util.List;

import base.dao.DaoFactory;
import model.advert.Advert;

public class AdvertRequest 
{
	
	public void validateAdvert (Advert advert) throws Exception
	{
		advert.setState(Advert.VALIDATE_STATE);
		
		DaoFactory.getDaoAdvert().saveOrUpdate(advert);		
	}
	
	
	public void unvalidateAdvert (Advert advert) throws Exception
	{
		advert.setState(Advert.UNVALIDATE_STATE);
		
		DaoFactory.getDaoAdvert().saveOrUpdate(advert);		
	}
	
	
	
	public List <Advert> getListWaitAdvert () throws Exception
	{
		
			return DaoFactory.getDaoAdvert().readByState(Advert.WAIT_STATE);
		
	}
	
	public List <Advert> getListUnvalidateAdvert () throws Exception
	{
		
			return DaoFactory.getDaoAdvert().readByState(Advert.UNVALIDATE_STATE);	

	}
	
	public List <Advert> getListValidateAdvert () throws Exception
	{
		
			return DaoFactory.getDaoAdvert().readByState(Advert.VALIDATE_STATE);		
	}
	
	
	
	
	
	
	
}//END
