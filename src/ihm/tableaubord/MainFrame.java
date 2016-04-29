package ihm.tableaubord;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame 
{
	
	private static final long serialVersionUID = 1L;
	
	private static PCenterPanel centerPanel = null;
		
	
	public MainFrame(Boolean admin) throws Exception
	{		
		this.setTitle("Octopuces v1.0");
		this.setSize(1366,768);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setMinimumSize(new Dimension(1366, 768));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel tableauBord = (JPanel)this.getContentPane();
		tableauBord.setLayout(new BorderLayout());
		
		MainFrame.centerPanel = new PCenterPanel(admin);
		
		tableauBord.add(new PLeftPanel(centerPanel, admin), BorderLayout.WEST);
		tableauBord.add(new PNorthPanel(), BorderLayout.NORTH);
		tableauBord.add(centerPanel, BorderLayout.CENTER);
	}


	public static PCenterPanel getCenterPanel()
	{
		return centerPanel;
	}


	
	
	
}
