package model.list;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table (name = "advert_list")
public class AdvertList extends DataParent
{
	
	public static final String NOM_ID = "adl_id";
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = NOM_ID)
	private Integer id = null;
	
	@Column (name = "adl_name")
	@NotNull
	private String name = null;
	
	@OneToOne (fetch=FetchType.LAZY)
	@JoinColumn (name = "usr_id")
	@NotNull
	private User user = null;
	
	//@ManyToMany (fetch = FetchType.LAZY)
	//@JoinTable (name = "add_list", joinColumns = @JoinColumn (name = "adv_id"), inverseJoinColumns = @JoinColumn (name = "adl_id"))
	//private List <Advert> advertList = null;
	
	
	
	
	/*CONSTRUCTOR*/
	
	public AdvertList(String name, User user)
	{
		this.name = name;
		this.user = user;
	}

	
	
	
	/* GETTERS / SETTERS */
	
	public Integer getId ()
	{
		return this.id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	

}//END
