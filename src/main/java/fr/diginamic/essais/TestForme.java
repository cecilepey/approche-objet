package fr.diginamic.essais;

import fr.diginamic.heritage.Carre;
import fr.diginamic.heritage.Cercle;
import fr.diginamic.heritage.Rectangle;
import fr.diginamic.utils.AffichageForme;

public class TestForme {

	public static void main(String[] args) {

		Cercle cercle1 = new Cercle(20);

		Rectangle rectangle1 = new Rectangle(10, 15.5);

		Carre carre1 = new Carre(12.5);

		AffichageForme.afficher(cercle1);

		AffichageForme.afficher(rectangle1);

		AffichageForme.afficher(carre1);

	}

}
