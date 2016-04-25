package ihm.tableaubord;

import javax.swing.JPanel;

import model.user.User;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;

import actionlistener.UserListener;

public class PUser extends JPanel
{

	private static final long serialVersionUID = 1L;
	
	private JButton buttonUpdate = new JButton("Modifier");
	JButton buttonDelete = new JButton("Supprimer");
	User userClone;
	
	JLabel lblMailContent;
	JLabel lblPhoneContent;
	JLabel lblZipContent;
	JLabel lblCityContent;
	
	JLabel lblZip;
	JLabel lblCity;
	JLabel lblMail;
	JLabel lblPhone;
	
	public PUser(User user)
	{
		UserListener userListener = new UserListener(this);
		
		this.userClone = user;
		setBackground(Color.WHITE);
		
		JLabel lblUser = new JLabel("Utilisateur :");
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblUserContent = new JLabel(userClone.getCivility() + " " + userClone.getFirstName() + " " +userClone.getName());
		
		JLabel lblLogin = new JLabel("Login :");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblLoginContent = new JLabel(userClone.getLogin());
								
		JLabel lblRole = new JLabel("Role :");
		lblRole.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblRoleContent = new JLabel(userClone.getRole().getName());
		
		buttonUpdate.setForeground(Color.WHITE);
		buttonUpdate.setFont(new Font("Helvetica", Font.BOLD, 12));
		buttonUpdate.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		buttonUpdate.setBackground(new Color(70, 130, 180));
		buttonUpdate.addActionListener(userListener);
		
		buttonDelete.setForeground(Color.WHITE);
		buttonDelete.setFont(new Font("Helvetica", Font.BOLD, 12));
		buttonDelete.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		buttonDelete.setBackground(new Color(70, 130, 180));
		buttonDelete.addActionListener(userListener);
		if (userClone.getContact() != null)
		{
			lblMailContent = new JLabel(userClone.getContact().getEmail());
			lblPhoneContent = new JLabel(userClone.getContact().getPhone());
			lblZipContent = new JLabel(userClone.getContact().getZip());
			lblCityContent = new JLabel(userClone.getContact().getCity());
			
			lblZip = new JLabel("Code postal :");
			lblCity = new JLabel("Ville :");
			lblMail = new JLabel("Email :");
			lblPhone = new JLabel("Téléphone :");
		}
		else
		{
			lblZip = new JLabel("");
			lblCity = new JLabel("");
			lblMail = new JLabel("");
			lblPhone = new JLabel("");
			
			
			lblMailContent = new JLabel("");			
			lblPhoneContent = new JLabel("");
			lblZipContent = new JLabel("");
			lblCityContent = new JLabel("");
		}
		
		lblZip.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCity.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMail.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblRole))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblRoleContent)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblLogin)
								.addComponent(lblUser, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
							.addGap(41)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblUserContent, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblLoginContent)
									.addGap(76)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblZip)
										.addComponent(lblMail)
										.addComponent(lblPhone)
										.addComponent(lblCity))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(lblCityContent)
											.addComponent(lblMailContent, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblPhoneContent, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblZipContent)))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(72)
							.addComponent(buttonUpdate, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(buttonDelete, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(112, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUser)
						.addComponent(lblUserContent))
					.addGap(40)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLogin)
						.addComponent(lblLoginContent)
						.addComponent(lblMail)
						.addComponent(lblMailContent))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPhone)
						.addComponent(lblPhoneContent))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblZip)
						.addComponent(lblZipContent))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRole)
						.addComponent(lblRoleContent)
						.addComponent(lblCity)
						.addComponent(lblCityContent))
					.addGap(73)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(buttonUpdate, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonDelete, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(35, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		
	}

	public JButton getButtonUpdate()
	{
		return buttonUpdate;
	}

	public JButton getButtonDelete()
	{
		return buttonDelete;
	}
	
	public User getUser()
	{
		return userClone;
	}
}
