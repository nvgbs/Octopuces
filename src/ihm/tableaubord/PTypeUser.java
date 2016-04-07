package ihm.tableaubord;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PTypeUser extends JPanel {
	/**
	 * @wbp.nonvisual location=73,324
	 */
	

	/**
	 * Create the panel.
	 */
	public PTypeUser() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(56, 146, 184));
		panel.setBounds(0, 0, 627, 665);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(12, 13, 603, 639);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		
		JButton btnNewButton0 = new JButton("VALIDER");
		btnNewButton0.setBounds(87, 569, 177, 25);
		panel_1.add(btnNewButton0);
		btnNewButton0.setForeground(new Color(255, 255, 255));
		btnNewButton0.setBackground(new Color(56, 146, 184));
		btnNewButton0.setFont(new Font("Helvetica", Font.BOLD, 12));
		btnNewButton0.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		btnNewButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		
		JButton btnNewButton_1 = new JButton("REFUSER");
		btnNewButton_1.setBounds(351, 569, 177, 25);
		panel_1.add(btnNewButton_1);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(56, 146, 184));
		btnNewButton_1.setFont(new Font("Helvetica", Font.BOLD, 12));
		btnNewButton_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		
		
		JLabel lblNewLabel_1 = new JLabel("Titre de l'annonce");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(49, 88, 177, 16);
		panel_1.add(lblNewLabel_1);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Référence de l'annonce");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(220, 45, 177, 16);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblCatgorieDeLannonce = new JLabel("Catégorie de l'annonce");
		lblCatgorieDeLannonce.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCatgorieDeLannonce.setBounds(55, 134, 215, 16);
		panel_1.add(lblCatgorieDeLannonce);
		
		
		JLabel lblDescriptionDeLannonce = new JLabel("Descriptif de l'annonce");
		lblDescriptionDeLannonce.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDescriptionDeLannonce.setBounds(49, 265, 264, 25);
		panel_1.add(lblDescriptionDeLannonce);
		
		
		JLabel lblDateDeLannonce = new JLabel("Date de l'annonce");
		lblDateDeLannonce.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDateDeLannonce.setBounds(49, 45, 165, 16);
		panel_1.add(lblDateDeLannonce);
		
		
		JLabel lblSouscagroieDeLannonce = new JLabel("Sous-catégorie de l'annonce");
		lblSouscagroieDeLannonce.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSouscagroieDeLannonce.setBounds(257, 132, 215, 20);
		panel_1.add(lblSouscagroieDeLannonce);
		
		
		JLabel label = new JLabel("Prix");
		
		JLabel lblNewLabel = new JLabel("PHOTO 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(87, 466, 92, 16);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("PHOTO 2");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(260, 466, 98, 16);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("PHOTO 3");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(440, 466, 86, 16);
		panel_1.add(lblNewLabel_4);
		

	}
}
