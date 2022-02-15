package api;

import java.text.MessageFormat;

public class MessageFormatExam {

	public static void main(String[] args) {
		String id = "blue";
		String name = "신용권";
		String tel = "010-0000-0000";
		
		String msg = "회원 ID: {0} \\n회원 이름: {1} \\n회원 전화: {2}";
		String res = MessageFormat.format(msg, id, name, tel);
		System.out.println(res);
		
	}

}
