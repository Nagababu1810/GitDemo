package javaPrograms;

import java.util.Scanner;

public class WhileloopUsingbreak {

	public static void main(String[] args) {
		
		
		
		int n=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value :");
		n=sc.nextInt();
		
		while(n<=100) {
			
			System.out.println(n);
			if(n==7) {
				
				continue;
			}
			n++;
			break;
			
			
		}
		
		
		
		

	}

}
