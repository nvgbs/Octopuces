package ihm.pageconnexion;


import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;


import javax.swing.BoxLayout;

import java.awt.Color;

public class FrameLogin extends JFrame
{
  
  
	private static final long serialVersionUID = 1L;
	
	
	private JPanel contentPane;
	
	

	
	

	
	public FrameLogin()
	{
		setAlwaysOnTop(true);
		setBackground(new Color(119, 136, 153));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1224, 792);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Connexion au Back-Office");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		
		PLeftLogin panelConnexion = new PLeftLogin();
		contentPane.add(panelConnexion);
		
		
	}

}//END
