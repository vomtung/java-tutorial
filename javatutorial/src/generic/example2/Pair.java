package generic.example2;

public class Pair<T,S> {
	
	private T first;
	
	private S second;

	public Pair(T f, S s) {
		first = f;
		second = s;
	}

	public Pair() {
	}

	public T getFirst() {
		return first;
	}

	public S getSecond() {
		return second;
	}

	public static void main(String[] args) {
		Pair<String, Integer> p1;
		Pair<Boolean, Short> p2;
		p1 = new Pair<String, Integer>("one", 2);
		p2 = new Pair<Boolean, Short>();
		System.out.println(p1.getFirst());
		System.out.println(p1.getSecond());
	}
}
