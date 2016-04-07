package base.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import base.BaseSession;
import model.advert.Advert;

public class DaoAdvert extends DaoParent 
{
	
	
	public List<Advert> readByState(Integer state)throws Exception
	{

		Session session = BaseSession.getNewSession();

		Criteria criteria = session.createCriteria(Advert.class);
		criteria.add(Restrictions.eq(Advert.NOM_STATE, state.intValue()));

		@SuppressWarnings("unchecked")
		ArrayList<Advert> listResult = (ArrayList<Advert>) criteria.list();

		session.close();

		return listResult;
	}
}
