package Array;

import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		System.out.println("Enter the size of your array: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b[]=new int[a];
		int c=0,d=0;
		for(int i=0;i<b.length;i++) {
			System.out.println("enter the value: ");
			b[i]=s.nextInt();
			if(b[i]%2==0) {
				c+=1;}
			}
		System.out.println("Count of even numbers from given array is : "+c);
		System.out.println("Count of odd numbers from given array is : "+(a-c));

	}

}
