/**
 * 
 */
package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Cécile Peyras
 *
 */
public class TestListeString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Nice, Carcassonne, Narbonne, Lyon, Foix, Pau, Marseille, Tarbes

		ArrayList<String> list = new ArrayList<>();

		list.add("Nice");
		list.add("Carcassonne");
		list.add("Narbonne");
		list.add("Lyon");
		list.add("Foix");
		list.add("Pau");
		list.add("Marseille");
		list.add("Tarbes");

		System.out.println(list);

		String max = "";

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).length() > max.length()) {

				max = list.get(i);
			}

		}

		System.out.println("La ville ayant le plus grand nombre de lettres est : " + max);

		for (int i = 0; i < list.size(); i++) {

			String mot = list.get(i).toUpperCase();
			list.set(i, mot);
		}
		System.out.println(list);

		Iterator<String> iter = list.iterator();

		while (iter.hasNext()) {

			String mot = iter.next();

			if (mot.startsWith("N")) {
				iter.remove();
			}

		}

		System.out.println(list);

	}

}
