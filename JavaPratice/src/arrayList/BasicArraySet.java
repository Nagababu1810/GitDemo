package arrayList;

import java.util.HashSet;
import java.util.Iterator;

public class BasicArraySet {

	public static void main(String[] args) {
		
		
		HashSet<String> hs= new HashSet<String>();
		hs.add("mango");
		hs.add("banana");
		hs.add("apple");
		hs.add("mango");
		
		System.out.println(hs);
		
		// iterate the hashset
		
		/*
		 * Iterator<String> itr = hs.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */
		// copy set to another set
		
		/*
		 * HashSet<String> subset=new HashSet<String>(); subset.add("s1");
		 * subset.add("s2"); hs.addAll(subset); System.out.println(subset);
		 * System.out.println(hs);
		 */
		// delete all elements
		/*
		 * hs.clear(); System.out.println("clear all the elements:" +hs);
		 */
		// copy hashset to array
		
		String[] str= new String[hs.size()];
		hs.toArray(str);
		for(String set:str) {
			System.out.println(set);
		}
		
		
		
		
	}

}
