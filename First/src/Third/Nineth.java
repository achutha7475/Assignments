package Third;

public class Nineth {

	public static void main(String[] args) {
		char a=' ';
		if (a>=' ' && a<='/' || a>=':' && a<='?')
			System.out.println("Its a special character");
		else if(a>='0' && a<='9')
			System.out.println("Its a digit");
		else 
			System.out.println("Its an alphabet");

	}

}
