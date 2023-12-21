import java.util.Scanner;

public class Rest {

	void rest(Character son,Stat stt,Sonface sf) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("<휴식>을 선택하였습니다.");
		System.out.println(son.name + "에게 1년간 휴식을 취하게 합니다.");
		System.out.println(son.name + "이(가) 하고 싶었던 것을 하게 놔둡니다. 스트레스 해소에 좋습니다.");

		son.age = son.age + 1;
		son.stress = son.stress - 20;
		son.height = son.height + 10;
		son.weight = son.weight + 10;
		son.money = son.money - 100;
		
		System.out.println("                                                               ");
		System.out.println("휴식을 통해 " + son.name + " 의 스트레스가 20 감소하였습니다.");
		System.out.println(son.name + " 의 스트레스가 " + son.stress + "가 되었습니다.");
		System.out.println("휴식을 통해 " + son.name + " 의 키가 10cm 증가하였습니다.");
		System.out.println(son.name + " 의 키가 " + son.height + "가 되었습니다.");
		System.out.println("휴식을 통해 " + son.name + " 의 몸무게가 10kg 증가하였습니다.");
		System.out.println(son.name + " 의 몸무게가 " + son.weight + "가 되었습니다.");
		System.out.println("휴식을 취하는 사이 " + son.name + "의 소지금이 100 달란트 감소하였습니다.");
		System.out.println(son.name + " 의 소지금이 " + son.money + "가 되었습니다.");

		System.out.println("                                                               ");
		System.out.println(son.name + "은 " + son.age + "세가 되었습니다.");
		System.out.println("                                                               ");
		System.out.println("1년 동안 양육한 결과를 확인 하시렵니까?");
		System.out.println("1. 예 2. 아니오");

		int checkstat = sc.nextInt();

		if (checkstat == 1) {

			stt.viewStat(son,sf);
			
		}
		if (checkstat == 2) {

			System.out.println("다음 해로 넘어갑니다.");
		}
	}
}
