package Array;

public class six {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9},index=0;
		int c[]=new int[a.length+b.length];
		for (int i=0;i<a.length;i++) {
			c[index]=a[i];
			index++;
		}
		for (int i=0;i<b.length;i++) {
			c[index]=b[i];
			index++;
		}
		for(int j:c) {
			System.out.println(j);
		}
	}

}
