package Fourth;

import java.util.Scanner;

public class Twentyfourth {

	public static void main(String[] args) {
		int sum=0;
		System.out.println("Enter the value : ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(int i=1;i<=a;i++) {
			if(i%2!=0) {
				sum=sum+i;
				System.out.println(sum);
			}
		}
		System.out.println("Sum of "+a+" odd numbers is "+sum+".");
	}

}
