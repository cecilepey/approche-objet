package fr.diginamic.entites;

import java.util.ArrayList;

import fr.diginamic.tp6.ISurface;

public class Maison implements ISurface {

	// private Piece[] tableau;
	// private int index = 0;

	private ArrayList<Piece> list = new ArrayList<Piece>();

	/**
	 * 	
	 */
	public Maison() {

	}

	public void ajouterPiece(Piece piece) {

		list.add(piece);

	}

	// méthode d'origine sans interface
	public double calculSuperficie() {

		double superficieTotale = 0;

		for (int i = 0; i < list.size(); i++) {

			superficieTotale = superficieTotale + list.get(i).getSuperficie();

		}
		return superficieTotale;
	}

	public double superficieEtage(int numeroEtage) {

		double superficieEtage = 0;

		for (int i = 0; i < list.size(); i++) {

			if (numeroEtage == list.get(i).getNumeroEtage()) {

				superficieEtage = superficieEtage + list.get(i).getSuperficie();
			}
		}

		return superficieEtage;
	}

	public double superficiePiece(int typePiece) {

		double superficiePiece = 0;

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getType() == typePiece) {

				superficiePiece = superficiePiece + list.get(i).getSuperficie();
			}

		}

		return superficiePiece;
	}

	public double nbPiece(int typePiece) {

		double nbPiece = 0;

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getType() == typePiece) {

				nbPiece++;
			}

		}

		return nbPiece;
	}

	// methode avec l'interface
	@Override
	public double calculerSurface() {
		double superficieTotale = 0;

		for (int i = 0; i < list.size(); i++) {

			superficieTotale = superficieTotale + list.get(i).getSuperficie();

		}
		return superficieTotale;
	}

	/**
	 * @return the list
	 */
	public ArrayList<Piece> getList() {
		return list;
	}

	/**
	 * @param list
	 *            the list to set
	 */
	public void setList(ArrayList<Piece> list) {
		this.list = list;
	}

}
