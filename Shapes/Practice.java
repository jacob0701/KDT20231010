package Practice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print("*");
				
			}	System.out.println();
		}
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = n-1; j >= i; j--) {
			
			
			System.out.print("*");
			
			
			} System.out.println();
			
		} 

		
//		for (int i = 1; i <= N; i++) {
//			
//			for (int j = 1; j <= N; j++) {
//				
//				if (i <= j) {
//				
//				System.out.print("*");
//
//				} else {
//					
//					System.out.print(" ");
//					
//				} 
//				
//				
//			} System.out.println();
//			
//		}
//		
//		for (int i = 2; i <= N; i++) {
//			
//			for (int j = N; j >= 1; j--) {
//				
//				if (i < j) {
//					
//					System.out.print(" ");
//				
//				} else {
//					
//					System.out.print("*");
//					
//				}
//				
//			} System.out.println();
//			
//		}
		
	}

}


