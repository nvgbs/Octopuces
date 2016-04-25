package ihm.pagedesactivercompte;


import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import actionlistener.ValidateDisableUserListener;
import model.user.User;
import javax.swing.ImageIcon;

public class FrameDesactiverCompte extends JFrame
{

		
	private static final long serialVersionUID = 1L;
	JButton btnYes = new JButton("Oui");
	JButton btnNo = new JButton("Non");
	User user;

	public FrameDesactiverCompte(User user)
	{
		ValidateDisableUserListener validateDisableUserListener = new ValidateDisableUserListener(this);
		
		this.user = user;
				
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setBounds(100, 100, 600, 250);
		this.setLocationRelativeTo(null);
		
		if (user.getAccountEnabled() == false)
		{
			this.setTitle("Activer un compte");
		}
		else
		{
			this.setTitle("Desactiver un compte");
		}
		
		
		this.setAlwaysOnTop(true);
		JPanel popUpDelete = (JPanel)this.getContentPane();
		
		popUpDelete.setBackground(new Color(57, 147, 184));
		popUpDelete.setLayout(null);
		
		JLabel lblDeleteAccount;
		
		
		if (user.getAccountEnabled() == false)
		{
			lblDeleteAccount = new JLabel("Activer un compte");
		}
		else
		{
			lblDeleteAccount = new JLabel("Desactiver un compte");
		}
		
		lblDeleteAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeleteAccount.setForeground(new Color(255, 255, 255));
		lblDeleteAccount.setFont(new Font("Arial", Font.BOLD, 13));
		lblDeleteAccount.setBounds(0, 11, 584, 16);
		getContentPane().add(lblDeleteAccount);
		
		JLabel labelAreYouSure;
		
		if (user.getAccountEnabled() == false)
		{
			labelAreYouSure = new JLabel("Etes vous sur de vouloir activer le compte de " + user.getFirstName() + " " + user.getName() + " ?" );
		}
		else
		{
			labelAreYouSure = new JLabel("Etes vous sur de vouloir desactiver le compte de " + user.getFirstName() + " " + user.getName() + " ?" );
		}
		
		labelAreYouSure.setHorizontalAlignment(SwingConstants.CENTER);
		labelAreYouSure.setForeground(Color.WHITE);
		labelAreYouSure.setFont(new Font("Arial", Font.BOLD, 13));
		labelAreYouSure.setBounds(0, 124, 584, 16);
		getContentPane().add(labelAreYouSure);
		
		btnYes.setBounds(168, 173, 89, 23);
		getContentPane().add(btnYes);
		btnYes.addActionListener(validateDisableUserListener);
		
		
		btnNo.setBounds(328, 173, 89, 23);
		getContentPane().add(btnNo);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblIcon.setIcon(new ImageIcon(FrameDesactiverCompte.class.getResource("/img/Icone_Sup_Compte_Ron_64.png")));
		lblIcon.setBounds(0, 37, 584, 64);
		getContentPane().add(lblIcon);
		btnNo.addActionListener(validateDisableUserListener);
		
	}

	public User getUser()
	{
		return user;
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
