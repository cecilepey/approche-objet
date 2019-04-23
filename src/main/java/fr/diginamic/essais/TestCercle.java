package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		Cercle cercle1 = new Cercle(5);
		Cercle cercle2 = new Cercle(6);

		System.out.println("le périmètre du cercle 1 est : " + cercle1.getPerimetre() + " et sa surface est : "
				+ cercle1.getSurface());
		System.out.println("le périmètre du cercle 2 est : " + cercle2.getPerimetre() + " et sa surface est : "
				+ cercle2.getSurface());

		Cercle cercle3 = CercleFactory.creer(2);

		System.out.println("le périmètre du cercle 3 est : " + cercle3.getPerimetre() + " et sa surface est : "
				+ cercle3.getSurface());

	}

}
