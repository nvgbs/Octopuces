package base.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import base.BaseSession;
import model.user.User;

public class DaoUser extends DaoParent 
{

	
	
	public List<User> readByRole(Integer stateValue)throws Exception
	{

		Session session = BaseSession.getNewSession();

		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("role", stateValue.intValue()));

		@SuppressWarnings("unchecked")
		ArrayList<User> listResult = (ArrayList<User>) criteria.list();

		session.close();

		return listResult;
	}
	
	
	
	
	
	
	
	
}//END
