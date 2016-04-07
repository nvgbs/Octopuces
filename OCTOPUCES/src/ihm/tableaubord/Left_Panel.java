package ihm.tableaubord;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.EmptyBorder;

public class Left_Panel extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Left_Panel()
	{
		setBorder(new EmptyBorder(10, 10, 10, 0));
		this.setBackground(new Color(255, 255, 255));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{250, 0};
		gridBagLayout.rowHeights = new int[]{50, 50, 50, 50, 50, 50, 50, 50, 50};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		setLayout(gridBagLayout);
		
		JButton btnNewButton_4 = new JButton("Tableau de bord");
		btnNewButton_4.setIcon(new ImageIcon(PUserList.class.getResource("/img/Icone_Tableau_20x20.png")));
		btnNewButton_4.setIconTextGap(47);
		btnNewButton_4.setForeground(new Color(70, 130, 180));
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnNewButton_4.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_4.gridx = 0;
		gbc_btnNewButton_4.gridy = 0;
		this.add(btnNewButton_4, gbc_btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Annonces à modérer");
		btnNewButton_5.setIcon(new ImageIcon(PUserList.class.getResource("/img/Icone_Pencil_20x20.png")));
		btnNewButton_5.setIconTextGap(20);
		btnNewButton_5.setForeground(new Color(70, 130, 180));
		btnNewButton_5.setBackground(new Color(255, 255, 255));
		btnNewButton_5.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnNewButton_5.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_5.gridx = 0;
		gbc_btnNewButton_5.gridy = 1;
		this.add(btnNewButton_5, gbc_btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Annonces validées");
		btnNewButton_6.setIconTextGap(33);
		btnNewButton_6.setIcon(new ImageIcon(PUserList.class.getResource("/img/Icone_In_20x20.png")));
		btnNewButton_6.setForeground(new Color(70, 130, 180));
		btnNewButton_6.setBackground(new Color(255, 255, 255));
		btnNewButton_6.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnNewButton_6.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_6.gridx = 0;
		gbc_btnNewButton_6.gridy = 2;
		this.add(btnNewButton_6, gbc_btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Annonces refusées");
		btnNewButton_7.setIcon(new ImageIcon(PUserList.class.getResource("/img/Icone_Croix_Refuse_20x20.png")));
		btnNewButton_7.setIconTextGap(33);
		btnNewButton_7.setForeground(new Color(70, 130, 180));
		btnNewButton_7.setBackground(new Color(255, 255, 255));
		btnNewButton_7.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnNewButton_7.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		gbc_btnNewButton_7.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_7.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_7.gridx = 0;
		gbc_btnNewButton_7.gridy = 3;
		this.add(btnNewButton_7, gbc_btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Créer utilisateur");
		btnNewButton_8.setIcon(new ImageIcon(PUserList.class.getResource("/img/Icone_Creer_Compte_20x20.png")));
		btnNewButton_8.setIconTextGap(54);
		btnNewButton_8.setForeground(new Color(70, 130, 180));
		btnNewButton_8.setBackground(new Color(255, 255, 255));
		btnNewButton_8.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnNewButton_8.setBorder(new LineBorder(new Color(70, 130, 180), 2, true));
		GridBagConstraints gbc_btnNewButton_8 = new GridBagConstraints();
		gbc_btnNewButton_8.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_8.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_8.gridx = 0;
		gbc_btnNewButton_8.gridy = 4;
		this.add(btnNewButton_8, gbc_btnNewButton_8);
		
		JButton btnNewButton = new JButton("Liste utilisateurs");
		btnNewButton.setIcon(new ImageIcon(PUserList.class.getResource("/img/Icone_Utilisateurs_20x20.png")));
		btnNewButton.setIconTextGap(49);
		btnNewButton.setForeground(new Color (70, 130, 180));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font ("Helvetica", Font.BOLD, 14));
		btnNewButton.setBorder(new LineBorder (new Color (70, 130, 180), 2));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 5;
		this.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnDeconnexion = new JButton("Deconnexion");
		btnDeconnexion.setIcon(new ImageIcon(Left_Panel.class.getResource("/img/Icone_Deconnexion_Carre_38x38.png")));
		btnDeconnexion.setIconTextGap(60);
		btnDeconnexion.setForeground(new Color(70, 130, 180));
		btnDeconnexion.setBackground(new Color(255, 255, 255));
		btnDeconnexion.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnDeconnexion.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		GridBagConstraints gbc_btnDeconnexion = new GridBagConstraints();
		gbc_btnDeconnexion.fill = GridBagConstraints.BOTH;
		gbc_btnDeconnexion.gridx = 0;
		gbc_btnDeconnexion.gridy = 8;
		this.add(btnDeconnexion, gbc_btnDeconnexion);
	}
}
