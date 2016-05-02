package ihm.tableaubord;

import javax.swing.JPanel;

import actionlistener.AdvertActionListener;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JLabel;
import model.advert.Advert;
import model.advert.Picture;

import javax.swing.JButton;
import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;

public class PAdvert extends JPanel
{
	
	private static final long serialVersionUID = 1L;
	
	
	
	
	
	private JButton btnAccept = new JButton();
	JButton btnPic = new JButton("Photos");
	JLabel lblPic;
	JButton btnRefuse = new JButton("Refuser");
	
	Integer stateValue;
	
	
	

	public PAdvert(Advert advert, Integer stateValue, List<Picture> listPicture)
	{
		
		
		
		AdvertActionListener advertListener = new AdvertActionListener (this, advert, listPicture);
		
		
		setBackground(Color.WHITE);
		
		
		JLabel DescriptionContent = new JLabel(advert.getDescription());
		setLayout(new MigLayout("", "[40px][10px][55px][99.00px][][][][][][][][108px][-46.00px][16px][-10.00px][76.00px][81.00px][71.00]", "[16px][23px][16px][20px][23.00px][23px][][][][][][][][][][][][][][][]"));
		
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
		
				
		
		
		btnAccept.setBackground(new Color(70, 130, 180));
		btnAccept.setForeground(new Color(255, 255, 255));
		
		btnAccept.addActionListener(advertListener);
		int i = 0;
		btnPic.addActionListener(advertListener);
		
		if (listPicture.size() > 0)
		{
			btnPic.setBackground(new Color(70, 130, 180));
			btnPic.setForeground(new Color(255, 255, 255));
			add(btnPic, "cell 2 20");			
		}
		btnRefuse.addActionListener(advertListener);
		if (stateValue == 0)
		{
			add(btnRefuse,"cell 17 20,alignx left" );
			btnRefuse.setBackground(new Color(70, 130, 180));
			btnRefuse.setForeground(new Color(255, 255, 255));
		}
		
		
		
			
		
		add(btnAccept, "cell 16 20");
		
		
		if (stateValue ==  Advert.VALIDATE_STATE)
		{
			btnAccept.setText("Désactiver");
		}
		else if (stateValue == Advert.UNVALIDATE_STATE)
		{
			btnAccept.setText("Réactiver");
		}
		else if (stateValue == Advert.WAIT_STATE)
		{
			btnAccept.setText("Activer");
		}
		
			
	}

	
	public void showPhotos(List <Picture> listPicture)
	{
		JFrame photos = new JFrame("Photos de l'annonce");
		JPanel panelPhotos = (JPanel) photos.getContentPane();
		photos.setSize(333*listPicture.size(), 300);
		photos.setAlwaysOnTop(true);
		panelPhotos.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelPhotos.setBackground(new Color(255, 255, 255));
		panelPhotos.setLayout(new GridLayout());
		
		for (Picture picture : listPicture)
		{
			JLabel lblPic  = new JLabel("");
			lblPic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
			add (lblPic);
			lblPic.setIcon(new ImageIcon(PAdvert.class.getResource(picture.getUrl())));
			panelPhotos.add(lblPic);
		}
		photos.setLocationRelativeTo(null);
		photos.setVisible(true);
		photos.setResizable(false);
	}
	
	
	
	


	public JButton getBtnPhotos()
	{
		return btnPic;
	}
	
	

	public JButton getBtnAccept() {
		return btnAccept;
	}









	public JButton getBtnRefuse() {
		return btnRefuse;
	}


	
	
	
}//END
