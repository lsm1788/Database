package api;

import java.sql.Date;

/**
 * 
 * System 클래스
 * 
 */

public class SystemExam {

	public static void main(String[] args) {
		
		//1644552214950	<-- Timestamp
		long now = System.currentTimeMillis();
		System.out.println(now);
		System.out.println(new Date(0));
		
	}
	
	
}


