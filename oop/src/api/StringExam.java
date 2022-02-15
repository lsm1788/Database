package api;

import java.io.UnsupportedEncodingException;

public class StringExam {

	public static void main(String[] args) {
		//format:서식문자열을 이용해서 서식화된 문자열을 반환한다.
		System.out.println("* format:서식문자열을 이용해서 서식화된 문자열을 반환한다.");
		System.out.println("");
		
		int i = 123456789;
		System.out.println(String.format("%,d", i));
		
		System.out.println("-----------------------");
		
		//split(구분자) 구분자를 이용하여 문자열 배열생성
		System.out.println("* split(구분자) 구분자를 이용하여 문자열 배열생성");
		System.out.println("");
		
		String splitStr = "boo:and:foo";
		String[] strArr = splitStr.split(":");
		System.out.println(strArr.length);
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		
		System.out.println("-----------------------");
		
		//starWith 문자열이 지정한 문자로 시작하는지 판단, 같으면 true반환
		//아니면 false를 반환한다.
		System.out.println("* starWith 문자열이 지정한 문자로 시작하는지 판단, 같으면 true반환, 아니면 false를 반환한다.");
		System.out.println("");
		
		String msg = "apple";
		System.out.println(msg.startsWith("a"));
		
		System.out.println("-----------------------");
		
		//isEmpty() 문자열의 길이가 0인 경우에, true를 리턴합니다.
		System.out.println("* isEmpty() 문자열의 길이가 0인 경우에, true를 리턴합니다.");
		System.out.println("");
		
		String isEmpty = "";
		System.out.println(isEmpty.isEmpty());
		
		System.out.println("-----------------------");
		
		//concat(String) 문자열 합치기
		System.out.println("* concat(String) 문자열 합치기");
		System.out.println("");
		
		String fStr = "java";
		String lStr = "Programing";
		System.out.println(fStr.concat(lStr));
		System.out.println(fStr + lStr);
		
		System.out.println("-----------------------");
		
		//valueOf() 다른타입을 문자열로 변환
		System.out.println("* valueOf() 다른타입을 문자열로 변환");
		System.out.println("");
		
		System.out.println(String.valueOf(false));
		System.out.println(String.valueOf(1));
		System.out.println(String.valueOf(1.));
		System.out.println(String.valueOf('a'));
		
		System.out.println("-----------------------");
		
		//trim 문자열 앞뒤 공백 잘라내기
		System.out.println("* trim 문자열 앞뒤 공백 잘라내기");
		System.out.println("");
		
		String oldStr1 = "      자바 프로그램     ";
		System.out.println("[DEG]["+oldStr1.trim()+"]");
		
		System.out.println("-----------------------");
		
		//알파벳 소,대문자 변경
		//toLowerCase() : 소문자
		//toUpperCase() : 대문자 
		System.out.println("* toLowerCase(),toUpperCase(), 알파벳 소,대문자 변경");
		System.out.println("");
		
		String oriStr = "Java Programing";
		System.out.println(oriStr.toLowerCase());
		System.out.println(oriStr.toUpperCase());
		
		System.out.println("-----------------------");
		
		//substring() 문자열 잘라내기 ★★★★★(중요)
		System.out.println("* substring() 문자열 잘라내기 ★★★★★(중요)");
		System.out.println("");
		
		String ssn = "880815-1234567";
		System.out.println(ssn.substring(0, 6));
		System.out.println(ssn.substring(7, ssn.length()));
		System.out.println(ssn.substring(7));
		
		
		System.out.println("-----------------------");
		
		//replace() 문자열 대치(교체)
		System.out.println("* replace() 문자열 대치(교체)");
		System.out.println("");
		
		String oldStr = "자바 프로그래밍 자바";
		String newStr = oldStr.replace("자바", "Java");
		System.out.println(newStr);
		
		System.out.println("--------------------------");
		
		//lenght() 문자열의 길이
		System.out.println("* lenght() 문자열의 길이");
		System.out.println("");
		
		String subject2 = "자바";
		System.out.println(subject2.length());
		
		System.out.println("-------------------");
		
		//indexOf(찾을 문자열) 문자열 찾기 charAt(인덱스)
		System.out.println("* indexOf(찾을 문자열) 문자열 찾기 charAt(인덱스)");
		System.out.println("");
		
		String subject1 = "자바 프로그래밍 자바";
		int idx = subject1.indexOf("바");
		System.out.println(idx);
		
		int idx1 = subject1.lastIndexOf("바");
		System.out.println(idx1);
		
		System.out.println("----------------------");
		
		//getBytes() 바이트 배열로 변환
		System.out.println("* getBytes() 바이트 배열로 변환");
		System.out.println("");
		
		String str = "안녕하세요";
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1.length);
		String str1 = new String(bytes1);
		System.out.println(str1);
		
		System.out.println("----------------------");
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println(bytes2.length);
			String str2 = new String(bytes2);
			System.out.println(str2);
			
			byte[] bytes3 = str.getBytes("EUC-KR");
			System.out.println(bytes3.length);
			String str3 = new String(bytes3);
			System.out.println(str3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println("----------------------");
		
		//byte[] bytes = "문자열".getBytes();
		//byte[] bytes = "문자열".getBytes("UTF-8");
		//System.out.println(new String(bytes));
		
		//equals(other object) 문자열비교
		// == OR equals
		String strVal1 = null;
		String strVal2 = "Abc";
		String strVal3 = "abc";
		System.out.println(strVal1 == strVal2);
		System.out.println(strVal2 == strVal3);
		//System.out.println(strVal1.equals(strVal2));
		
		System.out.println("ABC".equals(strVal2));
		System.out.println("ABC".equalsIgnoreCase(strVal2));
		
		//charAt(); 인덱스에 해당하는 문자[char]를 리턴한다.
		String subject = "990101-1000000";
		char charVal = subject.charAt(7);
		if((charVal-'0') % 2 == 0) {
			System.out.println("여자");
		} else {
			System.out.println("남자");
		}
		
	}

}
