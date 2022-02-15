package com.naver.lsm17888.app;

import java.util.Date;

public class DateExam3{

	public static void main(String[] args) {
		
		Date now2 = new Date();
		System.out.println(now2);
		
		java.sql.Date now1 = new java.sql.Date(System.currentTimeMillis());
		System.out.println(now1);
	}

}
