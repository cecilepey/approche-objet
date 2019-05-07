package fr.diginamic.essais;

import fr.diginamic.Exception.ExceptionMaison;
import fr.diginamic.entites.Maison;
import fr.diginamic.heritage.Chambre;
import fr.diginamic.heritage.Cuisine;
import fr.diginamic.heritage.SalleDeBain;
import fr.diginamic.heritage.Salon;
import fr.diginamic.heritage.WC;
import fr.diginamic.listes.MaisonTP7;

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

		Maison maison = null;
		try {
			maison = new Maison(9);
		} catch (ExceptionMaison e) {

			e.getMessage();
		}

		try {
			maison.ajouterPiece(sdb2);
		} catch (ExceptionMaison e1) {
			e1.getMessage();
		}
		try {
			maison.ajouterPiece(sdb1);
		} catch (ExceptionMaison e) {
			e.getMessage();
		}
		try {
			maison.ajouterPiece(toilettes2);
		} catch (ExceptionMaison e) {
			e.getMessage();
		}
		try {
			maison.ajouterPiece(toilettes1);
		} catch (ExceptionMaison e) {
			e.getMessage();
		}
		try {
			maison.ajouterPiece(salon);
		} catch (ExceptionMaison e) {
			e.getMessage();
		}
		try {
			maison.ajouterPiece(cuisine);
		} catch (ExceptionMaison e) {
			e.getMessage();
		}
		try {
			maison.ajouterPiece(chambre3);
		} catch (ExceptionMaison e) {
			e.getMessage();
		}
		try {
			maison.ajouterPiece(chambre2);
		} catch (ExceptionMaison e) {
			e.getMessage();
		}
		try {
			maison.ajouterPiece(chambre1);
		} catch (ExceptionMaison e) {
			e.getMessage();
		}

		/*
		 * Type de pièces : 0 : Chambre - 1 : Cuisine - 2 : salon -3 : WC - 4 :
		 * Salle de bain
		 */

		System.out.println(maison.getIndex());

		System.out.println(maison.calculSuperficie());
		try {
			System.out.println(maison.superficieEtage(0));
		} catch (ExceptionMaison e) {
			e.getMessage();
		}
		try {
			System.out.println(maison.superficieEtage(1));
		} catch (ExceptionMaison e) {
			e.getMessage();
		}

		try {
			System.out.println(maison.superficiePiece(2));
		} catch (ExceptionMaison e) {
			e.getMessage();
		}

		try {
			System.out.println(maison.nbPiece(3));
		} catch (ExceptionMaison e) {
			e.getMessage();
		}

		Chambre cbre1 = new Chambre(10, 0);
		Chambre cbre2 = new Chambre(9, 1);
		Chambre cbre3 = new Chambre(15.5, 1);
		Cuisine csine = new Cuisine(5, 0);
		Salon slon = new Salon(40.5, 0);
		WC toi1 = new WC(2, 0);
		WC toi2 = new WC(2.5, 1);
		SalleDeBain sb1 = new SalleDeBain(7, 1);
		SalleDeBain sb2 = new SalleDeBain(4, 0);

		MaisonTP7 maison2 = new MaisonTP7();

		maison2.ajouterPiece(sb2);
		maison2.ajouterPiece(sb1);
		maison2.ajouterPiece(toi2);
		maison2.ajouterPiece(toi1);
		maison2.ajouterPiece(slon);
		maison2.ajouterPiece(csine);
		maison2.ajouterPiece(cbre3);
		maison2.ajouterPiece(cbre2);
		maison2.ajouterPiece(cbre1);

		System.out.println(maison2.getList().size());

		System.out.println(maison2.calculSuperficie());
		System.out.println(maison2.superficieEtage(0));
		System.out.println(maison2.superficieEtage(1));

		System.out.println(maison2.superficiePiece(2));

		System.out.println(maison2.nbPiece(3));

	}

}
