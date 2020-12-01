package javaPrograms;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		
		int n,num=1,c,d;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows Floyds you want");
		n=sc.nextInt();
		System.out.println("floyds triangle");
		
		for(c=1;c<=n;c++) {
			
			for( d=1;d<=c;d++) {
				System.out.println(num +" "+num);
				num++;
			}
		}
		System.out.println();
		
	}

}
