package model.subscription;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import model.DataParent;
import model.user.User;

@Entity
@Table (name = "subscription")

public class Subscription extends DataParent
{
	public static final String NOM_ID = "sub_id";
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = NOM_ID)
	private Integer id = null;
	
	@Column (name = "sub_email")
	@NotNull
	private String email = null;
	
	@OneToOne
	@JoinColumn (name = "usr_id")
	private User usr = null;
	
	
	
	
	
	/*Constructor*/	
	
	public Subscription (Integer id, String email, User usr)
	{
				
		this.id = id;
		this.email = email;
		this.usr = usr;
	}





	public Integer getId() {
		return id;
	}





	public void setId(Integer id) {
		this.id = id;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public User getUsr() {
		return usr;
	}





	public void setUsr(User usr) {
		this.usr = usr;
	}
	
	
}//end
