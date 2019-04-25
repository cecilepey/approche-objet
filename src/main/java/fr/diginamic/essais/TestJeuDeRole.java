package fr.diginamic.essais;

import java.util.Scanner;

import fr.diginamic.heritage.Gobelin;
import fr.diginamic.heritage.Hero;
import fr.diginamic.heritage.Loup;
import fr.diginamic.heritage.Troll;

public class TestJeuDeRole {

	public static void main(String[] args) {

		Hero hero = new Hero();
		Loup loup = new Loup();
		Gobelin gobelin = new Gobelin();
		Troll troll = new Troll();

		Scanner sc = new Scanner(System.in);

		System.out.println("Le jeu va commencer, il y a un héro et 3 méchants");
		System.out.println("Veuillez choisir un adversaire : ");
		System.out.println("1 - Le Loup \n2 - Le Gobelin \n3 - Le Troll");

		hero.setAdversaire(sc.nextInt());

	}

}
