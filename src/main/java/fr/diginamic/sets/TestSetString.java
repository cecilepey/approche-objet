package fr.diginamic.sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetString {

	public static void main(String[] args) {

		// USA, France, Allemagne, UK, Italie, Japon, Chine, Russie, Inde

		Set<String> pays = new HashSet();

		pays.add("USA");
		pays.add("France");
		pays.add("Allemagne");
		pays.add("UK");
		pays.add("Italie");
		pays.add("Japon");
		pays.add("Chine");
		pays.add("Russie");
		pays.add("Inde");

		int max = 0;
		String paysMax = null;

		for (String setPays : pays) {

			if (setPays.length() > max) {
				max = setPays.length();
				paysMax = setPays;
			}
		}

		System.out.println(paysMax);

		System.out.println(pays);
	}

}
