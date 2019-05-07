
package fr.diginamic.tp6;

import fr.diginamic.Exception.ExceptionMaison;
import fr.diginamic.entites.Maison;
import fr.diginamic.heritage.Carre;
import fr.diginamic.heritage.Cercle;
import fr.diginamic.heritage.Chambre;
import fr.diginamic.heritage.Rectangle;
import fr.diginamic.heritage.SalleDeBain;

/**
 * @author Cécile Peyras
 *
 */
public class TestAffichageSurface {

	public static void main(String[] args) {

		Chambre chambre = new Chambre(2, 5);

		Maison maison = null;
		try {
			maison = new Maison(2);
		} catch (ExceptionMaison e) {
			e.getMessage();
		}

		try {
			maison.ajouterPiece(chambre);
		} catch (ExceptionMaison e) {
			e.getMessage();
		}
		SalleDeBain sdb = new SalleDeBain(8, 1);
		try {
			maison.ajouterPiece(sdb);
		} catch (ExceptionMaison e) {
			e.getMessage();
		}

		System.out.println(maison.calculerSurface());

		Cercle cercle = new Cercle(5);

		System.out.println(cercle.calculerSurface());

		Carre carre = new Carre(6);

		System.out.println(carre.calculerSurface());

		Rectangle rectangle = new Rectangle(8, 2);

		System.out.println(rectangle.calculerSurface());

	}

}
