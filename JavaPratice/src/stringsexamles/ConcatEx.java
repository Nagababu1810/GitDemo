package stringsexamles;

import java.util.ArrayList;
import java.util.List;

public class ConcatEx {

	public static void main(String[] args) {
		
		//concate single object
		String str1 ="java";
		String str2 ="Pratice";
		//This is spample message
		System.out.println(str1.concat(str1));
		System.out.println(str1.concat(str2));
		
		//concate multiple objects
		String str3="Tutourial";
		String str4="point";
		
		System.out.println(str1.concat(str2).concat(str3));
		
		//adding spaces
		String str5=str1.concat(str3);
		System.out.println(str5);
		
		System.out.println(str1.concat(" ").concat(str5));
		
		System.out.println(str1.concat("").concat("@").concat(str5));
		
		System.out.println(str5.concat("!!"));
		
		System.out.println(str1.concat("@"));
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
			
		//ends with
		
		String str6="www.javapoint.com";
		System.out.println(str6.endsWith("point"));
		System.out.println(str6.endsWith("t"));
		
		if(str6.endsWith("point")) {
			System.out.println("This is true");
		}
		else {
			System.out.println("This is not true");
		}
		
		//String equals
		String str7="java";
		String str8="Java";
		
		System.out.println(str6.equals(str5));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str7));
		
		if(str1.equals(str7)) {
			System.out.println("both are equals");
		}
		else
		{
			System.out.println("both are not equals");
		}
		
		System.out.println("=======================================");
		//equals ignore case
		System.out.println(str7.equals(str8));
		System.out.println(str7.equalsIgnoreCase(str8));
		if(str7.equalsIgnoreCase(str8)) {
			System.out.println("both are equals");
		}
		else
		{
			System.out.println("both are not equals");
		}
	
		System.out.println("______________________________________________");
		
		ArrayList<String> list=new ArrayList();
		
		
		list.add("babu");
		list.add("kumar");
		list.add("raju");
		list.add("paravathi");
		list.add("java");
	
		for(String str:list) {
			if(str1.equalsIgnoreCase(str8)) {
				System.out.println("java is presents");
			}
			else
			{
				System.out.println("java is not presents");
			}
		}
	
	
	
	
	//This is the result
	
	
	
	
	}
	

}
