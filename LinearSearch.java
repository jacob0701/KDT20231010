package search_algorithm;

import java.util.Iterator;
import java.util.Scanner;

public class LinearSearch {
	
	static int linearSearch(int[] a, int n, int key) {
//		int i = 0;
//		
//		while (true) {
//			if (i == n) 
//				return -1;
//			if (a[i] == key)
//				return i;
//			i++;
//		}
		for (int i = 0; i < n; i++) 
			if(a[i] == key)
				return i;
		return -1;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소수: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값: ");
		int key = sc.nextInt();
		
		int answer = linearSearch(x, num, key);
		
		if (answer == -1) 
			System.out.println("그 값의 요소가 없습니다.");
		else 
			System.out.println("그 값은 x[" + answer + "]에 있습니다.");
	}
}
