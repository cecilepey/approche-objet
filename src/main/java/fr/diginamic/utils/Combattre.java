package fr.diginamic.utils;

import fr.diginamic.entites.Personnage;
import fr.diginamic.heritage.Hero;

public class Combattre {

	public static void combattre(Hero hero, Personnage adversaire) {

		int attaqueHero = hero.calculAttaque();
		int attaqueAdversaire = adversaire.calculAttaque();
		int degats;

		if (attaqueAdversaire > attaqueHero) {

			degats = (attaqueAdversaire - attaqueHero) * 2;

			hero.setPtVie(hero.getPtVie() - degats);

		} else if (attaqueAdversaire < attaqueHero) {

			degats = (attaqueHero - attaqueAdversaire) * 2;

			adversaire.setPtVie(adversaire.getPtVie() - degats);
		}

	}

}
