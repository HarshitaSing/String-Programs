package StringPrograms;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class AllPossibleSubString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String S;
		S = sc.next();
		int k = 3;
		int i;
		//String[] arr= {} ;
		SortedSet<String> s = new TreeSet<String>();
		for(i =0;i<=S.length()-k;i++)
		{
			s.add(S.substring(i, i+k));
		}
		System.out.println(s.first());
		System.out.println(s.last());
		//System.out.println(arr);
		
		
		

	}

}
