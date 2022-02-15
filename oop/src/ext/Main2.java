package ext;

public class Main2 {

	public static void main(String[] args) {
		Board notice = null;
		notice = new Board();
		// Notice notice = new Notice();
		notice.setTitle("첫번째 공지글입니다.");
		// 객체명.필드 or 객체명.메소드()
		System.out.println(notice.getTitle());

		Board gallery = null;
		gallery = new Board();
		// Notice notice = new Notice();
		gallery.setTitle("첫번째 갤러리글입니다.");
		// 객체명.필드 or 객체명.메소드()
		System.out.println(gallery.getTitle());
		System.out.println(gallery.getFile());

	}
}
