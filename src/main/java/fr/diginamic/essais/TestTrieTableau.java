package fr.diginamic.essais;

import fr.diginamic.utils.TriTableau;

public class TestTrieTableau {

	public static void main(String[] args) {

		int[] tableau = { 5, 4, 3, 2, 1 };

		TriTableau.tableauTrie(tableau);

		for (int i = 0; i < tableau.length; i++) {

			System.out.println(tableau[i]);
		}

	}

}
