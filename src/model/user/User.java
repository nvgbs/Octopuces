package model.user;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import model.DataParent;

@Entity
@Table(name = "user")

public class User extends DataParent
{
	public static final String NOM_ID = "usr_id";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = NOM_ID)
	private Integer id = null;

	@Column(name = "usr_civility")
	@NotNull
	private String civility = null;

	@Column(name = "usr_name")
	@NotNull
	private String name = null;

	@Column(name = "usr_firstname")
	@NotNull
	private String firstName = null;

	@Column(name = "usr_login")
	@NotNull
	private String login = null;

	@Column(name = "usr_password")
	@NotNull
	private String password = null;

	@Column(name = "usr_subscription")
	@NotNull
	private Boolean subscription = false;

	@Column(name = "usr_enable")
	@NotNull
	private Boolean accountEnabled = true;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "con_id")
	private Contact contact = null;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "rol_id")
	private Role role = null;

	/* Constructor */

	public User(String civility, String name, String firstName, String login, String password, Contact contact,
			Role role)
	{
		this.civility = civility;
		this.name = name;
		this.firstName = firstName;
		this.login = login;
		this.password = password;
		this.contact = contact;
		this.role = role;
	}

	public User(String civility, String name, String firstName, String login, String password)
	{
		super();
		this.civility = civility;
		this.name = name;
		this.firstName = firstName;
		this.login = login;
		this.password = password;

	}
	public User(String civility, String name, String firstName, String login, String password, Role role)
	{
		super();
		this.civility = civility;
		this.name = name;
		this.firstName = firstName;
		this.login = login;
		this.password = password;
		this.role = role;

	}
	
	
	
	
	

	public User()
	{
		super();

	}

	public Boolean getSubscription()
	{
		return subscription;
	}

	public void setSubscription(Boolean subscription)
	{
		this.subscription = subscription;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Integer getId()
	{
		return id;
	}

	public String getCivility()
	{
		return civility;
	}

	public void setCivility(String civility)
	{
		this.civility = civility;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLogin()
	{
		return login;
	}

	public void setLogin(String login)
	{
		this.login = login;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public Boolean getAccountEnabled()
	{
		return accountEnabled;
	}

	public void setAccountEnabled(Boolean accountEnabled)
	{
		this.accountEnabled = accountEnabled;
	}

	public Contact getContact()
	{
		return contact;
	}

	public void setContact(Contact contact)
	{
		this.contact = contact;
	}

	public Role getRole()
	{
		return role;
	}

	public void setRole(Role role)
	{
		this.role = role;
	}

}// end
