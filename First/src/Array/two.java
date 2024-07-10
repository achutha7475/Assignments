package Array;
import java.util.Scanner;
public class two {

	public static void main(String[] args) {
		System.out.println("Enter the size of your array: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b[]=new int[a];
		for(int i=0;i<b.length;i++) {
			System.out.println("enter the value: ");
			b[i]=s.nextInt();}
		System.out.println("Even numbers from given array: ");
		for(int i=0;i<b.length;i++) {
			if(b[i]%2==0) {
				System.out.println(b[i]);
			}
		}

	}

}
