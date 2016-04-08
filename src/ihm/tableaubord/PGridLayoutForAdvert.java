package ihm.tableaubord;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.Color;

public class PGridLayoutForAdvert extends JPanel
{
	public PGridLayoutForAdvert() {
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
		
		






		
		}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

}
