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
@Table (name = "region")

public class Region extends DataParent
{
	public Region() {
		super();
		// TODO Auto-generated constructor stub
	}




	public static final String NOM_ID = "reg_id";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = NOM_ID)
	private Integer id = null;
	
	
	@Column (name = "reg_name")
	@NotNull
	private String name= null;
	
	
	
	
	/*Constructor*/
	
	public Region (Integer id, String name)
	{	
		super();
		this.id = id;
		this.name = name;
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
	
	
	
	
}//end