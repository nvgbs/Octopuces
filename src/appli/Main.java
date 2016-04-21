package appli;



import java.nio.channels.ReadableByteChannel;

import org.hibernate.cfg.Configuration;

import base.BaseInit;
import base.dao.DaoFactory;
import ihm.pageajoutcompte.FrameAjoutCompte;
import ihm.pageconnexion.FrameLogin;
import ihm.tableaubord.PMainPanel;
import model.user.Role;


public class Main {

	public static void main(String[] args)
	{
		
		Boolean result = null;

		try
		{
			// configure hibernate
			new Configuration().configure().buildSessionFactory();
			
			BaseInit.initData();
			
			result = true;
			
			new FrameLogin().setVisible(true);	
				
			
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

}//END
