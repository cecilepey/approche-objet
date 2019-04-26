package fr.diginamic.tp6;

public class TestExecuterOperation {

	public static void main(String[] args) {

		IOperation adition = new Adition();

		IOperation multiplication = new Multiplication();

		int a = 5;

		int b = 6;

		System.out.println(ExecuterOperation.execute(adition, a, b));

		System.out.println(ExecuterOperation.execute(multiplication, a, b));
	}

}
