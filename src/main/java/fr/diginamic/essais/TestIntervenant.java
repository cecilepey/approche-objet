package fr.diginamic.essais;

import fr.diginamic.heritage.Pigiste;
import fr.diginamic.heritage.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		Salarie salarie1 = new Salarie("Dupont", "Jean", 2000);

		Pigiste pigiste1 = new Pigiste("Henry", "Charles", 20, 150);

		System.out.println(salarie1.getSalaire() + " €");

		System.out.println(pigiste1.getSalaire() + " €");

		salarie1.afficherDonnees();

		pigiste1.afficherDonnees();

	}

}
