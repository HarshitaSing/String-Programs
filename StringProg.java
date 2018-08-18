package StringPrograms;
import java.util.Scanner;

public class StringProg {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a,b ;
		//System.out.println("Enter a");
		a = sc.next();
		//System.out.println("Enter b");
		b = sc.next();
		int alen = a.length();
		//System.out.println("a's value :" + alen);
		int blen = b.length();
		//System.out.println("b's value :" + blen);
		int c = alen+blen;
		System.out.println(c);
		//System.out.println(a + " " + b);
		
		if(a.compareTo(b)<0)
		{
			System.out.println("no");
		}
		else if(a.compareTo(b)==0)
		{
			System.out.println("No");
		}
		else
		{
			System.out.println("yes");
		}
		//System.out.println(a + " " +b);

		String var = a.substring(0, 1).toUpperCase();
		a = var + a.substring(1);
		String var1 = b.substring(0, 1).toUpperCase();
		b = var1 + b.substring(1);
		System.out.println(a + " " + b);
	}

}
