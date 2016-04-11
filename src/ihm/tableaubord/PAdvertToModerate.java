package ihm.tableaubord;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JScrollBar;

import metier.advert.AdvertRequest;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;


public class PAdvertToModerate extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	/**
	 * Create the panel.
	 * @throws Exception 
	 */
	public PAdvertToModerate() throws Exception {
		this.setBackground(new Color(56, 146, 184));
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("ANNONCES A MODERER");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblNewLabel.setForeground(Color.WHITE);
		add(lblNewLabel, BorderLayout.NORTH);
		
		JLabel LabelQuiSertARien = new JLabel(" ");
		add(LabelQuiSertARien, BorderLayout.SOUTH);
		
		PGridLayoutForAdvert gridLayoutForAdvert = new PGridLayoutForAdvert();
		add(gridLayoutForAdvert, BorderLayout.CENTER);
		
		JScrollPane scroll = new JScrollPane(gridLayoutForAdvert);
		this.add(scroll);
		repaint();
		
		
		//AdvertRequest.getListUnvalidateAdvert();
		
		
		

	}
	
	
	
	
}//END
