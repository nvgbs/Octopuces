package ihm.pagesupprimercompte;


import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import actionlistener.ValidateDeleteUserListener;
import model.user.User;
import javax.swing.ImageIcon;

public class FrameSupprimerCompte extends JFrame
{

		
	private static final long serialVersionUID = 1L;
	JButton btnYes = new JButton("Oui");
	JButton btnNo = new JButton("Non");
	User userClone;

	public FrameSupprimerCompte(User user)
	{
		ValidateDeleteUserListener validateDeleteUserListener = new ValidateDeleteUserListener(this);
		
		userClone = user;
				
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setBounds(100, 100, 600, 250);
		this.setLocationRelativeTo(null);
		this.setTitle("Ajouter un compte Adminitrateur - Modérateur");
		this.setAlwaysOnTop(true);
		JPanel popUpDelete = (JPanel)this.getContentPane();
		
		popUpDelete.setBackground(new Color(57, 147, 184));
		popUpDelete.setLayout(null);
		
		JLabel lblDeleteAccount = new JLabel("Suppression de compte");
		lblDeleteAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeleteAccount.setForeground(new Color(255, 255, 255));
		lblDeleteAccount.setFont(new Font("Arial", Font.BOLD, 13));
		lblDeleteAccount.setBounds(0, 11, 584, 16);
		getContentPane().add(lblDeleteAccount);
		
		JLabel labelAreYouSure = new JLabel("Etes vous sur de vouloir supprimer le compte de " + userClone.getFirstName() + " " + userClone.getName() + " ?" );
		labelAreYouSure.setHorizontalAlignment(SwingConstants.CENTER);
		labelAreYouSure.setForeground(Color.WHITE);
		labelAreYouSure.setFont(new Font("Arial", Font.BOLD, 13));
		labelAreYouSure.setBounds(0, 124, 584, 16);
		getContentPane().add(labelAreYouSure);
		
		btnYes.setBounds(177, 173, 89, 23);
		getContentPane().add(btnYes);
		btnYes.addActionListener(validateDeleteUserListener);
		
		
		btnNo.setBounds(328, 173, 89, 23);
		getContentPane().add(btnNo);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon(FrameSupprimerCompte.class.getResource("/img/Icone_Sup_Compte_Ron_64.png")));
		lblIcon.setBounds(261, 37, 64, 64);
		getContentPane().add(lblIcon);
		btnNo.addActionListener(validateDeleteUserListener);
		
	}

	public User getUser()
	{
		return userClone;
	}

	public JButton getBtnYes()
	{
		return btnYes;
	}

	public JButton getBtnNo()
	{
		return btnNo;
	}
}
