package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;
import fr.diginamic.entites.Client;

public class TestClient {

	public static void main(String[] args) {

		AdressePostale client1Adresse = new AdressePostale(8, "impasse des oiseaux", 44000, "Nantes");

		Client client1 = new Client(25, "Peyras", "Cécile", client1Adresse);

		Client client2 = new Client(27, "Dupont", "Jean",
				new AdressePostale(20, "boulevard de la plage", 17000, "La Rochelle"));

		client1.setNom("Noel");
		client1.setPrenom("papa");
		client1.setNumeroCompte(121);
		client1.getNom();

		System.out.println(client1.getNumeroCompte());

	}

}
