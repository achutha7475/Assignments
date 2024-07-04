package Fourth;

import java.util.Scanner;

public class Fortyseven {

	public static void main(String[] args) {
		System.out.println("enter an integer : ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int f=fact(a);
		System.out.println("Factorial of "+a+" is "+f);
	}
		public static int fact(int a) {
		if(a==0) {
			return 1;
		}
		else {
			return a*fact(a-1);
		}

	}
}
