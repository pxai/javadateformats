/**
 * 
 */
package io.pello.java.datemanipulation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author PELLO_ALTADILL
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String sampleDate = "2016-10-09T00:00:00+0200"; // ISO8601 format: https://en.wikipedia.org/wiki/ISO_8601
		
        DateFormat shortFormat= new SimpleDateFormat("MM/dd/yyyy"); 
        DateFormat longFormat= new SimpleDateFormat(); // "yyyy-MM-dd HH:mm:ss"
        
        // T is a separator, Z zulu hour, where midnisght 12 is zero
        DateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DateFormat isoFormatUS = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        
		String line = "";
		
		System.out.println("Please insert a valid date (MM/dd/yyyy)");
		line = reader.nextLine();
		
        // Convert from String to Date
        try {

			Date shortDate = shortFormat.parse(line);	
			System.out.println("Ok, date parsed: " + shortDate.toString());
			
        	Date longDate = longFormat.parse(sampleDate);
			System.out.println("Ok, long date parsed: " + longDate.toString());
			
		} catch (ParseException e) {
			System.err.println("Error parsing date: " + e.toString());
			e.printStackTrace();
		}	
		
	}

}
