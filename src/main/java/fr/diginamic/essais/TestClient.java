package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;
import fr.diginamic.entites.Client;

public class TestClient {

	public static void main(String[] args) {

		AdressePostale client1Adresse = new AdressePostale(8, "impasse des oiseaux", 44000, "Nantes");

		Client client1 = new Client(25, "Peyras", "Cécile", client1Adresse);

		AdressePostale client2Adresse = new AdressePostale(20, "boulevard de la plage", 17000, "La Rochelle");

		Client client2 = new Client(27, "Dupont", "Jean", client2Adresse);

	}

}
