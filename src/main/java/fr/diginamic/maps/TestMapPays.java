package fr.diginamic.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import fr.diginamic.sets.Pays;

public class TestMapPays {

	public static void main(String[] args) {

		Map<String, Pays> pays = new HashMap();

		Pays USA = new Pays("USA", 329_768_959, 59_532);
		Pays france = new Pays("France", 67_120_000, 44_538);
		Pays allemagne = new Pays("Allemagne", 82_700_000, 47_590);
		Pays UK = new Pays("UK", 66_020_000, 45_653);
		Pays italie = new Pays("Italie", 60_550_000, 29_847);
		Pays japon = new Pays("Japon", 126_400_000, 36_332);
		Pays chine = new Pays("Chine", 1_386_000_000, 7_589);
		Pays russie = new Pays("Russie", 144_500_000, 12_296);
		Pays inde = new Pays("Inde", 1_349_000_000, 1_627);

		pays.put("USA", USA);
		pays.put("France", france);
		pays.put("Allemagne", allemagne);
		pays.put("UK", UK);
		pays.put("Italie", italie);
		pays.put("Japon", japon);
		pays.put("Chine", chine);
		pays.put("Russie", russie);
		pays.put("Inde", inde);

		for (String key : pays.keySet()) {
			System.out.println(key);
		}

		Collection<Pays> listePays = pays.values();
		for (Pays liste : listePays) {
			System.out.println(liste.getNom() + " - " + liste.getNbHabitants() + " - " + liste.getPIBHabitants());
		}

		Pays paysMoinsHbts = listePays.iterator().next();
		int paysHbts = 0;
		String nomPays = null;
		Pays petitPays = null;

		for (Pays liste : listePays) {
			if (paysHbts < paysMoinsHbts.getNbHabitants()) {
				paysHbts = paysMoinsHbts.getNbHabitants();
				nomPays = paysMoinsHbts.getNom();
				petitPays = liste;
			}
		}

		System.out.println(petitPays.getNom());

		pays.remove(nomPays);

		for (Pays liste : listePays) {
			System.out.println(liste.getNom() + " - " + liste.getNbHabitants() + " - " + liste.getPIBHabitants());
		}

	}

}
