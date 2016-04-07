package ihm.pageajoutcompte;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class AjoutComptePanel extends JPanel {

	 
	
	/**
	 * Create the panel.
	 */
	@SuppressWarnings("rawtypes")
	public AjoutComptePanel() {
		setBackground(new Color(57, 147, 184));
		setLayout(null);
		
		JLabel lblCivilite = new JLabel("Civilité");
		lblCivilite.setHorizontalAlignment(SwingConstants.LEFT);
		lblCivilite.setForeground(new Color(255, 255, 255));
		lblCivilite.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblCivilite.setBounds(60, 183, 61, 26);
		add(lblCivilite);
		
		
		String[] civilite = { "Madame", "Mademoiselle", "Monsieur"};
		JComboBox comboBox = new JComboBox(civilite);
		//comboBox.setSelectedIndex(3);
		comboBox.setEditable(false);
		comboBox.setBounds(60, 217, 206, 26);
		add(comboBox);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setHorizontalAlignment(SwingConstants.LEFT);
		lblNom.setForeground(new Color(255, 255, 255));
		lblNom.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNom.setBounds(60, 256, 61, 26);
		add(lblNom);
		
		JTextField textField1 = new JTextField();
		textField1.setBackground(new Color(255, 255, 255));
		textField1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		textField1.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		textField1.setBounds(60, 288, 206, 23);
		add(textField1);
		textField1.setColumns(10);
		
		JLabel lblPrenom = new JLabel("Prénom");
		lblPrenom.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrenom.setForeground(new Color(255, 255, 255));
		lblPrenom.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblPrenom.setBounds(60, 333, 61, 16);
		add(lblPrenom);
		
		JTextField textField2 = new JTextField();
		textField2.setBackground(new Color(255, 255, 255));
		textField2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		textField2.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		textField2.setBounds(60, 354, 206, 23);
		add(textField2);
		textField2.setColumns(10);
		
		JLabel lblMail = new JLabel("E-mail");
		lblMail.setHorizontalAlignment(SwingConstants.LEFT);
		lblMail.setForeground(new Color(255, 255, 255));
		lblMail.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblMail.setBounds(60, 404, 61, 17);
		add(lblMail);
		
		JTextField textField3 = new JTextField();
		textField3.setBackground(new Color(255, 255, 255));
		textField3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		textField3.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		textField3.setBounds(60, 424, 206, 23);
		add(textField3);
		textField3.setColumns(10);
		
		
		JLabel lblMotdePasse = new JLabel("Mot de passe");
		lblMotdePasse.setHorizontalAlignment(SwingConstants.LEFT);
		lblMotdePasse.setForeground(new Color(255, 255, 255));
		lblMotdePasse.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblMotdePasse.setBounds(60, 470, 159, 26);
		add(lblMotdePasse);
		
		JTextField textField4 = new JTextField();
		textField4.setBackground(new Color(255, 255, 255));
		textField4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		textField4.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		textField4.setBounds(60, 499, 206, 23);
		add(textField4);
		textField4.setColumns(10);
		
		JLabel lblMotNouveau = new JLabel("Confirmer mot de passe");
		lblMotNouveau.setHorizontalAlignment(SwingConstants.LEFT);
		lblMotNouveau.setForeground(new Color(255, 255, 255));
		lblMotNouveau.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblMotNouveau.setBounds(60, 543, 192, 26);
		add(lblMotNouveau);
		
		
		JTextField textField5 = new JTextField();
		textField5.setBackground(new Color(255, 255, 255));
		textField5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		textField5.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		textField5.setBounds(60, 571, 206, 23);
		add(textField5);
		textField5.setColumns(10);
		
		JLabel lblDroitAcces = new JLabel("Ajouter droit d'accès");
		lblDroitAcces.setHorizontalAlignment(SwingConstants.LEFT);
		lblDroitAcces.setForeground(new Color(255, 255, 255));
		lblDroitAcces.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblDroitAcces.setBounds(60, 618, 217, 32);
		add(lblDroitAcces);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Droit Administrateur");
		chckbxNewCheckBox.setBackground(new Color(57, 147, 184));
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setFont(new Font("SansSerif", Font.BOLD, 14));
		chckbxNewCheckBox.setBounds(58, 672, 179, 23);
		add(chckbxNewCheckBox);
		
		JCheckBox chckbxLll = new JCheckBox("Droit Modérateur");
		chckbxLll.setBackground(new Color(57, 147, 184));
		chckbxLll.setForeground(new Color(255, 255, 255));
		chckbxLll.setFont(new Font("SansSerif", Font.BOLD, 14));
		chckbxLll.setBounds(256, 672, 172, 23);
		add(chckbxLll);
		
		JLabel lblCochezLaCase = new JLabel("Cochez la case correspondante");
		lblCochezLaCase.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblCochezLaCase.setForeground(new Color(245, 245, 245));
		lblCochezLaCase.setBounds(60, 644, 224, 16);
		add(lblCochezLaCase);
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Icone_Ajout_Compte_Ron_64.png"));
		label_1.setBounds(28, 45, 490, 77);
		add(label_1);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Icone_plus_100_68.png"));
		button.setBounds(451, 598, 45, 97);
		button.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		add(button);
		
		JLabel lblCrationCompteAdministrateur = new JLabel("Création Compte Administrateur ou Modérateur");
		lblCrationCompteAdministrateur.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrationCompteAdministrateur.setForeground(new Color(255, 255, 255));
		lblCrationCompteAdministrateur.setFont(new Font("Arial", Font.BOLD, 13));
		lblCrationCompteAdministrateur.setBounds(38, 135, 465, 16);
		add(lblCrationCompteAdministrateur);
		
		
		
		
		
		
		
		
		
		
		

	}
}
