package Fourth;

import java.util.Scanner;

public class Tenth {

	public static void main(String[] args) {
		System.out.println("Enter the two integers : ");
		Scanner a=new Scanner(System.in);
		int SellPr=a.nextInt();
		Scanner c=new Scanner(System.in);
		int CostPr=c.nextInt();
		if(SellPr>CostPr) {
			System.out.println("Profit");
		}
		else if(CostPr>SellPr) {
			System.out.println("Loss");
		}
		else {
			System.out.println("Neigther profir nor loss.");
		}

	}

}
