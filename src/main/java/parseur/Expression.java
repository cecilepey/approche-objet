package parseur;

public class Expression {

	MembreGauche gauche = new MembreGauche();
	MembreDroit droit = new MembreDroit();
	Operateur operateur = new Operateur(); // mettre la variable trouver par le
											// parseur

	/**
	 * @param variable
	 * @param valeur
	 * @param operateur
	 */
	public Expression(MembreGauche gauche, Operateur operateur, MembreDroit droit) {
		this.gauche = gauche;
		this.operateur = operateur;
		this.droit = droit;
	}

	/**
	 * @return the gauche
	 */
	public MembreGauche getGauche() {
		return gauche;
	}

	/**
	 * @param gauche
	 *            the gauche to set
	 */
	public void setGauche(MembreGauche gauche) {
		this.gauche = gauche;
	}

	/**
	 * @return the droit
	 */
	public MembreDroit getDroit() {
		return droit;
	}

	/**
	 * @param droit
	 *            the droit to set
	 */
	public void setDroit(MembreDroit droit) {
		this.droit = droit;
	}

	/**
	 * @return the operateur
	 */
	public Operateur getOperateur() {
		return operateur;
	}

	/**
	 * @param operateur
	 *            the operateur to set
	 */
	public void setOperateur(Operateur operateur) {
		this.operateur = operateur;
	}
}