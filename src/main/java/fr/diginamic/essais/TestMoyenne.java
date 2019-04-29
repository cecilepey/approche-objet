package fr.diginamic.essais;

import fr.diginamic.listes.CalculMoyenneTP7;
import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {

		CalculMoyenne moyenne = new CalculMoyenne(4);

		moyenne.ajout(1);
		moyenne.ajout(2);
		moyenne.ajout(3);
		moyenne.ajout(4);

		System.out.println(moyenne.calcul());

		CalculMoyenneTP7 moyenneTP7 = new CalculMoyenneTP7();

		moyenneTP7.ajout(1);
		moyenneTP7.ajout(2);
		moyenneTP7.ajout(3);
		moyenneTP7.ajout(4);

		System.out.println(moyenneTP7.calcul());

	}

}
