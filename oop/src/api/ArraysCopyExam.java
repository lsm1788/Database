package api;

import java.util.Arrays;

public class ArraysCopyExam {

	public static void main(String[] args) {
		
		char[] arr1 = {'J','A','V','A'};
		char[] arr2 = Arrays.copyOf(arr1, 4);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
	}

}
