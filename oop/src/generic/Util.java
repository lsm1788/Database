package generic;

public class Util {

	public static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		boolean keycompare = p1.getKey().equals(p2.getKey());
		boolean valuecompare = p1.getValue().equals(p2.getValue());
		return keycompare && valuecompare;
	}
}
