package Fourth;

import java.util.Scanner;

public class Fiftyeight {

	public static void main(String[] args) {
		int temp,c=0,r,sum=0,n;
		System.out.println("Enter an integer : ");
		Scanner a=new Scanner(System.in);
		int m=a.nextInt();
		temp=m;
		n=m;
		while(temp>0) {
			temp=temp/10;
			c++;
		}
		while(m>0) {
			r=m%10;
			sum+=Math.pow(r, c);
			m=m/10;
		}
		if(sum==n) {
			System.out.println(n+" is an armstrong number.");
		}
		else {
			System.out.println(n+" is not an armstrong number.");
		}

	}

}
