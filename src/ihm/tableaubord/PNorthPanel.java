package ihm.tableaubord;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

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
		JLabel lblOctopuces = new JLabel("OCTOPUCES");
		lblOctopuces.setHorizontalAlignment(SwingConstants.LEFT);
		lblOctopuces.setForeground(new Color(255, 255, 255));
		lblOctopuces.setFont(new Font("French Script MT", Font.BOLD, 40));
		
		JLabel lblNewLabel = new JLabel("Aide");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setIcon(new ImageIcon(PNorthPanel.class.getResource("/img/Icone_Aide_20x20.png")));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(26)
					.addComponent(lblOctopuces)
					.addPreferredGap(ComponentPlacement.RELATED, 694, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(30))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(41)
					.addComponent(lblNewLabel)
					.addContainerGap(41, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(31, Short.MAX_VALUE)
					.addComponent(lblOctopuces)
					.addGap(24))
		);
		setLayout(groupLayout);
		
	}
	
}
