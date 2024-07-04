package Fourth;

import java.util.Scanner;

public class Fifty {

	public static void main(String[] args) {
		System.out.println("Enter an integer: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int f=fact(a);
		System.out.println("sum of 1 to "+a+" is "+f+" .");
	}
		public static int fact(int a) {
		if(a==0) {
			return 0;
		}
		else {
			return a+fact(a-1);
		}

	}
}

