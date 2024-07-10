package Array;

public class five {

	public static void main(String[] args) {
		int a[]= {1,2,4,5,9,8,52,25,13};
		for (int i=0;i<a.length;i++) {
			if(a[i]>2 && a[i]%2==0 || a[i]>3 && a[i]%3==0 || a[i]>5 && a[i]%5==0) {
				continue;
			}
			else {
				System.out.println(a[i]+" is a prime number.");
			}
		}

	}

}
