package impl;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("HI");
		al.add("JAVA");
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}

}
