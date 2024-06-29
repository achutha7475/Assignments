package Fourth;

import java.util.Scanner;

public class Thirtythree {

	public static void main(String[] args) {
		int sum=0;
		System.out.println("Enter the numbers: ");
		while(true) {
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			if(a>0) {
				sum=sum+a;
			}
			else {
				break;
			}
		
		}
		System.out.println(sum);
		

	}

}
