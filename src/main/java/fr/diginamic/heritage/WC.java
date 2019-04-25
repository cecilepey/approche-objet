package fr.diginamic.heritage;

import fr.diginamic.entites.Piece;

public class WC extends Piece {

	public WC(double superficie, int numeroEtage) {
		super(superficie, numeroEtage);

	}

	@Override
	public int getType() {

		return 3;
	}

}
