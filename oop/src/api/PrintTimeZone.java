package api;

import java.util.Calendar;
import java.util.TimeZone;

public class PrintTimeZone {

	public static void main(String[] args) {
		//Locale
		//Asia/Seoul
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar now = Calendar.getInstance(timeZone);
		System.out.println(now.get(Calendar.HOUR));
		
		String[] ids = TimeZone.getAvailableIDs();
		for(String id : ids) {
			//System.out.println(id);
		}
		
	}

}
