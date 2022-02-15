package api;

import java.util.Arrays;

public class SortExam {

	public static void main(String[] args) {
		Member m1 = new Member("홍길동", 100);
		Member m2 = new Member("박동수", 50);
		Member m3 = new Member("김민수", 80);
		Member[] members = {m1,m2,m3};
		Arrays.sort(members);
		for(int i = 0; i < members.length; i++) {
			System.out.println("members["+i+"].name="+members[i].name);
		}
	}

}
