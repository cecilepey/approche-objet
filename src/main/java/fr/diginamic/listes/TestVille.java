package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestVille {

	public static void main(String[] args) {

		ArrayList<Ville> ville = new ArrayList<Ville>();

		Ville Nice = new Ville("Nice", 343000);
		Ville Carcassonne = new Ville("Carcassonne", 47800);
		Ville Narbonne = new Ville("Narbonne", 53400);
		Ville Lyon = new Ville("Lyon", 484000);
		Ville Foix = new Ville("Foix", 9700);
		Ville Pau = new Ville("Pau", 77200);
		Ville Marseille = new Ville("Marseille", 850700);
		Ville Tarbes = new Ville("Tarbes", 40600);

		ville.add(Nice);
		ville.add(Carcassonne);
		ville.add(Narbonne);
		ville.add(Lyon);
		ville.add(Foix);
		ville.add(Pau);
		ville.add(Marseille);
		ville.add(Tarbes);

		long max = 0;
		long mini = ville.get(0).getNbHabitants();
		String villeMaxHabitants = "";

		for (int i = 0; i < ville.size(); i++) {

			Ville villeHabitants = ville.get(i);

			if (villeHabitants.getNbHabitants() > max) {
				max = villeHabitants.getNbHabitants();
				villeMaxHabitants = villeHabitants.getNom();
			}

			if (mini > villeHabitants.getNbHabitants()) {
				mini = villeHabitants.getNbHabitants();

			}

		}

		System.out.println(villeMaxHabitants);

		Iterator<Ville> iter = ville.iterator();

		while (iter.hasNext()) {

			long nbMini = iter.next().getNbHabitants();

			if (nbMini == mini) {
				iter.remove();

			}
		}

		for (int i = 0; i < ville.size(); i++) {

			Ville villeHabitants = ville.get(i);

			if (villeHabitants.getNbHabitants() >= 100000) {
				villeHabitants.setNom(villeHabitants.getNom().toUpperCase());
			}

		}

		for (Ville affichVille : ville) {

			System.out.println(affichVille.getNom() + " : " + affichVille.getNbHabitants());
		}

	}

}
