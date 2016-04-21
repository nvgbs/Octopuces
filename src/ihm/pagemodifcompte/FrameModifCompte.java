package ihm.pagemodifcompte;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import actionlistener.UpdateUserListener;
import model.user.User;


public class FrameModifCompte extends JFrame {

	
	private static final long serialVersionUID = 1L;
	
	private JLabel lblCivility = new JLabel("Civilité");
	private String[] civilite = { "Madame", "Monsieur"};
	private JComboBox comboBoxCivility;
	private JTextField textFieldName;
	private JTextField textFieldFirstName;
	private JTextField textFieldLogin;
	private JPasswordField PasswordFieldPassword;
	private JPasswordField PasswordFieldPasswordRepeat;
	private JCheckBox chckbxAdmin = new JCheckBox("Administrateur");
	private JButton btnUpdateUser = new JButton("Valider");
	private JButton btnCancel = new JButton("Annuler");
	
	private JLabel lblPasswordFail = new JLabel("");	
	private JLabel lblLoginFail = new JLabel();
	private JLabel lblFirstNameFail = new JLabel();
	private JLabel lblNameFail = new JLabel();
	private User userClone;	

	public FrameModifCompte(User user) {
		
		UpdateUserListener updateUserListener = new UpdateUserListener(this);
		
		this.userClone = user;
		
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setBounds(100, 100, 550, 720);
		this.setLocationRelativeTo(null);
		this.setTitle("Ajouter un compte Adminitrateur - Modérateur");
		this.setAlwaysOnTop(true);
		
		JPanel pUpdateAccount = (JPanel)this.getContentPane();
		pUpdateAccount.setBorder(new EmptyBorder(5, 5, 5, 5));
		pUpdateAccount.setLayout(new BorderLayout(0, 0));
		pUpdateAccount.setBackground(new Color(57, 147, 184));
		pUpdateAccount.setLayout(null);
		
		JLabel lblCrationCompteAdministrateur = new JLabel("Modification de Compte");
		lblCrationCompteAdministrateur.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrationCompteAdministrateur.setForeground(new Color(255, 255, 255));
		lblCrationCompteAdministrateur.setFont(new Font("Arial", Font.BOLD, 13));
		lblCrationCompteAdministrateur.setBounds(0, 25, 498, 16);
		pUpdateAccount.add(lblCrationCompteAdministrateur);
		
		
		lblCivility.setHorizontalAlignment(SwingConstants.LEFT);
		lblCivility.setForeground(new Color(255, 255, 255));
		lblCivility.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblCivility.setBounds(60, 164, 61, 26);
		pUpdateAccount.add(lblCivility);
		
		
		
		comboBoxCivility = new JComboBox(civilite);
		comboBoxCivility.setSelectedItem(user.getCivility());
		comboBoxCivility.setEditable(false);
		comboBoxCivility.setBounds(60, 201, 206, 26);
		pUpdateAccount.add(comboBoxCivility);
		
		JLabel lblName = new JLabel("Nom");
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblName.setBounds(60, 238, 61, 26);
		pUpdateAccount.add(lblName);
		
		textFieldName = new JTextField(user.getName());
		textFieldName.setBackground(new Color(255, 255, 255));
		textFieldName.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		textFieldName.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		textFieldName.setBounds(60, 275, 206, 23);
		pUpdateAccount.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblFirstName = new JLabel("Prénom");
		lblFirstName.setHorizontalAlignment(SwingConstants.LEFT);
		lblFirstName.setForeground(new Color(255, 255, 255));
		lblFirstName.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblFirstName.setBounds(60, 309, 61, 16);
		pUpdateAccount.add(lblFirstName);
		
		textFieldFirstName = new JTextField(user.getFirstName());
		textFieldFirstName.setBackground(new Color(255, 255, 255));
		textFieldFirstName.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		textFieldFirstName.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		textFieldFirstName.setBounds(60, 336, 206, 23);
		pUpdateAccount.add(textFieldFirstName);
		textFieldFirstName.setColumns(10);
		
		
		JLabel lblPassword = new JLabel("Mot de passe");
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblPassword.setBounds(60, 431, 159, 26);
		pUpdateAccount.add(lblPassword);
		
		PasswordFieldPassword = new JPasswordField(user.getPassword());
		PasswordFieldPassword.setBackground(new Color(255, 255, 255));
		PasswordFieldPassword.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		PasswordFieldPassword.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		PasswordFieldPassword.setBounds(60, 468, 206, 23);
		pUpdateAccount.add(PasswordFieldPassword);
		PasswordFieldPassword.setColumns(10);
		
		JLabel lblPasswordRepeat = new JLabel("Confirmer mot de passe");
		lblPasswordRepeat.setHorizontalAlignment(SwingConstants.LEFT);
		lblPasswordRepeat.setForeground(new Color(255, 255, 255));
		lblPasswordRepeat.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblPasswordRepeat.setBounds(60, 502, 192, 26);
		pUpdateAccount.add(lblPasswordRepeat);
		
		
		PasswordFieldPasswordRepeat = new JPasswordField(user.getPassword());
		PasswordFieldPasswordRepeat.setBackground(new Color(255, 255, 255));
		PasswordFieldPasswordRepeat.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		PasswordFieldPasswordRepeat.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		PasswordFieldPasswordRepeat.setBounds(60, 539, 206, 23);
		pUpdateAccount.add(PasswordFieldPasswordRepeat);
		PasswordFieldPasswordRepeat.setColumns(10);
		
		
		
		JLabel lblDroitAcces = new JLabel("Ajouter droit d'accès");
		lblDroitAcces.setHorizontalAlignment(SwingConstants.LEFT);
		lblDroitAcces.setForeground(new Color(255, 255, 255));
		lblDroitAcces.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblDroitAcces.setBounds(60, 598, 159, 32);
		pUpdateAccount.add(lblDroitAcces);
		
		
		chckbxAdmin.setBackground(new Color(57, 147, 184));
		chckbxAdmin.setForeground(new Color(255, 255, 255));
		chckbxAdmin.setFont(new Font("SansSerif", Font.BOLD, 14));
		chckbxAdmin.setBounds(60, 637, 179, 23);
		pUpdateAccount.add(chckbxAdmin);
		
		
		btnUpdateUser.addActionListener(updateUserListener);
		btnUpdateUser.setIcon(null);
		btnUpdateUser.setBounds(346, 582, 113, 32);
		btnUpdateUser.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		pUpdateAccount.add(btnUpdateUser);
		
		textFieldLogin = new JTextField(user.getLogin());
		textFieldLogin.setFont(new Font("Dialog", Font.PLAIN, 12));
		textFieldLogin.setColumns(10);
		textFieldLogin.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		textFieldLogin.setBackground(Color.WHITE);
		textFieldLogin.setBounds(60, 397, 206, 23);
		pUpdateAccount.add(textFieldLogin);
		
		JLabel labelLogin = new JLabel("Login");
		labelLogin.setHorizontalAlignment(SwingConstants.LEFT);
		labelLogin.setForeground(Color.WHITE);
		labelLogin.setFont(new Font("SansSerif", Font.BOLD, 15));
		labelLogin.setBounds(60, 370, 61, 17);
		pUpdateAccount.add(labelLogin);
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setIcon(new ImageIcon(FrameModifCompte.class.getResource("/img/Icone_Ajout_Compte_Ron_64.png")));
		label_1.setBounds(0, 52, 498, 64);
		pUpdateAccount.add(label_1);
		
		lblPasswordFail.setForeground(Color.RED);
		lblPasswordFail.setBounds(288, 510, 262, 14);
		pUpdateAccount.add(lblPasswordFail);
		
	
		lblNameFail.setForeground(Color.RED);
		lblNameFail.setBounds(346, 280, 262, 14);
		pUpdateAccount.add(lblNameFail);
		
		
		lblFirstNameFail.setForeground(Color.RED);
		lblFirstNameFail.setBounds(336, 341, 272, 14);
		pUpdateAccount.add(lblFirstNameFail);
		lblLoginFail.setForeground(Color.RED);
		
	
		lblLoginFail.setBounds(336, 402, 272, 14);
		pUpdateAccount.add(lblLoginFail);
		
		btnCancel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		btnCancel.setBounds(346, 625, 113, 32);
		pUpdateAccount.add(btnCancel);
	}
	
	public void setTextFieldLogin(JTextField textFieldLogin) {
		this.textFieldLogin = textFieldLogin;
	}

	public void setLblCivility(JLabel lblCivility) {
		this.lblCivility = lblCivility;
	}

	public void setComboBoxCivility(JComboBox comboBoxCivility) {
		this.comboBoxCivility = comboBoxCivility;
	}

	public void setTextFieldName(JTextField textFieldName) {
		this.textFieldName = textFieldName;
	}

	public void setTextFieldFirstName(JTextField textFieldFirstName) {
		this.textFieldFirstName = textFieldFirstName;
	}

	public void setPasswordFieldPassword(JPasswordField passwordFieldPassword) {
		PasswordFieldPassword = passwordFieldPassword;
	}

	public void setPasswordFieldPasswordRepeat(JPasswordField passwordFieldPasswordRepeat) {
		PasswordFieldPasswordRepeat = passwordFieldPasswordRepeat;
	}

	public void setChckbxAdmin(JCheckBox chckbxAdmin) {
		this.chckbxAdmin = chckbxAdmin;
	}

	public void setLblPasswordFail(JLabel lblPasswordFail) {
		this.lblPasswordFail = lblPasswordFail;
	}

	public JTextField getTextFieldLogin() {
		return textFieldLogin;
	}

	public JLabel getLblCivility() {
		return lblCivility;
	}

	public JComboBox getComboBoxCivility() {
		return comboBoxCivility;
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

	public JPasswordField getPasswordFieldPasswordRepeat() {
		return PasswordFieldPasswordRepeat;
	}

	public JCheckBox getChckbxAdmin() {
		return chckbxAdmin;
	}

	public JButton getButtonAddUser() {
		return btnUpdateUser;
	}
	
	public JLabel getLblPasswordFail() {
		return lblPasswordFail;
	}

	public JLabel getLblLoginFail() {
		return lblLoginFail;
	}

	public void setLblLoginFail(JLabel lblLoginFail) {
		this.lblLoginFail = lblLoginFail;
	}

	public JLabel getLblFirstNameFail() {
		return lblFirstNameFail;
	}

	public void setLblFirstNameFail(JLabel lblFirstNameFail) {
		this.lblFirstNameFail = lblFirstNameFail;
	}

	public JLabel getLblNameFail() {
		return lblNameFail;
	}

	public void setLblNameFail(JLabel lblNameFail) {
		this.lblNameFail = lblNameFail;
	}
	
	public JButton getButtonUpdateUser()
	{
		return btnUpdateUser;
	}
	
	public JButton getButtonCancel()
	{
		return btnCancel;
	}
}
