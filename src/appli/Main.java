package appli;



import org.hibernate.cfg.Configuration;

import base.BaseInit;
import ihm.pageajoutcompte.FrameAjoutCompte;
import ihm.tableaubord.PMainPanel;


public class Main {

	public static void main(String[] args)
	{
		
		Boolean result = null;

		try
		{
			// configure hibernate
			new Configuration().configure().buildSessionFactory();
			
			//BaseInit.initData();
			
			result = true;
	new FrameAjoutCompte().setVisible(true);		
//			new PMainPanel().setVisible(true);
			
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
