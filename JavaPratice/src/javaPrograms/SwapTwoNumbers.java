package javaPrograms;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a;
		int b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A");
		a=sc.nextInt();
		System.out.println("Enter the value of B");
		b=sc.nextInt();
		
		
		System.out.println("before swaping");
		System.out.println("a=" +a);
		System.out.println("b=" + b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		System.out.println("After swaping");
		System.out.println("a=" +a);
		System.out.println("b=" + b);
		
		
	}

}
