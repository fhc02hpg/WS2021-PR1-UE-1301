package org.campus02.pegel;

import java.util.List;

public class DemoWasserstand {

	public static void main(String[] args) {
		
		Wasserstand w1 = new Wasserstand(1, "Mur", 3.75, 6.0, 100_000);
		Wasserstand w2 = new Wasserstand(2, "Mur", 6.15, 6.0, 125_000);
		Wasserstand w3 = new Wasserstand(3, "Enns", 2.97, 4.5, 100_000);
		Wasserstand w4 = new Wasserstand(4, "Enns", 4.51, 4.5, 150_000);
		Wasserstand w5 = new Wasserstand(5, "Donau", 7.00, 7.25, 130_000);
		Wasserstand w6 = new Wasserstand(6, "Donau", 5.78, 7.25, 190_000);

		WasserstandManager wmgr = new WasserstandManager();
		wmgr.add(w1);
		wmgr.add(w2);
		wmgr.add(w3);
		wmgr.add(w4);
		wmgr.add(w5);
		wmgr.add(w6);

		
	}

}
