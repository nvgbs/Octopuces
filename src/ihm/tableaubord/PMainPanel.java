package ihm.tableaubord;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PMainPanel extends JFrame 
{
	
	private static final long serialVersionUID = 1L;
		
	
	public PMainPanel() throws Exception
	{		
		this.setTitle("Octopuces v1.0");
		this.setSize(1366,768);
		this.setLocation(150,150);
		this.setAlwaysOnTop(true);
		this.setResizable(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel tableauBord = (JPanel)this.getContentPane();
		tableauBord.setLayout(new BorderLayout());
		
		PCenterPanel centerPanel = new PCenterPanel();
		
		tableauBord.add(new PLeftPanel(centerPanel), BorderLayout.WEST);
		tableauBord.add(new North_Panel(), BorderLayout.NORTH);
		tableauBord.add(centerPanel, BorderLayout.CENTER);
	}
	
	
}
