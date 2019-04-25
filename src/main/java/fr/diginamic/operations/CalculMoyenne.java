package fr.diginamic.operations;

public class CalculMoyenne {

	private double[] tableau;

	private int indice = 0;

	/**
	 * @param tableau
	 * @param indice
	 */
	public CalculMoyenne(double[] tableau, int indice) {
		this.tableau = tableau;
		this.indice = indice;
	}

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

	// pour ajouter plusieurs valeurs d'un seul coup, on peut utilser ...
	public void ajout(double... nbs) {
		for (int i = 0; i < nbs.length; i++) {
			ajout(nbs[i]);
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

	/**
	 * @return the tableau
	 */
	public double[] getTableau() {
		return tableau;
	}

	/**
	 * @param tableau
	 *            the tableau to set
	 */
	public void setTableau(double[] tableau) {
		this.tableau = tableau;
	}

	/**
	 * @return the indice
	 */
	public int getIndice() {
		return indice;
	}

	/**
	 * @param indice
	 *            the indice to set
	 */
	public void setIndice(int indice) {
		this.indice = indice;
	}

}
