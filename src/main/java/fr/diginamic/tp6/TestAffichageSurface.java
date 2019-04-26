
package fr.diginamic.tp6;

import fr.diginamic.entites.Maison;
import fr.diginamic.heritage.Cercle;
import fr.diginamic.heritage.Chambre;

/**
 * @author Cécile Peyras
 *
 */
public class TestAffichageSurface {

	public static void main(String[] args) {

		Chambre chambre = new Chambre(2, 5);
		Maison maison = new Maison(1);

		maison.ajouterPiece(chambre);

		System.out.println(maison.calculerSurface());

		Cercle cercle = new Cercle(5);

		System.out.println(cercle.calculerSurface());

	}

}
