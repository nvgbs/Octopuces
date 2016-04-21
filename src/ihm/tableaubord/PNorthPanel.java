package ihm.tableaubord;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;

public class PNorthPanel extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PNorthPanel()
	{
		this.setBackground(new Color(70, 130, 180));
		this.setBounds(0, 48, 1024, 102);
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 380, 20));
				
		JLabel lblOctopuces = new JLabel("OCTOPUCES");
		lblOctopuces.setHorizontalAlignment(SwingConstants.CENTER);
		lblOctopuces.setForeground(new Color(255, 255, 255));
		lblOctopuces.setFont(new Font("Arial", Font.BOLD, 26));
		this.add(lblOctopuces);
		
		JLabel lblNewLabel = new JLabel("Aide");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setIcon(new ImageIcon(PNorthPanel.class.getResource("/img/Icone_Aide_20x20.png")));
		add(lblNewLabel);
		
	}
	
}
