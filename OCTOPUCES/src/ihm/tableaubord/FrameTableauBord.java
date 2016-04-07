/*package ihm.tableaubord;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class FrameTableauBord extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		
		try
		{
			UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameTableauBord frame = new FrameTableauBord();
					frame.setTitle("BACK-OFFICE");
					frame.setContentPane(this);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public FrameTableauBord() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1140, 770);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//Bord1 tableaudeBord = new Bord1();
		//contentPane.add(tableaudeBord);
		
		//Bord2 tableaudeBord = new Bord2();
		//contentPane.add(tableaudeBord);
		
		//Bord3 tableaudeBord = new Bord3();
		//contentPane.add(tableaudeBord);
		
		//Bord4 tableaudeBord = new Bord4();
		//contentPane.add(tableaudeBord);
		
		//Bord5 tableaudeBord = new Bord5();
		//contentPane.add(tableaudeBord);
		
		//Bord6 tableaudeBord = new Bord6();
		//contentPane.add(tableaudeBord);
		
		//Bord7 tableaudeBord = new Bord7();
		//contentPane.add(tableaudeBord);
		
		Left_Panel test = new Left_Panel();
		contentPane.add(test, BorderLayout.EAST);
	}

}
*/