package Array;

public class eight {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		/*int c[]= {2,3,4,5,6,7,8,9,10};
		int b[]=new int[a.length];
		for (int i=0;i<a.length;i++) {
				b[i]=a[i]+c[i];
			}*/
		System.out.println("Actual values of array a: ");
		//System.out.println();
		for(int g:a) {
			System.out.print(g+" ");
		}
		System.out.println();
		System.out.println("Actual values of array after addition : ");
		//System.out.println();
		for(int i=0;i<a.length;i++) {
			a[i]+=a[i];}
		for(int g:a) {
			System.out.print(g+" ");
		}
		System.out.println();
		System.out.println("Actual values of array after subtraction : ");
		//System.out.println();
		for(int i=0;i<a.length;i++) {
			a[i]-=1;}
		for(int g:a) {
			System.out.print(g+" ");
		}
		System.out.println();
		System.out.println("Actual values of array after multiplication : ");
		//System.out.println();
		for(int i=0;i<a.length;i++) {
			a[i]*=2;
		}
		for(int g:a) {
			System.out.print(g+" ");
		}
		System.out.println();
		System.out.println("Actual values of array after division : ");
		//System.out.println();
		for(int i=0;i<a.length;i++) {
			a[i]/=2;
		}
		for(int g:a) {
			System.out.print(g+" ");
		}

	}}


