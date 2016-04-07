package ihm.tableaubord;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

public class PRejectedAdvert extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PRejectedAdvert() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(56, 146, 184));
		panel_1.setBounds(0, 48, 1054, 74);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblOctopuces = new JLabel("OCTOPUCES");
		lblOctopuces.setHorizontalAlignment(SwingConstants.CENTER);
		lblOctopuces.setForeground(new Color(255, 255, 255));
		lblOctopuces.setFont(new Font("Arial", Font.BOLD, 26));
		lblOctopuces.setBounds(118, 13, 198, 48);
		panel_1.add(lblOctopuces);
		
		JTextField textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setBounds(729, 29, 164, 25);
		panel_1.add(textField_1);
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setBorder(new EmptyBorder(2, 2, 2, 2));
		textField_1.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_1.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Icone_Search_30.png"));
		label_1.setBounds(691, 29, 56, 25);
		panel_1.add(label_1);
		
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(899, 28, 82, 26);
		panel_1.add(btnSearch);
		btnSearch.setForeground(new Color(255, 255, 255));
		btnSearch.setBackground(new Color(56, 146, 184));
		btnSearch.setBorder(new LineBorder(new Color(255, 255, 255)));
		btnSearch.setFont(new Font("Helvetica", Font.BOLD, 12));
		
		JLabel lblLogo = new JLabel("Logo");
		lblLogo.setForeground(new Color(255, 255, 255));
		lblLogo.setBounds(77, 17, 56, 33);
		panel_1.add(lblLogo);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 19, 1053, 28);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblAide = new JLabel("");
		lblAide.setHorizontalAlignment(SwingConstants.CENTER);
		lblAide.setFont(new Font("Arial", Font.BOLD, 15));
		lblAide.setForeground(new Color(56, 146, 184));
		lblAide.setBounds(910, 6, 45, 22);
		lblAide.setText("<html><a href=\"\" FONT color = #0677A6, STYLE =text-decoration:none>Aide</a></html>");
		panel.add(lblAide);
		
		JLabel label = new JLabel("");
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Icone_Aide_20x20.png"));
		//label.setText("<html><a href=\"\" img= C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Icone_Aide_20x20.png></a></html>");
		label.setBounds(955, 6, 20, 23);
		panel.add(label);
		
		JLabel lblBonjour = new JLabel("Bonjour !");
		lblBonjour.setForeground(new Color(56, 146, 184));
		lblBonjour.setBounds(80, 6, 82, 16);
		lblBonjour.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblBonjour.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblBonjour);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(56, 146, 184));
		panel_2.setBounds(291, 127, 762, 566);
		add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblTableauDeBord = new JLabel("ANNONCES REFUSEES");
		lblTableauDeBord.setBounds(34, 23, 335, 29);
		lblTableauDeBord.setForeground(new Color(255, 255, 255));
		lblTableauDeBord.setFont(new Font("Arial", Font.BOLD, 19));
		panel_2.add(lblTableauDeBord);
		
		
		JButton btnNewButton_1 = new JButton("Afficher ");
		btnNewButton_1.setBounds(521, 205, 167, 28);
		panel_2.add(btnNewButton_1);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(56, 146, 184));
		btnNewButton_1.setFont(new Font("Helvetica", Font.BOLD, 12));
		btnNewButton_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		JButton btnNewButton_3 = new JButton("Messages");
		btnNewButton_3.setBounds(521, 394, 167, 28);
		panel_2.add(btnNewButton_3);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(56, 146, 184));
		btnNewButton_3.setFont(new Font("Helvetica", Font.BOLD, 12));
		btnNewButton_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		
		JLabel lblNewLabel = new JLabel("Date de l'annonce");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(53, 96, 167, 28);
		panel_2.add(lblNewLabel);
		

		JLabel lblNewLabel_1 = new JLabel("Titre de l'annonce");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(53, 131, 190, 16);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Référence de l'annonce");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(277, 102, 227, 16);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblCatgorieDeLannonce = new JLabel("Catégorie de l'annonce");
		lblCatgorieDeLannonce.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCatgorieDeLannonce.setBounds(277, 125, 202, 28);
		panel_2.add(lblCatgorieDeLannonce);
		
		JLabel lblDescriptionDeLannonce = new JLabel("Description de l'annonce ...");
		lblDescriptionDeLannonce.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblDescriptionDeLannonce.setBounds(53, 173, 329, 43);
		panel_2.add(lblDescriptionDeLannonce);
		
		JLabel lblSouscagroieDeLannonce = new JLabel("Sous-catégorie de l'annonce");
		lblSouscagroieDeLannonce.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSouscagroieDeLannonce.setBounds(509, 131, 190, 16);
		panel_2.add(lblSouscagroieDeLannonce);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(34, 81, 690, 178);
		editorPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(128, 128, 128)));
		panel_2.add(editorPane);
		
		
		
		JLabel lblDateDeLannonce = new JLabel("Date de l'annonce");
		lblDateDeLannonce.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDateDeLannonce.setBounds(53, 291, 158, 16);
		panel_2.add(lblDateDeLannonce);
		
		JLabel lblTitreDeLannonce = new JLabel("Titre de l'annonce");
		lblTitreDeLannonce.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTitreDeLannonce.setBounds(53, 320, 127, 16);
		panel_2.add(lblTitreDeLannonce);
		
		JLabel lblRfrenceDeLannonce = new JLabel("Référence de l'annonce");
		lblRfrenceDeLannonce.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRfrenceDeLannonce.setBounds(290, 291, 167, 16);
		panel_2.add(lblRfrenceDeLannonce);
		
		JLabel lblCatgorieDeLannonce_1 = new JLabel("Catégorie de l'annonce");
		lblCatgorieDeLannonce_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCatgorieDeLannonce_1.setBounds(290, 320, 218, 16);
		panel_2.add(lblCatgorieDeLannonce_1);
		
		
		JLabel label_2 = new JLabel("Sous-catégorie de l'annonce");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_2.setBounds(509, 320, 218, 16);
		panel_2.add(label_2);
		
		
		JLabel lblDescriptionDdeLannonce = new JLabel("Description de l'annonce");
		lblDescriptionDdeLannonce.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblDescriptionDdeLannonce.setBounds(53, 378, 235, 20);
		panel_2.add(lblDescriptionDdeLannonce);
		
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(34, 272, 690, 178);
		panel_2.add(editorPane_1);
		
		
		JLabel lblDateDeLannonce_1 = new JLabel("Date de l'annonce");
		lblDateDeLannonce_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDateDeLannonce_1.setBounds(63, 486, 157, 16);
		panel_2.add(lblDateDeLannonce_1);
		
		JLabel lblTitreDeLannonce_1 = new JLabel("Titre de l'annonce");
		lblTitreDeLannonce_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTitreDeLannonce_1.setBounds(60, 514, 190, 16);
		panel_2.add(lblTitreDeLannonce_1);
		
		JLabel lblRfrenceDeLannoonce = new JLabel("Référence de l'annonce");
		lblRfrenceDeLannoonce.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRfrenceDeLannoonce.setBounds(290, 486, 167, 16);
		panel_2.add(lblRfrenceDeLannoonce);
		
		
		JLabel lblCatgorieDeLannonce_2 = new JLabel("Catégorie de l'annonce");
		lblCatgorieDeLannonce_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCatgorieDeLannonce_2.setBounds(290, 514, 150, 16);
		panel_2.add(lblCatgorieDeLannonce_2);
		
		
		JLabel lblSouscatgorieDeLannonce = new JLabel("Sous-catégorie de l'annonce");
		lblSouscatgorieDeLannonce.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSouscatgorieDeLannonce.setBounds(509, 514, 206, 16);
		panel_2.add(lblSouscatgorieDeLannonce);
		
		JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setBounds(34, 463, 690, 103);
		panel_2.add(editorPane_2);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(736, 81, 15, 485);
		panel_2.add(scrollBar);
		
		
		
		
		
		
		
		
		
	
		
		
		
	
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel label_7 = new JLabel("");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Icone_Tableau_20x20.png"));
		label_7.setBounds(37, 207, 39, 40);
		add(label_7);
		
		
		JButton btnNewButton_4 = new JButton("         Tableau de bord");
		btnNewButton_4.setForeground(new Color(70, 130, 180));
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnNewButton_4.setBounds(16, 207, 263, 40);
		btnNewButton_4.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		add(btnNewButton_4);
		
		JLabel label_8 = new JLabel("");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Icone_Pencil_20x20.png"));
		label_8.setBounds(37, 245, 39, 43);
		add(label_8);
		
		
		JButton btnNewButton_5 = new JButton("           Annonces à modérer");
		btnNewButton_5.setForeground(new Color(70, 130, 180));
		btnNewButton_5.setBackground(new Color(255, 255, 255));
		btnNewButton_5.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnNewButton_5.setBounds(16, 245, 263, 40);
		btnNewButton_5.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		add(btnNewButton_5);
		
		JLabel label_9 = new JLabel("");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Icone_In_20x20.png"));
		label_9.setBounds(37, 283, 39, 40);
		add(label_9);
		
		JButton btnNewButton_6 = new JButton("         Annonces validées");
		btnNewButton_6.setForeground(new Color(70, 130, 180));
		btnNewButton_6.setBackground(new Color(255, 255, 255));
		btnNewButton_6.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnNewButton_6.setBounds(16, 283, 263, 40);
		btnNewButton_6.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		add(btnNewButton_6);
		
		JLabel label_10 = new JLabel("");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Icone_Croix_Refuse_20x20.png"));
		label_10.setBounds(37, 327, 39, 28);
		add(label_10);
		
		JButton btnNewButton_7 = new JButton("        Annonces refusées");
		btnNewButton_7.setForeground(new Color(70, 130, 180));
		btnNewButton_7.setBackground(new Color(255, 255, 255));
		btnNewButton_7.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnNewButton_7.setBounds(16, 320, 263, 40);
		btnNewButton_7.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		add(btnNewButton_7);
		
		JLabel label_11 = new JLabel("");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Icone_Ajout_Compte_22x22.png"));
		label_11.setBounds(37, 358, 39, 40);
		add(label_11);
		
		JButton btnNewButton_8 = new JButton("       Créer utilisateur");
		btnNewButton_8.setForeground(new Color(70, 130, 180));
		btnNewButton_8.setBackground(new Color(255, 255, 255));
		btnNewButton_8.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnNewButton_8.setBounds(16, 358, 263, 40);
		btnNewButton_8.setBorder(new LineBorder(new Color(70, 130, 180), 2, true));
		add(btnNewButton_8);
		
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Icone_Deconnexion_Carre_38x38.png"));
		label_6.setBounds(72, 595, 56, 89);
		add(label_6);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Icone_Utilisateurs_20x20.png"));
		lblNewLabel_3.setBounds(37, 399, 39, 40);
		add(lblNewLabel_3);
		
		
		JButton btnDeconnexion = new JButton("Deconnexion");
		btnDeconnexion.setForeground(new Color(70, 130, 180));
		btnDeconnexion.setBackground(new Color(255, 255, 255));
		btnDeconnexion.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnDeconnexion.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		btnDeconnexion.setBounds(112, 629, 167, 28);
		add(btnDeconnexion);
		
		
		JButton btnNewButton = new JButton("      Liste utilisateurs");
		btnNewButton.setForeground(new Color (70, 130, 180));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font ("Helvetica", Font.BOLD, 14));
		btnNewButton.setBorder(new LineBorder (new Color (70, 130, 180), 2));
		btnNewButton.setBounds(16, 396, 263, 43);
		add(btnNewButton);
		
		

	}
}
