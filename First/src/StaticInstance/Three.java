package StaticInstance;

public class Three {
	static int i=1; 
	public static void main(String[] args) {
		 int i = 1; 
	        for (Three.i = 1; Three.i < 10; Three.i++) { //here only static i value increases and that don't affect instance variable i.
	            i = i + 2; //here instance variable i increments with 2. and IV(i) doesn't have  any involvement in for(three.i).
	            System.out.print(i + " ");
	            //Three.1==SV i;i==IV i;
	        }

	}

}

/*static int i=1; 
	public static void main(String[] args) {
		 int j = 1; 
	        for (Three.i = 1; Three.i < 10; Three.i++) { //here only static i value increases and that don't affect instance variable i.
	            j = j + 2; //here instance variable i increments with 2. and IV(i) doesn't have  any involvement in for(three.i).
	            System.out.print(j + " ");
	            system.out.println(i);	            
	            //Three.1==SV i;i==IV i;
	        }

	}

}

3 1
5 2
7 3
9 4
11 5
13 6
15 7
17 8
19 9
*/