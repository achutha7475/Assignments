package Array;
import java.util.Scanner;

public class H_L {

	public static void main(String[] args) {
		int arr[]= {9,1,3,4,6,7,8},temp,g,y;
		for(int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1 or 0 (where 1 indicates highest and 0 indicates lowest):");
		int a=s.nextInt();
		System.out.println(a);
		if(a==1) {
			System.out.println("Enter the highest number which you want:");
			Scanner d=new Scanner(System.in);
			int b=d.nextInt();
			g=arr.length-1;
			y=b-1;
			g=g-y;
			System.out.println(arr[g]);
			}
		
	else if(a==0) {
		System.out.println("Enter the lowest number which you want:");
		Scanner d=new Scanner(System.in);
		int b=d.nextInt();
		g=0;
		y=b-1;
		g=g+y;
		System.out.println(arr[g]);
	}}

	}
