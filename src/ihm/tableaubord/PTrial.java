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

public class PTrial extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PTrial() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(56, 146, 184));
		panel_1.setBounds(0, 48, 1054, 74);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblOctopuces = new JLabel("OCTOPUCES");
		lblOctopuces.setHorizontalAlignment(SwingConstants.CENTER);
		lblOctopuces.setForeground(new Color(255, 255, 255));
		lblOctopuces.setFont(new Font("Arial", Font.BOLD, 26));
		lblOctopuces.setBounds(118, 13, 198, 48);
		panel_1.add(lblOctopuces);
		
		JTextField textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setBounds(729, 29, 164, 25);
		panel_1.add(textField_1);
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setBorder(new EmptyBorder(2, 2, 2, 2));
		textField_1.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_1.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Icone_Search_30.png"));
		label_1.setBounds(691, 29, 56, 25);
		panel_1.add(label_1);
		
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(899, 28, 82, 26);
		panel_1.add(btnSearch);
		btnSearch.setForeground(new Color(255, 255, 255));
		btnSearch.setBackground(new Color(56, 146, 184));
		btnSearch.setBorder(new LineBorder(new Color(255, 255, 255)));
		btnSearch.setFont(new Font("Helvetica", Font.BOLD, 12));
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 19, 1053, 28);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblAide = new JLabel("Aide");
		lblAide.setHorizontalAlignment(SwingConstants.CENTER);
		lblAide.setFont(new Font("Arial", Font.BOLD, 15));
		lblAide.setForeground(new Color(56, 146, 184));
		lblAide.setBounds(910, 6, 45, 22);
		panel.add(lblAide);
		
		JLabel label = new JLabel("");
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Icone_Aide_20x20.png"));
		label.setBounds(955, 6, 20, 23);
		panel.add(label);
		
		JLabel lblBonjour = new JLabel("Bonjour !");
		lblBonjour.setForeground(new Color(56, 146, 184));
		lblBonjour.setBounds(80, 6, 82, 16);
		lblBonjour.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblBonjour.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblBonjour);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(56, 146, 184));
		panel_2.setBounds(291, 127, 762, 566);
		add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Annonces Refusées");
		btnNewButton_2.setBounds(150, 459, 167, 28);
		panel_2.add(btnNewButton_2);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(56, 146, 184));
		btnNewButton_2.setFont(new Font("Helvetica", Font.BOLD, 12));
		btnNewButton_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblTableauDeBord = new JLabel("TABLEAU DE BORD");
		lblTableauDeBord.setBounds(34, 23, 200, 29);
		lblTableauDeBord.setForeground(new Color(255, 255, 255));
		lblTableauDeBord.setFont(new Font("Arial", Font.BOLD, 19));
		panel_2.add(lblTableauDeBord);
		
		
		JButton btnNewButton_1 = new JButton("Annonces Validées");
		btnNewButton_1.setBounds(442, 239, 167, 28);
		panel_2.add(btnNewButton_1);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(56, 146, 184));
		btnNewButton_1.setFont(new Font("Helvetica", Font.BOLD, 12));
		btnNewButton_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		JButton btnNewButton0 = new JButton("Annonces à Modérer");
		btnNewButton0.setBounds(156, 239, 167, 28);
		panel_2.add(btnNewButton0);
		btnNewButton0.setForeground(new Color(255, 255, 255));
		btnNewButton0.setBackground(new Color(56, 146, 184));
		btnNewButton0.setFont(new Font("Helvetica", Font.BOLD, 12));
		btnNewButton0.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		btnNewButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Tab_Bord_2.png"));
		label_3.setBounds(408, 77, 221, 210);
		panel_2.add(label_3);
		btnNewButton0.setBounds(156, 241, 175, 25);
		panel_2.add(btnNewButton0);
		
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Tab_Bord_0.png"));
		label_2.setBounds(130, 77, 221, 210);
		panel_2.add(label_2);
		
		
		JButton btnNewButton_3 = new JButton("Messages");
		btnNewButton_3.setBounds(442, 459, 167, 28);
		panel_2.add(btnNewButton_3);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(56, 146, 184));
		btnNewButton_3.setFont(new Font("Helvetica", Font.BOLD, 12));
		btnNewButton_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Tab_Bord_01.png"));
		label_4.setBounds(130, 300, 221, 210);
		panel_2.add(label_4);
		
		
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Tab_Bord_04.png"));
		label_5.setBounds(408, 300, 221, 210);
		panel_2.add(label_5);
		
		JLabel label_7 = new JLabel("");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Icone_Tableau_20x20.png"));
		label_7.setBounds(37, 207, 39, 40);
		add(label_7);
		
		
		JButton btnNewButton_4 = new JButton("         Tableau de bord");
		btnNewButton_4.setForeground(new Color(70, 130, 180));
		btnNewButton_4.setBackground(new Color(220, 220, 220));
		btnNewButton_4.setFont(new Font("Helvetica", Font.BOLD, 13));
		btnNewButton_4.setBounds(16, 207, 263, 40);
		btnNewButton_4.setBorder(new LineBorder(new Color(255, 255, 255)));
		add(btnNewButton_4);
		
		JLabel label_8 = new JLabel("");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Icone_Pencil_20x20.png"));
		label_8.setBounds(37, 245, 39, 43);
		add(label_8);
		
		
		JButton btnNewButton_5 = new JButton("           Annonces à modérer");
		btnNewButton_5.setForeground(new Color(70, 130, 180));
		btnNewButton_5.setBackground(new Color(220, 220, 220));
		btnNewButton_5.setFont(new Font("Helvetica", Font.BOLD, 13));
		btnNewButton_5.setBounds(16, 245, 263, 40);
		btnNewButton_5.setBorder(new LineBorder(new Color(255, 255, 255)));
		add(btnNewButton_5);
		
		JLabel label_9 = new JLabel("");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Icone_In_20x20.png"));
		label_9.setBounds(37, 283, 39, 40);
		add(label_9);
		
		JButton btnNewButton_6 = new JButton("         Annonces validées");
		btnNewButton_6.setForeground(new Color(70, 130, 180));
		btnNewButton_6.setBackground(new Color(220, 220, 220));
		btnNewButton_6.setFont(new Font("Helvetica", Font.BOLD, 13));
		btnNewButton_6.setBounds(16, 283, 263, 40);
		btnNewButton_6.setBorder(new LineBorder(new Color(255, 255, 255)));
		add(btnNewButton_6);
		
		JLabel label_10 = new JLabel("");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Icone_Croix_Refuse_20x20.png"));
		label_10.setBounds(37, 327, 39, 28);
		add(label_10);
		
		JButton btnNewButton_7 = new JButton("        Annonces refusées");
		btnNewButton_7.setForeground(new Color(70, 130, 180));
		btnNewButton_7.setBackground(new Color(220, 220, 220));
		btnNewButton_7.setFont(new Font("Helvetica", Font.BOLD, 13));
		btnNewButton_7.setBounds(16, 320, 263, 40);
		btnNewButton_7.setBorder(new LineBorder(new Color(255, 255, 255)));
		add(btnNewButton_7);
		
		JLabel label_11 = new JLabel("");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Icone_Ajout_Compte_22x22.png"));
		label_11.setBounds(37, 358, 39, 40);
		add(label_11);
		
		JButton btnNewButton_8 = new JButton("       Créer compte");
		btnNewButton_8.setForeground(new Color(70, 130, 180));
		btnNewButton_8.setBackground(new Color(220, 220, 220));
		btnNewButton_8.setFont(new Font("Helvetica", Font.BOLD, 13));
		btnNewButton_8.setBounds(16, 358, 263, 40);
		btnNewButton_8.setBorder(new LineBorder(new Color(255, 255, 255)));
		add(btnNewButton_8);
		
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("C:\\Users\\JeSsyKa\\workspace\\IHMProjet\\img\\Icone_Deconnexion_Carre_38x38.png"));
		label_6.setBounds(61, 610, 56, 57);
		add(label_6);
		
		
		JButton btnDeconnexion = new JButton("Deconnexion");
		btnDeconnexion.setForeground(new Color(255, 255, 255));
		btnDeconnexion.setBackground(new Color(86, 162,195 ));
		btnDeconnexion.setFont(new Font("Helvetica", Font.BOLD, 12));
		btnDeconnexion.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		btnDeconnexion.setBounds(112, 629, 167, 28);
		add(btnDeconnexion);
		
		

	}
}
