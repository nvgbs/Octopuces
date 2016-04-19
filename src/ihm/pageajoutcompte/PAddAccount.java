package ihm.pageajoutcompte;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
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
import javax.swing.DefaultComboBoxModel;

public class PAddAccount extends JPanel {

	private static final long serialVersionUID = 1L;

	private JTextField textFieldLogin;

	private JLabel lblCivility = new JLabel("Civilité");
	private String[] civilite = { "Madame", "Monsieur"};
	private JComboBox comboBox = new JComboBox(civilite);
	private JTextField textFieldName = new JTextField();
	private JTextField textFieldFirstName = new JTextField();
	private JPasswordField PasswordFieldPassword = new JPasswordField();
	private JPasswordField PasswordFieldPassword2 = new JPasswordField();
	private JCheckBox chckbxAdmin = new JCheckBox("Droit Administrateur");
	private JCheckBox chckbxModerator = new JCheckBox("Droit Modérateur");
	private JButton buttonAddUser = new JButton("");
	
	
	@SuppressWarnings("rawtypes")
	public PAddAccount() {
		setBackground(new Color(57, 147, 184));
		setLayout(null);
		
		JLabel lblCrationCompteAdministrateur = new JLabel("Création Compte Administrateur ou Modérateur");
		lblCrationCompteAdministrateur.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrationCompteAdministrateur.setForeground(new Color(255, 255, 255));
		lblCrationCompteAdministrateur.setFont(new Font("Arial", Font.BOLD, 13));
		lblCrationCompteAdministrateur.setBounds(51, 73, 465, 16);
		add(lblCrationCompteAdministrateur);
		
		
		lblCivility.setHorizontalAlignment(SwingConstants.LEFT);
		lblCivility.setForeground(new Color(255, 255, 255));
		lblCivility.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblCivility.setBounds(60, 164, 61, 26);
		add(lblCivility);
		
		
		
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Madame", "Monsieur"}));
		//comboBox.setSelectedIndex(3);
		comboBox.setEditable(false);
		comboBox.setBounds(60, 201, 206, 26);
		add(comboBox);
		
		JLabel lblName = new JLabel("Nom");
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblName.setBounds(60, 238, 61, 26);
		add(lblName);
		
		
		textFieldName.setBackground(new Color(255, 255, 255));
		textFieldName.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		textFieldName.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		textFieldName.setBounds(60, 275, 206, 23);
		add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblFirstName = new JLabel("Prénom");
		lblFirstName.setHorizontalAlignment(SwingConstants.LEFT);
		lblFirstName.setForeground(new Color(255, 255, 255));
		lblFirstName.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblFirstName.setBounds(60, 309, 61, 16);
		add(lblFirstName);
		
		
		textFieldFirstName.setBackground(new Color(255, 255, 255));
		textFieldFirstName.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		textFieldFirstName.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		textFieldFirstName.setBounds(60, 336, 206, 23);
		add(textFieldFirstName);
		textFieldFirstName.setColumns(10);
		
		
		JLabel lblPassword = new JLabel("Mot de passe");
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblPassword.setBounds(60, 431, 159, 26);
		add(lblPassword);
		
		
		PasswordFieldPassword.setBackground(new Color(255, 255, 255));
		PasswordFieldPassword.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		PasswordFieldPassword.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		PasswordFieldPassword.setBounds(60, 468, 206, 23);
		add(PasswordFieldPassword);
		PasswordFieldPassword.setColumns(10);
		
		JLabel lblPassword2 = new JLabel("Confirmer mot de passe");
		lblPassword2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword2.setForeground(new Color(255, 255, 255));
		lblPassword2.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblPassword2.setBounds(60, 502, 192, 26);
		add(lblPassword2);
		
		
		
		PasswordFieldPassword2.setBackground(new Color(255, 255, 255));
		PasswordFieldPassword2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		PasswordFieldPassword2.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		PasswordFieldPassword2.setBounds(60, 539, 206, 23);
		add(PasswordFieldPassword2);
		PasswordFieldPassword2.setColumns(10);
		
		JLabel lblDroitAcces = new JLabel("Ajouter droit d'accès");
		lblDroitAcces.setHorizontalAlignment(SwingConstants.LEFT);
		lblDroitAcces.setForeground(new Color(255, 255, 255));
		lblDroitAcces.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblDroitAcces.setBounds(62, 583, 217, 32);
		add(lblDroitAcces);
		
		
		chckbxAdmin.setBackground(new Color(57, 147, 184));
		chckbxAdmin.setForeground(new Color(255, 255, 255));
		chckbxAdmin.setFont(new Font("SansSerif", Font.BOLD, 14));
		chckbxAdmin.setBounds(60, 637, 179, 23);
		add(chckbxAdmin);
		
		
		chckbxModerator.setBackground(new Color(57, 147, 184));
		chckbxModerator.setForeground(new Color(255, 255, 255));
		chckbxModerator.setFont(new Font("SansSerif", Font.BOLD, 14));
		chckbxModerator.setBounds(258, 637, 172, 23);
		add(chckbxModerator);
		
		JLabel lblCochezLaCase = new JLabel("Cochez la case correspondante");
		lblCochezLaCase.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblCochezLaCase.setForeground(new Color(245, 245, 245));
		lblCochezLaCase.setBounds(62, 609, 224, 16);
		add(lblCochezLaCase);
		
		
		buttonAddUser.setIcon(new ImageIcon(PAddAccount.class.getResource("/img/Icone_plus_100_68.png")));
		buttonAddUser.setBounds(447, 564, 45, 97);
		buttonAddUser.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		add(buttonAddUser);
		
		textFieldLogin = new JTextField();
		textFieldLogin.setFont(new Font("Dialog", Font.PLAIN, 12));
		textFieldLogin.setColumns(10);
		textFieldLogin.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		textFieldLogin.setBackground(Color.WHITE);
		textFieldLogin.setBounds(60, 397, 206, 23);
		add(textFieldLogin);
		
		JLabel labelLogin = new JLabel("Login");
		labelLogin.setHorizontalAlignment(SwingConstants.LEFT);
		labelLogin.setForeground(Color.WHITE);
		labelLogin.setFont(new Font("SansSerif", Font.BOLD, 15));
		labelLogin.setBounds(60, 370, 61, 17);
		add(labelLogin);
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setIcon(new ImageIcon(PAddAccount.class.getResource("/img/Icone_Ajout_Compte_Ron_64.png")));
		label_1.setBounds(41, 100, 490, 64);
		add(label_1);
		
		
		
		
		
		
		
		
		
		
		
		

	}


	public JTextField getTextFieldLogin() {
		return textFieldLogin;
	}


	public JLabel getLblCivility() {
		return lblCivility;
	}


	public JComboBox getComboBox() {
		return comboBox;
	}


	public JTextField getTextFieldName() {
		return textFieldName;
	}


	public JTextField getTextFieldFirstName() {
		return textFieldFirstName;
	}


	public JPasswordField getPasswordFieldPassword() {
		return PasswordFieldPassword;
	}


	public JPasswordField getPasswordFieldPassword2() {
		return PasswordFieldPassword2;
	}


	public JCheckBox getChckbxAdmin() {
		return chckbxAdmin;
	}


	public JCheckBox getChckbxModerator() {
		return chckbxModerator;
	}


	public JButton getButtonAddUser() {
		return buttonAddUser;
	}
	
	
	
}
