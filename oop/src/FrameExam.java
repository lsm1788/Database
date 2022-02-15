import java.awt.*;
//import로 생기는 java.awt.Frame에서 frame부분을 *로 바꾸어준다.

public class FrameExam {
	Frame frame = new Frame("ㅎㅎㅎ");
	Button button = new Button("★★★");

	// 디폴트 생성자 생성
	public FrameExam() {
		// 프레임에 컴포넌트 추가
		frame.add(button);

		// 프레임 크기 지정
		frame.setSize(600, 600);

		// 프레임 보이기
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		new FrameExam();

	}

}
