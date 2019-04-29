package fr.diginamic.listes;

public class Ville {

	private String nom;
	private long nbHabitants;

	/**
	 * @param nom
	 * @param nbHabitants
	 */
	public Ville(String nom, long nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
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
	 * @return the nbHabitants
	 */
	public long getNbHabitants() {
		return nbHabitants;
	}

	/**
	 * @param nbHabitants
	 *            the nbHabitants to set
	 */
	public void setNbHabitants(long nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

}
