import java.util.Scanner;

public class Monster extends Thread {
	
	public void run(Character son, Adventure ad) {

		Scanner sc = new Scanner(System.in);
		
		try {
			int sonDamage = son.hp;
			int monDamage = 1000;
			
			while (monDamage >= 0 & sonDamage >= 0) {
				
				if (ad.monster == ad.monsters[0]) {
					for (monDamage = son.thp; monDamage >= 0;) {
						Thread.sleep(1000);
						monDamage = monDamage - son.attack;
						System.out.println(son.name + "은 " + son.attack + "만큼의 피해를 입혔습니다.");
						System.out.println(ad.monster + "의 HP는 " + monDamage + "가 되었습니다.");
						System.out.println(ad.monster + "가(이) 공격을 합니다.");
						System.out.println(son.name + "은 " + son.tatk + "의 피해를 입었습니다.");
						sonDamage = sonDamage - son.tatk;
						System.out.println(son.name + "의 HP는 " + sonDamage + "입니다.");
						System.out.println("                                          ");
					}
				} 
				
				else if (ad.monster == ad.monsters[1]) {
					for (monDamage = son.rhp; monDamage >= 0;)   {
						Thread.sleep(1000);
						monDamage = monDamage - son.attack;
						System.out.println(son.name + "은 " + son.attack + "만큼의 피해를 입혔습니다.");
						System.out.println(ad.monster + "의 HP는 " + monDamage + "가 되었습니다.");
						System.out.println(ad.monster + "가(이) 공격을 합니다.");
						System.out.println(son.name + "은 " + son.ratk + "의 피해를 입었습니다.");
						sonDamage = sonDamage - son.ratk;
						System.out.println(son.name + "의 HP는 " + sonDamage + "입니다.");
						System.out.println("                                          ");
					}
				}
				
				else if (ad.monster == ad.monsters[2]) {
					for (monDamage = son.dhp; monDamage >= 0;)   {
						Thread.sleep(1000);
						monDamage = monDamage - son.attack;
						System.out.println(son.name + "은 " + son.attack + "만큼의 피해를 입혔습니다.");
						System.out.println(ad.monster + "의 HP는 " + monDamage + "가 되었습니다.");
						System.out.println(ad.monster + "가(이) 공격을 합니다.");
						System.out.println(son.name + "은 " + son.datk + "의 피해를 입었습니다.");
						sonDamage = sonDamage - son.datk;
						System.out.println(son.name + "의 HP는 " + sonDamage + "입니다.");
						System.out.println("                                          ");
					}
				} 
				
				else if (ad.monster == ad.monsters[3]) {
					for (monDamage = son.bhp; monDamage >= 0;)   {
						Thread.sleep(1000);
						monDamage = monDamage - son.attack;
						System.out.println(son.name + "은 " + son.attack + "만큼의 피해를 입혔습니다.");
						System.out.println(ad.monster + "의 HP는 " + monDamage + "가 되었습니다.");
						System.out.println(ad.monster + "가(이) 공격을 합니다.");
						System.out.println(son.name + "은 " + son.batk + "의 피해를 입었습니다.");
						sonDamage = sonDamage - son.batk;
						System.out.println(son.name + "의 HP는 " + sonDamage + "입니다.");
						System.out.println("                                          ");
					}
				} 
				
				else if (ad.monster == ad.monsters[4]) {
					for (monDamage = son.php; monDamage >= 0;)   {
						Thread.sleep(1000);
						monDamage = monDamage - son.attack;
						System.out.println(son.name + "은 " + son.attack + "만큼의 피해를 입혔습니다.");
						System.out.println(ad.monster + "의 HP는 " + monDamage + "가 되었습니다.");
						System.out.println(ad.monster + "가(이) 공격을 합니다.");
						System.out.println(son.name + "은 " + son.patk + "의 피해를 입었습니다.");
						sonDamage = sonDamage - son.patk;
						System.out.println(son.name + "의 HP는 " + sonDamage + "입니다.");
						System.out.println("                                          ");
					}
				}
			}
			if (monDamage <= 0 | sonDamage > 0) {

				System.out.println(ad.monster + "를 잡았습니다.");
				System.out.println("1년간의 모험으로 " + son.name + "은(는) 급성장하였습니다.");
				System.out.println("                                          ");
				
				son.stamina	= son.stamina + 20;
				son.strength = son.strength + 20;
				son.hp = son.hp + 20;
				son.attack = son.attack + 10;
				son.defence = son.defence + 10;
				son.stress = son.stress + 10;
				son.height = son.height + 5;
				son.weight = son.weight + 5;
				son.money = son.money + 200;
				son.age = son.age + 1;
				
				System.out.println(son.name + "의 체력이 20 증가하였습니다.");
				System.out.println(son.name + "의 체력이 " + son.stamina + "이 되었습니다.");
				System.out.println(son.name + "의 근력이 20 증가하였습니다.");
				System.out.println(son.name + "의 근력이 " + son.strength + "이 되었습니다.");
				System.out.println(son.name + "의 HP가 20 증가하였습니다.");
				System.out.println(son.name + "의 HP가 " + son.hp + "이 되었습니다.");
				System.out.println(son.name + "의 공격력이 10 증가하였습니다.");
				System.out.println(son.name + "의 공격력이 " + son.attack + "이 되었습니다.");
				System.out.println(son.name + "의 수비력이 10 증가하였습니다.");
				System.out.println(son.name + "의 수비력이 " + son.defence + "이 되었습니다.");
				System.out.println(son.name + "의 스트레스가 10 증가하였습니다.");
				System.out.println(son.name + "의 스트레스가 " + son.stress + "이 되었습니다.");
				System.out.println(son.name + "의 키가 5cm 증가하였습니다.");
				System.out.println(son.name + "의 키가 " + son.height + "cm가 되었습니다.");
				System.out.println(son.name + "의 몸무게가 5kg 증가하였습니다.");
				System.out.println(son.name + "의 몸무게가 " + son.weight + "kg가 되었습니다.");
				System.out.println(son.name + "의 소지금이 200 증가하였습니다.");
				System.out.println(son.name + "의 소지금이 " + son.money + "가 되었습니다.");
				System.out.println("                                          ");
				System.out.println("모험을 끝내고 다음 해로 넘어갑니다.");
			}

			else if (sonDamage <= 0) {
				System.out.println("샤냥이 끝났습니다.");
				System.out.println(son.name + "은 사냥 당했습니다. 안타깝게도..." + son.name + "은 사냥 중 목숨을 잃었습니다.");
				String death = "\n"
						+ "                                                                                                                                                                          \n"
						+ "                                                                                                                                                                          \n"
						+ "        GGGGGGGGGGGGG                                                                                                                                                     \n"
						+ "     GGG::::::::::::G                                                                                                                                                     \n"
						+ "   GG:::::::::::::::G                                                                                                                                                     \n"
						+ "  G:::::GGGGGGGG::::G                                                                                                                                                     \n"
						+ " G:::::G       GGGGGG  aaaaaaaaaaaaa      mmmmmmm    mmmmmmm       eeeeeeeeeeee            ooooooooooo   vvvvvvv           vvvvvvv    eeeeeeeeeeee    rrrrr   rrrrrrrrr   \n"
						+ "G:::::G                a::::::::::::a   mm:::::::m  m:::::::mm   ee::::::::::::ee        oo:::::::::::oo  v:::::v         v:::::v   ee::::::::::::ee  r::::rrr:::::::::r  \n"
						+ "G:::::G                aaaaaaaaa:::::a m::::::::::mm::::::::::m e::::::eeeee:::::ee     o:::::::::::::::o  v:::::v       v:::::v   e::::::eeeee:::::eer:::::::::::::::::r \n"
						+ "G:::::G    GGGGGGGGGG           a::::a m::::::::::::::::::::::me::::::e     e:::::e     o:::::ooooo:::::o   v:::::v     v:::::v   e::::::e     e:::::err::::::rrrrr::::::r\n"
						+ "G:::::G    G::::::::G    aaaaaaa:::::a m:::::mmm::::::mmm:::::me:::::::eeeee::::::e     o::::o     o::::o    v:::::v   v:::::v    e:::::::eeeee::::::e r:::::r     r:::::r\n"
						+ "G:::::G    GGGGG::::G  aa::::::::::::a m::::m   m::::m   m::::me:::::::::::::::::e      o::::o     o::::o     v:::::v v:::::v     e:::::::::::::::::e  r:::::r     rrrrrrr\n"
						+ "G:::::G        G::::G a::::aaaa::::::a m::::m   m::::m   m::::me::::::eeeeeeeeeee       o::::o     o::::o      v:::::v:::::v      e::::::eeeeeeeeeee   r:::::r            \n"
						+ " G:::::G       G::::Ga::::a    a:::::a m::::m   m::::m   m::::me:::::::e                o::::o     o::::o       v:::::::::v       e:::::::e            r:::::r            \n"
						+ "  G:::::GGGGGGGG::::Ga::::a    a:::::a m::::m   m::::m   m::::me::::::::e               o:::::ooooo:::::o        v:::::::v        e::::::::e           r:::::r            \n"
						+ "   GG:::::::::::::::Ga:::::aaaa::::::a m::::m   m::::m   m::::m e::::::::eeeeeeee       o:::::::::::::::o         v:::::v          e::::::::eeeeeeee   r:::::r            \n"
						+ "     GGG::::::GGG:::G a::::::::::aa:::am::::m   m::::m   m::::m  ee:::::::::::::e        oo:::::::::::oo           v:::v            ee:::::::::::::e   r:::::r            \n"
						+ "        GGGGGG   GGGG  aaaaaaaaaa  aaaammmmmm   mmmmmm   mmmmmm    eeeeeeeeeeeeee          ooooooooooo              vvv               eeeeeeeeeeeeee   rrrrrrr            \n"
						+ "                                                                                                                                                                          \n"
						+ "                                                                                                                                                                          \n";
				for (int i = 0; i < death.length(); i++) {
					System.out.print(death.charAt(i));
					Thread.sleep(1);
				}
				System.out.println("게임을 다시 시작 하겠습니까? (1. Yes 2. No)");
				int restart = sc.nextInt();

				if (restart == 1) {
					Main.main(null);
				} else if (restart == 2) {
					System.out.println(
							"무하마드와의 약속을 지키지 못한 아브라함은 " + son.name + "의 삼일장이 끝난 직후 귀가 하던 중 의문의 마차사고로 목수을 잃고 말았다.");
					System.out.println("END");
					Main.main(null);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
