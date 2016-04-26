package ihm.tableaubord;

import javax.swing.JPanel;

import actionlistener.AdvertActionListener;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import model.advert.Advert;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;

public class PAdvert extends JPanel
{
	
	private static final long serialVersionUID = 1L;
	
	
	
	
	
	private JButton btnCancel = new JButton();
	
	Integer stateValue;
	
	

	public PAdvert(Advert advert, Integer stateValue)
	{
		
		
		
		AdvertActionListener advertListener = new AdvertActionListener (this, advert);
		
		
		setBackground(Color.WHITE);
		
		
		JLabel DescriptionContent = new JLabel(advert.getDescription());
		setLayout(new MigLayout("", "[40px][10px][55px][99.00px][][][][][][][][108px][18px][16px][-10.00px][76.00px][81.00px][71.00]", "[16px][23px][16px][20px][23.00px][23px][][][][][][][][][][][][][][][]"));
		
		JLabel Date = new JLabel("Date :");
		Date.setFont(new Font("Tahoma", Font.BOLD, 13));
		add(Date, "cell 2 1,alignx left,aligny top");
		
		JLabel DateContent = new JLabel(advert.getDate().toString());
		add(DateContent, "cell 3 1,alignx left,aligny top");
		
		JLabel Reference = new JLabel("Référence :");
		Reference.setFont(new Font("Tahoma", Font.BOLD, 13));
		add(Reference, "cell 13 1,alignx right,aligny top");
		
		JLabel ReferenceContent = new JLabel(String.valueOf(advert.getId()));
		add(ReferenceContent, "cell 15 1 2 1,alignx left,aligny top");
		

		JLabel Title = new JLabel("Titre :");
		Title.setFont(new Font("Tahoma", Font.BOLD, 13));
		add(Title, "cell 2 2,alignx left,aligny bottom");
		
		JLabel TitleContent = new JLabel(advert.getTitle());
		add(TitleContent, "cell 3 2,alignx left,aligny center");
		
		JLabel Category = new JLabel("Catégorie :");
		Category.setFont(new Font("Tahoma", Font.BOLD, 13));
		add(Category, "cell 13 2,alignx right,aligny top");
		
		JLabel CategoryContent = new JLabel(advert.getSubCategory().getCategory().getName());
		add(CategoryContent, "cell 15 2 2 1,alignx left,aligny center");
		
		JLabel SubCategory = new JLabel("Sous-catégorie :");
		SubCategory.setFont(new Font("Tahoma", Font.BOLD, 13));
		add(SubCategory, "cell 13 3,alignx left,aligny top");
		
		JLabel SubCategoryContent = new JLabel(advert.getSubCategory().getName());
		add(SubCategoryContent, "cell 15 3 2 1,alignx left,aligny center");
		
		JLabel Description = new JLabel("Description :");
		Description.setFont(new Font("Tahoma", Font.ITALIC, 16));
		add(Description, "cell 2 5,alignx left,aligny top");
		add(DescriptionContent, "cell 1 6 12 12,grow");
		
				
		
		
		btnCancel.setBackground(new Color(70, 130, 180));
		btnCancel.setForeground(new Color(255, 255, 255));
		
		btnCancel.addActionListener(advertListener);
		
		
		
		add(btnCancel, "cell 17 20,alignx left");
		
		
		if (stateValue ==  Advert.VALIDATE_STATE)
		{
			btnCancel.setText("Désactiver");
		}
		else
		{
			btnCancel.setText("Activer");
		}
		
			
	}

	
	
	
	
	



	public JButton getBtnCancel() {
		return btnCancel;
	}


	
	
	
}//END
