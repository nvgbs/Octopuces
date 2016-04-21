package ihm.tableaubord;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;



public class PCenterPanel extends JPanel
{

	
	private static final long serialVersionUID = 1L;

	
	public static final String TITLE_WAIT = "ANNONCES A MODERER";
	public static final String TITLE_VALIDATE = "ANNONCES VALIDEES";
	public static final String TITLE_UNVALIDATE = "ANNONCES REFUSEES";	
	public static final String TITLE_LIST_USER = "LISTE DES UTILISATEURS";
	

	
	
	public PCenterPanel() throws Exception
	{
		this.setLayout(new BorderLayout());
		this.setBorder(new LineBorder(Color.WHITE, 10));
		this.setBackground(new Color(70, 130, 180));
				
		// this.add(new PAllAdvert(TITLE_WAIT, Advert.WAIT_STATE), BorderLayout.CENTER);
		// this.add(new PAllAdvert(TITLE_VALIDATE, Advert.VALIDATE_STATE), BorderLayout.CENTER);
		// this.add(new PAllAdvert(TITLE_UNVALIDATE, Advert.UNVALIDATE_STATE), BorderLayout.CENTER);
		//this.add(new PBoardTable(), BorderLayout.CENTER);
		
	}

	
	
	
	
	
	
	
}//END
