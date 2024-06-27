package Fourth;

import java.util.Scanner;

public class Nineteenth {

	public static void main(String[] args) {
		int d=0;
		System.out.println("Enter the year: ");
		Scanner a=new Scanner(System.in);
		int b=a.nextInt();
		System.out.println("Enter the month: ");
		Scanner c=new Scanner(System.in);
		String m=c.nextLine();
		if(b%8==0) {
			d=d+1;
		}
		else {
			d=d+0;
		}
		switch(m) {
		case "January":
			System.out.println("31");
			break;
		case "February":
			switch(d) {
			case 1:
				System.out.println("29");
				break;
			case 0:
				System.out.println("28");
				break;
			}
		case "March":
			System.out.println("31");
			break;
		case "April":
			System.out.println("31");
			break;
		case "May":
			System.out.println("31");
			break;
		case "June":
			System.out.println("30");
			break;
		case "July":
			System.out.println("31");
			break;
		case "August":
			System.out.println("31");
			break;
		case "September":
			System.out.println("30");
			break;
		case "October":
			System.out.println("31");
			break;
		case "November":
			System.out.println("30");
			break;
		case "December":
			System.out.println("31");
			break;
		}

	}

}
