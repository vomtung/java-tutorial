package generic.example8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class UnboundedWildcards<T> {
	
	T t;
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public static void printList(List<?> list) {
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object item = (Object) iterator.next();
			System.out.println(item);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = Arrays.asList(1, 2, 3);
		List<String>  ls = Arrays.asList("one", "two", "three");
		printList(li);
		printList(ls);
	}

}
