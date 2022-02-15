package api;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.SimpleAttributeSet;

public class UtilDateExam {

	public static void main(String[] args) {

		Date now = new Date();
		System.out.println(now);
		now.setMonth(5);
		System.out.println(now.getMonth()+1+"월");
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String nowStr = sdf.format(now);
		System.out.println(nowStr);
	}

}
