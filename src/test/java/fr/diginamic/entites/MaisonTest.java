package fr.diginamic.entites;

import org.junit.Test;

import fr.diginamic.Exception.ExceptionMaison;
import fr.diginamic.heritage.Chambre;
import fr.diginamic.heritage.Cuisine;
import junit.framework.Assert;

public class MaisonTest {

	@Test(expected = ExceptionMaison.class)
	public void testMaisonInt() throws ExceptionMaison {
		Maison maison = new Maison(-1);
	}

	@Test(expected = ExceptionMaison.class)
	public void testAjouterPiece() throws ExceptionMaison {
		Chambre chambre = null;
		Maison maison = new Maison(1);
		maison.ajouterPiece(chambre);

	}

	@Test
	public void testCalculSuperficie() throws ExceptionMaison {

		Maison maison = new Maison(2);

		Chambre chambre = new Chambre(10.2, 2);
		Cuisine cuisine = new Cuisine(2.5, 1);
		maison.ajouterPiece(cuisine);
		maison.ajouterPiece(chambre);
		double superficie = maison.calculSuperficie();
		Assert.assertEquals(12.7, superficie);

	}

	@Test(expected = ExceptionMaison.class)
	public void testSuperficieEtage() throws ExceptionMaison {
		Maison maison = new Maison(2);

		Chambre chambre = new Chambre(10.2, 2);
		Cuisine cuisine = new Cuisine(2.5, 1);
		maison.ajouterPiece(cuisine);
		maison.ajouterPiece(chambre);

		double superficie = maison.superficieEtage(0);

	}

	@Test(expected = ExceptionMaison.class)
	public void testSuperficiePiece() throws ExceptionMaison {

		Maison maison = new Maison(2);

		Chambre chambre = new Chambre(10.2, 2);
		Cuisine cuisine = new Cuisine(2.5, 1);
		maison.ajouterPiece(cuisine);
		maison.ajouterPiece(chambre);

		double superficie = maison.superficiePiece(2);
	}

	@Test(expected = ExceptionMaison.class)
	public void testNbPiece() throws ExceptionMaison {
		Maison maison = new Maison(2);

		Chambre chambre = new Chambre(10.2, 2);
		Cuisine cuisine = new Cuisine(2.5, 1);
		maison.ajouterPiece(cuisine);
		maison.ajouterPiece(chambre);

		double superficie = maison.nbPiece(2);

	}

	public void testCalculerSurface() throws ExceptionMaison {

		Maison maison = new Maison(2);

		Chambre chambre = new Chambre(10.2, 2);
		Cuisine cuisine = new Cuisine(2.5, 1);
		maison.ajouterPiece(cuisine);
		maison.ajouterPiece(chambre);

		double superficie = maison.calculerSurface();

	}

}
