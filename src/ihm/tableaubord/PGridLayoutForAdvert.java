package ihm.tableaubord;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.util.List;
import metier.advert.AdvertRequest;
import model.advert.Advert;

import java.awt.Color;

public class PGridLayoutForAdvert extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	public PGridLayoutForAdvert(Integer stateValue) throws Exception {
		
		List<Advert> listAdvert = AdvertRequest.getListAdvert(stateValue.intValue());
		
		setBackground(new Color(70, 130, 180));
		GridLayout grid = new GridLayout(listAdvert.size(), 1, 0, 10);
		setLayout(grid);
		
		for (Advert advert : listAdvert) {
			
			this.add(new PAdvert(advert, stateValue));
			
		}
	}

}
