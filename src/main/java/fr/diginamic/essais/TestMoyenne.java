package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {

		CalculMoyenne moyenne = new CalculMoyenne();

		moyenne.ajout(1);
		moyenne.ajout(2);
		moyenne.ajout(3);
		moyenne.ajout(4);

		System.out.println(moyenne.calcul());

	}

}
