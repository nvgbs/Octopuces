package ihm.pageajoutcompte;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class FrameCreateUserFail extends JFrame
{
	
	private static final long serialVersionUID = 1L;

	public FrameCreateUserFail() {
		getContentPane().setBackground(new Color(70, 130, 180));
		getContentPane().setForeground(new Color(0, 0, 0));
		getContentPane().setLayout(null);
	
		
		JLabel lblMessage = new JLabel("En tant que modérateur vous n'êtes pas autorisé à créer des utilisateurs.");
		lblMessage.setFont(new Font("Arial", Font.BOLD, 12));
		lblMessage.setForeground(new Color(255, 255, 255));
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setBounds(10, 11, 414, 52);
		getContentPane().add(lblMessage);
		
		JButton btnClose = new JButton("Fermer");
		btnClose.setForeground(new Color(70, 130, 180));
		btnClose.setFont(new Font("Arial", Font.PLAIN, 11));
		btnClose.setBackground(new Color(255, 255, 255));
		btnClose.setBounds(170, 67, 89, 23);
		getContentPane().add(btnClose);
	}
}
