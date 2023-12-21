
public class Stat {

	public void viewStat(Character son,Sonface sf) {
		
		System.out.println("	현재 <" + son.name + ">의 상태입니다.      ");
		System.out.println(" ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("   		이름: " + son.name + "	       ");
		System.out.println("  		나이: " + son.age + " 	       ");
		System.out.println("  		키: " + son.height + "	       ");
		System.out.println("  		몸무게: " + son.weight + "	   ");
		System.out.println("  		소지금: " + son.money + "		   ");
		System.out.println("  		스트레스: " + son.stress + "	   ");
		System.out.println("  		체력: " + son.stamina + "		   ");
		System.out.println("  		근력: " + son.strength + "	   ");
		System.out.println("  		지력: " + son.intelligence + "  ");
		System.out.println("  		도덕성: " + son.morality + "	   ");
		System.out.println("  		신앙심: " + son.faith + "	 	   ");
		System.out.println("  		감수성: " + son.sensibility + "  ");
		System.out.println("  		HP: " + son.hp + "	            ");
		System.out.println("  		공격력: " + son.attack + "	 	");
		System.out.println("  		방어력: " + son.defence + "      ");
		System.out.println(" ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		System.out.println("                                      ");
		System.out.println("                                                                                 ");
		
		if (son.age == 13) {
			
			sf.run2();
			System.out.println(son.name + "이 청소년이 되었습니다.");
			System.out.println("                             ");
		}
		else if (son.age == 18) {
			
			sf.run3();
			System.out.println(son.name + "이 성인이 되었습니다.");
			System.out.println("                             ");
		}
	}
}
	

