package fr.diginamic.heritage;

import fr.diginamic.entites.Forme;

public class Rectangle extends Forme {

	private double longueur;
	private double largeur;

	/**
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculerSurface() {

		return longueur * largeur;
	}

	@Override
	public double calculerPerimetre() {

		return (longueur * 2) + (largeur * 2);
	}

	/**
	 * @return the longueur
	 */
	public double getLongueur() {
		return longueur;
	}

	/**
	 * @param longueur
	 *            the longueur to set
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	/**
	 * @return the largeur
	 */
	public double getLargeur() {
		return largeur;
	}

	/**
	 * @param largeur
	 *            the largeur to set
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

}
