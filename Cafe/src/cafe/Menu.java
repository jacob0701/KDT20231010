package cafe;

public class Menu {
	
//	public Menu() {}    // 기본 생성자 생략 가능 
//	자주 사용되는 문구 Menu 클래스로 정리 
 
	public void main_menu() {
		System.out.printf("=======================%n");
		System.out.printf("<카페 메뉴 프로그램>%n" + "1.주문하기%n" +"2.메뉴 추가/삭제/수정%n" + "3.종료%n");
		System.out.printf("=======================%n");
	}
	public void coffee_menu() {
		System.out.printf("=======================%n");
		for (int i=0; i <= Calculator.bever.length-1; i++) {
			int price = Integer.parseInt(Calculator.bever[i][1]);
			String pr = String.format("%,d", price);
			System.out.printf("%d."+ Calculator.bever[i][0]+ "\t" + pr + "원\n", i+1);
		}
		System.out.printf("=======================%n");
	}
	public void add_order() {
		System.out.printf("추가 주문하시겠습니까?%n");
		System.out.printf("1. 추가 주문%n2. 메인 메뉴로 돌아가기%n");
		System.out.print("원하는 메뉴를 선택하세요: ");
	}
	public void add_menu() {
		System.out.printf("1. 메뉴 추가%n" + "2. 메뉴 삭제%n" + "3. 메뉴 수정%n" + "4. 메인 메뉴로 돌아가기%n" );
		System.out.print("원하는 메뉴를 선택하세요: ");
	}
}
