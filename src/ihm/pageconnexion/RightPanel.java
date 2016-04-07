package ihm.pageconnexion;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class RightPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public RightPanel()
	{
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		JLabel lblConnexion = new JLabel("CONNEXION");
		lblConnexion.setFont(new Font("Helvetica", Font.BOLD, 12));
		lblConnexion.setForeground(new Color(168, 168, 171));
		lblConnexion.setHorizontalAlignment(SwingConstants.CENTER);
		lblConnexion.setBounds(-10, 21, 297, 14);
		add(lblConnexion);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("U:\\34011-51-05\\test\\IHMProjet\\img\\Trait.png"));
		lblNewLabel.setBounds(10, 46, 277, 1);
		add(lblNewLabel);
		
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setForeground(new Color(6, 119, 166));
		lblEmail.setFont(new Font("Helvetica", Font.BOLD, 12));
		lblEmail.setBounds(28, 85, 61, 16);
		add(lblEmail);
		
		JTextField textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		textField.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		textField.setBounds(28, 104, 238, 26);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblMotPasse = new JLabel("Mot de passe");
		lblMotPasse.setHorizontalAlignment(SwingConstants.LEFT);
		lblMotPasse.setForeground(new Color(6, 119, 166));
		lblMotPasse.setFont(new Font("Helvetica", Font.BOLD, 12));
		lblMotPasse.setBounds(27, 154, 125, 16);
		add(lblMotPasse);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(240, 240, 240)));
		textField.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		textField.setBounds(28, 173, 238, 26);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Accéder à votre espace");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(56, 146, 184));
		btnNewButton.setFont(new Font("Helvetica", Font.BOLD, 12));
		btnNewButton.setBounds(27, 228, 239, 28);
		add(btnNewButton);
		
		JLabel lblUnProblmeTechnique = new JLabel("Mot de passe oublié ?");
		lblUnProblmeTechnique.setHorizontalAlignment(SwingConstants.CENTER);
		lblUnProblmeTechnique.setForeground(new Color(22, 22, 24));
		lblUnProblmeTechnique.setFont(new Font("Helvetica", Font.PLAIN, 12));
		lblUnProblmeTechnique.setBounds(10, 301, 277, 16);
		add(lblUnProblmeTechnique);
		
		JLabel lblSignalerUnProblme = new JLabel("Effectuer une nouvelle demande");
		lblSignalerUnProblme.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignalerUnProblme.setForeground(new Color(6, 119, 166));
		lblSignalerUnProblme.setFont(new Font("Helvetica", Font.BOLD, 11));
		lblSignalerUnProblme.setBounds(10, 319, 277, 16);
		add(lblSignalerUnProblme);
		
		

	}
}
