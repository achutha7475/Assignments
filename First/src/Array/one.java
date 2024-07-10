package Array;
import java.util.Scanner;
public class one {

	public static void main(String[] args) {
		System.out.println("Enter the size of an array you want to create: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b[]=new int[a];
		int sum=0;
		for(int i=0;i<b.length;i++) {
			System.out.println("Enter the value:");
			b[i]=s.nextInt();
			sum+=b[i];
		}
		System.out.println("Sum of all the values in an array is : "+sum);
	}

}
