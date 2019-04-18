package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
	
		AdressePostale adresse1 = new AdressePostale(); 
		
		adresse1.numeroRue = 8; 
		adresse1.rue = "impasse Camille Claudel"; 
		adresse1.codePostal = 44360; 
		adresse1.ville = "Vigneux de Bretagne"; 
		
		AdressePostale adresse2 = new AdressePostale(); 
		
		adresse2.numeroRue = 1; 
		adresse2.rue = "impasse Pina Bausch"; 
		adresse2.codePostal = 44800; 
		adresse2.ville = "St Herblain"; 
		
		System.out.println(adresse1);
		System.out.println(adresse2);

	}

}
