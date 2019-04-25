package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleService {

	public static void doubler(Cercle cercle) {

		cercle.setRayon(cercle.getRayon() + cercle.getRayon());

	}

}
