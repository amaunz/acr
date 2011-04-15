package acr.util;

import java.util.Calendar;

public class Time {

	/**
	 * Returns a date string.
	 * @return String
	 */
	public static String getDate() {
		return Calendar.getInstance().getTime().toString();
	}
	
}
