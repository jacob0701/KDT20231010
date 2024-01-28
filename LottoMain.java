package ArrayList;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class LottoMain {

	public static void main(String[] args) {
	
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		int[] luck = new int[6];
		
		for (int i = 1; i <= 45; i++) {
			lotto.add(i);
		}
		
		Collections.shuffle(lotto);						// 섞기
		
		for (int i = 0; i < luck.length; i++) {         // 뽑기 후 중복 삭제 
			luck[i] = lotto.get(i);
			lotto.remove(lotto.get(i));
		}
		
		for (int i = 0; i < luck.length; i++) {         // 배열 정렬
			for (int j = 0; j < luck.length; j++) {
				int tmp;
				if (luck[i] < luck[j]) {
					tmp = luck[i];
					luck[i] = luck[j];
					luck[j] = tmp;
				}
			}
		}
		System.out.print("로또 당첨 숫자: ");				// 프린트 
		for (int i = 0; i < luck.length; i++) {
			System.out.printf("%d ", luck[i]);
		}
		
	}

}
