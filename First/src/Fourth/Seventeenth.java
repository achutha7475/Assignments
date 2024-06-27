package Fourth;

import java.util.Scanner;

public class Seventeenth {

	public static void main(String[] args) {
		System.out.println("Enter the value: ");
		Scanner a=new Scanner(System.in);
		int b=a.nextInt();
		switch(b%8){
			case 0:
				System.out.println("It's a leap year");
				break;
			default:
				System.out.println("It's not a leap year");
				break;
		}
	}

}
