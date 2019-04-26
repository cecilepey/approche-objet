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
public class TestListeInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// -1, 5, 7, 3, -2, 4, 8, 5

		ArrayList<Integer> list = new ArrayList<>();

		list.add(-1);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(-2);
		list.add(4);
		list.add(8);
		list.add(5);

		for (Integer chiffre : list) {
			System.out.println(chiffre);
		}

		System.out.println(" ");

		int max = list.get(0);
		int mini = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			Integer chiffre = list.get(i);

			if (max < chiffre) {
				max = list.get(i);
			}
			if (mini > chiffre) {
				mini = list.get(i);
			}

		}
		System.out.println(max + "\n");

		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
			Integer chiffre = iterator.next();

			if (mini == chiffre) {
				iterator.remove();
			}
		}

		for (int i = 0; i < list.size(); i++) {

			int chiffre = list.get(i);

			if (chiffre < 0) {

				chiffre = chiffre * -1;
				list.set(i, chiffre);

			}
		}

		for (Integer chiffre : list) {
			System.out.println(chiffre);
		}

	}

}
