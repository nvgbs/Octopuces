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
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

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

public class PCreateUser extends JPanel {
	private JTextField textField;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public PCreateUser() {
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
		
		
		
		
		
		JLabel lblTableauDeBord = new JLabel("CREER COMPTE UTILISATEUR");
		lblTableauDeBord.setBounds(34, 23, 335, 29);
		lblTableauDeBord.setForeground(new Color(255, 255, 255));
		lblTableauDeBord.setFont(new Font("Arial", Font.BOLD, 19));
		panel_2.add(lblTableauDeBord);
		
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Icone_Ajout_Compte_Ron_64.png"));
		label_2.setBounds(328, 80, 78, 82);
		panel_2.add(label_2);
		
		JLabel lblNewLabel = new JLabel("Civilité");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel.setBounds(60, 183, 61, 26);
		panel_2.add(lblNewLabel);
		
		String[] civilite = { "Madame", "Mademoiselle", "Monsieur"};
		JComboBox comboBox = new JComboBox(civilite);
		//comboBox.setSelectedIndex(3);
		comboBox.setEditable(false);
		comboBox.setBounds(60, 217, 206, 26);
		panel_2.add(comboBox);
	
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setHorizontalAlignment(SwingConstants.LEFT);
		lblNom.setForeground(new Color(255, 255, 255));
		lblNom.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNom.setBounds(491, 183, 61, 26);
		panel_2.add(lblNom);
		
		JTextField textField1 = new JTextField();
		textField1.setBackground(new Color(255, 255, 255));
		textField1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		textField1.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		textField1.setBounds(491, 215, 206, 23);
		panel_2.add(textField1);
		textField1.setColumns(10);
		
		
		JLabel lblPrenom = new JLabel("Prénom");
		lblPrenom.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrenom.setForeground(new Color(255, 255, 255));
		lblPrenom.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblPrenom.setBounds(60, 276, 61, 16);
		panel_2.add(lblPrenom);
		
		JTextField textField2 = new JTextField();
		textField2.setBackground(new Color(255, 255, 255));
		textField2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		textField2.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		textField2.setBounds(60, 297, 206, 23);
		panel_2.add(textField2);
		textField2.setColumns(10);
		
		JLabel lblMail = new JLabel("E-mail");
		lblMail.setHorizontalAlignment(SwingConstants.LEFT);
		lblMail.setForeground(new Color(255, 255, 255));
		lblMail.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblMail.setBounds(491, 276, 61, 17);
		panel_2.add(lblMail);
		
		JTextField textField3 = new JTextField();
		textField3.setBackground(new Color(255, 255, 255));
		textField3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		textField3.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		textField3.setBounds(491, 296, 206, 23);
		panel_2.add(textField3);
		textField3.setColumns(10);
		
		JLabel lblMotdePasse = new JLabel("Mot de passe");
		lblMotdePasse.setHorizontalAlignment(SwingConstants.LEFT);
		lblMotdePasse.setForeground(new Color(255, 255, 255));
		lblMotdePasse.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblMotdePasse.setBounds(60, 356, 159, 26);
		panel_2.add(lblMotdePasse);
		
		JTextField textField4 = new JTextField();
		textField4.setBackground(new Color(255, 255, 255));
		textField4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		textField4.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		textField4.setBounds(60, 385, 206, 23);
		panel_2.add(textField4);
		textField4.setColumns(10);
		
		
		JLabel lblMotNouveau = new JLabel("Confirmer mot de passe");
		lblMotNouveau.setHorizontalAlignment(SwingConstants.LEFT);
		lblMotNouveau.setForeground(new Color(255, 255, 255));
		lblMotNouveau.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblMotNouveau.setBounds(491, 356, 192, 26);
		panel_2.add(lblMotNouveau);
		
		JTextField textField_2 = new JTextField();
		textField_2.setBackground(new Color(255, 255, 255));
		textField_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		textField_2.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		textField_2.setBounds(491, 385, 206, 23);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		
		JLabel lblDroitAcces = new JLabel("Ajouter droit d'accès");
		lblDroitAcces.setHorizontalAlignment(SwingConstants.LEFT);
		lblDroitAcces.setForeground(new Color(255, 255, 255));
		lblDroitAcces.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblDroitAcces.setBounds(63, 443, 186, 16);
		panel_2.add(lblDroitAcces);
		
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Droit Administrateur");
		chckbxNewCheckBox.setBackground(new Color(57, 147, 184));
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setFont(new Font("SansSerif", Font.BOLD, 14));
		chckbxNewCheckBox.setBounds(60, 504, 197, 16);
		panel_2.add(chckbxNewCheckBox);
	
		
		
		JLabel lblCochezLaCase = new JLabel("Cochez la case correspondante");
		lblCochezLaCase.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblCochezLaCase.setForeground(new Color(245, 245, 245));
		lblCochezLaCase.setBounds(63, 460, 245, 16);
		panel_2.add(lblCochezLaCase);
		
	
		
		
		JCheckBox chckbxLll = new JCheckBox("Droit Modérateur");
		chckbxLll.setBackground(new Color(57, 147, 184));
		chckbxLll.setForeground(new Color(255, 255, 255));
		chckbxLll.setFont(new Font("SansSerif", Font.BOLD, 14));
		chckbxLll.setBounds(302, 500, 211, 25);
		panel_2.add(chckbxLll);
		
		
		
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Icone_plus_100_68.png"));
		button.setBounds(588, 443, 45, 92);
		button.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		panel_2.add(button);
		
		
		
		
		
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
		
		JLabel label_111 = new JLabel("");
		label_111.setHorizontalAlignment(SwingConstants.CENTER);
		label_111.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Icone_Ajout_Compte_22x22.png"));
		label_111.setBounds(37, 358, 39, 40);
		add(label_111);
		
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
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Icone_Utilisateurs_20x20.png"));
		lblNewLabel_1.setBounds(37, 396, 39, 43);
		add(lblNewLabel_1);
		
		
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
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnNewButton.setBorder(new LineBorder (new Color (70, 130, 180), 2));
		btnNewButton.setBounds(16, 396, 263, 43);
		add(btnNewButton);
		

	}
}
