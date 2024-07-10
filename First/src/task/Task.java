package task;

public class Task {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		char b[][][]= {{{'a','b','c'},{'d','e','f'},{'g','h','i'}},{{'#','$','%'},{'%','&','*'},{'!','@','('}}};
		for (int i=0;i<1;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
		}
		System.out.println();
		for(int i=0;i<1;i++) {
			for(int j=0;j<b[i].length;j++) {
				for(int k=1;k<b[i][j].length-1;k++) {
				System.out.print(b[i][j][k]+" ");
			}
		}
			System.out.println();
			for(int u=1;u<2;u++) {
				for(int j=2;j<b[u].length;j++) {
					for(int k=0;k<b[u][j].length;k++) {
					System.out.print(b[u][j][k]+" ");
				}
			}
	}

}}}
