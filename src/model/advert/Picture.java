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
@Table (name = "picture")

public class Picture extends DataParent
{
	public static final String NOM_ID = "pic_id";
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = NOM_ID)	
	private Integer id = null;
	
	@Column (name = "pic_num")
	@NotNull
	private Integer num = null;
	
	@Column (name = "pic_name")
	@NotNull
	private String name = null;
	
	@Column (name = "pic_url")
	@NotNull
	private String url = null;
	
	@ManyToOne
	@JoinColumn (name = "adv_id")
	@NotNull
	private Advert advert = null;
	
	
	
	/*Constructor*/	
	
	public Picture (Integer id, Integer num, String name, String url, Advert advert)
	{
		this.id = id;
		this.num = num;
		this.name = name;
		this.url = url;
		this.advert = advert;
	}



	public Picture() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getNum() {
		return num;
	}



	public void setNum(Integer num) {
		this.num = num;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public Advert getAdvert() {
		return advert;
	}



	public void setAdvert(Advert advert) {
		this.advert = advert;
	}



	
	

}//end