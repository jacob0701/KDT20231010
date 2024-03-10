package Phone7;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddrApp {

	public static void main(String[] args) throws SQLException {
		DBUtil db = new DBUtil();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("--------------------------------");
			System.out.println("1. 주소록 추가");
			System.out.println("2. 주소록 삭제");
			System.out.println("3. 주소록 수정");
			System.out.println("4. 전체 주소록 보기");
			System.out.println("5. csv 파일 만들기");
			System.out.println("6. 종료");
			System.out.println("--------------------------------");
			System.out.print("원하는 메뉴를 선택하세요: ");
			System.out.println();
			int cmd = sc.nextInt();
			sc.nextLine();
			
			if (cmd == 1) {
				System.out.println("이름을 입력하세요.");
				String name = sc.nextLine();
				
				System.out.println("주소를 입력하세요.");
				String address = sc.nextLine();
				
				System.out.println("전화번호를 입력하세요.");
				String phone = sc.next();
				
				db.insertAddress(name, address, phone);
				System.out.println("주소록이 추가되었습니다.");
				System.out.println("----------------------------");
				System.out.println("등록된 내용을 확인하겠습니까? (Y/N)");
				String check = sc.next();
				db.review(check);
				
			} else if (cmd == 2){
				db.search();
				cmd = sc.nextInt();
				ArrayList<Addr> tmp = db.search(cmd);
				for (Addr a : tmp) {
					System.out.println(a);
				}

				System.out.println("삭제하려는 주소록의 ID번호를 입력하세요.");
				int id  = sc.nextInt();

				db.deleteAddress(id);
				System.out.println("주소록이 삭제되었습니다.");
				System.out.println("----------------------------");
				System.out.println("등록된 내용을 확인하겠습니까? (Y/N)");
				String check = sc.next();
				db.review(check);
				
			} else if (cmd == 3) {
				
				db.search();
				cmd = sc.nextInt();
				ArrayList<Addr> tmp = null;
				try {
					tmp = db.search(cmd);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for (Addr a : tmp) {
					System.out.println(a);
				}
				
				System.out.println("수정하려는 주소록의 ID번호를 입력하세요.");
				int id  = sc.nextInt();
				sc.nextLine();
				System.out.println("이름을 입력하세요.");
				String name = sc.nextLine();
				System.out.println("주소를 입력하세요.");
				String address = sc.nextLine();
				System.out.println("전화번호를 입력하세요.");
				String phone = sc.next();
				
				db.updataAddress(id, name, address, phone);
				System.out.println("주소록이 수정되었습니다.");
				System.out.println("----------------------------");
				System.out.println("등록된 내용을 확인하겠습니까? (Y/N)");
				String check = sc.next();
				db.review(check);
				
			} else if (cmd == 4) {
				
				db.review("y");
				
			} else if (cmd == 5) {
				
				System.out.println("----------------------------");
				System.out.println("1. 전체 주소록 파일 생성");
				System.out.println("2. 검색한 주소록 파일 생성");
				System.out.println("----------------------------");
				cmd = sc.nextInt();
				if (cmd == 1) {
					db.exportData();
				} else if(cmd == 2) {
					db.exportData();
				} else {
					System.out.println("1,2 둘 중에 하나를 선택해 주세요.");
					continue;
				}

			} 
			
			else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}
