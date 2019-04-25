package fr.diginamic.heritage;

import java.util.Random;

import fr.diginamic.entites.Personnage;

public class Gobelin extends Personnage {

	Random random = new Random();

	public Gobelin() {
		this.force = random.nextInt(6) + 7;
		this.ptVie = random.nextInt(6) + 10;
		this.nom = "Gobelin";
		this.type = 2;
	}

}
