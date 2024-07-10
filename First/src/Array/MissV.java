package Array;

public class MissV {
	public static boolean checkelement(int k) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				return true;
			}
			return false;
		}
	}
	public static void main(String[] args) {
		int arr[]= {9,1,3,4,6,7,8};
		for (int k=1;k<=10;k++) {
			boolean present=checkelement(k);
			if(present==false) {
				System.out.print(k);
			}
		}
	}

}
