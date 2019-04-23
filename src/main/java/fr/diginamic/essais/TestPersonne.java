package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;
import fr.diginamic.entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		Personne cecile = new Personne();

		cecile.nom = "Peyras";
		cecile.prenom = "Cecile";
		cecile.adresse = new AdressePostale(8, "impasse Camille Claudel", 44360, "Vigneux de Bretagne");

		Personne ami = new Personne();
		ami.nom = "Pierre";
		ami.prenom = "Paul";
		ami.adresse = new AdressePostale(5, "rue de Nantes", 44880, "Sautron");

		// Autre méthode et qui permet d'ajouter la meme adresse à plusieurs
		// personnes.
		AdressePostale adresse3 = new AdressePostale(6, "rue des peupliers", 44000, "nantes");

		Personne personne3 = new Personne();
		personne3.nom = "Marchand";
		personne3.prenom = "Estelle";
		personne3.adresse = adresse3;

	}
}
