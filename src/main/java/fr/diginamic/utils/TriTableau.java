package fr.diginamic.utils;

public class TriTableau {

	public static void tableauTrie(int[] tableau) {

		int positionMini = 0;

		int temp;

		for (int i = 0; i < tableau.length; i++) {

			positionMini = i;

			for (int j = i + 1; j < tableau.length; j++) {

				if (tableau[j] < tableau[positionMini]) {

					positionMini = j;
				}
			}

			temp = tableau[positionMini];
			tableau[positionMini] = tableau[i];
			tableau[i] = temp;

		}

	}
}
