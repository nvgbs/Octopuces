package ihm.tableaubord;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JPanel;
import metier.user.UserRequest;
import model.user.Role;
import model.user.User;

public class PGridLayoutForUser extends JPanel
{

	private static final long serialVersionUID = 1L;

	public PGridLayoutForUser(Boolean admin) throws Exception
	{

		List<User> listUser;
		
		if (admin == true)
		{
			listUser = UserRequest.getAllUser();
		} else
		{
			listUser = UserRequest.getUserByRole(Role.NUM_ROLE_USER);
		}

		setBackground(new Color(70, 130, 180));
		GridLayout grid = new GridLayout(listUser.size(), 1, 0, 10);
		setLayout(grid);

		for (User user : listUser)
		{

			this.add(new PUser(user));

		}
	}
}
