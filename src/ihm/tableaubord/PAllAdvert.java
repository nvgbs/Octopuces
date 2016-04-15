package ihm.tableaubord;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JScrollBar;

import metier.advert.AdvertRequest;
import model.advert.Advert;

import javax.swing.SwingConstants;
import javax.swing.JScrollPane;


public class PAllAdvert extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	/**
	 * Create the panel.
	 * @throws Exception 
	 */
	public PAllAdvert(String title, Integer stateValue) throws Exception 
	{
		this.setBackground(new Color(70, 130, 180));
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel(title);
		lblNewLabel.setBackground(new Color(70, 130, 180));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.WHITE);
		add(lblNewLabel, BorderLayout.NORTH);
		
		JLabel LabelQuiSertARien = new JLabel(" ");
		LabelQuiSertARien.setBackground(new Color(70, 130, 180));
		add(LabelQuiSertARien, BorderLayout.SOUTH);
		
		PGridLayoutForAdvert gridLayoutForAdvert = new PGridLayoutForAdvert(stateValue.intValue());
		add(gridLayoutForAdvert, BorderLayout.CENTER);
		
		JScrollPane scroll = new JScrollPane(gridLayoutForAdvert);
		this.add(scroll);
		// repaint();
		
		
		

	}
	
	
	
	
}
