package Fourth;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		System.out.println("Enter the value: ");
		Scanner a=new Scanner(System.in);
		int b=a.nextInt();
		if(b%4==0 && b%100==0) {
			System.out.println(b+" divisible by both 4 and 100.");
		}
		else {
			System.out.println(b+" not divisible by both 4 and 100.");
		}

	}

}
