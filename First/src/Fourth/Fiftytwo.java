package Fourth;

import java.util.Scanner;

public class Fiftytwo {

	public static void main(String[] args) {
		System.out.println("Enter an integer from which you need even numbers: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("Enter an integer to which you need even numbers: ");
		Scanner d=new Scanner(System.in);
		int b=d.nextInt();
		int sum=0,r=0;
		for (int i=a;i<=b;i++) {
			if(i%2==0) {
				sum+=i;
			}
			else {
				r+=i;
			}}
			System.out.println("Sum of all even numbers "+sum+" .");
			System.out.println("Sum of all odd numbers "+r+" .");
			

	}

}
