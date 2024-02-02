package Ex;
import java.util.Scanner;

import com.sun.tools.javac.Main;

public class Search {

//	public Search() {}
	
	public int search_num(int[] x) {
		for(int i =0; i<x.length; i++) 
			System.out.printf("x[%d]:"+ x[i]+"\n",i);
		System.out.print("검색할 값: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0; i<x.length;i++) 
			if (a == x[i])
				return i;
		return -1;		
	}
}
