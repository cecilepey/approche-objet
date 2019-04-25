package fr.diginamic.heritage;

import java.util.Random;

import fr.diginamic.entites.Personnage;

public class Loup extends Personnage {

	Random random = new Random();

	public Loup() {
		this.force = random.nextInt(6) + 5;
		this.ptVie = random.nextInt(6) + 5;
		this.nom = "Loup";
		this.type = 1;

	}

}
