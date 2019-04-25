package fr.diginamic.heritage;

import java.util.Random;

import fr.diginamic.entites.Personnage;

public class Hero extends Personnage {

	private int score = 0;
	Random random = new Random();

	public Hero() {

		this.force = random.nextInt(7) + 12;
		this.ptVie = random.nextInt(31) + 20;
		nom = "héro";

	}

	public int setAdversaire(int adversaire) {

		return adversaire;

	}

	public void calculerScore(Personnage adversaire) {

		if (adversaire.getType() == 1) {

			score = score + 1;

		} else if (adversaire.getType() == 2) {

			score = score + 2;

		} else if (adversaire.getType() == 3) {

			score = score + 5;
		} else {

			score = 15;
		}

	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score
	 *            the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	// Random random = new Random();
	// nbBatonOrdi = random.nextInt(3) + 1;
}
