package model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import model.DataParent;

@Entity
@Table (name = "role")

public class Role extends DataParent
{
	public static final String NOM_ID = "rol_id";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = NOM_ID)
	private Integer role = null;
	
	@Column(name = "rol_name")
	@NotNull
	private String name = null;
	
	
	
	/*Constructor*/
	
	public Role (Integer role, String name)
	{
		this.role = role;
		this.name = name;
		
	}



	public Integer getId() {
		return role;
	}



	public void setId(Integer role) {
		this.role = role;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	

}//end 
