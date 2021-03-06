package ihm.pageajoutcompte;


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

import actionlistener.CreateUserListener;

public class FrameAjoutCompte extends JFrame
{

	private static final long serialVersionUID = 1L;	
	private JTextField textFieldLogin;
	private JLabel lblCivility = new JLabel("Civilité");
	private String[] civilite =	{ "Madame", "Monsieur" };
	private JComboBox comboBoxCivility = new JComboBox(civilite);
	private JTextField textFieldName = new JTextField();
	private JTextField textFieldFirstName = new JTextField();
	private JPasswordField PasswordFieldPassword = new JPasswordField();
	private JPasswordField PasswordFieldPasswordRepeat = new JPasswordField();
	private JCheckBox chckbxAdmin = new JCheckBox("Administrateur");
	private JButton buttonAddUser = new JButton("");
	private JLabel lblPasswordFail = new JLabel("");
	private JLabel lblLoginFail = new JLabel();
	private JLabel lblFirstNameFail = new JLabel();
	private JLabel lblNameFail = new JLabel();

	public FrameAjoutCompte()
	{
		CreateUserListener userListener = new CreateUserListener(this);
		
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setBounds(100, 100, 550, 720);
		this.setLocationRelativeTo(null);
		this.setTitle("Ajouter un compte Adminitrateur - Modérateur");
		this.setAlwaysOnTop(true);

		JPanel popUpDelete = (JPanel) this.getContentPane();
		popUpDelete.setBorder(new EmptyBorder(5, 5, 5, 5));
		popUpDelete.setBackground(new Color(70, 130, 180));		
		popUpDelete.setLayout(null);
		getContentPane().setLayout(null);
		
		JLabel lblCrationCompteAdministrateur = new JLabel("Création Compte Administrateur ou Modérateur");
		lblCrationCompteAdministrateur.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrationCompteAdministrateur.setForeground(new Color(255, 255, 255));
		lblCrationCompteAdministrateur.setFont(new Font("Arial", Font.BOLD, 13));
		lblCrationCompteAdministrateur.setBounds(51, 73, 465, 16);
		getContentPane().add(lblCrationCompteAdministrateur);

		lblCivility.setHorizontalAlignment(SwingConstants.LEFT);
		lblCivility.setForeground(new Color(255, 255, 255));
		lblCivility.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblCivility.setBounds(60, 164, 61, 26);
		getContentPane().add(lblCivility);
		comboBoxCivility.setBackground(Color.WHITE);

		comboBoxCivility.setEditable(false);
		comboBoxCivility.setBounds(60, 201, 206, 26);
		getContentPane().add(comboBoxCivility);

		JLabel lblName = new JLabel("Nom");
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblName.setBounds(60, 238, 61, 26);
		getContentPane().add(lblName);

		textFieldName.setBackground(new Color(255, 255, 255));
		textFieldName.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		textFieldName.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		textFieldName.setBounds(60, 275, 206, 23);
		getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		textFieldName.addMouseListener(userListener);

		JLabel lblFirstName = new JLabel("Prénom");
		lblFirstName.setHorizontalAlignment(SwingConstants.LEFT);
		lblFirstName.setForeground(new Color(255, 255, 255));
		lblFirstName.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblFirstName.setBounds(60, 309, 61, 16);
		getContentPane().add(lblFirstName);

		textFieldFirstName.setBackground(new Color(255, 255, 255));
		textFieldFirstName.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		textFieldFirstName.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		textFieldFirstName.setBounds(60, 336, 206, 23);
		getContentPane().add(textFieldFirstName);
		textFieldFirstName.setColumns(10);
		textFieldFirstName.addMouseListener(userListener);

		JLabel lblPassword = new JLabel("Mot de passe");
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblPassword.setBounds(60, 431, 159, 26);
		getContentPane().add(lblPassword);

		PasswordFieldPassword.setBackground(new Color(255, 255, 255));
		PasswordFieldPassword.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		PasswordFieldPassword.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		PasswordFieldPassword.setBounds(60, 468, 206, 23);
		getContentPane().add(PasswordFieldPassword);
		PasswordFieldPassword.setColumns(10);
		PasswordFieldPassword.addMouseListener(userListener);

		JLabel lblPasswordRepeat = new JLabel("Confirmer mot de passe");
		lblPasswordRepeat.setHorizontalAlignment(SwingConstants.LEFT);
		lblPasswordRepeat.setForeground(new Color(255, 255, 255));
		lblPasswordRepeat.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblPasswordRepeat.setBounds(60, 502, 192, 26);
		getContentPane().add(lblPasswordRepeat);

		PasswordFieldPasswordRepeat.setBackground(new Color(255, 255, 255));
		PasswordFieldPasswordRepeat.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		PasswordFieldPasswordRepeat.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		PasswordFieldPasswordRepeat.setBounds(60, 539, 206, 23);
		getContentPane().add(PasswordFieldPasswordRepeat);
		PasswordFieldPasswordRepeat.setColumns(10);
		PasswordFieldPasswordRepeat.addMouseListener(userListener);

		JLabel lblDroitAcces = new JLabel("Ajouter droit d'accès");
		lblDroitAcces.setHorizontalAlignment(SwingConstants.LEFT);
		lblDroitAcces.setForeground(new Color(255, 255, 255));
		lblDroitAcces.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblDroitAcces.setBounds(60, 598, 159, 32);
		getContentPane().add(lblDroitAcces);

		chckbxAdmin.setBackground(new Color(70, 130, 180));
		chckbxAdmin.setForeground(new Color(255, 255, 255));
		chckbxAdmin.setFont(new Font("SansSerif", Font.BOLD, 14));
		chckbxAdmin.setBounds(60, 637, 179, 23);
		getContentPane().add(chckbxAdmin);

		buttonAddUser.addActionListener(userListener);
		buttonAddUser.setIcon(new ImageIcon(FrameAjoutCompte.class.getResource("/img/Icone_plus_100_68.png")));
		buttonAddUser.setBounds(447, 564, 45, 97);
		buttonAddUser.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		getContentPane().add(buttonAddUser);

		textFieldLogin = new JTextField();
		textFieldLogin.setFont(new Font("Dialog", Font.PLAIN, 12));
		textFieldLogin.setColumns(10);
		textFieldLogin.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		textFieldLogin.setBackground(Color.WHITE);
		textFieldLogin.setBounds(60, 397, 206, 23);
		getContentPane().add(textFieldLogin);
		textFieldLogin.addMouseListener(userListener);

		JLabel labelLogin = new JLabel("Login");
		labelLogin.setHorizontalAlignment(SwingConstants.LEFT);
		labelLogin.setForeground(Color.WHITE);
		labelLogin.setFont(new Font("SansSerif", Font.BOLD, 15));
		labelLogin.setBounds(60, 370, 61, 17);
		getContentPane().add(labelLogin);

		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setIcon(new ImageIcon(FrameAjoutCompte.class.getResource("/img/Icone_Ajout_Compte_Ron_64.png")));
		label_1.setBounds(41, 100, 490, 64);
		getContentPane().add(label_1);
		lblPasswordFail.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 10));

		lblPasswordFail.setForeground(Color.RED);
		lblPasswordFail.setBounds(243, 508, 288, 14);
		getContentPane().add(lblPasswordFail);
		lblNameFail.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 10));

		lblNameFail.setForeground(Color.RED);
		lblNameFail.setBounds(276, 284, 248, 14);
		getContentPane().add(lblNameFail);
		lblFirstNameFail.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 10));

		lblFirstNameFail.setForeground(Color.RED);
		lblFirstNameFail.setBounds(278, 345, 253, 14);
		getContentPane().add(lblFirstNameFail);
		lblLoginFail.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 10));
		lblLoginFail.setForeground(Color.RED);

		lblLoginFail.setBounds(278, 406, 246, 14);
		getContentPane().add(lblLoginFail);
	}

	public void setTextFieldLogin(JTextField textFieldLogin)
	{
		this.textFieldLogin = textFieldLogin;
	}

	public void setLblCivility(JLabel lblCivility)
	{
		this.lblCivility = lblCivility;
	}

	public void setComboBoxCivility(JComboBox comboBoxCivility)
	{
		this.comboBoxCivility = comboBoxCivility;
	}

	public void setTextFieldName(JTextField textFieldName)
	{
		this.textFieldName = textFieldName;
	}

	public void setTextFieldFirstName(JTextField textFieldFirstName)
	{
		this.textFieldFirstName = textFieldFirstName;
	}

	public void setPasswordFieldPassword(JPasswordField passwordFieldPassword)
	{
		PasswordFieldPassword = passwordFieldPassword;
	}

	public void setPasswordFieldPasswordRepeat(JPasswordField passwordFieldPasswordRepeat)
	{
		PasswordFieldPasswordRepeat = passwordFieldPasswordRepeat;
	}

	public void setChckbxAdmin(JCheckBox chckbxAdmin)
	{
		this.chckbxAdmin = chckbxAdmin;
	}

	public void setLblPasswordFail(JLabel lblPasswordFail)
	{
		this.lblPasswordFail = lblPasswordFail;
	}

	public JTextField getTextFieldLogin()
	{
		return textFieldLogin;
	}

	public JLabel getLblCivility()
	{
		return lblCivility;
	}

	public JComboBox getComboBoxCivility()
	{
		return comboBoxCivility;
	}

	public JTextField getTextFieldName()
	{
		return textFieldName;
	}

	public JTextField getTextFieldFirstName()
	{
		return textFieldFirstName;
	}

	public JPasswordField getPasswordFieldPassword()
	{
		return PasswordFieldPassword;
	}

	public JPasswordField getPasswordFieldPasswordRepeat()
	{
		return PasswordFieldPasswordRepeat;
	}

	public JCheckBox getChckbxAdmin()
	{
		return chckbxAdmin;
	}

	public JButton getButtonAddUser()
	{
		return buttonAddUser;
	}

	public JLabel getLblPasswordFail()
	{
		return lblPasswordFail;
	}

	public JLabel getLblLoginFail()
	{
		return lblLoginFail;
	}

	public void setLblLoginFail(JLabel lblLoginFail)
	{
		this.lblLoginFail = lblLoginFail;
	}

	public JLabel getLblFirstNameFail()
	{
		return lblFirstNameFail;
	}

	public void setLblFirstNameFail(JLabel lblFirstNameFail)
	{
		this.lblFirstNameFail = lblFirstNameFail;
	}

	public JLabel getLblNameFail()
	{
		return lblNameFail;
	}

	public void setLblNameFail(JLabel lblNameFail)
	{
		this.lblNameFail = lblNameFail;
	}
}
