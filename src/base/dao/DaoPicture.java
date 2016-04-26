package base.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import base.BaseSession;
import model.advert.Picture;

public class DaoPicture extends DaoParent {

	
	public List<Picture> readByAdvertId(Integer advertId)throws Exception
	{

		Session session = BaseSession.getNewSession();

		Criteria criteria = session.createCriteria(Picture.class);
		criteria.add(Restrictions.eq("advert.id", advertId.intValue()));

		@SuppressWarnings("unchecked")
		ArrayList<Picture> listResult = (ArrayList<Picture>) criteria.list();

		session.close();

		return listResult;
	}
}
