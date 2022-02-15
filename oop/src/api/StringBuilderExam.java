package api;

public class StringBuilderExam {

	public static void main(String[] args) {
		StringBuilder sql = new StringBuilder()
				.append(" select ")
				.append(" * ")
				.append(" from member ");
//		StringBuffer sql = new StringBuffer();
//		sql.append(" select ");
//		sql.append(" * ");
//		sql.append(" from member ");
		// StringBuffer -> String 클래스 만들기
		String sqlStr = sql.toString();

		System.out.println(sqlStr);

	}

}
