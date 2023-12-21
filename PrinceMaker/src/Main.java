import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String filename="/Users/lacon85/Desktop/prince maker.mp3";
		Bgm bg = new Bgm(filename);
		bg.start();								// BGM 쓰레드 시작 
		
		Logo lg = new Logo();
		lg.logo();								// 게임제목과 로고,오프닝 
		
		Runnable r = new Opening();
		Thread op = new Thread(r);
		op.run();
		
//		try {
//			op.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}										// 오프닝 생성 및 쓰레드 실행 (join으로 끝날 때까지 기다리기) 
		
		Season ss = new Season();
		Sonface sf = new Sonface();	
		EndingFace edf = new EndingFace();
												// 계절 & 얼굴 변화 쓰레드 
		
		Character son = new Character();
		son.character();						// 캐릭터 스탯 초기화, 이름 확정
		
		Decade dc = new Decade();
		dc.choice(son,ss,sf);					// 10년간 해야할 행동 선택 
		
		Ending ed = new Ending();
		ed.run(son);							// 엔딩1 쓰레드 실행
		
		Ending2 ed2 = new Ending2();
		ed2.ending2(son,edf);						// 엔딩2 메소드 실행 
		
		
		
		
	}

}
