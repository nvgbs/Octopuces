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
		
		Region region1 = new Region (null, "Alsace");
		DaoFactory.getDaoRegion().saveOrUpdate(region1);		
		Region region2 = new Region (null, "Aquitaine");
		DaoFactory.getDaoRegion().saveOrUpdate(region2);
		Region region3 = new Region (null, "Auvergne");
		DaoFactory.getDaoRegion().saveOrUpdate(region3);
		Region region4 = new Region (null, "Basse Normandie");
		DaoFactory.getDaoRegion().saveOrUpdate(region4);
		Region region5 = new Region (null, "Bourgogne");
		DaoFactory.getDaoRegion().saveOrUpdate(region5);
		Region region6 = new Region (null, "Bretagne");
		DaoFactory.getDaoRegion().saveOrUpdate(region6);
		Region region7 = new Region (null, "Centre");
		DaoFactory.getDaoRegion().saveOrUpdate(region7);
		Region region8 = new Region (null, "Champagne-Ardennes");
		DaoFactory.getDaoRegion().saveOrUpdate(region8);
		Region region9 = new Region (null, "Corse");
		DaoFactory.getDaoRegion().saveOrUpdate(region9);
		Region region10 = new Region (null, "Franche-Comté");
		DaoFactory.getDaoRegion().saveOrUpdate(region10);
		Region region11 = new Region (null, "Haute Normandie");
		DaoFactory.getDaoRegion().saveOrUpdate(region11);
		Region region12 = new Region (null, "Île de France");
		DaoFactory.getDaoRegion().saveOrUpdate(region12);
		Region region13 = new Region (null, "Languedoc-Roussillon");
		DaoFactory.getDaoRegion().saveOrUpdate(region13);
		Region region14 = new Region (null, "Limousin");
		DaoFactory.getDaoRegion().saveOrUpdate(region14);
		Region region15 = new Region (null, "Laurraine");
		DaoFactory.getDaoRegion().saveOrUpdate(region15);
		Region region16 = new Region (null, "Midi-Pyrennées");
		DaoFactory.getDaoRegion().saveOrUpdate(region16);
		Region region17 = new Region (null, "Nord Pas-de-Calais");
		DaoFactory.getDaoRegion().saveOrUpdate(region17);
		Region region18 = new Region (null, "Pays de la Loire");
		DaoFactory.getDaoRegion().saveOrUpdate(region18);
		Region region19 = new Region (null, "Picardie");
		DaoFactory.getDaoRegion().saveOrUpdate(region19);
		Region region20 = new Region (null, "Poitou-Charantes");
		DaoFactory.getDaoRegion().saveOrUpdate(region20);
		Region region21 = new Region (null, "Provence-Alpes-Côte-d'Azur");
		DaoFactory.getDaoRegion().saveOrUpdate(region21);
		Region region22 = new Region (null, "Rhônes-Alpes");
		DaoFactory.getDaoRegion().saveOrUpdate(region22);
		
		
		Role admin = new Role (Role.NUM_ROLE_ADMINISTRATEUR, "Admin");
		DaoFactory.getDaoRole().saveOrUpdate(admin);
		
		Role moderator = new Role (Role.NUM_ROLE_MODERATEUR, "Moderator");
		DaoFactory.getDaoRole().saveOrUpdate(moderator);
		
		Role user = new Role (Role.NUM_ROLE_USER, "User");		
		DaoFactory.getDaoRole().saveOrUpdate(user);
		
		
		
		
		
		
		
		Category cat1 = new Category(null, "Vehicules");
		DaoFactory.getDaoCategory().saveOrUpdate(cat1);
		Category cat2 = new Category(null, "Mutimédia");
		DaoFactory.getDaoCategory().saveOrUpdate(cat2);
		Category cat3 = new Category(null, "Mode");
		DaoFactory.getDaoCategory().saveOrUpdate(cat3);
		Category cat4 = new Category(null, "Maison");
		DaoFactory.getDaoCategory().saveOrUpdate(cat4);
		Category cat5 = new Category(null, "Enfance");
		DaoFactory.getDaoCategory().saveOrUpdate(cat5);
		Category cat6 = new Category(null, "Loisir");
		DaoFactory.getDaoCategory().saveOrUpdate(cat6);
		Category cat7 = new Category(null, "Services");
		DaoFactory.getDaoCategory().saveOrUpdate(cat7);
		Category cat8 = new Category(null, "Extérieur");
		DaoFactory.getDaoCategory().saveOrUpdate(cat8);
		
		
		SubCategory subca1 = new SubCategory(null, "Voitures", cat1);		
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca1);
		SubCategory subca2 = new SubCategory(null, "Motos", cat1);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca2);
		SubCategory subca3 = new SubCategory(null, "Vélos", cat1);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca3);
		SubCategory subca4 = new SubCategory(null, "Caravaning", cat1);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca4);
		SubCategory subca5 = new SubCategory(null, "Utilitaires", cat1);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca5);
		SubCategory subca6 = new SubCategory(null, "Nautisme", cat1);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca6);
		
		SubCategory subca7 = new SubCategory(null, "Informatique", cat2);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca7);
		SubCategory subca8 = new SubCategory(null, "Gaming", cat2);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca8);
		SubCategory subca9 = new SubCategory(null, "Image & son", cat2);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca9);
		SubCategory subca10 = new SubCategory(null, "Téléphonie", cat2);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca10);
		
		SubCategory subca11 = new SubCategory(null, "Vêtements", cat3);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca11);
		SubCategory subca12 = new SubCategory(null, "Chaussures", cat3);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca12);
		SubCategory subca13 = new SubCategory(null, "Bagageries", cat3);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca13);
		SubCategory subca14 = new SubCategory(null, "Accessoires", cat3);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca14);
		SubCategory subca15 = new SubCategory(null, "Bijoux", cat3);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca15);
		
		SubCategory subca16 = new SubCategory(null, "Ammeublement", cat4);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca16);
		SubCategory subca17 = new SubCategory(null, "Electroméger", cat4);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca17);
		SubCategory subca18 = new SubCategory(null, "Décorations", cat4);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca18);
		SubCategory subca19 = new SubCategory(null, "Arts de la table", cat4);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca19);
		SubCategory subca20 = new SubCategory(null, "Ligne de Maison", cat4);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca20);
		
		SubCategory subca21 = new SubCategory(null, "Jeux & Jouets", cat5);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca21);
		SubCategory subca22 = new SubCategory(null, "Puériculture", cat5);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca22);
		SubCategory subca23 = new SubCategory(null, "Vêtements bébé", cat5);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca23);
		
		SubCategory subca24 = new SubCategory(null, "Sport", cat6);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca24);
		SubCategory subca25 = new SubCategory(null, "Films", cat6);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca25);
		SubCategory subca26 = new SubCategory(null, "Musique & Instruments", cat6);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca26);
		SubCategory subca27 = new SubCategory(null, "Livres", cat6);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca27);
		
		SubCategory subca28 = new SubCategory(null, "Cours Particuliers", cat7);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca28);
		SubCategory subca29 = new SubCategory(null, "Services à la personne", cat7);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca29);
		
		SubCategory subca30 = new SubCategory(null, "Jardinage", cat8);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca30);
		SubCategory subca31 = new SubCategory(null, "Bricolage", cat8);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca31);
		SubCategory subca32 = new SubCategory(null, "Equipements extérieurs", cat8);
		DaoFactory.getDaoSubCategory().saveOrUpdate(subca32);
		
		
		
		
		
		
		
		
		
		
		Contact contact1 = new Contact ("89000", "Auxerre", "0782092223", "normannbadr@gmail.com", region5);
		Contact contact2 = new Contact ("34000", "Montpellier", "0485256369", "isabellerigault@gmail.com", region13);
		Contact contact3 = new Contact ("83300", "Draguignan", "0485256369", "sebgenre@gmail.com", region21);
		Contact contact4 = new Contact ("34000", "Montpellier", "0485256369", "jessykamarty@gmail.com", region13);
		Contact contact5 = new Contact ("20000", "Ajaccio", "0000000000", "meynadierjulien@gmail.com", region9);
		
		
		User user1 = new User ("Monsieur", "Badr", "Normann", "Nono" , "1603", contact1, user);
		User user2 = new User ("Madame", "Rigault", "Isabelle", "Isa","0000", contact2, admin);
		User user3 = new User ("Monsieur", "Genre", "Seb", "Seb", "1111", contact3, moderator); 
		User user4 = new User ("Madame", "Marty", "Jessyka", "Red Fish", "2222", contact4, admin);
		User user5 = new User ("Monsieur", "Meynadier", "Julien", "Ju", "3333", contact5, admin);
		
		
		
		
		
		DaoFactory.getDaoContact().saveOrUpdate(contact1);
		DaoFactory.getDaoContact().saveOrUpdate(contact2);
		DaoFactory.getDaoContact().saveOrUpdate(contact3);
		DaoFactory.getDaoContact().saveOrUpdate(contact4);
		DaoFactory.getDaoContact().saveOrUpdate(contact5);
		
		DaoFactory.getDaoUser().saveOrUpdate(user1);
		DaoFactory.getDaoUser().saveOrUpdate(user2);
		DaoFactory.getDaoUser().saveOrUpdate(user3);
		DaoFactory.getDaoUser().saveOrUpdate(user4);
		DaoFactory.getDaoUser().saveOrUpdate(user5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Advert advert1 = new Advert ("Vélo", new Date(), "Vélo des familles", 500.0f, true, true, 0, subca3, user1);
		DaoFactory.getDaoAdvert().saveOrUpdate(advert1);
		
		Advert advert2 = new Advert ("Moto", new Date(), "Moto des familles", 1000.0f, true, true, 1, subca2, user1);
		DaoFactory.getDaoAdvert().saveOrUpdate(advert2);
		
		Advert advert3 = new Advert ("Voiture", new Date(), "Voiture des familles", 2000.0f, true, true, 2, subca1, user1);
		DaoFactory.getDaoAdvert().saveOrUpdate(advert3);
		
		Advert advert4 = new Advert ("Jet Ski", new Date(), "Jet Ski des familles", 1200.0f, true, true, 0, subca6, user1);
		DaoFactory.getDaoAdvert().saveOrUpdate(advert4);
		
		Advert advert5 = new Advert ("Camion", new Date(), "Camion des familles", 3000.0f, true, true, 1, subca5, user1);
		DaoFactory.getDaoAdvert().saveOrUpdate(advert5);
		
		Advert advert6 = new Advert ("Camionnette", new Date(), "Camionnette des familles", 1500.0f, true, true, 2, subca5, user1);
		DaoFactory.getDaoAdvert().saveOrUpdate(advert6);
		
		
		return true;
	}
	
}
