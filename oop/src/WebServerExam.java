
public class WebServerExam {
	public static void main(String[] args) {
		//지금은 has a 방식, 다른 방식으로는 is a 방식이 있음.
		//has a 방식 = 만들어진 것을 가지고 있다. 호출해서 사용. 일반적인 사용방식.
		//is a 방식 = 
		//WebServer는 포트가 있고 메소드가 3개가 있다.
		WebServer ws = new WebServer();
		ws.port = 80;
		System.out.printf("현재 웹서버포트는 %d입니다.\n", ws.port);
		//ws.start();
		//ws.stop();
		ws.reStart();
	}

}
