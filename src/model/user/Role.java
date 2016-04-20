package model.user;

import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import model.DataParent;

@Entity
@Table (name = "role")

public class Role extends DataParent
{
	public static final String NOM_ID = "rol_id";
	
	public static final Integer NUM_ROLE_ADMINISTRATEUR = 1;
	public static final Integer NUM_ROLE_MODERATEUR = 2;
	public static final Integer NUM_ROLE_USER = 3;
	
	@Id
	@Column(name = NOM_ID)
	@Range(min=1, max=3)
	private Integer id = null;
	
	@Column(name = "rol_name")
	@NotNull
	private String name = null;
	
	
	
	/*Constructor*/
	
	public Role (Integer id, String name)
	{
		this.id = id;
		this.name = name;
		
	}



	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}



	


	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	

}//END
