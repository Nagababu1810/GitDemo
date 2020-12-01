package javaPrograms;

import java.util.Scanner;

public class OddEvenNumbers {

	public static void main(String[] args) {
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the value:");
		int value=reader.nextInt();
		
		if(value%2==0) {
			System.out.println(value+ " "+ "is even");
		}
		else
		{
			System.out.println(value +" "+ "is odd");
		}
	}

}
