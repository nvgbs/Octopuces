package ihm.pageconnexion;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;

public class PLeftLogin extends JPanel
{
	private JTextField passwordField;

	/**
	 * Create the panel.
	 */
	public PLeftLogin()
	{
		setBackground(new Color(243, 243, 244));
		setLayout(null);
		
		JLabel lblOctopuces = new JLabel("OCTOPUCES");
		lblOctopuces.setBounds(224, 144, 267, 32);
		lblOctopuces.setFont(new Font("SansSerif", Font.BOLD, 32));
		lblOctopuces.setForeground(new Color(56, 146, 184));
		add(lblOctopuces);
		
		JLabel lblLogo = new JLabel("Logo");
		lblLogo.setBounds(168, 144, 44, 30);
		lblLogo.setHorizontalAlignment(SwingConstants.LEFT);
		add(lblLogo);
		
		
		JLabel lblBienvenue = new JLabel("Bienvenue !");
		lblBienvenue.setBounds(168, 242, 258, 26);
		lblBienvenue.setHorizontalAlignment(SwingConstants.LEFT);
		lblBienvenue.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
		lblBienvenue.setForeground(new Color(22, 22, 24));
		add(lblBienvenue);
		
		
		JTextArea txtrVousAllezVous = new JTextArea();
		txtrVousAllezVous.setBounds(166, 309, 370, 123);
		txtrVousAllezVous.setBackground(new Color(243, 243, 244));
		txtrVousAllezVous.setForeground(new Color(91, 91, 91));
		txtrVousAllezVous.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
		txtrVousAllezVous.setText("Vous allez vous connecter à votre espace.\nSi vous rencontrez des problèmes technique lors\nde votre navigation et modération, nous vous\ninvitons à contacter un administrateur.");
		add(txtrVousAllezVous);
		
		JLabel lblUnProblmeTechnique = new JLabel("Un problème technique ?");
		lblUnProblmeTechnique.setBounds(168, 439, 250, 32);
		lblUnProblmeTechnique.setForeground(new Color(22, 22, 24));
		lblUnProblmeTechnique.setFont(new Font("Helvetica Neue", Font.PLAIN, 17));
		add(lblUnProblmeTechnique);
		
		JLabel lblSignalerUnProblme = new JLabel("");
		lblSignalerUnProblme.setHorizontalAlignment(SwingConstants.LEFT);
		lblSignalerUnProblme.setBounds(168, 460, 323, 32);
		lblSignalerUnProblme.setForeground(new Color(56, 146, 184));
		lblSignalerUnProblme.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
		add(lblSignalerUnProblme);
		lblSignalerUnProblme.setText("<html><a href=\"\" FONT color = #0677A6, STYLE =text-decoration:none>Signaler un problème technique</a></html>");
		lblSignalerUnProblme.setCursor(new Cursor (Cursor.HAND_CURSOR));
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(565, 85, 470, 583);
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new LineBorder(new Color(70, 130, 180), 1, true));
		add(panel);
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
		

		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setForeground(new Color(6, 119, 166));
		lblEmail.setFont(new Font("Helvetica Neue", Font.BOLD, 15));
		lblEmail.setBounds(63, 150, 323, 26);
		panel.add(lblEmail);
		
		JTextField textField = new JTextField();
		textField.setForeground(new Color(0, 0, 0));
		textField.setBounds(63, 189, 323, 38);
		panel.add(textField);
		textField.setBackground(new Color(255, 255, 255));
		textField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		textField.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
		textField.setColumns(10);
		
		
		
		JLabel lblMotPasse = new JLabel("Mot de passe");
		lblMotPasse.setHorizontalAlignment(SwingConstants.LEFT);
		lblMotPasse.setForeground(new Color(6, 119, 166));
		lblMotPasse.setFont(new Font("Helvetica Neue", Font.BOLD, 15));
		lblMotPasse.setBounds(62, 253, 322, 24);
		panel.add(lblMotPasse);
		
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setForeground(new Color(0, 0, 0));
		passwordField.setBounds(63, 290, 323, 38);
		panel.add(passwordField);
		passwordField.setBackground(new Color(255, 255, 255));
		passwordField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		passwordField.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
		passwordField.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Accéder à votre espace");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(56, 146, 184));
		btnNewButton.setFont(new Font("Helvetica Neue", Font.BOLD, 15));
		btnNewButton.setBounds(63, 377, 323, 38);
		panel.add(btnNewButton);
		
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
		
		
		
		
		

	}
}
