package fr.diginamic.essais;

import fr.diginamic.entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne cecile = new Personne(); 
		
		cecile.nom = "Peyras"; 
		cecile.prenom = "Cecile"; 
		cecile.adresse = "8 impasse Camille Claudel"; 
		
		Personne ami = new Personne(); 
		ami.nom = "Pierre"; 
		ami.prenom = "Paul"; 
		ami.adresse = "3 rue de Nantes"; 
		
		
	}
}
