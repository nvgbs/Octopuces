


import org.hibernate.cfg.Configuration;

import base.BaseInit;


public class Appli {

	public static void main(String[] args) {
		
		Boolean result = null;

		
		try
		{
			// configure hibernate
			new Configuration().configure().buildSessionFactory();
			
			BaseInit.initData();
			
			result = true;
		}
		catch (Exception e)
		{
			result = false;

			e.printStackTrace();
		}
		finally
		{
			System.out.println(String.valueOf(result));
		}

	}

}
