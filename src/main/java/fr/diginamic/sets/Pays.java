package fr.diginamic.sets;

public class Pays {

	private String nom;
	private long nbHabitants;
	private double PIBHabitants;

	/**
	 * @param nom
	 * @param nbHabitants
	 * @param pIBHabitants
	 */
	public Pays(String nom, long nbHabitants, double pIBHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		PIBHabitants = pIBHabitants;
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

	/**
	 * @return the pIBHabitants
	 */
	public double getPIBHabitants() {
		return PIBHabitants;
	}

	/**
	 * @param pIBHabitants
	 *            the pIBHabitants to set
	 */
	public void setPIBHabitants(double pIBHabitants) {
		PIBHabitants = pIBHabitants;
	}

}
