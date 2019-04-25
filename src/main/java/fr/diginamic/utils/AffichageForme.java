package fr.diginamic.utils;

import fr.diginamic.entites.Forme;

public class AffichageForme {

	public static void afficher(Forme forme) {

		System.out.println("Le périmètre de la forme est de : " + forme.calculerPerimetre());
		System.out.println("La surface de la forme est de : " + forme.calculerSurface());

	}

}
