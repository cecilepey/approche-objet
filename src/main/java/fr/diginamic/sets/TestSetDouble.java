package fr.diginamic.sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetDouble {

	public static void main(String[] args) {

		// 1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01, 13.3

		Set<Double> set = new HashSet();

		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		set.add(13.3);

		System.out.println(set);

		double max = set.iterator().next();

		for (Double sets : set) {

			if (max < sets) {
				max = sets;
			}

		}
		System.out.println(max);

	}

}
