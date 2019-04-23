package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;

public class TestAttributClasse {

	public static void main(String[] args) {

		AdressePostale a = new AdressePostale(8, "impasse de la lune", 44000, "Nantes");
		AdressePostale b = new AdressePostale(1, "rue de la mer", 44000, "Nantes");

		System.out.println(a.nbDepartements);
		System.out.println(b.nbDepartements);

		System.out.println(AdressePostale.nbDepartements);

		AdressePostale.nbDepartements = 102;

		System.out.println(a.nbDepartements);
		System.out.println(b.nbDepartements);

		System.out.println(AdressePostale.nbDepartements);

		a.nbDepartements = 103;

		System.out.println(a.nbDepartements);
		System.out.println(b.nbDepartements);

		System.out.println(AdressePostale.nbDepartements);

	}

}
