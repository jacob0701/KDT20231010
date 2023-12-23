package Practice;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
										   // N을 반지름 r이라 가정 
		
		
		for (int i = -N; i <= N; i++) {
										   // 전체 세로 범위를 지름 2N = 2r 로 잡아준다. 
			
										   // i = y값 , j = x값
		
			
			for (int j = -N; j <= N; j++) {
										   // 전체 가로 범위를 지름 2N = 2r 로 잡아준다. 
				
				
				
				if (i*i + j*j <= N * N) {
										    
										   // x^2 + y^2 = r^2 구의 방정식 
					
					System.out.print("* ");
					    				   // 원의 안쪽 및 경계선은 별표시 
				
				} else {
					
					System.out.print("  ");
										   // 원의 바깥쪽은 빈칸으로 표시 
				}

			} 
			
			System.out.println();
				
		}		
	
	}

}
