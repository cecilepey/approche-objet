package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {

		AdressePostale adresse1 = new AdressePostale(8, "impasse Camille Claudel", 44360, "Vigneux de Bretagne");

		AdressePostale adresse2 = new AdressePostale(1, "impasse Pina Bausch", 44800, "St Herblain");

		System.out.println(adresse1);
		System.out.println(adresse2);

	}

}
