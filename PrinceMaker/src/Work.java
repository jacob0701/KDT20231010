import java.util.Scanner;

public class Work {
	
	int work;
	
	void work (Character son,Season ss,Work wk,Stat stt,Sonface sf) {
		
		System.out.println("선택에 앞서 업종별 특징을 설명합니다.");
		System.out.println("                                           ");
		System.out.println("<일>에는 4가지 업종이 있으며, 일을 함에 따라 <소지금과 체력 및 각종 스탯>이 변동합니다.");
		System.out.println("5업종은 <야학>, <주점>, <수도원>, <병영> 입니다.");
		System.out.println("각 업종별로 향상되는 능력치는 상이합니다.");
		System.out.println("<야학>은 학교에서 가난한 아이들에게 학문을 가르치는 것입니다. <소지금>은 늘어나지 않지만 <많은 스탯>이 향상 합니다.");
		System.out.println("<주점>은 술집에서 일하는 것입니다. <소지금>이 크게 증가하고 <스트레스>는 감소하지만, <다른 스탯>이 줄어듭니다.");
		System.out.println("<수도원>은 예배당에서 보조로 일하는 것입니다. <소지금>의 증가는 없지만, 대신 <각종 스탯>이 증가하고 <스트레스>의 증가가 없는 활동입니다.");
		System.out.println("<병영>은 군대에서 훈련받으며 교관으로 일하는 것입니다. <소지금>과 <많은 스탯>이 향상 합니다.");
		System.out.println("                                           ");
		System.out.println("어떤 일을 시키겠습니까?");
		System.out.println("1. 야학 2. 주점 3. 수도원 4. 병영");
		
		Scanner sc = new Scanner(System.in);
		work = sc.nextInt();
		
		if (work == 1) {
			System.out.println("<야학>을 선택하였습니다.");
			System.out.println("1년간 <야학>을 하며 어려운 아이들에게 학문을 가르칩니다.");
			System.out.println("<야학>교사로 1년간 활동합니다.");
			System.out.println("                                           ");
			ss.run(son,wk);
			
			son.age = son.age + 1;
			son.intelligence = son.intelligence + 10;
			son.stamina = son.stamina + 5;
			son.stress = son.stress + 10;
			son.height = son.height + 5; 
			son.weight = son.weight + 5;
			son.money = son.money + 100;
			
			System.out.println("                                           ");
			System.out.println(son.name + "의 지능이 10 증가 하였습니다.");
			System.out.println(son.name + "의 지능은 " + son.intelligence + "이 되었습니다.");
			System.out.println(son.name + "의 체력이 5 증가 하였습니다.");
			System.out.println(son.name + "의 체력은 " + son.stamina + "이 되었습니다.");
			System.out.println(son.name + "의 스트레스가 10 증가 하였습니다.");
			System.out.println(son.name + "의 스트레스는 " + son.stress + "이 되었습니다.");
			System.out.println(son.name + "의 키가 5cm 증가 하였습니다.");
			System.out.println(son.name + "의 키가 " + son.height  + "cm가 되었습니다.");
			System.out.println(son.name + "의 몸무게가 5kg 증가 하였습니다.");
			System.out.println(son.name + "의 몸무게는 " + son.weight + "kg이 되었습니다.");
			System.out.println(son.name + "의 소지금이 100 달란트 증가 하였습니다.");
			System.out.println(son.name + "의 소지금은 " + son.money + " 달란트가 되었습니다.");
			}
		
		else if (work == 2) {
			System.out.println("<주점>을 선택하였습니다.");
			System.out.println("1년간 <주점>에서 직원으로 일하며 돈을 법니다.");
			System.out.println("<주점>에서 1년간 일합니다.");
			System.out.println("                                           ");
			ss.run(son,wk);
			
			son.age = son.age + 1;
			son.morality = son.morality - 5;
			son.stamina = son.stamina + 5;
			son.stress = son.stress + 15;
			son.height = son.height + 5; 
			son.weight = son.weight + 5;
			son.money = son.money + 200;
			
			System.out.println("                                           ");
			System.out.println(son.name + "의 도덕성이 5 감소 하였습니다.");
			System.out.println(son.name + "의 도덕성은 " + son.intelligence + "이 되었습니다.");
			System.out.println(son.name + "의 체력이 5 증가 하였습니다.");
			System.out.println(son.name + "의 체력은 " + son.stamina + "이 되었습니다.");
			System.out.println(son.name + "의 스트레스가 15 증가 하였습니다.");
			System.out.println(son.name + "의 스트레스는 " + son.stress + "이 되었습니다.");
			System.out.println(son.name + "의 키가 5cm 증가 하였습니다.");
			System.out.println(son.name + "의 키가 " + son.height  + "cm가 되었습니다.");
			System.out.println(son.name + "의 몸무게가 5kg 증가 하였습니다.");
			System.out.println(son.name + "의 몸무게는 " + son.weight + "kg이 되었습니다.");
			System.out.println(son.name + "의 소지금이 200 달란트 증가 하였습니다.");
			System.out.println(son.name + "의 소지금은 " + son.money + " 달란트가 되었습니다.");
			}	
		
		else if (work == 3) {
			System.out.println("<수도원>을 선택하였습니다.");
			System.out.println("1년간 <수도원>에서 자원봉사자로서 일하며, 수도생활을 합니다.");
			System.out.println("<수도원>에서 1년간 일합니다.");
			System.out.println("                                           ");
			ss.run(son,wk);
			
			son.age = son.age + 1;
			son.morality = son.morality + 5;
			son.faith	= son.faith + 5;
			son.sensibility = son.sensibility + 5;
			son.stamina = son.stamina + 5;
			son.height = son.height + 5; 
			son.weight = son.weight + 5;
			
			System.out.println("                                           ");
			System.out.println(son.name + "의 도덕성이 5 증가 하였습니다.");
			System.out.println(son.name + "의 도덕성은 " + son.morality + "이 되었습니다.");
			System.out.println(son.name + "의 신앙심이 5 증가 하였습니다.");
			System.out.println(son.name + "의 신앙심이 " + son.faith + "이 되었습니다.");
			System.out.println(son.name + "의 감수성이 5 증가 하였습니다.");
			System.out.println(son.name + "의 감수성은 " + son.sensibility + "이 되었습니다.");
			System.out.println(son.name + "의 체력이 5 증가 하였습니다.");
			System.out.println(son.name + "의 체력은 " + son.stamina + "이 되었습니다.");
			System.out.println(son.name + "의 키가 5cm 증가 하였습니다.");
			System.out.println(son.name + "의 키가 " + son.height  + "cm가 되었습니다.");
			System.out.println(son.name + "의 몸무게가 5kg 증가 하였습니다.");
			System.out.println(son.name + "의 몸무게는 " + son.weight + "kg이 되었습니다.");
			}
		
		else if (work == 4) {
			System.out.println("<병영>을 선택하였습니다.");
			System.out.println("1년간 <병영>에서 훈련하며 교관으로 신병을 교육합니다.");
			System.out.println("<병영>에서 1년간 일합니다.");
			System.out.println("                                           ");
			ss.run(son,wk);
			
			son.age = son.age + 1;
			son.strength = son.strength + 10;
			son.stamina = son.stamina + 10;
			son.stress = son.stress + 15;
			son.height = son.height + 5; 
			son.weight = son.weight + 5;
			son.money = son.money + 100;
			son.hp = son.hp + 30;
			son.attack = son.attack + 15;
			son.defence = son.defence + 15;
			
			System.out.println("                                           ");
			System.out.println(son.name + "의 근력이 10 증가 하였습니다.");
			System.out.println(son.name + "의 근력은 " + son.strength + "이 되었습니다.");
			System.out.println(son.name + "의 체력이 10 증가 하였습니다.");
			System.out.println(son.name + "의 체력은 " + son.stamina + "이 되었습니다.");
			System.out.println(son.name + "의 스트레스가 15 증가 하였습니다.");
			System.out.println(son.name + "의 스트레스는 " + son.stress + "이 되었습니다.");
			System.out.println(son.name + "의 키가 5cm 증가 하였습니다.");
			System.out.println(son.name + "의 키가 " + son.height  + "cm가 되었습니다.");
			System.out.println(son.name + "의 몸무게가 5kg 증가 하였습니다.");
			System.out.println(son.name + "의 몸무게는 " + son.weight + "kg이 되었습니다.");
			System.out.println(son.name + "의 소지금이 100 달란트 증가 하였습니다.");
			System.out.println(son.name + "의 소지금은 " + son.money + " 달란트가 되었습니다.");
			System.out.println(son.name + "의 HP가 30 증가 하였습니다.");
			System.out.println(son.name + "의 HP는 " + son.hp + "이 되었습니다.");
			System.out.println(son.name + "의 공격력이 15 증가 하였습니다.");
			System.out.println(son.name + "의 공격력은 " + son.attack + "이 되었습니다.");
			System.out.println(son.name + "의 방어력이 15 증가 하였습니다.");
			System.out.println(son.name + "의 방어력이 " + son.defence + "이 되었습니다.");
			}
		
		else { 
			System.out.println("4가지 업종 주에 하나를 골라야 합니다. 다시 선택해 주십시오.");
			}
		
		System.out.println("                                                                                     ");
		System.out.println(son.name + "은 " + son.age + "세가 되었습니다."); 
		System.out.println("                                                                                     ");
		System.out.println("1년 동안 양육한 결과를 확인 하시렵니까?"); 
		System.out.println("1. 예 2. 아니오");
		
		int checkstat = sc.nextInt();
		
		if (checkstat == 1) {
			
			stt.viewStat(son, sf);
			
		} 
		
		else if (checkstat == 2) {
			
			System.out.println("다음 해로 넘어갑니다.");
		}
	}
}
