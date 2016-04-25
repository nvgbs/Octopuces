package ihm.tableaubord;


import javax.swing.JPanel;
import metier.advert.AdvertRequest;
import model.advert.Advert;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Cursor;

public class PBoardTable extends JPanel 
{
	
	private static final long serialVersionUID = 1L;

	public PBoardTable() throws Exception
	{
		setBackground(new Color(70, 130, 180));
		setLayout(new BorderLayout(0, 0));
		
		JLabel nbAdvertLabel = new JLabel("New label");
		nbAdvertLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		nbAdvertLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nbAdvertLabel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		nbAdvertLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
		nbAdvertLabel.setIcon(new ImageIcon(PBoardTable.class.getResource("/img/Tab_Bord_0.png")));
		nbAdvertLabel.setFont(new Font("Arial", Font.BOLD, 16));
		nbAdvertLabel.setForeground(new Color(255, 255, 255));
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
		boardLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		boardLabel.setHorizontalAlignment(SwingConstants.CENTER);
		boardLabel.setForeground(new Color(255, 255, 255));
		add(boardLabel, BorderLayout.NORTH);
	}

	

}
	
	
	
	

