package Array;

import java.util.Scanner;

public class four {

	public static void main(String[] args) {
		System.out.println("Enter the size of your array: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b[]=new int[a];
		for(int i=0;i<a;i++) {
			System.out.println("enter the value: ");
			b[i]=s.nextInt();}
		for(int h:b) {
			System.out.println(h);
		}
		int c[]=new int[a];
		int p=0;
		for (int i=b.length-1;i>-1;i--) {
			c[p]=b[i];
			p++;
		}
		for(int h:c) {
			System.out.println(h);
		}
	}

}
