package Fourth;

import java.util.Scanner;

public class Fourteenth {

	public static void main(String[] args) {
		System.out.println("Enter the three integers : ");
		Scanner a=new Scanner(System.in);
		int b=a.nextInt();
		Scanner c=new Scanner(System.in);
		int d=c.nextInt();
		Scanner e=new Scanner(System.in);
		int f=e.nextInt();
		System.out.println("Expected Output:");
		if(b>d && b>f) {
			System.out.println("The greatest: "+b);
		}
		if(d>f && d>b) {
			System.out.println("The greatest: "+d);
		}
		if(f>d && b<f) {
			System.out.println("The greatest: "+f);
		}
	}

}
