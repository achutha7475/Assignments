package Fourth;

import java.util.Scanner;

public class Twentythird {

	public static void main(String[] args) {
		int c;
		System.out.println("Enter a number of which you want a table to be written : ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for (int i=1;i<=10;i++) {
			c=i*a;
			System.out.println(a+" X "+i+" = "+c);
		}

	}

}
