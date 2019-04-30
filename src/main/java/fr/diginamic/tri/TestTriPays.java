package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import fr.diginamic.sets.Pays;

public class TestTriPays {

	public static void main(String[] args) {

		List<Pays> pays = new ArrayList<Pays>();

		Pays USA = new Pays("USA", 329_768_959, 59_532);
		Pays france = new Pays("France", 67_120_000, 44_538);
		Pays allemagne = new Pays("Allemagne", 82_700_000, 47_590);
		Pays UK = new Pays("UK", 66_020_000, 45_653);
		Pays italie = new Pays("Italie", 60_550_000, 29_847);
		Pays japon = new Pays("Japon", 126_400_000, 36_332);
		Pays chine = new Pays("Chine", 1_386_000_000, 7_589);
		Pays russie = new Pays("Russie", 144_500_000, 12_296);
		Pays inde = new Pays("Inde", 1_349_000_000, 1_627);

		pays.add(USA);
		pays.add(france);
		pays.add(allemagne);
		pays.add(UK);
		pays.add(italie);
		pays.add(japon);
		pays.add(chine);
		pays.add(russie);
		pays.add(inde);

		Collections.sort(pays);

		System.out.println("Tri avec compareTo() sur le PIB/Habitants");

		for (Pays listePays : pays) {

			System.out.println(listePays.getNom() + " - nombre d'habitants :  " + listePays.getNbHabitants()
					+ " - PIB/Habitant : " + listePays.getPIBHabitants());

		}
		System.out.println(" \nTri avec Comparator nombre habitants : ");

		Comparator<Pays> comparHabitants = new ComparatorHabitant();

		pays.sort(comparHabitants);

		for (Pays listePays : pays) {

			System.out.println(listePays.getNom() + " - nombre d'habitants :  " + listePays.getNbHabitants()
					+ " - PIB/Habitant : " + listePays.getPIBHabitants());
		}

		System.out.println(" \nTri avec Comparator PIB/Habitants ");

		Comparator<Pays> comparPIBHab = new ComparatorPibHabitant();

		pays.sort(comparPIBHab);

		for (Pays listePays : pays) {

			System.out.println(listePays.getNom() + " - nombre d'habitants :  " + listePays.getNbHabitants()
					+ " - PIB/Habitant : " + listePays.getPIBHabitants());

		}

	}

}
