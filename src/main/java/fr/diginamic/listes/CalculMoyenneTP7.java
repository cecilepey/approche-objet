package fr.diginamic.listes;

import java.util.ArrayList;

public class CalculMoyenneTP7 {

	ArrayList<Double> list = new ArrayList<Double>();

	/**
	 * @param tableau
	 * @param indice
	 */
	public CalculMoyenneTP7() {

	}

	public void ajout(double ajout) {

		list.add(ajout);

	}

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
