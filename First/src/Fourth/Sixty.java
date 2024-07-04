package Fourth;

import java.util.Scanner;

public class Sixty {

	public static void main(String[] args) {
		System.out.println("Enter an integer : ");
		Scanner a=new Scanner(System.in);
		int m=a.nextInt();
		int e,f=7;
		e=m%10;
		if(e==f || m%7==0) {
			System.out.println(m+" is a buzz number.");
		}
		else {
			System.out.println(m+" is not a buzz number.");
		}

	}

}
