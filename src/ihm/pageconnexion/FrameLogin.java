package ihm.pageconnexion;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;

import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.MatteBorder;

import actionlistener.ActionListenerLogin;

import javax.swing.border.LineBorder;

public class FrameLogin extends JFrame
{

	
	private static final long serialVersionUID = 1L;
	
	
	
	private JTextField textFieldLogin = new JTextField();
	private JPasswordField textFieldPassword = new JPasswordField();
	private JButton btnLogin = new JButton("Accéder à votre espace");
	private JLabel lblLoginFail = new JLabel("");
	private JLabel lblPasswordFail = new JLabel("");
	
	

	public FrameLogin()
	{	
		
		
		ActionListenerLogin listenerLogin = new ActionListenerLogin (this);
		
		
		setAlwaysOnTop(true);
		setBackground(new Color(119, 136, 153));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1224, 792);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Connexion au Back-Office");
		
		
				
		setBackground(new Color(243, 243, 244));
		getContentPane().setLayout(null);
		
		
		JLabel lblOctopuces = new JLabel("OCTOPUCES");
		lblOctopuces.setBounds(224, 144, 267, 32);
		lblOctopuces.setFont(new Font("SansSerif", Font.BOLD, 32));
		lblOctopuces.setForeground(new Color(56, 146, 184));
		getContentPane().add(lblOctopuces);
		
		JLabel lblLogo = new JLabel("Logo");
		lblLogo.setBounds(168, 144, 44, 30);
		lblLogo.setHorizontalAlignment(SwingConstants.LEFT);
		getContentPane().add(lblLogo);
		
		
		JLabel lblBienvenue = new JLabel("Bienvenue !");
		lblBienvenue.setBounds(168, 242, 258, 26);
		lblBienvenue.setHorizontalAlignment(SwingConstants.LEFT);
		lblBienvenue.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
		lblBienvenue.setForeground(new Color(22, 22, 24));
		getContentPane().add(lblBienvenue);
		
		
		JTextArea txtrVousAllezVous = new JTextArea();
		txtrVousAllezVous.setBounds(166, 309, 370, 123);
		txtrVousAllezVous.setBackground(new Color(243, 243, 244));
		txtrVousAllezVous.setForeground(new Color(91, 91, 91));
		txtrVousAllezVous.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
		txtrVousAllezVous.setText("Vous allez vous connecter à votre espace.\nSi vous rencontrez des problèmes technique lors\nde votre navigation et modération, nous vous\ninvitons à contacter un administrateur.");
		getContentPane().add(txtrVousAllezVous);
		
		
		JLabel lblUnProblmeTechnique = new JLabel("Un problème technique ?");
		lblUnProblmeTechnique.setBounds(168, 439, 250, 32);
		lblUnProblmeTechnique.setForeground(new Color(22, 22, 24));
		lblUnProblmeTechnique.setFont(new Font("Helvetica Neue", Font.PLAIN, 17));
		getContentPane().add(lblUnProblmeTechnique);
		
		
		JLabel lblSignalerUnProblme = new JLabel("");
		lblSignalerUnProblme.setHorizontalAlignment(SwingConstants.LEFT);
		lblSignalerUnProblme.setBounds(168, 460, 323, 32);
		lblSignalerUnProblme.setForeground(new Color(56, 146, 184));
		lblSignalerUnProblme.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
		getContentPane().add(lblSignalerUnProblme);
		lblSignalerUnProblme.setText("<html><a href=\"\" FONT color = #0677A6, STYLE =text-decoration:none>Signaler un problème technique</a></html>");
		lblSignalerUnProblme.setCursor(new Cursor (Cursor.HAND_CURSOR));
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(565, 85, 470, 583);
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new LineBorder(new Color(70, 130, 180), 1, true));
		getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		JLabel lblConnexion = new JLabel("CONNEXION");
		lblConnexion.setFont(new Font("Dialog", Font.BOLD, 19));
		lblConnexion.setForeground(new Color(105, 105, 105));
		lblConnexion.setHorizontalAlignment(SwingConstants.CENTER);
		lblConnexion.setBounds(39, 53, 390, 26);
		panel.add(lblConnexion);
		
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon("/Users/jessykamarty/Documents/workspace/IHMProjet/img/Trait.png"));
		lblNewLabel.setBounds(19, 41, 238, 5);
		panel.add(lblNewLabel);
		

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setHorizontalAlignment(SwingConstants.LEFT);
		lblLogin.setForeground(new Color(6, 119, 166));
		lblLogin.setFont(new Font("Helvetica Neue", Font.BOLD, 15));
		lblLogin.setBounds(63, 116, 323, 26);
		panel.add(lblLogin);
		
		textFieldLogin.addMouseListener(listenerLogin);
		textFieldLogin.setForeground(new Color(0, 0, 0));
		textFieldLogin.setBounds(63, 163, 323, 38);
		panel.add(textFieldLogin);
		textFieldLogin.setBackground(new Color(255, 255, 255));
		textFieldLogin.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		textFieldLogin.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
		textFieldLogin.setColumns(10);
		textFieldLogin.addKeyListener(listenerLogin);
		
		
		
		JLabel lblMotPasse = new JLabel("Mot de passe");
		lblMotPasse.setHorizontalAlignment(SwingConstants.LEFT);
		lblMotPasse.setForeground(new Color(6, 119, 166));
		lblMotPasse.setFont(new Font("Helvetica Neue", Font.BOLD, 15));
		lblMotPasse.setBounds(63, 246, 322, 24);
		panel.add(lblMotPasse);
		
		
		textFieldPassword.addMouseListener(listenerLogin);
		textFieldPassword.setForeground(new Color(0, 0, 0));
		textFieldPassword.setBounds(63, 281, 323, 38);
		panel.add(textFieldPassword);
		textFieldPassword.setBackground(new Color(255, 255, 255));
		textFieldPassword.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		textFieldPassword.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
		textFieldPassword.setColumns(10);
		textFieldPassword.addKeyListener(listenerLogin);
		
		btnLogin.addActionListener(listenerLogin);		
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(56, 146, 184));
		btnLogin.setFont(new Font("Helvetica Neue", Font.BOLD, 15));
		btnLogin.setBounds(63, 377, 323, 38);
		panel.add(btnLogin);
		
		
		JLabel lblMotPasse1 = new JLabel("Mot de passe oublié ?");
		lblMotPasse1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMotPasse1.setForeground(new Color(22, 22, 24));
		lblMotPasse1.setFont(new Font("Helvetica Neue", Font.PLAIN, 14));
		lblMotPasse1.setBounds(39, 486, 380, 16);
		panel.add(lblMotPasse1);
		
		JLabel lblEffectuerDemande = new JLabel("");
		lblEffectuerDemande.setHorizontalAlignment(SwingConstants.CENTER);
		lblEffectuerDemande.setForeground(new Color(6, 119, 166));
		lblEffectuerDemande.setFont(new Font("Helvetica Neue", Font.BOLD, 13));
		lblEffectuerDemande.setBounds(39, 504, 388, 16);
		panel.add(lblEffectuerDemande);
		lblEffectuerDemande.setText("<html><a href=\"\" FONT color = #0677A6, STYLE =text-decoration:none>Effectuer une nouvelle demande</a></html>");
		lblEffectuerDemande.setCursor(new Cursor (Cursor.HAND_CURSOR));
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Trait.png"));
		label.setBounds(39, 92, 380, 1);
		panel.add(label);
		
		
		lblLoginFail.setForeground(Color.RED);
		lblLoginFail.setBounds(63, 212, 323, 14);
		panel.add(lblLoginFail);
		
		
		lblPasswordFail.setForeground(Color.RED);
		lblPasswordFail.setBounds(73, 330, 313, 14);
		panel.add(lblPasswordFail);
		
	}

	//GETTERS SETTERS \\

	public JTextField getTextFieldLogin() {
		return textFieldLogin;
	}



	public JPasswordField getTextFieldPassword() {
		return textFieldPassword;
	}



	public JButton getBtnLogin() {
		return btnLogin;
	}



	public JLabel getLblLoginFail() {
		return lblLoginFail;
	}



	public JLabel getLblPasswordFail() {
		return lblPasswordFail;
	}
	
	
	
	
}//END
