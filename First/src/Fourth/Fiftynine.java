package Fourth;

import java.util.Scanner;

public class Fiftynine {

	public static void main(String[] args) {
		System.out.println("Enter an integer : ");
		Scanner a=new Scanner(System.in);
		int m=a.nextInt();
		int s,e,d;
		s=m%10;
		d=m*m;
		e=d%10;
		if(e==s) {
			System.out.println(m+" is an Automorphic number.");
		}
		else {
			System.out.println(m+" is not an Automorphic number.");
		}
	}

}
