package fr.diginamic.heritage;

import fr.diginamic.entites.Piece;

public class Salon extends Piece {

	public Salon(double superficie, int numeroEtage) {
		super(superficie, numeroEtage);

	}

	@Override
	public int getType() {

		return 2;
	}

}
