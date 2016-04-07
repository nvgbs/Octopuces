package model.list;

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
@Table (name = "add_list")

public class AddList implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Id
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "add_adv_id", referencedColumnName = "adv_id")
	@NotNull
	private Advert advert = null;
	
	
	
	@Id
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "add_adl_id", referencedColumnName = "adl_id")
	@NotNull
	private AdvertList advertList = null;
	
	@Column (name = "add_date")
	@NotNull
	private Date date = null;
	
	
	
	
	public AddList (Advert advert, AdvertList advertList, Date date)
	{
		this.advert = advert;
		this.advertList = advertList;
		this.date = date;
	}
	
	

	

	public Advert getAdvert() {
		return advert;
	}



	public void setAdvert(Advert advert) {
		this.advert = advert;
	}



	public AdvertList getAdvertList() {
		return advertList;
	}



	public void setAdvertList(AdvertList advertList) {
		this.advertList = advertList;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}

	
	
	
	
	
}
