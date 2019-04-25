package fr.diginamic.heritage;

import java.util.Random;

import fr.diginamic.entites.Personnage;

public class Troll extends Personnage {

	Random random = new Random();

	public Troll() {
		this.force = random.nextInt(9) + 12;
		this.ptVie = random.nextInt(11) + 20;
		this.nom = "Troll";
		this.type = 3;

	}

}
