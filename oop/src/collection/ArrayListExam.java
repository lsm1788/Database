package collection;

import java.util.*;

public class ArrayListExam {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("JDBC");
		list.add("Servley/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.isEmpty());
		System.out.println("총 객체 수 : "+list.size());
		System.out.println("------------------------");
		
		list.remove(0);			// 첫번째 배열항목 삭제
		list.remove("iBATIS");	// 이름을 넣어서도 삭제가능
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.isEmpty());
		System.out.println("총 객체 수 : "+list.size());
		
	}

}
