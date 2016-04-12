package ihm.tableaubord;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import model.advert.Advert;

public class PAdvert extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PAdvert(Advert advert) {
		setBackground(Color.WHITE);
		
		JLabel Reference = new JLabel("Référence :");
		Reference.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel SubCategory = new JLabel("Sous-catégorie :");
		SubCategory.setFont(new Font("Tahoma", Font.BOLD, 13));
		

		JLabel Title = new JLabel("Titre :");
		Title.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel Date = new JLabel("Date :");
		Date.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel Category = new JLabel("Catégorie :");
		Category.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel Description = new JLabel("Description :");
		Description.setFont(new Font("Tahoma", Font.ITALIC, 16));
		
		JLabel DateContent = new JLabel(advert.getDate().toString());
		
		JLabel TitleContent = new JLabel(advert.getTitle());
		
		JLabel ReferenceContent = new JLabel(String.valueOf(advert.getId()));
		
		JLabel CategoryContent = new JLabel(advert.getSubCategory().getCategory().getName());
		
		JLabel SubCategoryContent = new JLabel(advert.getSubCategory().getName());
		
		JLabel DescriptionContent = new JLabel(advert.getDescription());
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(46)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(DescriptionContent, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(Description)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(Date)
								.addComponent(Title))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(DateContent)
								.addComponent(TitleContent))
							.addGap(103)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(Category)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(CategoryContent)
									.addGap(58)
									.addComponent(SubCategory)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(SubCategoryContent))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(Reference)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(ReferenceContent)))))
					.addContainerGap(60, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(Date)
						.addComponent(Reference)
						.addComponent(DateContent)
						.addComponent(ReferenceContent))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(Title)
						.addComponent(Category)
						.addComponent(SubCategory)
						.addComponent(TitleContent)
						.addComponent(CategoryContent)
						.addComponent(SubCategoryContent))
					.addGap(58)
					.addComponent(Description)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(DescriptionContent, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(33, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}
}
