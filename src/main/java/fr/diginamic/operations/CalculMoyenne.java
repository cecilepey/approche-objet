package fr.diginamic.operations;

public class CalculMoyenne {

	double[] tableau;

	int indice = 0;

	public CalculMoyenne(int longueur) {

		if (longueur < 0) {

			System.out.println("Le tableau doit avoir une valeur supérieure ou égale à 0");
		} else {

			tableau = new double[longueur];
		}

	}

	public void ajout(double ajout) {

		if (indice > tableau.length - 1) {

			System.out.println("Vous avez entrez trop d'éléments");
		} else {

			tableau[indice] = ajout;
			indice++;

		}

	}

	public double calcul() {

		double moyenne;
		double somme = 0;

		for (int i = 0; i < tableau.length; i++) {

			somme = somme + tableau[i];

		}

		moyenne = somme / tableau.length;

		return moyenne;

	}

}
