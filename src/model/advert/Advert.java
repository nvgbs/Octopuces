package model.advert;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import model.DataParent;
import model.basket.AdvertToBasket;
import model.user.User;

@Entity
@Table(name = "advert")

public class Advert extends DataParent {
	public static final Integer WAIT_STATE = 0;
	public static final Integer VALIDATE_STATE = 1;
	public static final Integer UNVALIDATE_STATE = 2;
	
	
	public static final String NOM_ID = "adv_id";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = NOM_ID)
	private Integer id = null;

	@Column(name = "adv_title")
	@NotNull
	private String title = null;

	@Column(name = "adv_date")
	@NotNull
	private Date date = null;

	@Column(name = "adv_description")
	@NotNull
	private String description = null;

	@Column(name = "adv_price")
	@NotNull
	private Float price = null;

	@Column(name = "adv_phone")
	@NotNull
	private Boolean phone = null;

	@Column(name = "adv_email")
	@NotNull
	private Boolean email = null;

	@Column(name = "adv_state")
	@NotNull
	private Integer state = null;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "sub_id")
	@NotNull
	private SubCategory subCategory = null;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "usr_id")
	@NotNull
	private User user = null;
	
	@OneToMany(mappedBy = "advert", fetch = FetchType.LAZY)
	private List<AdvertToBasket> advertBasket = null;


	/* Constructor */	
	

	public Advert() {
		super();
	}

	public Advert(String title, Date date, String description, Float price, Boolean phone, Boolean email,
			Integer state, SubCategory subCategory, User user) {
		super();
		this.title = title;
		this.date = date;
		this.description = description;
		this.price = price;
		this.phone = phone;
		this.email = email;
		this.state = state;
		this.subCategory = subCategory;
		this.user = user;
		
	}

	
	
	
	
	public List<AdvertToBasket> getAdvertBasket() {
		return advertBasket;
	}

	public void setAdvertBasket(List<AdvertToBasket> advertBasket) {
		this.advertBasket = advertBasket;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Boolean getPhone() {
		return phone;
	}

	public void setPhone(Boolean phone) {
		this.phone = phone;
	}

	public Boolean getEmail() {
		return email;
	}

	public void setEmail(Boolean email) {
		this.email = email;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	
	public SubCategory getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

}// END
