package array;
import java.util.*;

public class ArrayReverse {

	public static void main(String[] args) {

		int[] random_num = new int[10];
		Scanner sc= new Scanner(System.in);
		
		for (int i=0; i<random_num.length; i++) {
			random_num[i] = sc.nextInt();
		}

		for (int i=0; i<random_num.length-1; i++) {
			boolean change = false;
			
			for (int j=0; j<random_num.length-1-i; j++) {
				if (random_num[j] > random_num[j+1]) {
					int temp = random_num[j];
					random_num[j] = random_num[j+1];
					random_num[j+1] = temp;
					change = true;
				}
			}
			if (!change) break;
		}	
		for (int k=0; k<random_num.length; k++) 
			System.out.println(random_num[k]);
		System.out.println();
	}
}
