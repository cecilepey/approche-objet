package fr.diginamic.operations;

public class Operations {

	public static double calcul(double nb1, double nb2, char op) {

		if (op == '+') {

			return nb1 + nb2;

		} else if (op == '-') {

			return nb1 - nb2;

		} else if (op == '*') {

			return nb1 * nb2;

		} else if (op == '/') {

			return nb1 / nb2;

		} else {

			return 0.0;
		}

	}

}
