package base.dao;

public class DaoFactory {
	
	private static DaoUser daoUser = null;
	private static DaoPicture daoPicture = null;
	private static DaoCategory daoCategory = null;
	private static DaoSubCategory daoSubCategory = null;
	private static DaoSubscription daoSubscription = null;
	private static DaoContact daoContact = null;
	private static DaoRegion daoRegion = null;
	private static DaoRole daoRole = null;
	private static DaoAdvert daoAdvert = null;
	
	public static DaoUser getDaoUser()
	{
		if (daoUser == null)
		{
			daoUser = new DaoUser();
		}
		return daoUser;
	}

	
	
	public static DaoPicture getDaoPicture()
	{
		if (daoPicture == null)
		{
			daoPicture = new DaoPicture();
		}
		return daoPicture;
	}
	
	public static DaoCategory getDaoCategory()
	{
		if (daoCategory == null)
		{
			daoCategory = new DaoCategory();
		}
		return daoCategory;
	}
	
	public static DaoSubCategory getDaoSubCategory()
	{
		if (daoSubCategory == null)
		{
			daoSubCategory = new DaoSubCategory();
		}
		return daoSubCategory;
	}
	
	public static DaoSubscription getDaoSubscription()
	{
		if (daoSubscription == null)
		{
			daoSubscription = new DaoSubscription();
		}
		return daoSubscription;
	}
	
	public static DaoContact getDaoContact()
	{
		if (daoContact == null)
		{
			daoContact = new DaoContact();
		}
		return daoContact;
	}

	public static DaoRegion getDaoRegion()
	{
		if (daoRegion == null)
		{
			daoRegion = new DaoRegion();
		}
		return daoRegion;
	}
	
	public static DaoRole getDaoRole()
	{
		if (daoRole == null)
		{
			daoRole = new DaoRole();
		}
		return daoRole;
	}
	
	public static DaoAdvert getDaoAdvert()
	{
		if (daoAdvert == null)
		{
			daoAdvert = new DaoAdvert();
		}
		return daoAdvert;
	}
}
