package ihm.tableaubord;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public class Center_Panel extends JPanel
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Center_Panel() throws Exception
	{
		this.setLayout(new BorderLayout());
		this.setBorder(new LineBorder(Color.WHITE, 10));
		this.setBackground(new Color(56, 146, 184));
		
		this.add(new PAdvertToModerate(),BorderLayout.CENTER);
	}
	
	
	

}
