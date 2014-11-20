package generic.example4;

import generic.example1.Employer;
import generic.example1.Main;
import generic.example1.Manager;

import java.util.ArrayList;
import java.util.List;

public class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
	this.key = key;
	this.value = value;
    }

    public K getKey()	{ return key; }
    public V getValue() { return value; }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
    	Pair<String, String>  p2 = new OrderedPair<String, String>("hello", "world");
    	
    	System.out.println(p1.getKey()+p1.getValue());
    	System.out.println(p2.getKey()+p2.getValue());
	}
}
