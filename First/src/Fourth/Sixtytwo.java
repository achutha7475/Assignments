package Fourth;

import java.util.Scanner;

public class Sixtytwo {

	public static void main(String[] args) {
		System.out.println("Enter an integer with zeroes in it: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int temp=a,d=0,c=0,e,r,t;
		while(temp>0) {
				temp=temp/10;
				c+=1;
		}
		System.out.println(c);
		r=c;
		while(a>0) {
			e=a%10;
			d+=1;
			}
		t=e;
			if(t!=0 && d==r) {
				System.out.println("This number followed the rules.");
			}
		else if(t==0 && d==r){
				System.out.println("This number does'nt followed given rules.");
			}
	}

}
