package ihm.tableaubord;

import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.BoxLayout;
import javax.swing.JEditorPane;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PAdvert extends JPanel
{
	public PAdvert() {
		setBackground(Color.WHITE);
		
		JLabel label = new JLabel("");
		
		JLabel label_1 = new JLabel("");
		
		JLabel lblNewLabel_2 = new JLabel("Référence :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel label_4 = new JLabel("");
		
		JLabel lblSouscatgorie = new JLabel("Sous-catégorie :");
		lblSouscatgorie.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel label_2 = new JLabel("");
		
		JLabel label_5 = new JLabel("");
		

		JLabel lblNewLabel_1 = new JLabel("Titre :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel label_3 = new JLabel("");
		
		JLabel lblNewLabel = new JLabel("Date :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblCatgorieDeLannonce = new JLabel("Catégorie :");
		lblCatgorieDeLannonce.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblDescriptionDeLannonce = new JLabel("Description :");
		lblDescriptionDeLannonce.setFont(new Font("Tahoma", Font.ITALIC, 16));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(label)
							.addGap(5)
							.addComponent(label_1)
							.addGap(193)
							.addComponent(label_4)
							.addGap(117)
							.addComponent(label_2)
							.addGap(5)
							.addComponent(label_5)
							.addGap(48)
							.addComponent(label_3))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(46)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDescriptionDeLannonce)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel)
										.addComponent(lblNewLabel_1))
									.addGap(159)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblCatgorieDeLannonce)
											.addGap(114)
											.addComponent(lblSouscatgorie))
										.addComponent(lblNewLabel_2))))))
					.addContainerGap(239, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(144)
							.addComponent(label))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(106)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(38)
									.addComponent(label_2))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(38)
									.addComponent(label_5))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(38)
									.addComponent(label_3))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(144)
							.addComponent(label_4))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(36)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_2))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1)
								.addComponent(lblCatgorieDeLannonce)
								.addComponent(lblSouscatgorie))
							.addGap(58)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDescriptionDeLannonce)
								.addComponent(label_1))))
					.addContainerGap(123, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}
}
