package hello;

public class 구구단 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		가로	
		
		for (int n = 1; n <= 9; n++) {
			for (int i = 2; i <= 9; i++) {
				System.out.printf("%d x %d = %d\t", i, n, n*i);
			}
				System.out.println();
		}
		
//		세로
		System.out.println();
		
		for (int n = 2; n <= 9; n++) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d\n", n, i, n*i);
			}
				System.out.println();
		}
		
	}

}
