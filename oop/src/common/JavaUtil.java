package common;

public class JavaUtil {

	/**
	 * round 함수(반올림)
	 * @param double 실수값
	 * @param int 소수점 자리수
	 * @return double
	 */
	public static double round(double d, int i) {
		
		return Math.round(d*Math.pow(10, i))/Math.pow(10, i);
	}
	
	/**
	 * 문자열이 null일때 빈값으로 처리
	 * @param 문자열
	 * @return null일때 빈값 OR null아닐때 문자열
	 */
	public static String nullToBlank(String s) {
		if(s == null) {
			s = "";
		}
		return s;
		
	}
}
