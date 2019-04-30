package fr.diginamic.sets;

public class Pays {

	private String nom;
	private int nbHabitants;
	private double PIBHabitants;

	/**
	 * @param nom
	 * @param nbHabitants
	 * @param pIBHabitants
	 */
	public Pays(String nom, int nbHabitants, double pIBHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		PIBHabitants = pIBHabitants;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pays other = (Pays) obj;
		if (Double.doubleToLongBits(PIBHabitants) != Double.doubleToLongBits(other.PIBHabitants))
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
