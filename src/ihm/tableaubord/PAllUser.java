package ihm.tableaubord;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class PAllUser extends JPanel
{

	private static final long serialVersionUID = 1L;
	
	private Boolean admin;
	
	public PAllUser(String title, Boolean admin) throws Exception
	{
		this.admin= admin;
		this.setBackground(new Color(70, 130, 180));
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitle = new JLabel(title);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblTitle.setForeground(Color.WHITE);
		add(lblTitle, BorderLayout.NORTH);
		
		JLabel LabelQuiSertARien = new JLabel(" ");
		add(LabelQuiSertARien, BorderLayout.SOUTH);
		
		PGridLayoutForUser gridLayoutForUser = new PGridLayoutForUser(admin);
		add(gridLayoutForUser, BorderLayout.CENTER);
		
		JScrollPane scroll = new JScrollPane(gridLayoutForUser);
		scroll.getVerticalScrollBar().setUnitIncrement(10);
		this.add(scroll);
	}

}
