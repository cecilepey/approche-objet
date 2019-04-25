package fr.diginamic.heritage;

import fr.diginamic.entites.Intervenant;

public class Salarie extends Intervenant {

	private double salaire;

	public Salarie(String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.salaire = salaire;
	}

	@Override
	public void afficherDonnees() {

		System.out.println("Statut salarié : ");
		super.afficherDonnees();
	}

	@Override
	public double getSalaire() {
		return salaire;
	}

	/**
	 * @param salaire
	 *            the salaire to set
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

}
