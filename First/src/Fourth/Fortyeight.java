package Fourth;

import java.util.Scanner;

public class Fortyeight {

	public static void main(String[] args) {
		System.out.println("Enter an integer: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int sum=0;
		for (int i=1;i<=a;i++) {
			if(i%2!=0) {
				sum+=i;
			}
			
		}
		System.out.println(sum);

	}

}
