package ihm.tableaubord;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import model.advert.Advert;

public class Center_Panel extends JPanel
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private static final String TITLE_WAIT = "ANNONCES A MODERER";
	private static final String TITLE_VALIDATE = "ANNONCES VALIDEES";
	private static final String TITLE_UNVALIDATE = "ANNONCES REFUSEES";

	
	
	public Center_Panel() throws Exception
	{
		this.setLayout(new BorderLayout());
		this.setBorder(new LineBorder(Color.WHITE, 10));
		this.setBackground(new Color(56, 146, 184));

		//this.add(new PAllAdvert(TITLE_WAIT, Advert.WAIT_STATE), BorderLayout.CENTER);
		//this.add(new PAllAdvert(TITLE_VALIDATE, Advert.VALIDATE_STATE), BorderLayout.CENTER);
		this.add(new PAllAdvert(TITLE_UNVALIDATE, Advert.UNVALIDATE_STATE), BorderLayout.CENTER);
		//this.add(new PBoardTable(), BorderLayout.CENTER);
	}

}
