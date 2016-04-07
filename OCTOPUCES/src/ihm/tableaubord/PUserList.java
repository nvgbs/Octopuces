package ihm.tableaubord;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

public class PUserList extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PUserList() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(56, 146, 184));
		panel_1.setBounds(0, 0, 1054, 74);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblAide = new JLabel("");
		lblAide.setBounds(880, 29, 45, 22);
		panel_1.add(lblAide);
		lblAide.setHorizontalAlignment(SwingConstants.CENTER);
		lblAide.setFont(new Font("Arial", Font.BOLD, 15));
		lblAide.setForeground(new Color(255, 255, 255));
		lblAide.setText("<html><a href=\"\" FONT color = #FFFFFF, STYLE =text-decoration:none>Aide</a></html>");
		
		JLabel lblOctopuces = new JLabel("OCTOPUCES");
		lblOctopuces.setHorizontalAlignment(SwingConstants.CENTER);
		lblOctopuces.setForeground(new Color(255, 255, 255));
		lblOctopuces.setFont(new Font("Arial", Font.BOLD, 26));
		lblOctopuces.setBounds(118, 13, 198, 48);
		panel_1.add(lblOctopuces);
		
		JLabel lblLogo = new JLabel("Logo");
		lblLogo.setForeground(new Color(255, 255, 255));
		lblLogo.setBounds(77, 17, 56, 33);
		panel_1.add(lblLogo);
		
		JLabel label = new JLabel("");
		label.setBounds(929, 31, 20, 23);
		panel_1.add(label);
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(PUserList.class.getResource("/img/Icone_Aide_20x20.png")));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(56, 146, 184));
		panel_2.setBounds(289, 79, 764, 610);
		add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblTableauDeBord = new JLabel("UTILISATEURS");
		lblTableauDeBord.setBounds(34, 23, 335, 29);
		lblTableauDeBord.setForeground(new Color(255, 255, 255));
		lblTableauDeBord.setFont(new Font("Arial", Font.BOLD, 19));
		panel_2.add(lblTableauDeBord);
		
		JButton btnNewButton_2 = new JButton("Modifier");
		btnNewButton_2.setBounds(324, 205, 167, 28);
		panel_2.add(btnNewButton_2);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(56, 146, 184));
		btnNewButton_2.setFont(new Font("Helvetica", Font.BOLD, 12));
		btnNewButton_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		JButton btnNewButton_1 = new JButton("Supprimer ");
		btnNewButton_1.setBounds(521, 205, 167, 28);
		panel_2.add(btnNewButton_1);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(56, 146, 184));
		btnNewButton_1.setFont(new Font("Helvetica", Font.BOLD, 12));
		btnNewButton_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		JButton btnNewButton_3 = new JButton("Supprimer");
		btnNewButton_3.setBounds(521, 394, 167, 28);
		panel_2.add(btnNewButton_3);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(56, 146, 184));
		btnNewButton_3.setFont(new Font("Helvetica", Font.BOLD, 12));
		btnNewButton_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		
		
		JButton btnNewButton_9 = new JButton("Modifier");
		btnNewButton_9.setBounds(324, 394, 167, 28);
		panel_2.add(btnNewButton_9);
		btnNewButton_9.setForeground(new Color(255, 255, 255));
		btnNewButton_9.setBackground(new Color(56, 146, 184));
		btnNewButton_9.setFont(new Font("Helvetica", Font.BOLD, 12));
		btnNewButton_9.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		
		
		JLabel lblNewLabel = new JLabel("Civilité :");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(53, 119, 167, 16);
		panel_2.add(lblNewLabel);
		

		JLabel lblNewLabel_1 = new JLabel("Nom :");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(248, 119, 190, 16);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Prénom :");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(471, 119, 227, 16);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblCatgorieDeLannonce = new JLabel("Email :");
		lblCatgorieDeLannonce.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCatgorieDeLannonce.setBounds(53, 163, 202, 16);
		panel_2.add(lblCatgorieDeLannonce);
		
		JLabel lblDescriptionDeLannonce = new JLabel("Mot de passe :");
		lblDescriptionDeLannonce.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDescriptionDeLannonce.setBounds(324, 163, 120, 16);
		panel_2.add(lblDescriptionDeLannonce);
		
		JLabel lblSouscagroieDeLannonce = new JLabel("Droit d'accès :");
		lblSouscagroieDeLannonce.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSouscagroieDeLannonce.setBounds(53, 205, 190, 20);
		panel_2.add(lblSouscagroieDeLannonce);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(34, 81, 690, 178);
		editorPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(128, 128, 128)));
		panel_2.add(editorPane);
		
		
		
		JLabel lblDateDeLannonce = new JLabel("Civilité :");
		lblDateDeLannonce.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDateDeLannonce.setBounds(53, 308, 158, 16);
		panel_2.add(lblDateDeLannonce);
		
		JLabel lblTitreDeLannonce = new JLabel("Nom : ");
		lblTitreDeLannonce.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTitreDeLannonce.setBounds(248, 308, 127, 16);
		panel_2.add(lblTitreDeLannonce);
		
		JLabel lblRfrenceDeLannonce = new JLabel("Prénom : ");
		lblRfrenceDeLannonce.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRfrenceDeLannonce.setBounds(471, 308, 167, 16);
		panel_2.add(lblRfrenceDeLannonce);
		
		JLabel lblCatgorieDeLannonce_1 = new JLabel("Email : ");
		lblCatgorieDeLannonce_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCatgorieDeLannonce_1.setBounds(53, 355, 218, 16);
		panel_2.add(lblCatgorieDeLannonce_1);
		
		
		JLabel label_2 = new JLabel("Mot de passe : ");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_2.setBounds(324, 355, 218, 16);
		panel_2.add(label_2);
		
		
		
		
		JLabel lblDescriptionDdeLannonce = new JLabel("Droit d'accès :");
		lblDescriptionDdeLannonce.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDescriptionDdeLannonce.setBounds(53, 398, 235, 20);
		panel_2.add(lblDescriptionDdeLannonce);
		
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(34, 272, 690, 178);
		panel_2.add(editorPane_1);
		
		
		JLabel lblDateDeLannonce_1 = new JLabel("Civilité :");
		lblDateDeLannonce_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDateDeLannonce_1.setBounds(63, 508, 157, 16);
		panel_2.add(lblDateDeLannonce_1);
		
		JLabel lblRfrenceDeLannoonce = new JLabel("Prénom :");
		lblRfrenceDeLannoonce.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRfrenceDeLannoonce.setBounds(471, 508, 167, 16);
		panel_2.add(lblRfrenceDeLannoonce);
		
		
		JLabel lblSouscatgorieDeLannonce = new JLabel("Nom :");
		lblSouscatgorieDeLannonce.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSouscatgorieDeLannonce.setBounds(248, 508, 206, 16);
		panel_2.add(lblSouscatgorieDeLannonce);
		
		JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setBounds(34, 463, 690, 103);
		panel_2.add(editorPane_2);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(736, 81, 15, 485);
		panel_2.add(scrollBar);
		
		
		
		
		
		
		
		
		
	
		
		
		
	
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton_4 = new JButton("Tableau de bord");
		btnNewButton_4.setIcon(new ImageIcon(PUserList.class.getResource("/img/Icone_Tableau_20x20.png")));
		btnNewButton_4.setIconTextGap(47);
		btnNewButton_4.setForeground(new Color(70, 130, 180));
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnNewButton_4.setBounds(16, 159, 263, 40);
		btnNewButton_4.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		add(btnNewButton_4);
			
		JButton btnNewButton_5 = new JButton("Annonces à modérer");
		btnNewButton_5.setIcon(new ImageIcon(PUserList.class.getResource("/img/Icone_Pencil_20x20.png")));
		btnNewButton_5.setIconTextGap(20);
		btnNewButton_5.setForeground(new Color(70, 130, 180));
		btnNewButton_5.setBackground(new Color(255, 255, 255));
		btnNewButton_5.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnNewButton_5.setBounds(16, 197, 263, 40);
		btnNewButton_5.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		add(btnNewButton_5);
				
		JButton btnNewButton_6 = new JButton("Annonces validées");
		btnNewButton_6.setIconTextGap(33);
		btnNewButton_6.setIcon(new ImageIcon(PUserList.class.getResource("/img/Icone_In_20x20.png")));
		btnNewButton_6.setForeground(new Color(70, 130, 180));
		btnNewButton_6.setBackground(new Color(255, 255, 255));
		btnNewButton_6.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnNewButton_6.setBounds(16, 235, 263, 40);
		btnNewButton_6.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		add(btnNewButton_6);
				
		JButton btnNewButton_7 = new JButton("Annonces refusées");
		btnNewButton_7.setIcon(new ImageIcon(PUserList.class.getResource("/img/Icone_Croix_Refuse_20x20.png")));
		btnNewButton_7.setIconTextGap(33);
		btnNewButton_7.setForeground(new Color(70, 130, 180));
		btnNewButton_7.setBackground(new Color(255, 255, 255));
		btnNewButton_7.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnNewButton_7.setBounds(16, 272, 263, 40);
		btnNewButton_7.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		add(btnNewButton_7);
						
		JButton btnNewButton_8 = new JButton("Créer utilisateur");
		btnNewButton_8.setIcon(new ImageIcon(PUserList.class.getResource("/img/Icone_Creer_Compte_20x20.png")));
		btnNewButton_8.setIconTextGap(54);
		btnNewButton_8.setForeground(new Color(70, 130, 180));
		btnNewButton_8.setBackground(new Color(255, 255, 255));
		btnNewButton_8.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnNewButton_8.setBounds(16, 310, 263, 40);
		btnNewButton_8.setBorder(new LineBorder(new Color(70, 130, 180), 2, true));
		add(btnNewButton_8);
				
		JButton btnNewButton = new JButton("Liste utilisateurs");
		btnNewButton.setIcon(new ImageIcon(PUserList.class.getResource("/img/Icone_Utilisateurs_20x20.png")));
		btnNewButton.setIconTextGap(49);
		btnNewButton.setForeground(new Color (70, 130, 180));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font ("Helvetica", Font.BOLD, 14));
		btnNewButton.setBorder(new LineBorder (new Color (70, 130, 180), 2));
		btnNewButton.setBounds(16, 348, 263, 40);
		add(btnNewButton);
		
		JButton btnDeconnexion = new JButton("Deconnexion");
		btnDeconnexion.setIcon(null);
		btnDeconnexion.setForeground(new Color(70, 130, 180));
		btnDeconnexion.setBackground(new Color(255, 255, 255));
		btnDeconnexion.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnDeconnexion.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		btnDeconnexion.setBounds(107, 575, 167, 28);
		add(btnDeconnexion);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(PUserList.class.getResource("/img/Icone_Deconnexion_Carre_38x38.png")));
		lblNewLabel_3.setBounds(66, 563, 46, 40);
		add(lblNewLabel_3);
	}
}
