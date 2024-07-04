package Fourth;

import java.util.Scanner;

public class Fiftyseven {

	public static void main(String[] args) {
		int f,g;
		System.out.println("Enter 5 integers : ");
		Scanner p=new Scanner(System.in);
		int a=p.nextInt();
		Scanner q=new Scanner(System.in);
		int b=q.nextInt();
		Scanner r=new Scanner(System.in);
		int c=r.nextInt();
		Scanner s=new Scanner(System.in);
		int d=s.nextInt();
		Scanner t=new Scanner(System.in);
		int e=t.nextInt();
		f=a+b+c+d+e;
		g=(a+b+c+d+e)/5;
		System.out.println("Sum of given numbers is "+f);
		System.out.println("Average for given numbers is "+g);

	}

}
