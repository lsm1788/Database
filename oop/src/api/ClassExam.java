package api;

import excep.A;

public class ClassExam {

	public static void main(String[] args) throws ClassNotFoundException {
		ClassExam ce = new ClassExam();
		System.out.println(ce.getClass());
		System.out.println(ce.getClass().getName());	//.getClass <---클래스명 가져오기
		Class clazz = Class.forName("api.Counter");
		System.out.println(clazz.getName());
		
		
		
	}

}
