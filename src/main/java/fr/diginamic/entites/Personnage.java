package fr.diginamic.entites;

import java.util.Random;

public abstract class Personnage {

	protected int ptVie;
	protected int force;
	protected int attaque;
	protected boolean enVie = true;
	protected String nom;
	protected int type;
	Random random = new Random();

	/**
	 * @param ptVie
	 * @param force
	 */
	public Personnage() {
	}

	public int calculAttaque() {

		attaque = force + random.nextInt(11) + 1;

		return attaque;
	}

	public boolean enVie() {

		if (ptVie <= 0) {
			return false;
		} else {

			return true;
		}

	};

	/**
	 * @return the ptVie
	 */
	public int getPtVie() {
		return ptVie;
	}

	/**
	 * @param ptVie
	 *            the ptVie to set
	 */
	public void setPtVie(int ptVie) {
		this.ptVie = ptVie;
	}

	/**
	 * @return the force
	 */
	public int getForce() {
		return force;
	}

	/**
	 * @param force
	 *            the force to set
	 */
	public void setForce(int force) {
		this.force = force;
	}

	/**
	 * @return the attaque
	 */
	public int getAttaque() {
		return attaque;
	}

	/**
	 * @param attaque
	 *            the attaque to set
	 */
	public void setAttaque(int attaque) {
		this.attaque = attaque;
	}

	/**
	 * @return the enVie
	 */
	public boolean isEnVie() {
		return enVie;
	}

	/**
	 * @param enVie
	 *            the enVie to set
	 */
	public void setEnVie(boolean enVie) {
		this.enVie = enVie;
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
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

}
