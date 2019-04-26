package fr.diginamic.entites;

import fr.diginamic.tp6.ISurface;

public class Maison implements ISurface {

	private Piece[] tableau;
	private int index = 0;

	/**
	 * @param tableau
	 * @param index
	 */
	public Maison(Piece[] tableau, int index) {
		this.tableau = tableau;
		this.index = index;
	}

	public Maison(int index) {

		tableau = new Piece[index];
	}

	public void ajouterPiece(Piece piece) {

		tableau[index] = piece;

		index++;

	}

	// méthode d'origine sans interface
	public double calculSuperficie() {

		double superficieTotale = 0;

		for (int i = 0; i < tableau.length; i++) {

			superficieTotale = superficieTotale + tableau[i].getSuperficie();

		}
		return superficieTotale;
	}

	public double superficieEtage(int numeroEtage) {

		double superficieEtage = 0;

		for (int i = 0; i < tableau.length; i++) {

			if (numeroEtage == tableau[i].getNumeroEtage()) {

				superficieEtage = superficieEtage + tableau[i].getSuperficie();
			}
		}

		return superficieEtage;
	}

	public double superficiePiece(int typePiece) {

		double superficiePiece = 0;

		for (int i = 0; i < tableau.length; i++) {

			if (tableau[i].getType() == typePiece) {

				superficiePiece = superficiePiece + tableau[i].getSuperficie();
			}

		}

		return superficiePiece;
	}

	public double nbPiece(int typePiece) {

		double nbPiece = 0;

		for (int i = 0; i < tableau.length; i++) {

			if (tableau[i].getType() == typePiece) {

				nbPiece++;
			}

		}

		return nbPiece;
	}

	// methode avec l'interface
	@Override
	public double calculerSurface() {
		double superficieTotale = 0;

		for (int i = 0; i < tableau.length; i++) {

			superficieTotale = superficieTotale + tableau[i].getSuperficie();

		}
		return superficieTotale;
	}

	/**
	 * @return the tableau
	 */
	public Piece[] getTableau() {
		return tableau;
	}

	/**
	 * @param tableau
	 *            the tableau to set
	 */
	public void setTableau(Piece[] tableau) {
		this.tableau = tableau;
	}

	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * @param index
	 *            the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}

}
