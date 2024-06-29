package Fourth;

public class Twentyeighth {

	public static void main(String[] args) {
	/*	int i,c,l;
		for(i=1;i<=20;i++) {
			if(i>=8) {
				if (i%2==0 | i%3==0 | i%5==0 | i%7==0) {
				continue;
				}
				else {
				System.out.println(i);
				}
			}
			if (i>3 && i<8) {
				if (i%2==0) {
					continue;
				}
				else {
					System.out.println(i);
				}
			}
			if(i<3 && i>=2) {
				c=i-1;
				if(c!=1 && i%c==0) {
					continue;
				}
				else {
					System.out.println(i);
				}
			}
			if(i==1) {
				l=i-1;
				if(l!=0 && i%l==0) {
					continue;
				}
				else {
					System.out.println(i);
			}
			}
	}

	}

}*/
		int n=21;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==2 && i==3) {
					System.out.println("Exception");
				}
				else {
					System.out.println("i = "+i+"  j = "+j);
				}

			}
		}
	}}
