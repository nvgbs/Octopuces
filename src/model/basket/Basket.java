package model.basket;

import java.util.List;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import model.DataParent;

@Entity
@Table (name = "basket")
public class Basket extends DataParent
{
	
	public static final String NOM_ID = "bas_id";
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = NOM_ID)
	private Integer id = null;
	
	@Column (name = "bas_name")
	@NotNull
	private String name = null;
	
	@OneToMany(mappedBy = "basket", fetch = FetchType.LAZY)
	private List<AdvertToBasket> advertBasket = null;

	
	
	public Basket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId ()
	{
		return this.id;
	}
	
	public Basket(String name, List<AdvertToBasket> advertBasket) {
		super();
		this.name = name;
		this.advertBasket = advertBasket;
	}

	public List<AdvertToBasket> getAdvertBasket() {
		return advertBasket;
	}

	public void setAdvertBasket(List<AdvertToBasket> advertBasket) {
		this.advertBasket = advertBasket;
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
