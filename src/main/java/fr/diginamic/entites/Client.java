package fr.diginamic.entites;

/**
 * Classe qui représente le client
 * 
 * @author Cécile Peyras
 *
 */
public class Client {

	public int numeroCompte;
	public String nom;
	public String prenom;
	public AdressePostale adresse;

	/**
	 * Constructeur du client
	 * 
	 * @param param1
	 *            : numéro de compte
	 * @param nomClient
	 *            : nom du client
	 * @param prenomClient
	 *            : prénom du client
	 */
	public Client(int param1, String nomClient, String prenomClient) {
		System.out.println("Nouvelle instance créée");
		// System.out.println(param1);
		numeroCompte = param1;
		nom = nomClient;
		prenom = prenomClient;
		System.out.println("Le numéro de compte du client " + nom + " " + prenom + " est : " + numeroCompte);
	}

	public Client(int numeroCompte, String nom, String prenom, AdressePostale adresse) {
		this(numeroCompte, nom, prenom);
		this.adresse = adresse;
		System.out.println("L'adresse est : " + adresse.numeroRue + " " + adresse.rue + " " + adresse.codePostal + " "
				+ adresse.ville);
	}

	public void afficherNom() {
		System.out.println(prenom + " " + nom.toUpperCase());

	}

	public void modifierNom(String nom) {
		this.nom = nom;

	}

	public void modifierPrenom(String prenom) {
		this.prenom = prenom;

	}

	public void modifierNoCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;

	}

	public String nom() {
		return nom;
	}

	public String prenom() {
		return prenom;
	}

	public int numeroCompte() {
		return numeroCompte;
	}

}
