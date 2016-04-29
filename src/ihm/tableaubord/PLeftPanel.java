package ihm.tableaubord;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import actionlistener.ActionMenuListener;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class PLeftPanel extends JPanel
{
	private JButton disconnectBtn = new JButton("Deconnexion");
	private JButton listUserBtn = new JButton("Liste utilisateurs");
	private JButton listUserBtnAdmin = new JButton("Liste utilisateurs");
	private JButton boardTableBtn = new JButton("Tableau de bord");
	private JButton waitAdvertBtn = new JButton("Annonces en attente");
	private JButton checkAdvertBtn = new JButton("Annonces Validées");
	private JButton refuseAdvertBtn = new JButton("Annonces Désactivées");
	private JButton createUserBtn = new JButton("Créer utilisateur");
	
	
	private static final long serialVersionUID = 1L;
	private final JLabel lblLogo = new JLabel("");
	
	public PLeftPanel(PCenterPanel centerPanel, Boolean admin)
	{
		ActionMenuListener menuListener = new ActionMenuListener(this, centerPanel);
		
		
		
		setBorder(new EmptyBorder(10, 10, 10, 0));
		this.setBackground(new Color(255, 255, 255));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{250, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 50, 50, 50, 50, 50, 50, 50, 50, 50};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		setLayout(gridBagLayout);
		
		if (admin == true)
		{
			createUserBtn.addActionListener(menuListener);
			createUserBtn.addMouseListener(menuListener);
			createUserBtn.setForeground(new Color(70, 130, 180));
			createUserBtn.setBackground(new Color(255, 255, 255));
			createUserBtn.setFont(new Font("SansSerif", Font.BOLD, 14));
			createUserBtn.setBorder(new LineBorder(new Color(70, 130, 180), 2, true));
			GridBagConstraints gbc_createUserBtn = new GridBagConstraints();
			gbc_createUserBtn.fill = GridBagConstraints.BOTH;
			gbc_createUserBtn.insets = new Insets(0, 0, 5, 0);
			gbc_createUserBtn.gridx = 0;
			gbc_createUserBtn.gridy = 8;
			this.add(createUserBtn, gbc_createUserBtn);
			createUserBtn.setIcon(new ImageIcon(PLeftPanel.class.getResource("/img/Icone_Creer_Compte_20x20.png")));
			createUserBtn.setIconTextGap(54);	
			createUserBtn.setFocusPainted(false);
		}
		disconnectBtn.setFocusPainted(false);
		
		
		
		
		disconnectBtn.addActionListener(menuListener);
		disconnectBtn.addMouseListener(menuListener);
			
			GridBagConstraints gbc_lblLogo = new GridBagConstraints();
			gbc_lblLogo.insets = new Insets(0, 0, 5, 0);
			gbc_lblLogo.gridx = 0;
			gbc_lblLogo.gridy = 0;
			lblLogo.setIcon(new ImageIcon(PLeftPanel.class.getResource("/img/LOGO OCTOPUCES detouré.png")));
			add(lblLogo, gbc_lblLogo);
			refuseAdvertBtn.setFocusPainted(false);
			
			refuseAdvertBtn.addActionListener(menuListener);
			refuseAdvertBtn.addMouseListener(menuListener);
			checkAdvertBtn.setFocusPainted(false);
			
			checkAdvertBtn.addActionListener(menuListener);
			checkAdvertBtn.addMouseListener(menuListener);
			waitAdvertBtn.setFocusPainted(false);
			
			waitAdvertBtn.addActionListener(menuListener);
			waitAdvertBtn.addMouseListener(menuListener);
			boardTableBtn.setFocusPainted(false);
			
			boardTableBtn.addActionListener(menuListener);
			boardTableBtn.addMouseListener(menuListener);
			boardTableBtn.setIcon(new ImageIcon(PLeftPanel.class.getResource("/img/Icone_Tableau_20x20.png")));
			boardTableBtn.setIconTextGap(47);
			boardTableBtn.setForeground(new Color(70, 130, 180));
			boardTableBtn.setBackground(new Color(255, 255, 255));
			boardTableBtn.setFont(new Font("SansSerif", Font.BOLD, 14));
			boardTableBtn.setBorder(new LineBorder(new Color(70, 130, 180), 2));
			GridBagConstraints gbc_boardTableBtn = new GridBagConstraints();
			gbc_boardTableBtn.fill = GridBagConstraints.BOTH;
			gbc_boardTableBtn.insets = new Insets(0, 0, 5, 0);
			gbc_boardTableBtn.gridx = 0;
			gbc_boardTableBtn.gridy = 3;
			this.add(boardTableBtn, gbc_boardTableBtn);
			waitAdvertBtn.setIcon(new ImageIcon(PLeftPanel.class.getResource("/img/Icone_Pencil_20x20.png")));
			waitAdvertBtn.setIconTextGap(20);
			waitAdvertBtn.setForeground(new Color(70, 130, 180));
			waitAdvertBtn.setBackground(new Color(255, 255, 255));
			waitAdvertBtn.setFont(new Font("SansSerif", Font.BOLD, 14));
			waitAdvertBtn.setBorder(new LineBorder(new Color(70, 130, 180), 2));
			GridBagConstraints gbc_waitAdvertBtn = new GridBagConstraints();
			gbc_waitAdvertBtn.fill = GridBagConstraints.BOTH;
			gbc_waitAdvertBtn.insets = new Insets(0, 0, 5, 0);
			gbc_waitAdvertBtn.gridx = 0;
			gbc_waitAdvertBtn.gridy = 4;
			this.add(waitAdvertBtn, gbc_waitAdvertBtn);
			checkAdvertBtn.setIconTextGap(33);
			checkAdvertBtn.setIcon(new ImageIcon(PLeftPanel.class.getResource("/img/Icone_In_20x20.png")));
			checkAdvertBtn.setForeground(new Color(70, 130, 180));
			checkAdvertBtn.setBackground(new Color(255, 255, 255));
			checkAdvertBtn.setFont(new Font("SansSerif", Font.BOLD, 14));
			checkAdvertBtn.setBorder(new LineBorder(new Color(70, 130, 180), 2));
			GridBagConstraints gbc_checkAdvertBtn = new GridBagConstraints();
			gbc_checkAdvertBtn.fill = GridBagConstraints.BOTH;
			gbc_checkAdvertBtn.insets = new Insets(0, 0, 5, 0);
			gbc_checkAdvertBtn.gridx = 0;
			gbc_checkAdvertBtn.gridy = 5;
			this.add(checkAdvertBtn, gbc_checkAdvertBtn);
			refuseAdvertBtn.setIcon(new ImageIcon(PLeftPanel.class.getResource("/img/Icone_Croix_Refuse_20x20.png")));
			refuseAdvertBtn.setIconTextGap(33);
			refuseAdvertBtn.setForeground(new Color(70, 130, 180));
			refuseAdvertBtn.setBackground(new Color(255, 255, 255));
			refuseAdvertBtn.setFont(new Font("SansSerif", Font.BOLD, 14));
			refuseAdvertBtn.setBorder(new LineBorder(new Color(70, 130, 180), 2));
			GridBagConstraints gbc_refuseAdvertBtn = new GridBagConstraints();
			gbc_refuseAdvertBtn.fill = GridBagConstraints.BOTH;
			gbc_refuseAdvertBtn.insets = new Insets(0, 0, 5, 0);
			gbc_refuseAdvertBtn.gridx = 0;
			gbc_refuseAdvertBtn.gridy = 6;
			this.add(refuseAdvertBtn, gbc_refuseAdvertBtn);
		listUserBtn.setFocusPainted(false);
		
		
			listUserBtn.addActionListener(menuListener);
			listUserBtn.addMouseListener(menuListener);
			listUserBtn.setIcon(new ImageIcon(PLeftPanel.class.getResource("/img/Icone_Utilisateurs_20x20.png")));
			listUserBtn.setIconTextGap(49);
			listUserBtn.setForeground(new Color (70, 130, 180));
			listUserBtn.setBackground(new Color(255, 255, 255));
			listUserBtn.setFont(new Font ("Helvetica", Font.BOLD, 14));
			listUserBtn.setBorder(new LineBorder (new Color (70, 130, 180), 2));
			GridBagConstraints gbc_listUserBtn = new GridBagConstraints();
			gbc_listUserBtn.fill = GridBagConstraints.BOTH;
			gbc_listUserBtn.insets = new Insets(0, 0, 5, 0);
			gbc_listUserBtn.gridx = 0;
			gbc_listUserBtn.gridy = 7;
			this.add(listUserBtn, gbc_listUserBtn);
		disconnectBtn.setIcon(new ImageIcon(PLeftPanel.class.getResource("/img/Icone_Deconnexion_Carre_38x38.png")));
		disconnectBtn.setIconTextGap(60);
		disconnectBtn.setForeground(new Color(70, 130, 180));
		disconnectBtn.setBackground(new Color(255, 255, 255));
		disconnectBtn.setFont(new Font("SansSerif", Font.BOLD, 14));
		disconnectBtn.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		GridBagConstraints gbc_disconnectBtn = new GridBagConstraints();
		gbc_disconnectBtn.fill = GridBagConstraints.BOTH;
		gbc_disconnectBtn.gridx = 0;
		gbc_disconnectBtn.gridy = 10;
		this.add(disconnectBtn, gbc_disconnectBtn);
	}

	
	public JButton getDisconnectBtn()
	{
		return disconnectBtn;
	}

	public JButton getListUserBtn() 
	{
		return listUserBtn;
	}

	public JButton getBoardTableBtn() 
	{
		return boardTableBtn;
	}

	public JButton getWaitAdvertBtn() 
	{
		return waitAdvertBtn;
	}

	public JButton getCheckAdvertBtn()
	{
		return checkAdvertBtn;
	}

	public JButton getRefuseAdvertBtn()
	{
		return refuseAdvertBtn;
	}

	public JButton getCreateUserBtn() 
	{
		return createUserBtn;
	}
	
	public JButton getListUserBtnAdmin()
	{
		return listUserBtnAdmin;
	}

	
	
	
}//END
