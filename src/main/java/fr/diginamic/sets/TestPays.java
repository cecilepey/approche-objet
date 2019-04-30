package fr.diginamic.sets;

import java.util.HashSet;
import java.util.Set;

public class TestPays {

	public static void main(String[] args) {

		// USA, France, Allemagne, UK, Italie, Japon, Chine, Russie, Inde

		Set<Pays> pays = new HashSet();

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

		double maxPIB = pays.iterator().next().getPIBHabitants();
		String paysMaxPIB = null;

		double maxPIBTotal = pays.iterator().next().getPIBHabitants() * pays.iterator().next().getNbHabitants();
		String paysMaxPIBTotal = null;

		double minPIBTotal = pays.iterator().next().getPIBHabitants() * pays.iterator().next().getNbHabitants();
		String paysMinPIBTotal = null;
		Pays paysMinTotal = null;

		for (Pays listePays : pays) {

			if (maxPIB < listePays.getPIBHabitants()) {
				maxPIB = listePays.getPIBHabitants();
				paysMaxPIB = listePays.getNom();
			}

			if (maxPIBTotal < listePays.getNbHabitants() * listePays.getPIBHabitants()) {
				maxPIBTotal = listePays.getNbHabitants() * listePays.getPIBHabitants();
				paysMaxPIBTotal = listePays.getNom();
			}

			if (minPIBTotal > listePays.getNbHabitants() * listePays.getPIBHabitants()) {
				minPIBTotal = listePays.getNbHabitants() * listePays.getPIBHabitants();
				paysMinPIBTotal = listePays.getNom().toUpperCase();
				listePays.setNom(paysMinPIBTotal.toUpperCase());
				paysMinTotal = listePays;

			}

		}

		System.out.println("Pays avec le PIB par habitant le plus élevé : " + paysMaxPIB);
		System.out.println("Pays avec le PIB total : " + paysMaxPIBTotal);
		System.out.println("Pays avec le PIB total le plus petit (en majuscule): " + paysMinPIBTotal);

		pays.remove(paysMinTotal);

		for (Pays listePays : pays) {
			System.out.println(listePays.getNom() + " - nb habitants : " + listePays.getNbHabitants()
					+ " - PIB Total : " + listePays.getNbHabitants() * listePays.getPIBHabitants());
		}

	}

}
