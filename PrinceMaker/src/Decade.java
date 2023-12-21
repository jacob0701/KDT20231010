import java.util.Scanner;

public class Decade {

	void choice(Character son,Season ss,Sonface sf) {

		Scanner sc = new Scanner(System.in);

		Study st = new Study();
		Work wk = new Work();
		Rest re = new Rest();
		Adventure ad = new Adventure();
		Stat stt = new Stat();

		int year;

		for (int n = 1; n <= 10; n++) {
			System.out.println(n + " 년째의 행동은 무엇으로 결정하시겠습니까?");

			System.out.println("1. 학습 2. 모험 3. 일  4. 휴식");
			year = sc.nextInt();

			if (year == 1) {
				System.out.println("                                                                                     ");
				System.out.println("'학습'을 선택하였습니다.");
				System.out.println("                                                                                     ");
				st.study(son,stt,sf);
			} else if (year == 2) {
				System.out.println("                                                                                     ");
				System.out.println("'모험'을 선택하였습니다.");
				System.out.println("                                                                                     ");
				ad.adventure(son,stt,sf);
			} else if (year == 3) {
				System.out.println("                                                                                     ");
				System.out.println("'일'을 선택하였습니다.");
				System.out.println("                                                                                     ");
				wk.work(son,ss,wk,stt,sf);
			} else if (year == 4) {
				System.out.println("                                                                                     ");
				System.out.println("'휴식'을 선택하였습니다.");
				System.out.println("                                                                                     ");
				re.rest(son,stt,sf);
			} else {
				System.out.println("                                                                                     ");
				System.out.println("잘못 누르셨습니다. 다시 선택해 주세요.");
			}

		}
	}

}
