package fr.diginamic.heritage;

import fr.diginamic.entites.Piece;

public class SalleDeBain extends Piece {

	public SalleDeBain(double superficie, int numeroEtage) {
		super(superficie, numeroEtage);

	}

	@Override
	public int getType() {

		return 4;
	}
}
