/**
 * 
 */
package fr.diginamic.tp6;

/**
 * @author Cécile Peyras
 *
 */
public class ExecuterOperation {

	public static int execute(IOperation operation, int a, int b) {
		return operation.calcul(a, b);

	}

}
