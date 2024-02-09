package hello;
import java.util.*;

public class 구구단하나 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", n, i, n*i);
		}
	}

}
