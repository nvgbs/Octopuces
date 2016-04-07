package ihm.tableaubord;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollBar;

import metier.advert.AdvertRequest;


public class PAdvertToModerate extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	/**
	 * Create the panel.
	 */
	public PAdvertToModerate() {
		this.setBackground(new Color(56, 146, 184));
		this.setLayout(null);
		
		JLabel lblAnnoncesAModerer = new JLabel("ANNONCES A MODERER");
		lblAnnoncesAModerer.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblAnnoncesAModerer.setForeground(Color.WHITE);
		lblAnnoncesAModerer.setBackground(new Color(255, 255, 255));
		lblAnnoncesAModerer.setBounds(56, 11, 281, 42);
		add(lblAnnoncesAModerer);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(1053, 11, 17, 616);
		add(scrollBar);
		
		AdvertRequest.getListUnvalidateAdvert();
		
		
		
		
		

	}
}
