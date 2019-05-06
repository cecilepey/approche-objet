package fr.diginamic.sets;

public class Pays implements Comparable<Pays> {

	/** nom : String */
	private String nom;
	/** nbHabitants : int */
	private int nbHabitants;
	/** PIBHabitants : int */
	private int PIBHabitants;

	/**
	 * Constructeur
	 * 
	 * @param nom
	 * @param nbHabitants
	 * @param pIBHabitants
	 */
	public Pays(String nom, int nbHabitants, int pIBHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		PIBHabitants = pIBHabitants;
	}

	@Override
	public int compareTo(Pays pays) {
		if (pays.getPIBHabitants() > this.getPIBHabitants()) {
			return 1;
		} else if (pays.getPIBHabitants() == this.getPIBHabitants()) {
			return 0;
		}

		return -1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pays other = (Pays) obj;
		if (PIBHabitants != other.PIBHabitants)
			return false;
		if (nbHabitants != other.nbHabitants)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
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
	public int getNbHabitants() {
		return nbHabitants;
	}

	/**
	 * @param nbHabitants
	 *            the nbHabitants to set
	 */
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	/**
	 * Getter
	 * 
	 * @return the pIBHabitants
	 */
	public int getPIBHabitants() {
		return PIBHabitants;
	}

	/**
	 * Setter
	 * 
	 * @param pIBHabitants
	 *            the pIBHabitants to set
	 */
	public void setPIBHabitants(int pIBHabitants) {
		PIBHabitants = pIBHabitants;
	}

}
