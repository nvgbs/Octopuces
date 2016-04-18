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

public class PUser extends JPanel
{

	private static final long serialVersionUID = 1L;
	
	public PUser(User user)
	{
		setBackground(Color.WHITE);
		
		JLabel lblUser = new JLabel("Utilisateur :");
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblUserContent = new JLabel(user.getCivility() + " " + user.getFirstName() + " " +user.getName());
		
		JLabel lblLogin = new JLabel("Login :");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblLoginContent = new JLabel(user.getLogin());
		
		JLabel lblPassword = new JLabel("Mot de passe :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblPasswordContent = new JLabel(user.getPassword());
		
		JLabel lblZip = new JLabel("Code postal :");
		lblZip.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblCity = new JLabel("Ville :");
		lblCity.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblMail = new JLabel("Email :");
		lblMail.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblPhone = new JLabel("Téléphone :");
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblRole = new JLabel("Role :");
		lblRole.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblRoleContent = new JLabel(user.getRole().getName());
		
		JButton button = new JButton("Modifier");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Helvetica", Font.BOLD, 12));
		button.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		button.setBackground(new Color(56, 146, 184));
		
		JButton button_1 = new JButton("Supprimer ");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Helvetica", Font.BOLD, 12));
		button_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		button_1.setBackground(new Color(56, 146, 184));
		
		JLabel lblMailContent = new JLabel(user.getContact().getEmail());
		
		JLabel lblPhoneContent = new JLabel(user.getContact().getPhone());
		
		JLabel lblZipContent = new JLabel(user.getContact().getZip());
		
		JLabel lblCityContent = new JLabel(user.getContact().getCity());
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPassword)
								.addComponent(lblRole))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblRoleContent)
								.addComponent(lblPasswordContent)))
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
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)))
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
						.addComponent(lblPassword)
						.addComponent(lblPasswordContent)
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
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(35, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		
	}
}
