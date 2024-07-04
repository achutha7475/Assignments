package Fourth;

import java.util.Scanner;

public class Fortynine {

	public static void main(String[] args) {
		System.out.println("Enter an integer: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int t,b=a+1;
		t=1;
		while(t!=b) {
			System.out.println(t);
			t++;
		}

	}

}
