package ihm.pagemodifcompte;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import ihm.pageconnexion.FrameLogin;

public class FrameModifCompte extends JFrame {

	private JPanel contentPane;


	public FrameModifCompte() {
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setBounds(100, 100, 400, 400);
		this.setTitle("Ajouter un compte Adminitrateur - Modérateur");
		this.setAlwaysOnTop(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		PUpdateAccount panelAjoutCompte = new PUpdateAccount();
		contentPane.add(panelAjoutCompte);
	}

}
