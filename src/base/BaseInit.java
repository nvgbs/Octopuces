package base;

import java.util.Date;

import base.dao.DaoFactory;
import model.advert.Advert;
import model.advert.Category;
import model.advert.SubCategory;
import model.user.Contact;
import model.user.Region;
import model.user.Role;
import model.user.User;

public class BaseInit {

	public static Boolean initData() throws Exception
	{
		
		Region region = new Region (null, "Hérault");
		DaoFactory.getDaoRegion().saveOrUpdate(region);
		
		Role admin = new Role (Role.NUM_ROLE_ADMINISTRATEUR, "Admin");
		DaoFactory.getDaoRole().saveOrUpdate(admin);
		
		Role moderator = new Role (Role.NUM_ROLE_MODERATEUR, "Moderator");
		DaoFactory.getDaoRole().saveOrUpdate(moderator);
		
		Role user = new Role (Role.NUM_ROLE_USER, "User");		
		DaoFactory.getDaoRole().saveOrUpdate(user);
		
		Contact contact1 = new Contact ("34000", "Montpellier", "0485256369", "normannbadr@gmail.com", region);
		Contact contact2 = new Contact ("34000", "Montpellier", "0485256369", "isabellerigault@gmail.com", region);
		Contact contact3 = new Contact ("34000", "Montpellier", "0485256369", "sebgenre@gmail.com", region);
		Contact contact4 = new Contact ("34000", "Montpellier", "0485256369", "jessykamarty@gmail.com", region);
		Contact contact5 = new Contact ("34000", "Montpellier", "0485256369", "meynadierjulien@gmail.com", region);
		
		DaoFactory.getDaoContact().saveOrUpdate(contact1);
		DaoFactory.getDaoContact().saveOrUpdate(contact2);
		DaoFactory.getDaoContact().saveOrUpdate(contact3);
		DaoFactory.getDaoContact().saveOrUpdate(contact4);
		DaoFactory.getDaoContact().saveOrUpdate(contact5);
		
		
		User user1 = new User ("Monsieur", "Badr", "Normann", "Nono" , "1603", contact1, admin);
		User user2 = new User ("Madame", "Rigault", "Isabelle", "Isa","0000", contact2, admin);
		User user3 = new User ("Monsieur", "Genre", "Seb", "Seb", "1111", contact3, admin); 
		User user4 = new User ("Madame", "Marty", "Jessyka", "Red Fish", "2222", contact4, admin);
		User user5 = new User ("Monsieur", "Meynadier", "Julien", "Ju", "3333", contact5, admin);
		
		
		DaoFactory.getDaoUser().saveOrUpdate(user1);
		DaoFactory.getDaoUser().saveOrUpdate(user2);
		DaoFactory.getDaoUser().saveOrUpdate(user3);
		DaoFactory.getDaoUser().saveOrUpdate(user4);
		DaoFactory.getDaoUser().saveOrUpdate(user5);
		
		
		
		Category cat1 = new Category(null, "Vehicule");
		DaoFactory.getDaoCategory().saveOrUpdate(cat1);
		
		
		SubCategory subca = new SubCategory(null, "2Roues", cat1);		
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca);
	
		
		Advert advert1 = new Advert ("Velo", new Date(), "vélo des familles", 500.0f, true, true, 0, subca, user1);
		DaoFactory.getDaoAdvert().saveOrUpdate(advert1);
		
		
		
		return true;
	}
	
}
