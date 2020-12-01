package collections;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		
		
		//array a[]={1,2,3,4,5,6,};
		
		ArrayList<String> ar=new ArrayList();
		ar.add("nagababu");
		ar.add("bhavani");
		ar.add("raju");
		ar.add("meena");
		ar.add("nagababu");
		System.out.println(ar);
		ar.remove(0);
		System.out.println(ar);
		ar.isEmpty();
		System.out.println(ar);
		ar.equals(ar);
		ar.addAll(ar);
		
		System.out.println(ar);
		
		ar.removeAll(ar);
		System.out.println(ar);
		System.out.println(ar);
		ar.addAll(ar);
		System.out.println(ar);

		ar.add("ctc");
		ar.add("cog");
		ar.add("wipro");
		ar.add("infosys");
		System.out.println(ar);
		
		
	}

}
