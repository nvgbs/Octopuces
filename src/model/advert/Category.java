package model.advert;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import model.DataParent;

@Entity
@Table (name = "category")

public class Category extends DataParent
{

	public static final String NOM_ID = "cat_id";
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = NOM_ID)
	private Integer id = null;
	
	@Column (name = "cat_name")
	@NotNull
	private String name = null;
	
	
	
	/*Constructor*/
	
	public Category (Integer id, String name)
	{
		this.id = id;
		this.name = name;
	}


	public Category() {
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
	
	
	
	
	
	
	
	
	
	
}//end
