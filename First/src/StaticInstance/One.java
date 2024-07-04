package StaticInstance;

public class One {

		int x = 10; 
		public static void main(String[] args) 
		    { 
		        One t1 = new One(); 
		        One t2 = new One(); 
		        t1.x = 20; 
		        System.out.println(t1.x + " ."); 
		        System.out.println(t2.x);

	}

}
