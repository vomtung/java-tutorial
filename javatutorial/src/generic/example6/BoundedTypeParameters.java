package generic.example6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class BoundedTypeParameters<T> {

	private T t;          

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void print(List<? extends Number> list){
    	for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Number number = (Number) iterator.next();
			System.out.println(number);
			
		}
    }
    
    public static void main(String[] args) {
        List<Integer>listInteger=Arrays.asList(1,2,3,4);
        List<String>listString=Arrays.asList("1","Flag","Lemon","Apple");
        List<Long>listLong=Arrays.asList(new Long(1),new Long(2),new Long(3));
        print(listInteger);
        //print(listString);//Error
        print(listLong);
    }
}
