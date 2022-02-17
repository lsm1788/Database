package collection;

import java.util.*;

public class HashSetExam {

	public static void main(String[] args) {
		//Set<String> set = new HashSet<String>();
		List<String> set = new ArrayList<String>();
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/Jsp");
		set.add("Java");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String data = it.next();
			System.out.println(data);
		}
	}

}
