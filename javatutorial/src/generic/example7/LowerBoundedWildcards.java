package generic.example7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LowerBoundedWildcards<T> {
	
	public LowerBoundedWildcards(T t) {
		super();
		this.t = t;
	}

	private T t;          

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public static  void inspect(List<? super LowerBoundedWildcards> list){
    	for (Iterator iterator = list.iterator(); iterator.hasNext();) {
    		LowerBoundedWildcards wildCard = (LowerBoundedWildcards) iterator.next();
    		System.out.println(wildCard.getT().getClass());
		}
    }

    public static void main(String[] args) {
//        integerBox.inspect("some text"); // error: this is still String!
        List<LowerBoundedWildcards> list=new ArrayList<>();
        list.add(new LowerBoundedWildcards<Integer>(1));
        list.add(new LowerBoundedWildcards<Integer>(1));
        inspect(list);
        
    }
}
