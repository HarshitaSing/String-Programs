package StringPrograms;

import java.util.Scanner;

public class AllPossibleSubString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String S;
		S = sc.next();
		int k = 3;
		int i;
		String[] arr= {} ;
		//SortedSet<String> s = new TreeSet<String>();
		for(i =0;i<=S.length()-k;i++)
		{
			 arr[i]=(S.substring(i, i+k));
		}
		//System.out.println(s.first());
		//System.out.println(s.last());
		//System.out.println(arr);
		for(i =0;i<S.length()-k;i++)
		{
			System.out.println(arr[i]);
		}
		
		

	}

}
