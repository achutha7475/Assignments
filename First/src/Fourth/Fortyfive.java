package Fourth;

import java.util.Scanner;

public class Fortyfive {

	public static void main(String[] args) {
		int c,temp;
		System.out.println("Enter an integer: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		c=0;
		temp=a;
			while(temp>0) {
			c=c+1;
			temp/=10;
		}
		System.out.println(c);
}}
