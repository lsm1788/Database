package api;

import java.text.DecimalFormat;

public class DecimalFormatExam {

	public static void main(String[] args) {

		double num = 0;
		DecimalFormat df = new DecimalFormat("000");
		String str = df.format(num);
		System.out.println(str);
		for(int i = 1; i < 101; i++) {
			
			System.out.println(df.format(i));
		}
	}

}
