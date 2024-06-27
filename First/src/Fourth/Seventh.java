package Fourth;

import java.util.Scanner;

public class Seventh {

	public static void main(String[] args) {
		System.out.println("Enter an integer : ");
		Scanner a=new Scanner(System.in);
		int m=a.nextInt();
		if(m>0) {
			System.out.println("n=+1");
		}
		else if(m<0) {
			System.out.println("n=-1");
		}
		else {
			System.out.println("n=0");
		}

	}

}
