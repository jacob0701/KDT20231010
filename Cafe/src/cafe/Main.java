package cafe;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Menu mn = new Menu();          // 메뉴 클래스의 인스턴스 
		NewMenu nmn = new NewMenu();   // 뉴메뉴 클래스의 인스턴스 
		
		outer:
		while(true) {
			mn.main_menu();
			Scanner sc = new Scanner(System.in);
			System.out.print("원하는 메뉴를 선택하세요: ");
			int choice = sc.nextInt();
			
			inner:
			switch(choice) {
					case 1: 
						while(true) {
						mn.coffee_menu();
						sc.nextLine();
						System.out.print("주문 하시겠습니까? (ex> 아메리카노 1 카페라떼 2\n");
						String select = sc.nextLine();					// 주문을 한 문장으로 다 받기 
						String[] order = select.split("\s");			// 문장을 공백 단위로 나눠 배열에 저장 
						System.out.println("<주문 내역 확인>");
						for (int i=0; 2*i+1 <= order.length-1; i++) {	// 주문 내역 보여주기 
							System.out.print(order[2*i]+"\t"+order[2*i+1]+"잔\n");
						}
						String[] order2 = Calculator.order_fix(order);   // 계산기 클래스에서 합계 받아오기  
						int Payment = Calculator.cal_price(order2);
						String payment = String.format("%,d", Payment);     // 천단위 콤마 표시를 위한 변환 
						System.out.println("지불하실 금액은 "+ payment +"원 입니다.\n");
						mn.add_order();
						choice = sc.nextInt();
						if (choice == 1) {  
							continue;	   // 추가 주문 루프 
						}
						else 
							break inner;   // 닉네임 지정으로 탈출해서 나오는 단계를 지정 
						}
					case 2: 
						mn.add_menu();
						choice = sc.nextInt();
						if (choice == 1) {
							mn.coffee_menu();
							System.out.print("추가할 메뉴를 입력하세요.\n");
							String new_bv = sc.next();
							System.out.print("추가할 메뉴의 가격을 입력하세요.\n");
							String new_price = sc.next();
							Calculator.bever = nmn.add_menu(new_bv,new_price);    				// 뉴메뉴에 보내고 받아온 값을 bever에 갈아끼기 
							mn.coffee_menu();
						} else if (choice == 2) {
							mn.coffee_menu();
							System.out.print("삭제할 메뉴를 입력하세요.\n");
							String del_bv = sc.next();
							Calculator.bever = nmn.del_menu(del_bv); 			  				// 뉴메뉴에 보내고 받아온 값을 bever에 갈아끼기 
							mn.coffee_menu();
						}else if (choice == 3) {
							mn.coffee_menu();
							System.out.print("수정하고 싶은 메뉴를 입력하세요.\n");
							String existing_bv = sc.next();
							System.out.print("새로운 메뉴명를 입력하세요.\n");
							String edit_bv = sc.next();
							System.out.print("새로운 메뉴의 가격을 입력하세요.\n");
							String edit_price = sc.next();
							Calculator.bever = nmn.edit_menu(existing_bv,edit_bv,edit_price);   // 뉴메뉴에 보내고 받아온 값을 bever에 갈아끼기 
							mn.coffee_menu();
						}
						break;
					case 3: 
						System.out.println("프로그램을 종료합니다.");
						System.out.println("안녕히 가십시오.");
						break outer;
					default:
						System.out.println("잘못 입력하였습니다. 1~3번 중 하나를 선택해 주세요.");
						break;
						
			}
		}
	}
}
