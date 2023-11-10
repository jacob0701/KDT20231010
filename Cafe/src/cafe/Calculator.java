package cafe;

public class Calculator {

//	public Calculator() {} 
	
	// 계산기 클래스  
	
	public static String[][] bever = new String[4][2];   // 초기 메뉴 2중배열 생
	{
		bever[0][0] = "아메리카노";	bever[1][0] = "카페라떼";	bever[2][0] = "아인슈페너";	bever[3][0] = "에스프레소";
		bever[0][1] = "3500";	bever[1][1] = "4500";	bever[2][1] = "5000";	bever[3][1] = "2500";
	}
//     4행2열
//	{ {"아메리카노","3500"},
//	  {"카페라떼","4500"},
//	  {"아인슈페너","5000"},
//	  {"에스프레소","2500"}}
	
	public static String[] order_fix(String[] order) {   
		for (int i=0; 2*i+1 <= order.length-1; i++) {    // 주문품목과 수량 짝수단위로 움직이므로 길이를 2*i+1로 지정 
			for (int j=0;j<= bever.length-1;j++) {
				if (order[2*i].equals(bever[j][0])) {    // 주문과 메뉴품명을 비교 
					order[2*i] = bever[j][1];			 // 오더의 품명을 해당 가격으로 대체 
					break;
				} else {
					continue;
				}
			}
		}
		return order;
	}
	public static int cal_price(String[] order2) {
		int sum = 0;
		
		for (int i = 0; 2*i+1 <= order2.length-1; i++) {    
			int per_price = Integer.parseInt(order2[2*i]);  // 합산을 위한 형변환 
			int count = Integer.parseInt(order2[2*i+1]);	// 합산을 위한 형변환
			sum += per_price * count;						// 주문합계 
		}
		return sum;											// 합계를 메인으로 보내기
	}   
}
