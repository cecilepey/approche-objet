/**
 * 
 */
package fr.diginamic.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Cécile Peyras
 *
 */
public class TestDate {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		@SuppressWarnings("deprecation")
		Date date = new Date(-25, 3, 30);

		System.out.println(date);

		Calendar calendar = Calendar.getInstance();
		// calendar.set(2019, 03, 30, 0, 0, 0);
		calendar.set(Calendar.YEAR, 2019);
		calendar.set(Calendar.DAY_OF_YEAR, 196);

		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 50);
		calendar.set(Calendar.SECOND, 2);

		Date maDate = calendar.getTime();

		// pour insérer du texte dans le formateur : ''

		SimpleDateFormat formatteur = new SimpleDateFormat("'Le' EEEEE dd/MM/yyy 'à' HH:mm:ss' ms:'sss");

		String maDateFormatee = formatteur.format(maDate);

		System.out.println(maDateFormatee);

		SimpleDateFormat formatteurStandard = new SimpleDateFormat("dd/MM/yyyy");
		String chaine = "04/05/2019";
		Date maDateStandard = formatteurStandard.parse(chaine);
		System.out.println(maDateStandard);

	}

}
