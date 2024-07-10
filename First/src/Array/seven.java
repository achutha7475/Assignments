package Array;

public class seven {
	/*public static int display() {
		int a[]= {1,2,1,2,3,35,6,3,8,4,68,4,2,6},temp=0,d=0;
		for(int i=0;i<a.length;i++) {
			for (int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}}
		for(int i=0;i<a.length;i++) {
			int c=0;
			for (int j=i+1;j<a.length;j++) {
				if(a[j]!=a[i]) {
					c=c+0;
					continue;
				}
				else if(a[j]==a[i]){
					c+=1;
					d+=c;
					if(a[i]==temp) {
						break;
					}
				}}
				temp=a[i];}
		System.out.println(d+"*");
		for(int j:a) {
			System.out.print(j+" ");
		}
		return d;
	}*/

	public static void main(String[] args) {
		//display();
		int a[]= {1,2,1,2,3,35,6,3,8,4,68,4,2,6},temp=0,d=0,e=0;
		for(int i=0;i<a.length;i++) {
			for (int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}}
		for(int i=0;i<a.length;i++) {
			int c=0;
			for (int j=i+1;j<a.length;j++) {
				if(a[j]!=a[i]) {
					c=c+0;
					continue;
				}
				else if(a[j]==a[i]){
					c+=1;
					d+=c;
					if(a[i]==temp) {
						break;
					}
				}}
				temp=a[i];}
		int b[]=new int[d];
		for (int i=0;i<a.length;i++) {
			if(a[i]!=temp) {
			b[e]=a[i];
			temp=b[e];
			e++;
		}
			else {
				continue;
			}

	}
		for(int h:b) {
			System.out.print(h+" ");
		}

}}
