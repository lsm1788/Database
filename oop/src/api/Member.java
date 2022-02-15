package api;

public class Member implements Comparable<Member>{

	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Member o) {
	
		return age - o.age;
	}
	
}
