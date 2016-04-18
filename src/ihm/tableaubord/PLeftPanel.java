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

public class PLeftPanel extends JPanel
{
	private JButton disconnectBtn = new JButton("Deconnexion");
	private JButton listUserBtn = new JButton("Liste utilisateurs");
	private JButton boardTableBtn = new JButton("Tableau de bord");
	private JButton waitAdvertBtn = new JButton("Annonces à modérer");
	private JButton checkAdvertBtn = new JButton("Annonces validées");
	private JButton refuseAdvertBtn = new JButton("Annonces refusées");
	private JButton createUserBtn = new JButton("Créer utilisateur");
	
	private static final long serialVersionUID = 1L;

	public PLeftPanel(PCenterPanel centerPanel)
	{
		ActionMenuListener menuListener = new ActionMenuListener(this, centerPanel);
		
		
		
		setBorder(new EmptyBorder(10, 10, 10, 0));
		this.setBackground(new Color(255, 255, 255));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{250, 0};
		gridBagLayout.rowHeights = new int[]{50, 50, 50, 50, 50, 50, 50, 50, 50};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		setLayout(gridBagLayout);
		
		
		boardTableBtn.setIcon(new ImageIcon(PUserList.class.getResource("/img/Icone_Tableau_20x20.png")));
		boardTableBtn.setIconTextGap(47);
		boardTableBtn.setForeground(new Color(70, 130, 180));
		boardTableBtn.setBackground(new Color(255, 255, 255));
		boardTableBtn.setFont(new Font("SansSerif", Font.BOLD, 14));
		boardTableBtn.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		GridBagConstraints gbc_boardTableBtn = new GridBagConstraints();
		gbc_boardTableBtn.fill = GridBagConstraints.BOTH;
		gbc_boardTableBtn.insets = new Insets(0, 0, 5, 0);
		gbc_boardTableBtn.gridx = 0;
		gbc_boardTableBtn.gridy = 0;
		this.add(boardTableBtn, gbc_boardTableBtn);
		
		waitAdvertBtn.addActionListener(menuListener);
		waitAdvertBtn.setIcon(new ImageIcon(PUserList.class.getResource("/img/Icone_Pencil_20x20.png")));
		waitAdvertBtn.setIconTextGap(20);
		waitAdvertBtn.setForeground(new Color(70, 130, 180));
		waitAdvertBtn.setBackground(new Color(255, 255, 255));
		waitAdvertBtn.setFont(new Font("SansSerif", Font.BOLD, 14));
		waitAdvertBtn.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		GridBagConstraints gbc_waitAdvertBtn = new GridBagConstraints();
		gbc_waitAdvertBtn.fill = GridBagConstraints.BOTH;
		gbc_waitAdvertBtn.insets = new Insets(0, 0, 5, 0);
		gbc_waitAdvertBtn.gridx = 0;
		gbc_waitAdvertBtn.gridy = 1;
		this.add(waitAdvertBtn, gbc_waitAdvertBtn);
		
		checkAdvertBtn.addActionListener(menuListener);
		checkAdvertBtn.setIconTextGap(33);
		checkAdvertBtn.setIcon(new ImageIcon(PUserList.class.getResource("/img/Icone_In_20x20.png")));
		checkAdvertBtn.setForeground(new Color(70, 130, 180));
		checkAdvertBtn.setBackground(new Color(255, 255, 255));
		checkAdvertBtn.setFont(new Font("SansSerif", Font.BOLD, 14));
		checkAdvertBtn.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		GridBagConstraints gbc_checkAdvertBtn = new GridBagConstraints();
		gbc_checkAdvertBtn.fill = GridBagConstraints.BOTH;
		gbc_checkAdvertBtn.insets = new Insets(0, 0, 5, 0);
		gbc_checkAdvertBtn.gridx = 0;
		gbc_checkAdvertBtn.gridy = 2;
		this.add(checkAdvertBtn, gbc_checkAdvertBtn);
		
		refuseAdvertBtn.addActionListener(menuListener);
		refuseAdvertBtn.setIcon(new ImageIcon(PUserList.class.getResource("/img/Icone_Croix_Refuse_20x20.png")));
		refuseAdvertBtn.setIconTextGap(33);
		refuseAdvertBtn.setForeground(new Color(70, 130, 180));
		refuseAdvertBtn.setBackground(new Color(255, 255, 255));
		refuseAdvertBtn.setFont(new Font("SansSerif", Font.BOLD, 14));
		refuseAdvertBtn.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		GridBagConstraints gbc_refuseAdvertBtn = new GridBagConstraints();
		gbc_refuseAdvertBtn.fill = GridBagConstraints.BOTH;
		gbc_refuseAdvertBtn.insets = new Insets(0, 0, 5, 0);
		gbc_refuseAdvertBtn.gridx = 0;
		gbc_refuseAdvertBtn.gridy = 3;
		this.add(refuseAdvertBtn, gbc_refuseAdvertBtn);
		
		
		createUserBtn.setIcon(new ImageIcon(PUserList.class.getResource("/img/Icone_Creer_Compte_20x20.png")));
		createUserBtn.setIconTextGap(54);
		createUserBtn.setForeground(new Color(70, 130, 180));
		createUserBtn.setBackground(new Color(255, 255, 255));
		createUserBtn.setFont(new Font("SansSerif", Font.BOLD, 14));
		createUserBtn.setBorder(new LineBorder(new Color(70, 130, 180), 2, true));
		GridBagConstraints gbc_createUserBtn = new GridBagConstraints();
		gbc_createUserBtn.fill = GridBagConstraints.BOTH;
		gbc_createUserBtn.insets = new Insets(0, 0, 5, 0);
		gbc_createUserBtn.gridx = 0;
		gbc_createUserBtn.gridy = 4;
		this.add(createUserBtn, gbc_createUserBtn);
		
		
		listUserBtn.setIcon(new ImageIcon(PUserList.class.getResource("/img/Icone_Utilisateurs_20x20.png")));
		listUserBtn.setIconTextGap(49);
		listUserBtn.setForeground(new Color (70, 130, 180));
		listUserBtn.setBackground(new Color(255, 255, 255));
		listUserBtn.setFont(new Font ("Helvetica", Font.BOLD, 14));
		listUserBtn.setBorder(new LineBorder (new Color (70, 130, 180), 2));
		GridBagConstraints gbc_listUserBtn = new GridBagConstraints();
		gbc_listUserBtn.fill = GridBagConstraints.BOTH;
		gbc_listUserBtn.insets = new Insets(0, 0, 5, 0);
		gbc_listUserBtn.gridx = 0;
		gbc_listUserBtn.gridy = 5;
		this.add(listUserBtn, gbc_listUserBtn);
		
		disconnectBtn.addActionListener(menuListener);
		disconnectBtn.setIcon(new ImageIcon(PLeftPanel.class.getResource("/img/Icone_Deconnexion_Carre_38x38.png")));
		disconnectBtn.setIconTextGap(60);
		disconnectBtn.setForeground(new Color(70, 130, 180));
		disconnectBtn.setBackground(new Color(255, 255, 255));
		disconnectBtn.setFont(new Font("SansSerif", Font.BOLD, 14));
		disconnectBtn.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		GridBagConstraints gbc_disconnectBtn = new GridBagConstraints();
		gbc_disconnectBtn.fill = GridBagConstraints.BOTH;
		gbc_disconnectBtn.gridx = 0;
		gbc_disconnectBtn.gridy = 8;
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

	
	
	
}//END
