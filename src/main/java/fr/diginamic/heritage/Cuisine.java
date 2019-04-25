package fr.diginamic.heritage;

import fr.diginamic.entites.Piece;

public class Cuisine extends Piece {

	public Cuisine(double superficie, int numeroEtage) {
		super(superficie, numeroEtage);

	}

	@Override
	public int getType() {

		return 1;
	}

}
