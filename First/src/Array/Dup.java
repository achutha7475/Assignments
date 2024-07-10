package Array;

public class Dup {

	public static void main(String[] args) {
		int a[]= {1,2,6,3,4,3,5,2,2,6,6,9},temp=0;
		for(int i=0;i<a.length;i++) {
			for (int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}}
		for(int i=0;i<a.length;i++) {
			int c=1;
			for (int j=i+1;j<a.length;j++) {
				if(a[j]!=a[i]) {
					c=c+0;
					continue;
				}
				else if(a[j]==a[i]){
					c+=1;
					if(a[i]==temp) {
						break;
					}
				}}
				if(c>1 && a[i]!=temp) {
				System.out.println(a[i]+" is a duplicate value and its count is "+c);
			}
				temp=a[i];}
		}

	}


