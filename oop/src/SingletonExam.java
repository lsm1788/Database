
public class SingletonExam {

	public static void main(String[] args) {
		// new Singleton(); 은 에러가 발생한다. private이므로.
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1 == s2); 
		//s1과 s2가 같은 곳을 가리키는지 확인
		
		if(s1 == s2) {
			System.out.println("같은 Singleton객체 입니다.");
		} else {
			System.out.println("다른 Singleton객체 입니다.");
		}
		
	}

}
