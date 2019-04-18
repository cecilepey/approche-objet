package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;
import fr.diginamic.entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne cecile = new Personne(); 
		
		cecile.nom = "Peyras"; 
		cecile.prenom = "Cecile"; 
		cecile.adresse = new AdressePostale(); 
		cecile.adresse.numeroRue = 5; 
		cecile.adresse.rue = "impasse Camille Claudel"; 
		cecile.adresse.codePostal = 44360; 
		cecile.adresse.ville = "Vigneux de Bretagne"; 
		
				
		Personne ami = new Personne(); 
		ami.nom = "Pierre"; 
		ami.prenom = "Paul"; 
		ami.adresse = new AdressePostale(); 
		ami.adresse.numeroRue = 5; 
		ami.adresse.rue = "rue de nantes"; 
		ami.adresse.codePostal = 44880; 
		ami.adresse.ville = "Sautron"; 
		
		// Autre méthode et qui permet d'ajouter la meme adresse à plusieurs personnes.
		AdressePostale adresse3 = new AdressePostale(); 
		adresse3.numeroRue = 6; 
		adresse3.rue = " rue des peupliers"; 
		adresse3.codePostal = 44000; 
		adresse3.ville = "Nantes"; 
		
		Personne personne3 = new Personne(); 
		personne3.nom = "Marchand"; 
		personne3.prenom = "Estelle"; 
		personne3.adresse = adresse3; 
		
				
		
	}
}
