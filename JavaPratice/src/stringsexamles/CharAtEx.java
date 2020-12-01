package stringsexamles;

public class CharAtEx {

	public static void main(String[] args) {
		//findout particular character
		String str="javascript";
		System.out.println("the charter at str is:" + str.charAt(9));
		
		char ch=str.charAt(0);
		System.out.println(ch);
		
		//Add second space
		//find out first index value and last index value
		
		String name="nagababu";
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(name.length()-1));
		
		System.out.println("----------------------------------");
		//findout odd index value
		String str1="java strings";
		//System.out.println(str1.charAt(0));
		for(int i=0;i<str1.length()-1;i++) {
			if(i%2<=0) {
				System.out.println("the char at :"+i+ "place"+str1.charAt(i));
			}
			
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		
		//frequency of string
		String str2="string notes";
		
		int count=0;
		for(int i=1;i<=str2.length()-1;i++) {
			if(str2.charAt(i)=='n') {
			count++;
			System.out.println(i);
		}
		}
		
		
		
	

	}

}
