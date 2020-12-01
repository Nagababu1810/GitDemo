package arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BasicArrayList {


	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList<String>();
		
		a.add("First");
		a.add("second");
		a.add("Third");
		a.add("fourth");
		System.out.println("the Actual value :" +a);
		
		// 1. how to copy or clone Arrylist
		
		  //ArrayList<String> copy = (ArrayList<String>) a.clone();
		  //System.out.println("Expected value is :" + copy);
		
		
		// 2.read the values using iterator
		
		/*Iterator<String> read = a.iterator();
		while(read.hasNext()) {
			System.out.println(read.next());
	*/
		
		
 

		
		
		
		// 3.add all element of list
		
		/*
		 * List<String> list=new ArrayList<String>(); list.add("apple");
		 * list.add("banana"); a.addAll(list); System.out.println("Adding the elements:"
		 * + a );
		 */
		
		// 4.delete all elements
		/*
		 * a.clear(); System.out.println("clear all the elements :" + a);
		 */
	
		// 5.comparing two list values containsAll(); method
		
		/*
		 * List<String> list=new ArrayList<String>(); list.add("second");
		 * list.add("Third"); System.out.println("Comparing the list values:"+
		 * a.containsAll(list));
		 * 
		 * list.add("five"); System.out.println("comparing the list values:"+
		 * a.containsAll(list));
		 */
		
		// 6.copy arraylist to array toarray() method
		
		/*
		 * String[] str=new String[a.size()]; a.toArray(str); for(String strarray:str) {
		 * System.out.println(strarray); }
		 */
		
		//7. get sublist
		/*
		 * List<String> str = a.subList(1,3);
		 * System.out.println("sub list of the value:" + str);
		 */
		
		// 8.reverse arraylist, collections.reverser()method
			
		
		/*
		 * List<String> list=new ArrayList<String>(); list.add("mango");
		 * list.add("potota"); list.add("gova"); Collections.reverse(list); for(String
		 * arrlst:list) { System.out.println(arrlst); }
		 */
		
		// 9.shaful the elements
		
		Collections.shuffle(a);
		System.out.println("shuffle the elements");
		for(String shuf:a) {
			System.out.println(shuf);
			
		System.out.println("again after shuffle");
		for(String shuff:a) {
			System.out.println(shuff);
		}
		}
		
		
		
		// 10.swap two elements of arraylist
		
		Collections.swap(a, 1, 3);
		System.out.println("Swap the two numbers");
		for(String sw:a) {
			System.out.println(sw);
			
		}
		
		
		
		
		
		}
}
