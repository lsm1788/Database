package ext;

public class Main {

	public static void main(String[] args) {
		Notice notice = null;
		notice = new Notice();
		//Notice notice = new Notice();
		notice.setTitle("첫번째 공지글입니다.");
		//객체명.필드 or 객체명.메소드()
		System.out.println(notice.getTitle());
		
		Gallery gallery = new Gallery();
		//gallery.setImgFile("그림.png");
		System.out.println(gallery.getFile());
	}

}
