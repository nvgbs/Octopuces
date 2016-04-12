package model.basket;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import model.advert.Advert;

@Entity
@Table (name = "advert_basket")

public class AdvertToBasket implements Serializable {
	
	private static final long serialVersionUID = 1L;


	@Column (name = "adb_date")
	@NotNull
	private Date date = null;
	

	@Id
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "adb_adv_id", referencedColumnName = "adv_id")
	@NotNull
	private Advert advert = null;
	
	
	
	@Id
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "adb_bas_id", referencedColumnName = "bas_id")
	@NotNull
	private Basket basket = null;
	
	
	public AdvertToBasket (Advert advert, Basket basket, Date date)
	{
		this.advert = advert;
		this.basket = basket;
		this.date = date;
	}
	
	public AdvertToBasket ()
	{
		super();
	}

	

	public Advert getAdvert() {
		return advert;
	}



	public void setAdvert(Advert advert) {
		this.advert = advert;
	}



	

	public Basket getBasket() {
		return basket;
	}





	public void setBasket(Basket basket) {
		this.basket = basket;
	}





	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}

	
	
	
	
	
}
