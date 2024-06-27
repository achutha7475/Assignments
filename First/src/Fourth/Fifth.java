package Fourth;

import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) {
		System.out.println("Enter the integer : ");
		Scanner a=new Scanner(System.in);
		int b=a.nextInt();
		switch(b%2)
		{
		case 1:
			System.out.println("Odd number");
			break;
		case 0:
			System.out.println("Even number");
		}

	}

}
