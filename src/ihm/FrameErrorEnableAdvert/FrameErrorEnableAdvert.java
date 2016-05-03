package ihm.FrameErrorEnableAdvert;


import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import actionlistener.ErrorEnableAdvertListener;
import model.user.User;
import javax.swing.ImageIcon;

public class FrameErrorEnableAdvert extends JFrame
{

		
	private static final long serialVersionUID = 1L;
	JButton btnOk = new JButton("OK");
	User user;

	public FrameErrorEnableAdvert(User user)
	{
		ErrorEnableAdvertListener errorEnableAdvertListener = new ErrorEnableAdvertListener(this);
		
		this.user = user;
				
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setBounds(100, 100, 600, 250);
		this.setLocationRelativeTo(null);
		this.setTitle("Erreur activation annonce");
		this.setAlwaysOnTop(true);
		JPanel popUpDelete = (JPanel)this.getContentPane();
		
		popUpDelete.setBackground(new Color(70, 130, 180));
		popUpDelete.setLayout(null);
		
		JLabel lblErrorEnableAdvert = new JLabel("Erreur activation annonce");
		lblErrorEnableAdvert.setHorizontalAlignment(SwingConstants.CENTER);
		lblErrorEnableAdvert.setForeground(new Color(255, 255, 255));
		lblErrorEnableAdvert.setFont(new Font("Arial", Font.BOLD, 13));
		lblErrorEnableAdvert.setBounds(0, 11, 584, 16);
		getContentPane().add(lblErrorEnableAdvert);
		
		JLabel labelUserDisable = new JLabel("Impossible d'activer l'annonce : le compte " + user.getFirstName() + " " + user.getName() + " est désactivé !" );
		labelUserDisable.setHorizontalAlignment(SwingConstants.CENTER);
		labelUserDisable.setForeground(Color.WHITE);
		labelUserDisable.setFont(new Font("Arial", Font.BOLD, 13));
		labelUserDisable.setBounds(0, 124, 584, 16);
		getContentPane().add(labelUserDisable);
		btnOk.setBackground(new Color(255, 255, 255));
		btnOk.setForeground(new Color(70, 130, 180));
		
		
		btnOk.setBounds(239, 178, 89, 23);
		getContentPane().add(btnOk);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon(FrameErrorEnableAdvert.class.getResource("/img/Error_64.png")));
		lblIcon.setBounds(255, 38, 64, 64);
		getContentPane().add(lblIcon);
		btnOk.addActionListener(errorEnableAdvertListener);
		
	}

	public User getUser()
	{
		return user;
	}
	
	public JButton getBtnOk()
	{
		return btnOk;
	}
}
