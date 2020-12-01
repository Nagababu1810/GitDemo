package collections;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
		
		hs.put(0, 10);
		hs.put(1,20);
		hs.put(2, 30);
		hs.put(3, 40);
		hs.put(4,50);
		System.out.println(hs);
		hs.put(4, 100);
		System.out.println(hs);
		hs.put(5, 100);
		
		System.out.println(hs);
		
		hs.remove(5);
		System.out.println(hs);
		
		hs.isEmpty();
		System.out.println(hs);
		
		hs.put(4, 50);
		System.out.println(hs);
		
	}

}
