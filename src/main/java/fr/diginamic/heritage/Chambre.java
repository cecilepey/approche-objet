package fr.diginamic.heritage;

import fr.diginamic.entites.Piece;

public class Chambre extends Piece {

	public Chambre(double superficie, int numeroEtage) {
		super(superficie, numeroEtage);

	}

	@Override
	public int getType() {

		return 0;
	}

}
