package model.advert;

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

@Entity
@Table (name = "subcategory")

public class SubCategory extends DataParent
{
	private static final String NOM_ID = "sca_id";
	

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name =NOM_ID)
	private Integer id = null;
	
	@Column (name = "sca_name")
	@NotNull
	private String name = null;
	
	@OneToOne
	@JoinColumn (name = "cat_id")
	@NotNull
	private Category cat = null;
	
	/*Constructor*/
	
	public SubCategory (Integer id, String name, Category cat)
	{
		this.id = id;
		this.name = name;
		this.cat = cat;
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

	public Category getCat() {
		return cat;
	}

	public void setCat(Category cat) {
		this.cat = cat;
	}
	
	
	
	
	
	
	
}//end
