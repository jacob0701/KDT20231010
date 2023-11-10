package cafe;

public class NewMenu extends Calculator {
	
	private String[][] new_bever;     								// 메뉴의 추가,삭제,수정에 쓰일 2중 배열을 생성만 함 

	public String[][] add_menu(String new_bv, String new_price) {   // 메뉴 추가 
		for (int i=bever.length; i <= bever.length ; ++i ) {
			new_bever = new String[i+1][2]; 						// 기존보다 1열이 추가된 새로운 2중배열 생성 
			System.arraycopy(bever, 0, new_bever, 0, bever.length); // 복사 후 
			new_bever[i][0] = new_bv;  								// 마지막 열에 품명과 가격 넣기 
			new_bever[i][1] = new_price; 
		}
		return new_bever;
	}
	public String[][] del_menu(String del_bv)  {      				// 메뉴 삭제 
		new_bever = new String[bever.length-1][2];					// 기존보다 1열이 줄어든 새로운 2중배열 생성 
		for (int i=0,j=0; i < bever.length ; ++i) {
			if (del_bv.equals(bever[i][0])) {						// 삭제할 품명과 같은 품명 찾은 후 그 행은 건너뛰기 
				continue;											
			} else 
				new_bever[j][0] = bever[i][0];						// 같지 않은 곳은 그대로 대체 
				new_bever[j][1] = bever[i][1];
				j++;												// 삭제할 부분을 건너뛰기 위해 j를 하나씩 증가 
		}
		return new_bever;
	}
	public String[][] edit_menu(String existing_bv,String edit_bv,String edit_price)  {   // 메뉴 수정 
		new_bever = new String[bever.length][2];										  // 기존과 같은 새로운 2중배열 생성 
		for (int i=0,j=0; i < bever.length ; i++) {
			if (existing_bv.equals(bever[i][0])) {					// 수정할 품목 찾기 
				new_bever[j][0] = edit_bv;							// 수정하려는 품목 넣기 
				new_bever[j][1] = edit_price;						// 해당 품목의 가격 입력 
				j++;												// 지나가기 위해 j를 하나씩 증가 
				continue;
			} else 
				new_bever[j][0] = bever[i][0];						// 나머지는 그대로 대체
				new_bever[j][1] = bever[i][1];
				j++;												// 지나가기 위해 j를 하나씩 증가
		}
		return new_bever;											
	}
	
	
	
	
	
}