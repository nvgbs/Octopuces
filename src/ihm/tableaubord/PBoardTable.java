package ihm.tableaubord;

import javax.swing.JFrame;
import javax.swing.JPanel;

import metier.advert.AdvertRequest;
import model.advert.Advert;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class PBoardTable extends JPanel 
{
	public PBoardTable() throws Exception
	{
		setBackground(new Color(70, 130, 180));
		setLayout(new BorderLayout(0, 0));
		
		JLabel nbAdvertLabel = new JLabel("New label");
		nbAdvertLabel.setFont(new Font("Arial", Font.BOLD, 16));
		nbAdvertLabel.setForeground(new Color(255, 255, 255));
		nbAdvertLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(nbAdvertLabel, BorderLayout.CENTER);
		
		List<Advert> listAdvert = AdvertRequest.getListAdvert(Advert.WAIT_STATE);
		
		Integer nbAdvertVar = listAdvert.size();
		
		if (nbAdvertVar == 1)
		{
			nbAdvertLabel.setText(nbAdvertVar + " annonce à traiter !");
		}
		else if (nbAdvertVar > 1)
		{
			nbAdvertLabel.setText(nbAdvertVar + " annonces à traiter !");
		}
		else
		{
			nbAdvertLabel.setText("Aucune annonce à traiter ");
		}
		
		
		JLabel boardLabel = new JLabel("Tableau de bord");
		boardLabel.setFont(new Font("Arial", Font.BOLD, 20));
		boardLabel.setHorizontalAlignment(SwingConstants.CENTER);
		boardLabel.setForeground(new Color(255, 255, 255));
		add(boardLabel, BorderLayout.NORTH);
	}

	

}
	
	
	
	

