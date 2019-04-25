package fr.diginamic.utils;

import java.util.Random;
import java.util.Scanner;

import fr.diginamic.entites.Personnage;
import fr.diginamic.heritage.Gobelin;
import fr.diginamic.heritage.Hero;
import fr.diginamic.heritage.Loup;
import fr.diginamic.heritage.Troll;

public class GestionJeu {

	public static void main(String[] args) {

		int choix;
		int type;
		Personnage adversaire = null;

		Hero hero = new Hero();
		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		type = random.nextInt(3) + 1;
		if (type == 1) {
			adversaire = new Loup();
			System.out.println("Voici un loup avec " + adversaire.getPtVie() + " point de vie et "
					+ adversaire.getForce() + " point de force. ");
		} else if (type == 2) {
			adversaire = new Gobelin();
			System.out.println("Voici un gobelin avec " + adversaire.getPtVie() + " point de vie et "
					+ adversaire.getForce() + " point de force. ");
		} else if (type == 3) {
			adversaire = new Troll();
			System.out.println("Voici un troll avec " + adversaire.getPtVie() + " point de vie et "
					+ adversaire.getForce() + " point de force. ");
		}

		System.out.println("Vous avez " + hero.getPtVie() + " points de vie et " + hero.getForce() + " point de force");
		System.out.println("appuyer sur 1 pour le combattre");

		while (hero.enVie() == true) {

			choix = sc.nextInt();

			if (choix == 1) {

				Combattre.combattre(hero, adversaire);

				if (adversaire.enVie() == false) {
					hero.calculerScore(adversaire);
					System.out.println("Vous avez " + hero.getPtVie() + " points de vie");
					System.out
							.println("Le " + adversaire.getNom() + " est mort, votre score est de " + hero.getScore());
					System.out.println("appuyer sur 2 pour un nouvel adversaire");

				} else if (hero.enVie() == false) {
					System.out.println("Vous êtes mort ! Votre score est de " + hero.getScore());
					System.out.println("============== GAME OVER =============");
					break;

				} else {
					System.out.println("Vous avez " + hero.getPtVie() + " points de vie");
					System.out.println("Le " + adversaire.getNom() + " a " + adversaire.getPtVie() + " points de vie");
					System.out.println("appuyer sur 1 pour le combattre");

				}

			} else if (choix == 2) {
				type = random.nextInt(3) + 1;
				if (type == 1) {
					adversaire = new Loup();
					System.out.println("Voici un loup avec " + adversaire.getPtVie() + " point de vie et "
							+ adversaire.getForce() + " point de force. ");
					System.out.println("appuyer sur 1 pour le combattre");

				} else if (type == 2) {
					adversaire = new Gobelin();
					System.out.println("Voici un gobelin avec " + adversaire.getPtVie() + " point de vie et "
							+ adversaire.getForce() + " point de force. ");
					System.out.println("appuyer sur 1 pour le combattre");

				} else if (type == 3) {
					adversaire = new Troll();
					System.out.println("Voici un troll avec " + adversaire.getPtVie() + " point de vie et "
							+ adversaire.getForce() + " point de force. ");
					System.out.println("appuyer sur 1 pour le combattre");

				}

			}

		}

		sc.close();

	}

}
