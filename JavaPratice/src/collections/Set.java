package collections;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array<integer> as=new Arryset();
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(10);
		
		System.out.println(hs);
		hs.remove(10);
		System.out.println(hs);
		hs.add(100);
		
		hs.add(50);
		hs.add(60);
		System.out.println(hs);
		Iterator<Integer> i = hs.iterator();
		//System.out.println(i);
		
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		
		
		
		
	}

}
