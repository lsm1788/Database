package api;

import java.util.Random;

public class RandomExam {

	public static void main(String[] args) {
		//10-20
		Random random = new Random(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());

		System.out.println(Math.abs(random.nextInt(11)+10));
		
	}

}
