/*package ihm.pageconnexion;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.Color;

public class Frame extends JFrame
{
  
  
	private JPanel contentPane;
	
	private final JLabel label = DefaultComponentFactory.getInstance().createTitle("New JGoodies title");

	
	public static void main(String[] args) {
		try
		{
			UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Frame()
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
		
		
		LeftPanel panelConnexion = new LeftPanel();
		contentPane.add(panelConnexion);
		
		
	}

}*/
