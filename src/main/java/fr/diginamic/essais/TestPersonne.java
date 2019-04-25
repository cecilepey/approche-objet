package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;
import fr.diginamic.entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		AdressePostale adresse1 = new AdressePostale(8, "rue des peupliers", 44000, "nantes");

		Personne cecile = new Personne("Peyras", "Cécile", adresse1);

		AdressePostale adresse2 = new AdressePostale(5, "rue de Nantes", 44880, "Sautron");

		Personne ami = new Personne("Pierre", "Paul", adresse2);

		// Autre méthode et qui permet d'ajouter la meme adresse à plusieurs
		// personnes.
		AdressePostale adresse3 = new AdressePostale(6, "rue des peupliers", 44000, "nantes");

		Personne personne3 = new Personne("MArchand", "Estelle", adresse3);

	}
}
