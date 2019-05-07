package fr.diginamic.entites;

import fr.diginamic.Exception.ExceptionMaison;
import fr.diginamic.tp6.ISurface;

public class Maison implements ISurface {

	private Piece[] tableau;
	private int index = 0;

	public Maison(int index) throws ExceptionMaison {

		if (index < 0) {
			throw new ExceptionMaison("Vous ne pouvez pas entrer un index négatif");
		} else {
			tableau = new Piece[index];
		}

	}

	public void ajouterPiece(Piece piece) throws ExceptionMaison {

		if (piece == null) {
			throw new ExceptionMaison("L'objet en paramètre ne peut pas être null");

		} else {

			tableau[index] = piece;

			index++;
		}

	}

	// méthode d'origine sans interface
	public double calculSuperficie() {

		double superficieTotale = 0;

		for (int i = 0; i < tableau.length; i++) {

			superficieTotale = superficieTotale + tableau[i].getSuperficie();

		}
		return superficieTotale;
	}

	public double superficieEtage(int numeroEtage) throws ExceptionMaison {

		double superficieEtage = 0;

		for (int i = 0; i < tableau.length; i++) {

			if (numeroEtage == tableau[i].getNumeroEtage()) {

				superficieEtage = superficieEtage + tableau[i].getSuperficie();
			} else {
				throw new ExceptionMaison("Le numéro d'étage n'existe pas !");
			}
		}

		return superficieEtage;
	}

	public double superficiePiece(int typePiece) throws ExceptionMaison {

		double superficiePiece = 0;

		for (int i = 0; i < tableau.length; i++) {

			if (tableau[i].getType() == typePiece) {

				superficiePiece = superficiePiece + tableau[i].getSuperficie();
			} else {
				throw new ExceptionMaison("Le type de pièce n'existe pas dans la maison");
			}

		}

		return superficiePiece;
	}

	public double nbPiece(int typePiece) throws ExceptionMaison {

		double nbPiece = 0;

		for (int i = 0; i < tableau.length; i++) {

			if (tableau[i].getType() == typePiece) {

				nbPiece++;
			} else {
				throw new ExceptionMaison("Le type de pièce n'existe pas dans la maison");
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
