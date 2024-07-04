package Fourth;

import java.util.Scanner;

public class Fiftysix {

	public static void main(String[] args) {
		int f;
		System.out.println("Enter an integer : ");
		Scanner z=new Scanner(System.in);
		int a=z.nextInt();
		for(int i=1;i<=a;i++) {
			f=i*i;
			System.out.println("Square of given number "+i+" is "+f);
		}
	}

}
