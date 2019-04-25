package fr.diginamic.heritage;

import fr.diginamic.entites.Intervenant;

public class Pigiste extends Intervenant {

	private int nbJourTravaille;
	private double taux;

	public Pigiste(String nom, String prenom, int nbJourTravaille, double taux) {
		super(nom, prenom);
		this.nbJourTravaille = nbJourTravaille;
		this.taux = taux;

	}

	@Override
	public void afficherDonnees() {

		System.out.println("Satut Pigiste : ");
		super.afficherDonnees();
	}

	@Override
	public double getSalaire() {

		return nbJourTravaille * taux;

	}

	/**
	 * @return the nbJourTravaille
	 */
	public int getNbJourTravaille() {
		return nbJourTravaille;
	}

	/**
	 * @param nbJourTravaille
	 *            the nbJourTravaille to set
	 */
	public void setNbJourTravaille(int nbJourTravaille) {
		this.nbJourTravaille = nbJourTravaille;
	}

	/**
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/**
	 * @param taux
	 *            the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

}
