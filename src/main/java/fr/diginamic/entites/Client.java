package fr.diginamic.entites;

/**
 * Classe qui représente le client
 * 
 * @author Cécile Peyras
 *
 */
public class Client {

	private int numeroCompte;
	private String nom;
	private String prenom;
	private AdressePostale adresse;

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

	/**
	 * @return the numeroCompte
	 */
	public int getNumeroCompte() {
		return numeroCompte;
	}

	/**
	 * @param numeroCompte
	 *            the numeroCompte to set
	 */
	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the adresse
	 */
	public AdressePostale getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse
	 *            the adresse to set
	 */
	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}

}
