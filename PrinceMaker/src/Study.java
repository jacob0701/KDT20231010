import java.rmi.Naming;
import java.util.Scanner;

public class Study {

	void study(Character son,Stat stt,Sonface sf) {

		System.out.println("선택에 앞서 각 과목별 특성을 설명합니다.");
		System.out.println("                                                                                     ");
		System.out.println("<수학>은 지능(intelligence)이 향상됩니다.");
		System.out.println("<예술>은 감수성(sensibility)이 향상됩니다.");
		System.out.println("<법학>은 도덕성(morality)이 향상됩니다.");
		System.out.println("<신학>은 신앙심(faith)이 향상됩니다.");
		System.out.println("                                                                                     ");
		System.out.println("어떤 과목을 교육 시키겠습니까?");
		System.out.println("1. 수학 2. 예술 3. 법학 4. 신학");

		Scanner sc = new Scanner(System.in);
		int subject = sc.nextInt();

		if (subject == 1) {

			System.out.println("당신은 <수학>을 선택하였습니다.");
			System.out.println("1년간 <수학>에 정진합니다.");
			System.out.println("                                                                                 ");
			System.out.println("  _           _                                 _                 _        		 ");
			System.out.println(" (_) _     _ (_)                               (_)               (_)      		 ");
			System.out.println(" (_)(_)   (_)(_)         _  _  _             _ (_) _  _          (_) _  _  _      ");
			System.out.println(" (_) (_)_(_) (_)        (_)(_)(_) _         (_)(_)(_)(_)         (_)(_)(_)(_)_    ");
			System.out.println(" (_)   (_)   (_)         _  _  _ (_)           (_)               (_)        (_)   ");
			System.out.println(" (_)         (_)       _(_)(_)(_)(_)           (_)     _         (_)        (_)   ");
			System.out.println(" (_)         (_)      (_)_  _  _ (_)_          (_)_  _(_)        (_)        (_)   ");
			System.out.println(" (_)         (_)        (_)(_)(_)  (_)           (_)(_)          (_)        (_)   ");
			System.out.println("                                                                                  ");

			son.age = son.age + 1;
			son.intelligence = son.intelligence + 10;
			son.stress = son.stress + 10;
			son.height = son.height + 3;
			son.weight = son.weight + 3;
			son.money = son.money - 100;

			System.out.println(son.name + "의 지능이 10 증가 하였습니다.");
			System.out.println(son.name + "의 지능은 " + son.intelligence + "이 되었습니다.");
			System.out.println(son.name + "의 스트레스가 10 증가 하였습니다.");
			System.out.println(son.name + "의 스트레스는 " + son.stress + "이 되었습니다.");
			System.out.println(son.name + "의 키가 3cm 증가 하였습니다.");
			System.out.println(son.name + "의 키가 " + son.height + "cm가 되었습니다.");
			System.out.println(son.name + "의 몸무게가 3kg 증가 하였습니다.");
			System.out.println(son.name + "의 몸무게는 " + son.weight + "kg이 되었습니다.");
			System.out.println(son.name + "의 소지금이 100 달란트 감소 하였습니다.");
			System.out.println(son.name + "의 소지금은 " + son.money + " 달란트가 되었습니다.");

		} else if (subject == 2) {

			System.out.println("당신은 <예술>을 선택하였습니다.");
			System.out.println("1년간 <예술>에 정진합니다.");
			System.out.println("        _                                       _            ");
			System.out.println("      _(_)_                                    (_)           ");
			System.out.println("    _(_) (_)_          _       _  _          _ (_) _  _      ");
			System.out.println("  _(_)     (_)_       (_)_  _ (_)(_)        (_)(_)(_)(_)     ");
			System.out.println(" (_) _  _  _ (_)        (_)(_)                 (_)           ");
			System.out.println(" (_)(_)(_)(_)(_)        (_)                    (_)     _     ");
			System.out.println(" (_)         (_)        (_)                    (_)_  _(_)    ");
			System.out.println(" (_)         (_)        (_)                      (_)(_)      ");
			System.out.println("               									                               ");

			son.age = son.age + 1;
			son.sensibility = son.sensibility + 10;
			son.stress = son.stress + 10;
			son.height = son.height + 3;
			son.weight = son.weight + 3;
			son.money = son.money - 100;

			System.out.println(son.name + "의 감수성이 10 증가 하였습니다.");
			System.out.println(son.name + "의 감수성이 " + son.sensibility + "이 되었습니다.");
			System.out.println(son.name + "의 스트레스가 10 증가 하였습니다.");
			System.out.println(son.name + "의 스트레스는 " + son.stress + "이 되었습니다.");
			System.out.println(son.name + "의 키가 3cm 증가 하였습니다.");
			System.out.println(son.name + "의 키가 " + son.height + "cm가 되었습니다.");
			System.out.println(son.name + "의 몸무게가 3kg 증가 하였습니다.");
			System.out.println(son.name + "의 몸무게는 " + son.weight + "kg이 되었습니다.");
			System.out.println(son.name + "의 소지금이 100 달란트 감소 하였습니다.");
			System.out.println(son.name + "의 소지금은 " + son.money + " 달란트가 되었습니다.");
			
		} else if (subject == 3) {

			System.out.println("당신은 <법학>을 선택하였습니다.");
			System.out.println("1년간 <법학>에 정진합니다.");
			System.out.println(" _                                                          ");
			System.out.println("(_)                                                         ");
			System.out.println("(_)                     _  _  _           _             _   ");
			System.out.println("(_)                    (_)(_)(_) _       (_)           (_)  ");
			System.out.println("(_)                     _  _  _ (_)      (_)     _     (_)  ");
			System.out.println("(_)                   _(_)(_)(_)(_)      (_)_  _(_)_  _(_)  ");
			System.out.println("(_) _  _  _  _       (_)_  _  _ (_)_       (_)(_) (_)(_)    ");
			System.out.println("(_)(_)(_)(_)(_)        (_)(_)(_)  (_)        (_)   (_)      ");
			System.out.println("                                                            ");

			son.age = son.age + 1;
			son.morality = son.morality + 10;
			son.stress = son.stress + 10;
			son.height = son.height + 3;
			son.weight = son.weight + 3;
			son.money = son.money - 100;

			System.out.println(son.name + "의 도덕성이 10 증가 하였습니다.");
			System.out.println(son.name + "의 도덕성이 " + son.sensibility + "이 되었습니다.");
			System.out.println(son.name + "의 스트레스가 10 증가 하였습니다.");
			System.out.println(son.name + "의 스트레스가 " + son.stress + "이 되었습니다.");
			System.out.println(son.name + "의 키가 3cm 증가 하였습니다.");
			System.out.println(son.name + "의 키가 " + son.height + "cm가 되었습니다.");
			System.out.println(son.name + "의 몸무게가 3kg 증가 하였습니다.");
			System.out.println(son.name + "의 몸무게는 " + son.weight + "kg이 되었습니다.");
			System.out.println(son.name + "의 소지금이 100 달란트 감소 하였습니다.");
			System.out.println(son.name + "의 소지금은 " + son.money + " 달란트가 되었습니다.");
			
		} else if (subject == 4) {

			System.out.println("당신은 <신학>을 선택하였습니다.");
			System.out.println("1년간 <신학>에 정진합니다.");
			System.out.println("               									                                 ");
			System.out.println("    _  _  _             _  _  _  _          _  _  _  _              ");
			System.out.println(" _ (_)(_)(_) _        _(_)(_)(_)(_)_       (_)(_)(_)(_)             ");
			System.out.println("(_)         (_)      (_)          (_)      (_)       (_)_           ");
			System.out.println("(_)    _  _  _       (_)          (_)      (_)         (_)          ");
			System.out.println("(_)   (_)(_)(_)      (_)          (_)      (_)         (_)          ");
			System.out.println("(_)         (_)      (_)          (_)      (_)        _(_)           ");
			System.out.println("(_) _  _  _ (_)      (_)_  _  _  _(_)      (_) _  _  (_)             ");
			System.out.println("(_)(_)(_)(_)           (_)(_)(_)(_)        (_)(_)(_)(_)              ");
			System.out.println("               									                               ");

			son.age = son.age + 1;
			son.faith = son.faith + 10;
			son.stress = son.stress + 10;
			son.height = son.height + 3;
			son.weight = son.weight + 3;
			son.money = son.money - 100;

			System.out.println(son.name + "의 신앙심이 10 증가 하였습니다.");
			System.out.println(son.name + "의 신앙심이 " + son.faith + "이 되었습니다.");
			System.out.println(son.name + "의 스트레스가 10 증가 하였습니다.");
			System.out.println(son.name + "의 스트레스가 " + son.stress + "이 되었습니다.");
			System.out.println(son.name + "의 키가 3cm 증가 하였습니다.");
			System.out.println(son.name + "의 키가 " + son.height + "cm가 되었습니다.");
			System.out.println(son.name + "의 몸무게가 3kg 증가 하였습니다.");
			System.out.println(son.name + "의 몸무게는 " + son.weight + "kg이 되었습니다.");
			System.out.println(son.name + "의 소지금이 100 달란트 감소 하였습니다.");
			System.out.println(son.name + "의 소지금은 " + son.money + " 달란트가 되었습니다.");
		}

		System.out.println("                                                                                     ");
		System.out.println(son.name + "은 " + son.age + "세가 되었습니다.");
		System.out.println("                                                                                     ");
		System.out.println("1년 동안 양육한 결과를 확인 하시렵니까?");
		System.out.println("1. 예 2. 아니오");

		int checkstat = sc.nextInt();

		if (checkstat == 1) {

			stt.viewStat(son,sf);
			
		} else if (checkstat == 2) {

			System.out.println("다음 해로 넘어갑니다.");

		}

	}

}
