package fr.diginamic.tri;

import java.util.Comparator;

import fr.diginamic.sets.Pays;

public class ComparatorPibHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays o1, Pays o2) {
		if (o1.getPIBHabitants() < o2.getPIBHabitants()) {
			return 1;
		} else if (o1.getPIBHabitants() == o2.getPIBHabitants()) {
			return 0;
		}

		return -1;
	}

}
