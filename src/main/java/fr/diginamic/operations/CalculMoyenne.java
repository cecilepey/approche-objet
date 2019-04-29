package fr.diginamic.operations;

import java.util.ArrayList;

public class CalculMoyenne {

	private ArrayList<Double> list = new ArrayList<Double>();

	// private double[] tableau;

	// private int indice = 0;

	/**
	 * @param tableau
	 * @param indice
	 */
	public CalculMoyenne() {

	}

	/*
	 * public CalculMoyenne(int longueur) {
	 * 
	 * 
	 * if (longueur < 0) {
	 * 
	 * System.out.
	 * println("Le tableau doit avoir une valeur supérieure ou égale à 0"); }
	 * else {
	 * 
	 * tableau = new double[longueur]; }
	 * 
	 * }
	 */

	public void ajout(double ajout) {

		list.add(ajout);

		/*
		 * if (indice > tableau.length - 1) {
		 * 
		 * System.out.println("Vous avez entrez trop d'éléments"); } else {
		 * 
		 * tableau[indice] = ajout; indice++;
		 * 
		 * }
		 */

	}

	// pour ajouter plusieurs valeurs d'un seul coup, on peut utilser ...
	/*
	 * public void ajout(double... nbs) { for (int i = 0; i < nbs.length; i++) {
	 * ajout(nbs[i]); } }
	 */

	public double calcul() {

		double moyenne;
		double somme = 0;

		for (int i = 0; i < list.size(); i++) {

			somme = somme + list.get(i);

		}

		moyenne = somme / list.size();

		return moyenne;

	}

	/**
	 * @return the list
	 */
	public ArrayList<Double> getList() {
		return list;
	}

	/**
	 * @param list
	 *            the list to set
	 */
	public void setList(ArrayList<Double> list) {
		this.list = list;
	}

}
