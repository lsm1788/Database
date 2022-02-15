package excep;

public class NumberFormatException {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		int value1 = 0;
		try {
			value1 = Integer.parseInt(data1);
			System.out.println(value1);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		} finally {
			System.out.println("무적권 실행됩니다.");
		}

	}
}