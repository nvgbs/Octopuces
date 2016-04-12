package model.advert;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table (name = "subcategory")

public class SubCategory extends DataParent
{
	private static final String NOM_ID = "sub_id";
	

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name =NOM_ID)
	private Integer id = null;
	
	@Column (name = "sub_name")
	@NotNull
	private String name = null;
	
	@ManyToOne
	@JoinColumn (name = "cat_id")
	@NotNull
	private Category category = null;
	
	/*Constructor*/
	
	public SubCategory (Integer id, String name, Category category)
	{
		this.id = id;
		this.name = name;
		this.category = category;
	}

	
	
	public SubCategory() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Category getCategory() {
		return category;
	}



	public void setCategory(Category category) {
		this.category = category;
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
		return category;
	}

	public void setCat(Category cat) {
		this.category = cat;
	}
	
	
	
	
	
	
	
}//end
