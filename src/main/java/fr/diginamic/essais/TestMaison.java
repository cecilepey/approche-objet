package fr.diginamic.essais;

import fr.diginamic.entites.Maison;
import fr.diginamic.heritage.Chambre;
import fr.diginamic.heritage.Cuisine;
import fr.diginamic.heritage.SalleDeBain;
import fr.diginamic.heritage.Salon;
import fr.diginamic.heritage.WC;

public class TestMaison {

	public static void main(String[] args) {

		Chambre chambre1 = new Chambre(10, 0);
		Chambre chambre2 = new Chambre(9, 1);
		Chambre chambre3 = new Chambre(15.5, 1);
		Cuisine cuisine = new Cuisine(5, 0);
		Salon salon = new Salon(40.5, 0);
		WC toilettes1 = new WC(2, 0);
		WC toilettes2 = new WC(2.5, 1);
		SalleDeBain sdb1 = new SalleDeBain(7, 1);
		SalleDeBain sdb2 = new SalleDeBain(4, 0);

		Maison maison = new Maison();

		maison.ajouterPiece(sdb2);
		maison.ajouterPiece(sdb1);
		maison.ajouterPiece(toilettes2);
		maison.ajouterPiece(toilettes1);
		maison.ajouterPiece(salon);
		maison.ajouterPiece(cuisine);
		maison.ajouterPiece(chambre3);
		maison.ajouterPiece(chambre2);
		maison.ajouterPiece(chambre1);

		/*
		 * Type de pièces : 0 : Chambre - 1 : Cuisine - 2 : salon -3 : WC - 4 :
		 * Salle de bain
		 */

		System.out.println(maison.getList().size());

		System.out.println(maison.calculSuperficie());
		System.out.println(maison.superficieEtage(0));
		System.out.println(maison.superficieEtage(1));

		System.out.println(maison.superficiePiece(2));

		System.out.println(maison.nbPiece(3));

	}

}
