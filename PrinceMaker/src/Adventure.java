import java.util.Random;
import java.util.Scanner;

public class Adventure {

	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	Monster mon = new Monster();

	String monster;
	String[] monsters = { "용감한 호랑이", "우물가에 토끼", "숨바꼭질하던 노루", "동굴에서 기어나온 도적", "닭보다 귀한 꿩" };

	void adventure(Character son, Stat stt, Sonface sf) {

		monster = monsters[ran.nextInt(5)];

		System.out.println("자! 산으로 모험을 떠납니다.");
		System.out.println("헛! 모험을 하던 중 <" + monster + ">을 발견했습니다.");
		System.out.println("사냥(공격) 하겠습니까?");
		System.out.println("1. 공격한다 2. 다른 경로로 도망간다.");
		int fight = sc.nextInt();

		if (fight == 1) {

			System.out.println("자! 사냥을 시작합니다!");
			System.out.println(son.name + "의 스탯입니다. 신중하게 전투에 임하십시오.");
			System.out.println(" ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("		HP: " + son.hp);
			System.out.println("		공격력: " + son.attack);
			System.out.println("		방어력: " + son.defence);
			System.out.println(" ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

			if (monster == monsters[0]) {

				System.out.println(monster + "의 스탯은 다음과 같습니다.");
				System.out.println(" ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
				System.out.println("		HP: " + son.thp);
				System.out.println("		공격력: " + son.tatk);
				System.out.println("		방어력: " + son.tdef);
				System.out.println(" ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
				System.out.println(son.name + "이 선제 공격합니다.");
				mon.run(son, this);
			} else if (monster == monsters[1]) {

				System.out.println(monster + "의 스탯은 다음과 같습니다.");
				System.out.println(" ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
				System.out.println("		HP: " + son.rhp);
				System.out.println("		공격력: " + son.ratk);
				System.out.println("		방어력: " + son.rdef);
				System.out.println(" ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
				System.out.println(son.name + "이 선제 공격합니다.");
				mon.run(son, this);

			} else if (monster == monsters[2]) {

				System.out.println(monster + "의 스탯은 다음과 같습니다.");
				System.out.println(" ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
				System.out.println("		HP: " + son.dhp);
				System.out.println("		공격력: " + son.datk);
				System.out.println("		방어력: " + son.ddef);
				System.out.println(" ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
				System.out.println(son.name + "이 선제 공격합니다.");
				mon.run(son, this);

			} else if (monster == monsters[3]) {

				System.out.println(monster + "의 스탯은 다음과 같습니다.");
				System.out.println(" ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
				System.out.println("		HP: " + son.bhp);
				System.out.println("		공격력: " + son.batk);
				System.out.println("		방어력: " + son.bdef);
				System.out.println(" ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
				System.out.println(son.name + "이 선제 공격합니다.");
				mon.run(son, this);

			} else if (monster == monsters[4]) {

				System.out.println(monster + "의 스탯은 다음과 같습니다.");
				System.out.println(" ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
				System.out.println("		HP: " + son.php);
				System.out.println("		공격력: " + son.patk);
				System.out.println("		방어력: " + son.pdef);
				System.out.println(" ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
				System.out.println(son.name + "이 선제 공격합니다.");
				mon.run(son, this);
			}
		} else if (fight == 2) {
			System.out.println("겁을 먹은 "+ son.name + "은 " + monster + "를 보고 도망갑니다.");
			this.adventure(son, stt, sf);
		}

		System.out.println("                                                                                     ");
		System.out.println(son.name + "은 " + son.age + "세가 되었습니다.");
		System.out.println("1년 동안 양육한 결과를 확인 하시렵니까?");
		System.out.println("1. 예 2. 아니오");

		int checkstat = sc.nextInt();

		if (checkstat == 1) {

			stt.viewStat(son, sf);

		} else if (checkstat == 2) {

			System.out.println("다음 해로 넘어갑니다.");
		}
	}
}
