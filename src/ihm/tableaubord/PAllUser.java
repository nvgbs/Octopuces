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
	
	public PAllUser(String title) throws Exception
	{
		this.setBackground(new Color(56, 146, 184));
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitle = new JLabel(title);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblTitle.setForeground(Color.WHITE);
		add(lblTitle, BorderLayout.NORTH);
		
		JLabel LabelQuiSertARien = new JLabel(" ");
		add(LabelQuiSertARien, BorderLayout.SOUTH);
		
		PGridLayoutForUser gridLayoutForUser = new PGridLayoutForUser();
		add(gridLayoutForUser, BorderLayout.CENTER);
		
		JScrollPane scroll = new JScrollPane(gridLayoutForUser);
		this.add(scroll);
	}

}
