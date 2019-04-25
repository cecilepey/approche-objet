package fr.diginamic.entites;

public abstract class Intervenant {

	private String nom;
	private String prenom;

	/**
	 * @param nom
	 * @param prenom
	 */
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public abstract double getSalaire();

	public void afficherDonnees() {
		System.out.println("Nom : " + nom + " \nPrénom : " + prenom + " \nSalaire : " + getSalaire() + " € \n");

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

}
