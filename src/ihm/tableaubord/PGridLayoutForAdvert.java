package ihm.tableaubord;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JList;
import javax.swing.JScrollPane;

import javassist.bytecode.annotation.EnumMemberValue;
import metier.advert.AdvertRequest;
import model.advert.Advert;

import java.awt.Color;

public class PGridLayoutForAdvert extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	public PGridLayoutForAdvert() throws Exception {
		setBackground(new Color(70, 130, 180));
		GridLayout grid = new GridLayout(50, 1, 0, 10);
		setLayout(grid);
		
		PAdvert test = new PAdvert();
		this.add(test);
		PAdvert test2 = new PAdvert();
		this.add(test2);
		PAdvert test3 = new PAdvert();
		this.add(test3);
		PAdvert test4 = new PAdvert();
		this.add(test4);
		PAdvert test5 = new PAdvert();
		this.add(test5);
		PAdvert test6 = new PAdvert();
		this.add(test6);
		PAdvert test7 = new PAdvert();
		this.add(test7);
		
		showAdvertToModerate();


		




		
		}
	
	private static void showAdvertToModerate() throws Exception
	{
		List<Advert>list;
		list = AdvertRequest.getListWaitAdvert();
		System.out.println(list);
		
		
	}

	
	

}
