package Fourth;

import java.util.Scanner;

public class Fiftyfive {

	public static void main(String[] args) {
		int f,g;
		System.out.println("Enter 5 integers : ");
		Scanner z=new Scanner(System.in);
		int a=z.nextInt();
		Scanner y=new Scanner(System.in);
		int b=y.nextInt();
		Scanner x=new Scanner(System.in);
		int c=x.nextInt();
		Scanner w=new Scanner(System.in);
		int d=w.nextInt();
		Scanner v=new Scanner(System.in);
		int e=v.nextInt();
		f=a+b+c+d+e;
		g=(a+b+c+d+e)/5;
		System.out.println("Sum of given numbers is "+f);
		System.out.println("Average for given numbers is "+g);
	}

}
