package Phone7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;

public class DBUtil {

	// ============= JDBC 관련 변수 ====================
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	// 데이터베이스 연결 정보 
	String url = "jdbc:mysql://localhost:3306/phone_book?serverTimezone=UTC";
	String user = "root"; // MySQL 사용자 이름 
	String pass = "1234"; // MySQL 비밀번호

	// ===================================

	// 생성자
	public DBUtil() {
		conn = getConncetion();
	}

	public Connection getConncetion() {
		Connection conn = null;

		try {

			// 1. 드라이버 세팅
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Connection 획득
			conn = DriverManager.getConnection(url, user, pass);
			//			System.out.println("DB Connection 성공");

		} catch (Exception e) {
			System.out.println("DB작업중 문제 발생: " + e.getMessage());
		}
		return conn;
	}

	public void insertAddress(String name, String address, String phone) {
		// ========== DB작업 =========
		// 3. Statement 생성
		try {
			stmt = conn.createStatement();

			// 4. SQL 처리하고 결과 ResultSet에 받아오기
			String sql = "INSERT INTO phone (phone_NAME, phone_ADDRESS, phone_NUMBER) VALUES ('" + name + "', '" + address + "','" + phone + "')";
			// 조회결과가 없는 경우에는 ResultSet으로 받아올게 없기 때문에 
			// sql만 반영해주는 executeUpdate(sql) 사용 

			stmt.execute(sql);
			System.out.println("등록완료");

		} catch (Exception e) {
			System.out.println("DB작업중 문제 발생: " + e.getMessage());
			e.printStackTrace();
		}
		// =======================================
	}
	
	public void updataAddress(int id, String name, String address, String phone) {
		// ================================ DB 작업 ================================
		try {
			stmt = conn.createStatement();

			String sql = "UPDATE phone SET phone_NAME = '" + name + "', phone_ADDRESS = '" + address + "', phone_NUMBER = '" + phone + "' WHERE phone_ID =  " + id;

			stmt.executeUpdate(sql);
			System.out.println("주소록 수정 완료");
		} catch (Exception e) {
			System.out.println("DB 작업중 문제 발생 : " + e.getMessage());
			e.printStackTrace();
		}
		// ===================================================================
	}

	public void deleteAddress(int id) {
		// ============== DB 작업 ===============
		try {
			stmt = conn.createStatement();

			String sql = "DELETE FROM phone WHERE phone_ID = " + id;
			stmt.executeUpdate(sql);

			sql = "SET @COUNT = 0";    										//MySQL에서 변수 설정
			stmt.executeUpdate(sql);

			sql = "UPDATE phone SET phone.phone_ID = @COUNT:= @COUNT + 1";	//행 갯수 만큼 phone_ID 번호 차례대로 증가 
			stmt.executeUpdate(sql);

			sql = "ALTER TABLE phone AUTO_INCREMENT = 1";					//AUTO_INCREMENT값 행 갯수로 설정
			stmt.executeUpdate(sql);

			System.out.println("주소록 삭제 완료");
		} catch (Exception e) {
			System.out.println("DB 작업 중 문제 발생: " + e.getMessage());
			e.printStackTrace();
		}
		// ===================================================
	}

	public void search() {

		System.out.println("--------------------------------");
		System.out.println("1. 이름 검색");
		System.out.println("2. 전화번호 검색");
		System.out.println("3. 주소 검색");
		System.out.println("--------------------------------");
		System.out.println("원하는 검색 방법을 선택하세요.");
	}

	public void rebrowsing() {
		System.out.println("--------------------------------");
		System.out.println("결과내 재검색이 가능합니다.");
		System.out.println("재검색하시겠습니까? (Y/N)");
		System.out.println("--------------------------------");
	}
	
	
	public ArrayList<Addr> search(int select) throws SQLException {
		ArrayList<Addr> addrList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String word;
		ResultSet tmp_rs = null;

		switch (select) {
		case 1: {
			System.out.println("이름으로 검색합니다."); 
			word = sc.next();
			
			try {
				conn = getConncetion();
				stmt = conn.createStatement();
				String sql = "SELECT *  FROM phone_book.phone where phone_NAME like \"%" + word + "%\";";
				tmp_rs = stmt.executeQuery(sql);
				rs = tmp_rs;
				break;
			} catch (Exception e) {
				System.out.println("list DB 작업중 문제 발생!");
				e.printStackTrace();
			}
			
			
			
		}
		case 2: {
			System.out.println("전화번호로 검색합니다."); 
			System.out.println("전화번호의 중간자리 혹은 마지막 4자리를 입력하세요.");
			word = sc.next();
			try {
				conn = getConncetion();
				stmt = conn.createStatement();
				String sql = "SELECT *  FROM phone_book.phone where phone_NUMBER like \"%" + word + "%\";";
				tmp_rs = stmt.executeQuery(sql);
				rs = tmp_rs;
				break;
			} catch (Exception e) {
				System.out.println("list DB 작업중 문제 발생!");
				e.printStackTrace();
			}		
		}
		case 3: {
			System.out.println("주소로 검색합니다."); 
			System.out.println("'시','구','동' 중에 권역 하나를 정확히 입력하세요.");
			word = sc.next();
			try {
				conn = getConncetion();
				stmt = conn.createStatement();
				String sql = "SELECT *  FROM phone_book.phone where phone_ADDRESS like \"%" + word + "%\";";
				tmp_rs = stmt.executeQuery(sql);
				rs = tmp_rs;
				break;
			} catch (Exception e) {
				System.out.println("list DB 작업중 문제 발생!");
				e.printStackTrace();
			}		
		}
		default : { break;}
		}
		try {
			while (rs.next()) {
				int id = rs.getInt("phone_ID");
				String name = rs.getString("phone_NAME");
				String address = rs.getString("phone_ADDRESS");
				String phone = rs.getString("phone_NUMBER");
				Addr a1 = new Addr(id,name,address,phone);
				addrList.add(a1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return addrList;
	}

	public ArrayList<Addr> getAddress() {
		// 담아야 하니까
		ArrayList<Addr> phone_book_list = new ArrayList<>();
		ResultSet tmp_rs = null;
		try {
			conn = getConncetion();
			stmt = conn.createStatement();
			String sql = "select * from phone;\r\n" + "";
			tmp_rs = stmt.executeQuery(sql);
			System.out.println("============ 주소록 목록 ===============");
			
			
			
			while (tmp_rs.next()) {
				int id = tmp_rs.getInt("phone_ID");
				String name = tmp_rs.getString("phone_NAME");
				String address = tmp_rs.getString("phone_ADDRESS");
				String phone = tmp_rs.getString("phone_NUMBER");
				
			
				
				

				Addr ar = new Addr(id,name,address,phone);
				phone_book_list.add(ar);
			}
		} catch (Exception e) {
			System.out.println("list DB 작업중 문제 발생!");
			e.printStackTrace();
		}
		rs = tmp_rs; 
		return phone_book_list;
	}
	
	public void review(String check) {
		check = check.toUpperCase();
		if (check.equals("Y")) {
			ArrayList<Addr> tmp = getAddress();
			for (Addr current_list : tmp) {
				System.out.println(current_list);
			}
			System.out.println();
		} 
	}
	public void exportData() throws SQLException {
		String path = "C:\\works\\Phone7\\phone_book.csv";
		File csv = new File(path);
		try {
			FileWriter fw = new FileWriter(csv, false);
			BufferedWriter bw = new BufferedWriter(fw);
			while (rs.next()) {
				int id = rs.getInt("phone_ID");
				String name = rs.getString("phone_NAME");
				String address = rs.getString("phone_ADDRESS");
				String phone = rs.getString("phone_NUMBER");
				System.out.println(id);
				System.out.println(name);
				bw.write(id + "," + name + "," + address + "," + phone);
				bw.newLine();
				bw.flush();
				bw.close();
			} 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
