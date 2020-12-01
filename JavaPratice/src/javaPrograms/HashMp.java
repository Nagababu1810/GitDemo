package javaPrograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMp {

	public static void main(String[] args) {
		
		
		HashMap<String,String> hm=new HashMap<String, String>();
		
		hm.put("one", "raju");
		hm.put("Two", "ravi");
		hm.put("Three", "ramu");
		hm.put("four","ramesh");
		
		System.out.println(hm);
		
		for(Entry<String, String> itr:hm.entrySet()) {
			//System.out.println(itr);
			//System.out.println("======================================");
			System.out.println(itr.getKey()+" = "+itr.getValue());
		}
		
		
	}

}
