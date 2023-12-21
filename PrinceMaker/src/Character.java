import java.beans.IntrospectionException;
import java.util.Scanner;

public class Character {

	Scanner sc = new Scanner(System.in);
										// 스캐너 생성
	public String name;

	public int stamina = 50;
	public int strength = 50;
	public int intelligence = 50;
	public int morality = 50;
	public int faith = 50;
	public int sensibility = 50;

	public int stress = 0;
	public int money = 1000;

	public int hp = 100;
	public int age = 10;
	public int height = 140;
	public int weight = 30;

	public int attack = 20;
	public int defence = 10;
	
	public int tiger,rabbit,deer,bandit,pheasant;
	
	public int thp = 150;
	public int tatk = 40;
	public int tdef = 20;
	
	public int rhp = 20;
	public int ratk = 0;
	public int rdef = 20;
	
	public int dhp = 50;
	public int datk = 10;
	public int ddef = 30;
	
	public int bhp = 120;
	public int batk = 20;
	public int bdef = 20;
	
	public int php = 30;
	public int patk = 10;
	public int pdef = 20;
										// 기본 스탯 초기화
	void character() {
		
		Sonface sf = new Sonface();
		int gamestart;

		do {
			System.out.println("     				                                                                     ");
			System.out.println("아들의 <이름>은 무엇입니까?");
			name = sc.next();

			System.out.println("     				                                                                     ");
			System.out.println("당신의 아들의 이름은 <" + name + "> 입니다.");
			System.out.println("     				                                                                     ");
			System.out.println("이대로 진행할까요?");
			System.out.println("1. 예" + " 2. 아니오");

			gamestart = sc.nextInt();

			if (gamestart == 1) {

				System.out.println("당신의 아들 <" + name + ">과 함께 <프린스 메이커>를 시작합니다.");

			}
			else if (gamestart == 2) {

				System.out.println("다시 이름을 정해주십시오.");

			}
			else {
				System.out.println("\"예/아니오\" 둘 중에 하나만 선택이 가능합니다.");
			}

		} while (gamestart != 1);
																					// 캐릭터 이름 확정 후 게임 시작!
		
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("<현재 " + name + "의 상태>");
		System.out.println("1. 나이	: " + age + "세");
		System.out.println("2. 키	: " + height + "cm");
		System.out.println("3. 몸무게	: " + weight + "kg");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("4. 체력	: " + stamina + "p(=point)");
		System.out.println("5. 근력	: " + strength + "p");
		System.out.println("6. 지력	: " + intelligence + "p");
		System.out.println("7. 도덕성	: " + morality + "p");
		System.out.println("8. 신앙심	: " + faith + "p");
		System.out.println("9. 감수성	: " + sensibility + "p");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("<소지금>	: " + money + " 달란트 🪙");
		System.out.println("<HP>	: " + hp + "");
		System.out.println("-----------------------------------------------------------------------------------------");
		sf.run1();
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("           																			     ");
		System.out.println("자! 이제 육성을 시작합니다.");
		System.out.println("                                                                                         ");
		System.out.println("시작하기 전에 <게임 규칙>을 설명합니다.");
		System.out.println("                                                                                         ");
		System.out.println("당신은 1년 단위로 총 10년간 <" + name + ">에게 아래의 4가지 중 한 가지 행동을 하도록 명령할 수 있습니다.     ");
		System.out.println("                                                                                         ");
		System.out.println("행위는 다음과 같이 4가지 입니다. 설명을 잘 읽고 알맞은 선택을 하십시오.                                     ");
		System.out.println("                                                                                         ");
		System.out.println("첫 번째, <학습>은 <" + name + ">에게 교육을 시키는 것입니다.");
		System.out.println("<학습>은 선택 과목에 따라 <" + name + ">의 여러 능력치를 향상 시키지만, '소지금'이 감소하고 '스트레스'가 증가합니다.");
		System.out.println("'스트레스'는 일정 수준 이상이 되면, <" + name + ">이 하는 모든 행동에 효율이 떨어집니다.");
		System.out.println("                                                                                         ");
		System.out.println("두 번째, <모험>은 <" + name + ">에게 마을 밖으로 나가 탐험하게 하는 것입니다.");
		System.out.println("<모험>은 마을 밖으로 나가 사냥과 전투를 하며 경험을 쌓는 것입니다.");
		System.out.println("기본 생명력인 HP는 " + hp + "이며 0이 되는 순간 게임이 종료됩니다.");
		System.out.println("<모험>은 '각종 능력치'가 증가하고 '소지금'도 증가하지만,'스트레스'도 증가합니다. 게임이 종료될 수 있으니 주의하십시오.");
		System.out.println("                                                                                         ");
		System.out.println("세 번째, <일>은 <" + name + ">에게 여러 직업을 경험하게 하는 것입니다.");
		System.out.println("<일>은 주로 '소지금'이 증가하며, 선택에 따라 '능력치'도 증가합니다. '스트레스' 또한 학습에 비해 상대적으로 크게 증가합니다.");
		System.out.println("                                                                                         ");
		System.out.println("네 번째, <휴식>은 <" + name + ">에게 아무런 행동을 하지 않고 쉬게 하는 것입니다.");
		System.out.println("<휴식>은 '스트레스'를 감소시킵니다. '소지금와 능력치'의 증감은 없습니다.");
		System.out.println("'스트레스'는 일정수준(60 이상)일 경우 <" + name + ">이 병에 걸려 죽을 수도 있습니다.");
		System.out.println("항상 '스트레스' 관리에 신경써야 합니다.");
		System.out.println("                                                                                         ");
	}

}
